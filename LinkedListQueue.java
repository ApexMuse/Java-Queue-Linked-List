/*
 * 			AUTHOR: Todd Twiggs
 * 			DATE:   October 12, 2015
 * 
 * 			This is the LinkedListQueue class for Project 2
 */

import javax.swing.JOptionPane;

public class LinkedListQueue {

	protected Node front, rear;
	public int queueSize;

	// Constructor for a linked list
	public LinkedListQueue(){
		front = null;
		rear = null;
		queueSize = 0;
	}
	
	// Check to see if the queue is empty
	Node first(){
		return front;
	}
	
	// Get the size of the queue
	int size(){
		return queueSize;
	}
	
	// Insert a Node at the rear of the queue
	void enqueue(int nodeData){
		Node newNode = new Node(nodeData, null);
		
		if (rear == null){
			front = newNode;
			rear = newNode;
		}
		else {
			rear.setNext(newNode);
			rear = rear.getNext();
		}
		queueSize++;
	} // End of enqueue
	
	// Remove a Node from the front of the queue
	void dequeue(){
		Node dummyNode = front;
		front = dummyNode.getNext();
		
		if (front == null){
			rear = null;
		}
		queueSize--;
	} // End of dequeue
	
	// Print the contents of the queue
	void print(String message){
		String output = message;
		output += "The queue contains: \n";
		Node current = front;
		for (int i = 1; i < queueSize; i++){
			if (i == 11){
				output += "\n";
			}
			output += current.getData() + ", ";
			current = current.getNext();
		}
		output += current.getData();
		JOptionPane.showMessageDialog(null, output);
	} // End of print

} // End of class LinkedListQueue
