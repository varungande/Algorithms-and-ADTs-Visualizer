import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;

/********************
 * Class Name: Page
 * Author: Varun Gande
 * Description: This is the JPanel object that displays all
 * 				the visuals
 *	     
 ********************/
public class Page extends JPanel implements ActionListener{
	// Buttons
	JButton buttonGoHome;
	JButton buttonLinkedList;
	JButton buttonStack;  
	JButton buttonBinaryTree;
	JButton buttonBubbleSort;
	JButton buttonSelectionSort;
	JButton buttonInsertionSort;
	JButton buttonQueue;
	JButton buttonAddNode; 
	JButton buttonInsertNode;
	JButton buttonDeleteNode;
	JButton buttonSort;
	JButton buttonGenArray;
	JTextField textPosition;
	JTextField textValue;  
	JButton[] buttons = new JButton[13];

	// Boolean values to check what page the user is currently on
	boolean[] goPage = {false, false, false, false, false, false, false, false};
	
	/********************
	 * Constructor Name: Page
	 * Author: Varun Gande
	 * Description: Initializes all the buttons
	 *	     
	 ********************/
	Page() {
		
		// HomePage button
		buttonGoHome = new JButton("Back to HomePage");
		buttonGoHome.addActionListener(this);
		buttonGoHome.setFocusable(false);
		
		
		// LinkedList Page button
		buttonLinkedList = new JButton("Linked List");
		buttonLinkedList.setBounds(300,140,300,50);
		buttonLinkedList.addActionListener(this);
		buttonLinkedList.setFocusable(false);
		this.add(buttonLinkedList);


		// Stack Page button
		buttonStack = new JButton("Stack");
		buttonStack.setBounds(300,200,300,50);
		buttonStack.addActionListener(this);
		buttonStack.setFocusable(false);
		this.add(buttonStack);

		
		// Queue Page button
		buttonQueue = new JButton("Queue");
		buttonQueue.setBounds(300,260,300,50);
		buttonQueue.addActionListener(this);
		buttonQueue.setFocusable(false);
		this.add(buttonQueue);

		
		// BinaryTree Page button
		buttonBinaryTree = new JButton("Binary Tree");
		buttonBinaryTree.setBounds(300,320,300,50);
		buttonBinaryTree.addActionListener(this);
		buttonBinaryTree.setFocusable(false);
		this.add(buttonBinaryTree);

		
		// BubbleSort Page button
		buttonBubbleSort = new JButton("Bubble Sort");
		buttonBubbleSort.setBounds(300,380,300,50);
		buttonBubbleSort.addActionListener(this);
		buttonBubbleSort.setFocusable(false);
		this.add(buttonBubbleSort);

		
		// SelectionSort Page button
		buttonSelectionSort = new JButton("Selection Sort");
		buttonSelectionSort.setBounds(300,440,300,50);
		buttonSelectionSort.addActionListener(this);
		buttonSelectionSort.setFocusable(false);
		this.add(buttonSelectionSort);

		
		// InsertionSort Page button
		buttonInsertionSort = new JButton("Insertion Sort");
		buttonInsertionSort.setBounds(300,500,300,50);
		buttonInsertionSort.addActionListener(this);
		buttonInsertionSort.setFocusable(false);
		this.add(buttonInsertionSort);


		// Sort button
		buttonSort = new JButton("Sort");
		buttonSort.addActionListener(this);
		buttonSort.setFocusable(false);
		
		// Generate Array button
		buttonGenArray = new JButton("Refresh");
		buttonGenArray.addActionListener(this);
		buttonGenArray.setFocusable(false);
		
		// Add Node button
		buttonAddNode = new JButton();
		buttonAddNode.addActionListener(this); 
		buttonAddNode.setFocusable(false); 
		
		// Insert Node Button
		buttonInsertNode = new JButton("Insert Node at Position");
		buttonInsertNode.addActionListener(this);
		buttonInsertNode.setFocusable(false);
		
		// Delete Node button
		buttonDeleteNode = new JButton();
		buttonDeleteNode.addActionListener(this);
		buttonDeleteNode.setFocusable(false);
		
		// Position text field
		textPosition = new JTextField("Position");
		textPosition.addActionListener(this);
		
		// Value text field
		textValue = new JTextField("Value");
		textValue.addActionListener(this);
		
		buttons[0] = buttonLinkedList; buttons[1] = buttonStack; buttons[2] = buttonQueue; buttons[3] = buttonBinaryTree;
		buttons[4] = buttonBubbleSort; buttons[5] = buttonSelectionSort; buttons[6] = buttonInsertionSort; 
		buttons[7] = buttonAddNode; buttons[8] = buttonDeleteNode; buttons[9] = buttonInsertNode; buttons[10] = buttonSort;
		buttons[11] = buttonGenArray; buttons[12] = buttonGoHome;
		
		this.setBackground(new Color(110, 180, 90));
		this.setBounds(0,0,900,600);
		this.setLayout(null);
	}
	
