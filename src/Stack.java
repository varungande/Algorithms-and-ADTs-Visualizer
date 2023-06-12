/********************
 * Class Name: Stack
 * Author: Varun Gande
 * Description: It is a Stack ADT
 *	     
 ********************/
public class Stack {
	Node top;
	
	/********************
	 * Constructor Name: Stack
	 * Author: Varun Gande
	 * Description: sets top of stack to be null
	 *	     
	 ********************/
	Stack() {
		top = null;
	}
	
	/********************
	 * Function Name: push
	 * Author: Varun Gande
	 * Description: adds a node to the top of the stack
	 * Input Parameters: Node newNode, int number
	 * Return Types: None
	 *	     
	 ********************/
	void push(Node newNode, int number) {
		newNode.link = top;
		newNode.number = number;
		top = newNode;
	}
	
	/********************
	 * Function Name: pop
	 * Author: Varun Gande
	 * Description: will pop the top node off the stack
	 * Input Parameters: None
	 * Return Types: None
	 *	     
	 ********************/
	void pop() {
		if (top != null) {
			top = top.link;
		}
	}
	
	/********************
	 * Function Name: valueOfNode
	 * Author: Varun Gande
	 * Description: returns value of node in a position in the stack
	 * Input Parameters: int pos
	 * Return Types: String
	 *	     
	 ********************/
	String valueOfNode(int pos) {
		Node temp = top;
		int x = 1;
		while (temp != null && x <= (numOfNodes()-1 - pos)) {
			temp = temp.link;
			x++;
		}
		return String.valueOf(temp.number);
	}
	
	/********************
	 * Function Name: numOfNodes
	 * Author: Varun Gande
	 * Description: returns number of nodes in the stack + null
	 * Input Parameters: None
	 * Return Types: None
	 *	     
	 ********************/
	int numOfNodes() {
		int x = 1;
		Node temp = top;
		while (temp != null) {
			temp = temp.link;
			x += 1;
		}
		return x;
	}

}
