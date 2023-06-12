/********************
 * Class Name: BinaryTree
 * Author: Varun Gande
 * Description: It is a BinaryTree ADT
 *	     
 ********************/
public class BinaryTree {
	Node root;
	String inorder = "";
	String postorder = "";
	String preorder = "";
	
	/********************
	 * Constructor Name: BinaryTree
	 * Author: Varun Gande
	 * Description: sets root of the tree to be null
	 *	     
	 ********************/
	BinaryTree() {
		root = null;
	}
	
	/********************
	 * Function Name: insertNode
	 * Author: Varun Gande
	 * Description: points root to the newNode
	 * Input Parameters: Node newNode
	 * Return Types: None
	 *	     
	 ********************/
	void insertNode(Node newNode) {
		// Insert first node when tree is empty, root = null
		if (root == null) {
			newNode.left = null;
			newNode.right = null;
			root = newNode;
			inorder(root);
			postorder(root);
			preorder(root);
		}
	}
	
	/********************
	 * Function Name: insertNode
	 * Author: Varun Gande
	 * Description: places new node in the right spot in tree according to its value
	 * Input Parameters: Node parent, Node newNode
	 * Return Types: None
	 *	     
	 ********************/
	void insertNode(Node parent, Node newNode) {
		if (newNode.number < parent.number) {
			if (parent.left == null) {
				parent.left = newNode;
				newNode.left = null;
				newNode.right = null;
			}
			else {
				insertNode(parent.left, newNode);
			}
			
		}
		else if (newNode.number > parent.number){
			if (parent.right == null) {
				parent.right = newNode;
				newNode.left = null;
				newNode.right = null;
			}
			else {
				insertNode(parent.right, newNode);
			}
			
		}
		
		// Updates the different order strings each time node is added to tree
		inorder = "";
		inorder(root);
		postorder = "";
		postorder(root);
		preorder = "";
		preorder(root);

	}
	
	/********************
	 * Function Name: inorder
	 * Author: Varun Gande
	 * Description: inorder traversal
	 * Input Parameters: Node parent
	 * Return Types: None
	 *	     
	 ********************/
	void inorder(Node parent) {
		if (parent == null) {
			return;
		}
		
		inorder(parent.left);
		inorder += String.valueOf(parent.number) + " ";
		inorder(parent.right);
	}
	
	/********************
	 * Function Name: postorder
	 * Author: Varun Gande
	 * Description: postorder traversal
	 * Input Parameters: Node parent
	 * Return Types: None
	 *	     
	 ********************/
	void postorder(Node parent) {
		if (parent == null) {
			return;
		}
		
		postorder(parent.left);
		postorder(parent.right);
		postorder += String.valueOf(parent.number) + " ";
	}
	
	/********************
	 * Function Name: preorder
	 * Author: Varun Gande
	 * Description: preorder traversal
	 * Input Parameters: Node parent
	 * Return Types: None
	 *	     
	 ********************/
	void preorder(Node parent) {
		if (parent == null) {
			return;
		}
		
		preorder += String.valueOf(parent.number) + " ";
		preorder(parent.left);
		preorder(parent.right);
	}
	
	

	

}