	/********************
	 * Function Name: actionPerformed
	 * Author: Varun Gande
	 * Description: Handles actions/shows different pages when buttons/textboxes 
	 * 				are clicked
	 * Input Parameters: ActionEvent
	 * Return Types: None
	 *	     
	 ********************/

	public void actionPerformed(ActionEvent e) {
		
		// HomePage button Clicked
		if (e.getSource() == buttonGoHome) {
			makeFalse(goPage, 0);
		}
		
		// StackPage button Clicked
		if (e.getSource() == buttonStack) {
			this.remove(textPosition); 
			this.add(textValue);
			textValue.setBounds(15, 75, 172, 50);
			
			new StackPage();
			makeFalse(goPage, 1);
		}
		
		// LinkedListPage button Clicked
		if (e.getSource() == buttonLinkedList) {
			this.add(textPosition); 
			this.add(textValue);
			textPosition.setBounds(200, 15, 80, 30);
			textValue.setBounds(292, 15, 80, 30);
			
			new LinkedListPage();
			makeFalse(goPage, 2);
		}
		
		// QueuePage button Clicked
		if (e.getSource() == buttonQueue) {
			this.remove(textPosition); 
			this.add(textValue);
			textValue.setBounds(200, 15, 172, 50);
			
			new QueuePage();
			makeFalse(goPage, 3);
		}
		
		// BinaryTreePage button Clicked
		if (e.getSource() == buttonBinaryTree) {
			this.remove(textPosition); 
			this.add(textValue);
			textValue.setBounds(385, 15, 172, 50);
			
			new BinaryTreePage();
			makeFalse(goPage, 7);
		}
		
		// BubbleSortPage button Clicked
		if (e.getSource() == buttonBubbleSort) {

			this.remove(textPosition); 
			this.remove(textValue);
			
			new BubbleSortPage();
			makeFalse(goPage, 4);
		}
		
		// SelectionSortPage button Clicked
		if (e.getSource() == buttonSelectionSort) {
			this.remove(textPosition); 
			this.remove(textValue);
			
			new SelectionSortPage();
			makeFalse(goPage, 5);
		}
		
		// InsertionSortPage button Clicked
		if (e.getSource() == buttonInsertionSort) {
			this.remove(textPosition); 
			this.remove(textValue);
			new InsertionSortPage();
			makeFalse(goPage, 6);
		}
		
		// Adds node depending on the current page
		if (e.getSource() == buttonAddNode) {
			
			// Stack
			if (goPage[1]) {
				if (StackPage.isValue) {
					StackPage.myStack.push(new Node(), StackPage.value);
					StackPage.isValue = false;
				}
			}
			
			// LinkedList
			if (goPage[2]) {
				if (LinkedListPage.isValue) {
					LinkedListPage.myLinkedList.addNode(new Node(), LinkedListPage.value);
					LinkedListPage.isValue = false;
					LinkedListPage.nodeInserted = false;
				}
			}
			
			// Queue
			if (goPage[3]) {
				if (QueuePage.isValue) {
					QueuePage.myQueue.enqueue(new Node(), QueuePage.value);
					QueuePage.isValue = false;
				}
			}
			
			// BinaryTree
			if (goPage[7]) {
				if (BinaryTreePage.isValue) {
					Node n = new Node();
					n.number = BinaryTreePage.value;
					if (BinaryTreePage.myBinaryTree.root == null) {
						BinaryTreePage.myBinaryTree.insertNode(n);
					}
					else {
						BinaryTreePage.myBinaryTree.insertNode(BinaryTreePage.myBinaryTree.root, n);
					}
					BinaryTreePage.isValue = false;

				}
			}
			
		} 
		
		// Position textbox
		if (e.getSource() == textPosition) {
			try {
				LinkedListPage.nodeInserted = false;
				LinkedListPage.isPosition = true;
				LinkedListPage.position = Integer.parseInt(textPosition.getText());
			}
			catch (Exception ex) {
				LinkedListPage.isPosition = false;
			}
			
		}
		
		// Retrieves 'value' depending on the current page
		if (e.getSource() == textValue) {
			try {
				if (goPage[1]) {
					StackPage.value = Integer.parseInt(textValue.getText());
					StackPage.isValue = true;
				}
				if (goPage[2]) {
					LinkedListPage.value = Integer.parseInt(textValue.getText());
					LinkedListPage.isValue = true;
				}
				if (goPage[3]) {
					QueuePage.value = Integer.parseInt(textValue.getText());
					QueuePage.isValue = true;
				}
				if (goPage[7]) {
					BinaryTreePage.value = Integer.parseInt(textValue.getText());
					BinaryTreePage.isValue = true;
				}
			}
			catch (Exception ex) {
				LinkedListPage.isValue = false;
				StackPage.isValue = false;
				QueuePage.isValue = false;
				BinaryTreePage.isValue = false;

			}
			
		}
		
		// Deletes node depending on the current page
		if (e.getSource() == buttonDeleteNode) {
			
			// Stack
			if (goPage[1]) {
				StackPage.myStack.pop();
			}
			
			// LinkedList
			if (goPage[2]) {
				if (LinkedListPage.isPosition) {
					LinkedListPage.nodeInserted = false;
					LinkedListPage.isPosition = false;
					LinkedListPage.myLinkedList.deleteNode(LinkedListPage.position); 
				}
			}
			
			// Queue
			if(goPage[3]) {
				QueuePage.myQueue.dequeue();
			}
		}
		
		// Insert Node
		if (e.getSource() == buttonInsertNode) {
			if (LinkedListPage.isValue && LinkedListPage.isPosition) {
				LinkedListPage.isPosition = false;
				LinkedListPage.isValue = false;
				LinkedListPage.nodeInserted = true;
				LinkedListPage.myLinkedList.insertNode(new Node(), LinkedListPage.value, LinkedListPage.position);	
			}
			
		}
		
		// Sorts the array depending on the current page
		if (e.getSource() == buttonSort) {
			// BubbleSort
			if (goPage[4]) {
				BubbleSortPage.keepSorting = true;
			}
			
			// SelectionSort
			if (goPage[5]) {
				SelectionSortPage.keepSorting = true;
			}
			
			// InsertionSort
			if (goPage[6]) {
				InsertionSortPage.keepSorting = true;
			}
			
		}
		
		// Generates new array depending on current page
		if (e.getSource() == buttonGenArray) {
			
			// BubbleSort Array
			if (goPage[4]) {
				BubbleSortPage.keepSorting = false;
				BubbleSortPage.j = -1;
				BubbleSortPage.generateArray();
			}
			
			// SelectionSort Array
			if (goPage[5]) {
				SelectionSortPage.keepSorting = false;
				SelectionSortPage.j = -1;
				SelectionSortPage.generateArray();
			}
			
			// InsertionSort Array
			if (goPage[6]) {
				InsertionSortPage.keepSorting = false;
				InsertionSortPage.n = 1;
				InsertionSortPage.j = 0;
				InsertionSortPage.generateArray();
			}
		}
	}
	
	
	/********************
	 * Function Name: paintComponent
	 * Author: Varun Gande
	 * Description: Does all graphics, painting the screen and controlling view of buttons
	 * 				depending on the page that the user is on, and also acts a counter for
	 * 				the sorting algorithms
	 * Input Parameters: Graphics
	 * Return Types: None
	 *	     
	 ********************/
	public void paintComponent(Graphics g) {
		// Background for Home Page
		g.setColor(new Color(131, 148, 188));
		g.fillRect(0,0,900,600);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Arial", Font.BOLD, 40));
		g.drawString("ADTs and Sorting Algorithms", 170, 70);
		g.setFont(new Font("Arial", Font.PLAIN, 13));
		g.drawString("By: Varun Gande", 760, 545);

		// Home Page
		if (goPage[0]) {
			removeAllButtons(); this.remove(textValue); this.remove(textPosition);
			this.add(buttonLinkedList);this.add(buttonStack);this.add(buttonQueue); this.add(buttonBinaryTree);
			this.add(buttonBubbleSort);this.add(buttonSelectionSort);this.add(buttonInsertionSort);
			
			g = HomePage.paintScreen(g);
		}
		
		// Stack Page
		if (goPage[1]) {
			removeAllButtons();this.add(buttonAddNode);
			this.add(buttonDeleteNode);this.add(buttonGoHome); 
			buttonGoHome.setBounds(15,15,172,50);
			buttonAddNode.setBounds(15,135,172,50);
			buttonDeleteNode.setBounds(15,195,172,50);
			buttonAddNode.setText("Add Node");
			buttonDeleteNode.setText("Delete Node");
			
			g = StackPage.paintScreen(g);
		}
		
		// Linked List Page
		if (goPage[2]) {
			removeAllButtons();
			this.add(buttonAddNode); this.add(buttonGoHome);
			this.add(buttonInsertNode);this.add(buttonDeleteNode);
			buttonGoHome.setBounds(15,15,160,50);
			buttonAddNode.setBounds(15,75,160,50);
			buttonDeleteNode.setBounds(200, 93, 172, 30);
			buttonAddNode.setText("Add Node");
			buttonDeleteNode.setText("Delete Node at Position");
			buttonInsertNode.setBounds(200, 53, 172, 30);
			
			g = LinkedListPage.paintScreen(g);
		}
		
		// Queue Page
		if (goPage[3]) {
			removeAllButtons();
			this.add(buttonAddNode); this.add(buttonGoHome);this.add(buttonDeleteNode); 
			buttonGoHome.setBounds(15,15,172,50);
			buttonAddNode.setBounds(200,75,172,50);
			buttonDeleteNode.setBounds(15,75,172,50);
			buttonAddNode.setText("Enqueue");
			buttonDeleteNode.setText("Dequeue");
			
			g = QueuePage.paintScreen(g);

		}
		
		// BinaryTree Page
		if (goPage[7]) {
			removeAllButtons();
			this.add(buttonAddNode); this.add(buttonGoHome);
			buttonGoHome.setBounds(15,15,172,50);
			buttonAddNode.setBounds(200,15,172,50);
			buttonAddNode.setText("Add Node");
			
			g = BinaryTreePage.paintScreen(g);
		}
		
		// Bubble Sort Page
		if (goPage[4]) {
			removeAllButtons();
			this.add(buttonGoHome);this.add(buttonSort); this.add(buttonGenArray); 
			buttonGoHome.setBounds(15,15,172,50);
			buttonSort.setBounds(200, 15, 172, 50);
			buttonGenArray.setBounds(385,15, 172, 50);
			g.setColor(new Color(129,121,137));
			g.fillRect(0, 0, 900, 600);		
			g.setColor(new Color(235, 236, 233));
			
			// Checking to see if array has been sorted
			BubbleSortPage.isSorted();
			
			// If sort button is clicked, counter of the loop in bubble sort page will begin to increment
			if (BubbleSortPage.keepSorting) {
				BubbleSortPage.j++;
			}	
			
			g = BubbleSortPage.paintScreen(g);
		}
		
		// Selection Sort Page
		if (goPage[5]) {
			removeAllButtons();
			this.add(buttonGoHome); this.add(buttonSort); this.add(buttonGenArray);
			buttonGoHome.setBounds(15,15,172,50);
			buttonSort.setBounds(200, 15, 172, 50);
			buttonGenArray.setBounds(385,15, 172, 50);
			g.setColor(new Color(129,121,137));
			g.fillRect(0, 0, 900, 600);		
			g.setColor(new Color(235, 236, 233));
			
			// Checking to see if array has been sorted
			SelectionSortPage.isSorted();
			
			// If sort button is clicked, counter of the loop in bubble sort page will begin to increment
			if (SelectionSortPage.keepSorting) {
				SelectionSortPage.j++;
			}
			
			// Delaying repainting of bars to see them move
			try {
				Thread.sleep(60);
			} catch (InterruptedException e) {
			}
			g = SelectionSortPage.paintScreen(g);
		}
		
		// Insertion Sort Page
		if (goPage[6]) {
			removeAllButtons();
			this.add(buttonGoHome);this.add(buttonSort); this.add(buttonGenArray); 
			buttonGoHome.setBounds(15,15,172,50);
			buttonSort.setBounds(200, 15, 172, 50);
			buttonGenArray.setBounds(385,15, 172, 50);
			g.setColor(new Color(129,121,137));
			g.fillRect(0, 0, 900, 600);		
			g.setColor(new Color(235, 236, 233));
			
			// Checking to see if array has been sorted
			InsertionSortPage.isSorted();
			
			// Delaying repainting of bars to see them move
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
			}
			g = InsertionSortPage.paintScreen(g);
		}
		
		this.repaint();
	}
	
	
	/********************
	 * Function Name: makeFalse
	 * Author: Varun Gande
	 * Description: Makes all the pages that the user isn't on false, 
	 * 				and the current page true
	 * Input Parameters: boolean[] arr, int exception
	 * Return Types: None
	 *	     
	 ********************/
	public void makeFalse(boolean[] arr, int exception) {
		for(int i = 0; i < arr.length; i++) {
			if (i == exception) {
				arr[i] = true;
			}
			else {
				arr[i] = false;
			}
		}
	}
	
	
	/********************
	 * Function Name: removeAllButtons
	 * Author: Varun Gande
	 * Description: Removes all the buttons in the program
	 * Input Parameters: None
	 * Return Types: None
	 *	     
	 ********************/
	public void removeAllButtons() {
		for (int i = 0; i < buttons.length; i++) {
			this.remove(buttons[i]);
		}
	}
	


}
