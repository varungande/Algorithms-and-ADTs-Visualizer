/********************
 * Class Name: LinkedList
 * Author: Varun Gande
 * Description: It is a LinkedList ADT
 *	     
 ********************/
public class LinkedList {
	Node start;
	
	/********************
	 * Constructor Name: LinkedList
	 * Author: Varun Gande
	 * Description: sets start of the list to null
	 *	     
	 ********************/
	LinkedList() {
		start = null;
	}
	
	/********************
	 * Function Name: addNode
	 * Author: Varun Gande
	 * Description: adds a node to the end of the list
	 * Input Parameters: Node newNode, int number
	 * Return Types: None
	 *	     
	 ********************/
	void addNode(Node newNode, int number) {
		newNode.number = number;
		newNode.link = start;
		start = newNode;
	}
	
	
	/********************
	 * Function Name: valueOfNode
	 * Author: Varun Gande
	 * Description: returns the value of a node at a position in the list
	 * Input Parameters: int post
	 * Return Types: String
	 *	     
	 ********************/
	String valueOfNode(int pos) {
		Node temp = start;
		int x = 1;
		while (temp != null && x <= (numOfNodes()-1 - pos)) {
			temp = temp.link;
			x++;
		}
		return String.valueOf(temp.number);
	}
	
	/********************
	 * Function Name: insertNode
	 * Author: Varun Gande
	 * Description: inserts a new node at a specific position in the list
	 * Input Parameters: Node newNode,  int number, int pos
	 * Return Types: None
	 *	     
	 ********************/
	void insertNode(Node newNode, int number, int pos) {
		Node temp = start;
		int x = 0;
		if (pos > 0 && pos <= numOfNodes()-1) {
			while (x < (numOfNodes()-1 - pos)) {
				temp = temp.link;
				x++;
			}	
			
			newNode.link = temp.link;
			temp.link = newNode;
			newNode.number = number;	
		}
		else if (pos == numOfNodes()) {
			addNode(newNode, number);
		}
	}
	
	/********************
	 * Function Name: deleteNode
	 * Author: Varun Gande
	 * Description: deletes a new node at a specific position in the list
	 * Input Parameters: int pos
	 * Return Types: None
	 *	     
	 ********************/
	void deleteNode(int pos) {
		Node temp = start;
		int x = 1;
		if (pos == numOfNodes()-1 && start != null) {
			start = start.link;
		}
		else if (pos < numOfNodes()-1 && pos > 0) {
			while (temp != null && x < (numOfNodes()-1 - pos)) {
				temp = temp.link;
				x++;
			}
			temp.link = temp.link.link;
		}

	}
	
	/********************
	 * Function Name: numOfNodes
	 * Author: Varun Gande
	 * Description: returns the number of nodes in the list + null
	 * Input Parameters: None
	 * Return Types: int
	 *	     
	 ********************/
	int numOfNodes() {
		int x = 1; // accounts for null
		Node temp = start;
		while(temp != null) {
			x += 1;
			temp = temp.link;
		}
		return x;
	}


	
	
}

