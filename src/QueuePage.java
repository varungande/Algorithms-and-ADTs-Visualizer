/********************
 * Class Name: QueuePage
 * Author: Varun Gande
 * Description: Controls the Graphics for the queue page
 *	     
 ********************/
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class QueuePage {
	static Queue myQueue;
	static boolean nodeInserted;
	static boolean isValue = false;
	static int value;
	static int numOfNodes;
	static int size = 4; 
	static int y = 300; 
	
	/********************
	 * Constructor Name: QueuePage
	 * Author: Varun Gande
	 * Description: initializes a new queue
	 *	     
	 ********************/
	QueuePage() {
		myQueue = new Queue();
	}
	
	/********************
	 * Function Name: paintScreen
	 * Author: Varun Gande
	 * Description: Displays the queue and its related buttons
	 * Input Parameters: Graphics
	 * Return Types: Graphics
	 *	     
	 ********************/
	public static Graphics paintScreen(Graphics g) {
		g.setColor(new Color(93,176,165));
		g.fillRect(0, 0, 900, 600);
		g.setFont(new Font("Arial", Font.PLAIN, 13));
		numOfNodes = myQueue.numOfNodes();
		
		// Special case when queue is empty and there are two nulls
		if (numOfNodes == -1) {
			for (int i = 0; i < 2; i++) {
				g.setColor(new Color(140, 90, 210));
				g.fillRoundRect((size*i*(14+size))+10 , y - (size*10), size*14, size*10, 10, 10);
				g.setColor(Color.WHITE);
				g.drawString("Null", size*i*(14+size)+25 , y - (size*4));
			}
		}

		// Printing out the Queue
		for(int i = 0; i < numOfNodes; i++) {
			// Null Node
			if (i == numOfNodes-1) {
				g.setColor(new Color(140, 90, 210));
				g.fillRoundRect((size*i*(14+size))+10 , y - (size*10), size*14, size*10, 10, 10);
				g.setColor(Color.WHITE);
				g.drawString("Null", (size*i*(14+size))+25, y - (size*4));
			}
			
			// Other Nodes
			else {
				g.setColor(new Color(243, 54, 117));
				g.fillRoundRect((size*i*(14+size))+10 , y - (size*10), size*14, size*10, 10, 10);
				g.setColor(Color.WHITE);
				g.drawString(myQueue.valueOfNode(numOfNodes-1-i), (size*i*(14+size))+30 , y - (size*4));
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
