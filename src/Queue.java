/********************
 * Class Name: Queue
 * Author: Varun Gande
 * Description: It is a Queue ADT
 *	     
 ********************/
public class Queue {
	Node head;
	Node tail;
	
	/********************
	 * Constructor Name: Queue
	 * Author: Varun Gande
	 * Description: sets head and tail of queue to be nulls
	 *	     
	 ********************/
	Queue() {
		head = null;
		tail = null;
	}
	
	/********************
	 * Function Name: enqueue
	 * Author: Varun Gande
	 * Description: adds a node to the end/tail of queue
	 * Input Parameters: Node newNode, int number
	 * Return Types: None
	 *	     
	 ********************/	
	void enqueue(Node newNode, int number) {
		newNode.number = number;
		if (head == null && tail == null) {
			head = tail = newNode;
		}
		else if (head==tail) {
			tail = newNode;
			tail.link = head;
		}
		else {
			newNode.link = tail;
			tail = newNode;	
		}
	}
	
	/********************
	 * Function Name: dequeue
	 * Author: Varun Gande
	 * Description: deletes a node at the front/head of queue
	 * Input Parameters: None
	 * Return Types: None
	 *	     
	 ********************/	
	void dequeue() {
		Node temp = tail;
		if (temp != head) {
			while (temp.link != head) {
				temp = temp.link;
			}
			head = temp;
			head.link = null;
		}
		else {
			head = tail = null;
		}
	}

	/********************
	 * Function Name: valueOfNode
	 * Author: Varun Gande
	 * Description: returns value of node at a position
	 * Input Parameters: int pos
	 * Return Types: String
	 *	     
	 ********************/	
	String valueOfNode(int pos) {
		Node temp = tail;
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
	 * Description: returns number of nodes in the queue + null
	 * Input Parameters: None
	 * Return Types: int
	 *	     
	 ********************/	
	int numOfNodes() {
		Node temp = tail;
		int x = 1;
		if (tail == null) {
			return -1;
		}
		else {
			while (temp != null) {
				temp = temp.link;
				x++;
			}
			return x;
		}
	}
	

}
