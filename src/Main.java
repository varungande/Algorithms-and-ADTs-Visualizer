/********************
 * Program Name: ADTs and Sorting Visualizer Culminating
 * Author: Varun Gande
 * Date : March June 18, 2022
 * Does: This program visualizes multiple abstract data types and
 * 		 sorting algorithms 
 *	     
 ********************/

import javax.swing.JFrame;

/********************
 * Class Name: Main
 * Author: Varun Gande
 * Description: The Main class creates the Window of the visualizer 
 * 				and runs the whole program
 *	     
 ********************/
public class Main {
	public static void main(String[] args) {
		// Creates window and starts program
		JFrame window = new JFrame();
		window.setSize(900, 600);
		window.setResizable(false);
		window.setTitle("ADT and Sorting Visualizer");
		window.setVisible(true);
		
		// Starting off program with the home page
		window.add(new HomePage());
	}
}
