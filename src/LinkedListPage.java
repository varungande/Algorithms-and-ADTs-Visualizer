/********************
 * Class Name: LinkedListPage
 * Author: Varun Gande
 * Description: Controls the Graphics for the linked list page
 *	     
 ********************/
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class LinkedListPage {
	static LinkedList myLinkedList;
	static boolean nodeInserted;
	static boolean isValue = false;
	static boolean isPosition = false;
	static int position;
	static int value;
	static int numOfNodes;
	static int nodeNumber;
	static int size = 4; 
	static int y = 300; 
	
	/********************
	 * Constructor Name: LinkedListPage
	 * Author: Varun Gande
	 * Description: initializes a new linked list
	 *	     
	 ********************/
	LinkedListPage() {
		myLinkedList = new LinkedList();
	} 
	
	/********************
	 * Function Name: paintScreen
	 * Author: Varun Gande
	 * Description: Displays the linked list and its related buttons
	 * Input Parameters: Graphics
	 * Return Types: Graphics
	 *	     
	 ********************/
	public static Graphics paintScreen(Graphics g) {
		g.setColor(new Color(93,176,165));
		g.fillRect(0, 0, 900, 600);
		g.setFont(new Font("Arial", Font.PLAIN, 13));
		numOfNodes = myLinkedList.numOfNodes();
		
		for(int i = 0; i < numOfNodes; i++) {
			
			// Null Node
			if (i == 0) {
				g.setColor(new Color(140, 90, 210));
				g.fillRoundRect(10, y - (size*10), size*14, size*10, 10, 10);
				g.setColor(Color.WHITE);
				g.drawString("Null", 25, y - (size*4));
			}
			
			// Highlights the inserted node 
			else if (i == position && nodeInserted) {
				g.setColor(new Color(33, 107, 185));
				g.fillRoundRect((size*i*(14+size))+10 , y - (size*10), size*14, size*10, 10, 10);
				g.setColor(Color.WHITE);
				g.drawString(myLinkedList.valueOfNode(i), (size*i*(14+size))+30 , y - (size*4));
			}
			
			// Other Nodes
			else {
				g.setColor(new Color(243, 54, 117));
				g.fillRoundRect((size*i*(14+size))+10 , y - (size*10), size*14, size*10, 10, 10);
				g.setColor(Color.WHITE);
				g.drawString(myLinkedList.valueOfNode(i), (size*i*(14+size))+30 , y - (size*4));
			}

			// Connection between Nodes
			if (i != numOfNodes-1) {
				g.setColor(Color.WHITE);
				g.fillRoundRect((size*i*(14+size)) + 10 + (size*14),y - (size*10) + (size*4), size*5, size*1, 1, 1);
			}
		}
		return g;
	}
}
