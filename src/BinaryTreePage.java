/********************
 * Class Name: BinaryTreePage
 * Author: Varun Gande
 * Description: Controls the Graphics for the Binary tree page
 *	     
 ********************/
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


public class BinaryTreePage {
	static BinaryTree myBinaryTree;
	static boolean isValue = false;
	static int value;
	static int level;
	static int numOfNodes;
	static int size = 4; 
	static int y = 300; 
	
	/********************
	 * Constructor Name: BinaryTreePage
	 * Author: Varun Gande
	 * Description: initializes a binary tree
	 *	     
	 ********************/
	BinaryTreePage() {
		myBinaryTree = new BinaryTree();

	}
	
	/********************
	 * Function Name: paintScreen
	 * Author: Varun Gande
	 * Description: Displays the binary tree
	 * Input Parameters: Graphics
	 * Return Types: Graphics
	 *	     
	 ********************/
	public static Graphics paintScreen(Graphics g) {
		g.setColor(new Color(93,176,165));
		g.fillRect(0, 0, 900, 600);
		printTree(g, myBinaryTree.root, 0, false, false, 300);
		g.setFont(new Font("Arial", Font.PLAIN, 13));
		g.setColor(Color.WHITE);
		
		g.drawString("Inorder:", 20, 500);
		g.drawString(myBinaryTree.inorder, 70, 500);

		g.drawString("PostOrder:", 20, 525);
		g.drawString(myBinaryTree.postorder, 90, 525);

		g.drawString("PreOrder:", 20, 550);
		g.drawString(myBinaryTree.preorder, 85, 550);

		return g;
	}
	
	/********************
	 * Function Name: printTree
	 * Author: Varun Gande
	 * Description: prints the shape of the tree
	 * Input Parameters: None
	 * Return Types: None
	 *	     
	 ********************/
	public static void printTree(Graphics g, Node parent, int level, boolean up, boolean down, int y) {
		if (parent == null) {
			return;
		}
		
		g.setColor(Color.BLACK);
		// traversing through right subtree
		printTree(g, parent.right, level+1, true, false, y - 30 - (level+1 * 20));
		
		// Printing the Nodes that are greater, on right side relative its parent node's value
		if (up) {
			int x = 65 + (level*50);
			g.drawString(String.valueOf(parent.number),x,  y + 20);
			g.drawLine(x+12, y+11, x+50, y+20);
			g.drawLine(x+12, y+11, x+50, y-30);


		}
		
		// Printing the Nodes that are lower, on left side relative its parent node's value
		else if (down){
			int x = 65 + (level*50);
			g.drawString(String.valueOf(parent.number),x, y - 20);
			g.drawLine(x+8, y-23, x+50, y+15);
			g.drawLine(x+8, y-23, x+50, y-35);

		}
		
		// Prints the root node
		else if (up == down) {
			g.setColor(Color.CYAN);
			g.fillOval(42, 280, 30, 30);
			g.setColor(Color.BLACK);
			g.drawString(String.valueOf(parent.number),46, 300);
			g.drawLine(65, 280, 115, 265);
			g.drawLine(62, 310, 115, 330);

		}
		
		// traversing through left subtree
		printTree(g, parent.left, level+1, false, true, y + 30 + (level+1 *20));
	}
}
