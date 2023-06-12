/********************
 * Class Name: StackPage
 * Author: Varun Gande
 * Description: Controls the Graphics for the stack page
 *	     
 ********************/
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class StackPage{
	static Stack myStack;
	static int numOfNodes;
	static int nodeNumber;
	static int value;
	static boolean isValue = false;
	static int size = 5;
	static int x = 450; 
	
	/********************
	 * Constructor Name: StackPage
	 * Author: Varun Gande
	 * Description: initializes a new Stack
	 *	     
	 ********************/
	StackPage() {
		myStack = new Stack();
	}
	
	
	/********************
	 * Function Name: paintScreen
	 * Author: Varun Gande
	 * Description: Displays the stack and its related buttons
	 * Input Parameters: Graphics
	 * Return Types: Graphics
	 *	     
	 ********************/
	public static Graphics paintScreen(Graphics g) {
		g.setColor(new Color(83,166,155));
		g.fillRect(0, 0, 900, 600);		
		g.setFont(new Font("Arial", Font.PLAIN, 13));
		numOfNodes = myStack.numOfNodes();
		
		// Printing as many nodes as are in the stack
		for(int i = 0; i < numOfNodes; i++) {
			
			// Null Node
			if (i == 0) {
				g.setColor(new Color(130, 80, 200));
				g.fillRoundRect(x - (size*7), (-(size*11) * i) + 550 - (size*10), size*14, size*10, 10,10);
				g.setColor(Color.WHITE);
				g.drawString("Null", x - (size*2), (-(size*11) * i) + 550 - (size*4));
			}
			
			// All Other Nodes
			else {
				g.setColor(new Color(233, 44, 107));
				g.fillRoundRect(x - (size*7), (-(size*11) * i) + 550 - (size*10), size*14, size*10, 10,10);
				g.setColor(Color.WHITE);
				g.drawString(myStack.valueOfNode(i), x - (size), (-(size*11) * i) + 550 - (size*4));
			}
			
			// Connection between Nodes
			if (i != numOfNodes-1) {
				g.setColor(Color.WHITE);
				g.fillRoundRect(x-(size/2), ((-size*11) * i) + (550-(size*13)), size*1, size*3, 1, 1);
			}
		}
		return g;
	}
	

}
