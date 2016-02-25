/*
 * 			AUTHOR: Todd Twiggs
 * 			DATE:   October 12, 2015
 * 
 * 			Implement the queue using the linked list. Please see the first project for general requirements 
 * 			on programming assignments, including how to submit.
 * 			Your implementation must include the key methods in the queue; refer to the slides for the methods.
 * 
 * 			Requirements:
 * 			1. Demonstrate the implementation by building a queue with 20 elements; your program should print 
 * 				the building process and the content of the final queue.
 *			2. Demonstrate the methods in the queue by printing out the content of the queue after every 
 *				operation of the method.
 *			3. Build a queue with at least 10,000 elements, and measure the time of the building process.
 */

import javax.swing.JOptionPane;

public class Project2 {

	public static void main(String[] args) {
		
		int nodeData;
		
		// Create the linked list
		LinkedListQueue myQueue = new LinkedListQueue();
		
		// Display size of the initial queue
		String message = "The initial queue has size " + myQueue.size();
		JOptionPane.showMessageDialog(null, message);
		
		// Add 20 Nodes to the queue by consecutive applications of enqueue()
		for (int i = 1; i <= 20; i++){
			nodeData = (int) (Math.random()*100);
			myQueue.enqueue(nodeData);
			message = "AFTER ITERATION #" + i + ":\n";
			message += "The new queue size is " + myQueue.size() + "\n\n";
			myQueue.print(message);
		}
		
		// Insert a Node at the rear of the queue
		String numString = JOptionPane.showInputDialog("Type an integer to insert at the rear of the queue: ");
		nodeData = Integer.parseInt(numString);
		myQueue.enqueue(nodeData);
		message = "AFTER ENQUEUE:\n";
		message += "The new queue size is " + myQueue.size() + "\n\n";
		myQueue.print(message);
		
		// Remove a Node from the front of the queue
		myQueue.dequeue();
		message = "AFTER DEQUEUE:\n";
		message += "The new queue size is " + myQueue.size() + "\n\n";
		myQueue.print(message);
		
		message = "The program will now build a queue of 50,000 Nodes,\n";
		message += "and will measure the time of the building process.";
		JOptionPane.showMessageDialog(null, message);
		
		// Build a queue with 50,000 elements, and measure the time of the building process.
		LinkedListQueue myHugeQueue = new LinkedListQueue();
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < 50000; i++){
			nodeData = (int) (Math.random()*100);
			myHugeQueue.enqueue(nodeData);
		}
		long finishTime = System.currentTimeMillis();
		long totalTime = finishTime - startTime;
		
		message = "The queue size is " + myHugeQueue.size() + "\n";
		message += "The build time was " + totalTime + " milliseconds.";
		JOptionPane.showMessageDialog(null, message);
		
	} // End of main()
} // End of class Project2
