/********************
 * Class Name: BubbleSortPage
 * Author: Varun Gande
 * Description: Controls the Graphics for the bubble sort page
 *	     
 ********************/
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

public class BubbleSortPage {
	static int[] arr;
	static int size;
	static int y; 
	static boolean keepSorting;
	static int smallestIndex;
	static int j; // counter that replaces the loop in the algorithm

	/********************
	 * Constructor Name: BubbleSortPage
	 * Author: Varun Gande
	 * Description: initializes default values for algorithm
	 * 				and generates an array 
	 *	     
	 ********************/
	BubbleSortPage() {
		keepSorting = false;
		j = -1;
		y = 300;
		size = 4;
		smallestIndex = 0;
		arr = new int[50];
		generateArray();
	}
	
	/********************
	 * Function Name: paintScreen
	 * Author: Varun Gande
	 * Description: Displays the bars and animates their movement
	 * Input Parameters: Graphics
	 * Return Types: Graphics
	 *	     
	 ********************/
	public static Graphics paintScreen(Graphics g) {
		g.setColor(new Color(137,130,145));
		g.fillRect(0, 0, 900, 600);	
		g.setColor(Color.WHITE);
		g.setFont(new Font("Arial", Font.PLAIN, 30));
		g.drawString("Bubble Sort", 640, 50);
						
		if (keepSorting) {
			
			// Iterating through whole array (pass)
			for(int i = 0; i < arr.length - j; i++) {
				
				// Resetting j to 0 if it reaches length of array 
				if (j >= arr.length - 1) {
					j = 0;
				}
				
				// Bubble Sort swapping algorithm
				if (arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}

			}
			
			// Displaying all the bars
			for (int i = 0; i < arr.length; i++) {
				g.setColor(Color.WHITE);
				g.fillRect(size*i*4 + 40, 570 - size*arr[i], size*3, size*arr[i]);
			}
			
			// Returning graphics to 'Page' Class to be painted each time algorithm swaps a value
			return g;
		}
		else {
			if (isSorted()) {
				for(int i = 0; i < arr.length; i++) {
					// Use this for plain color
					// g.setColor(new Color(0, 255, 111));
					
					// Use this color for color gradient (works for array sizes under 70)
					g.setColor(new Color(50+i*3, 190+i, 111));
					g.fillRect(size*i*4 + 40, 570 - size*arr[i], size*3, size*arr[i]);
				}	
			}
			else {
				g.setColor(Color.WHITE);
				for(int i = 0; i < arr.length; i++) {
					g.fillRect(size*i*4 + 40, 570 - size*arr[i], size*3, size*arr[i]);
				}	
			}	
		}
		
		// Returning graphics to 'Page' Class to be painted each time algorithm swaps a value
		return g;
	}

	/********************
	 * Function Name: isSorted()
	 * Author: Varun Gande
	 * Description: checks if array has been sorted
	 * Input Parameters: None
	 * Return Types: boolean
	 *	     
	 ********************/
	public static boolean isSorted() {
		int x = 1;
		
		// Checking if each value is less than the one next to it
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] <= arr[i+1]) {
				x++;
			}
		}
		
		// Array has been sorted, algorithm bubble sort should stop running
		if(x == arr.length) {
			keepSorting = false;
			return true; 
		}
		
		return false;
	}
	
	/********************
	 * Function Name: generateArray
	 * Author: Varun Gande
	 * Description: generates new array with random values
	 * Input Parameters: None
	 * Return Types: None
	 *	     
	 ********************/
	public static void generateArray() {
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(110)+6;
		}
	}

}
