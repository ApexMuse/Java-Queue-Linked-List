/*
 * 			AUTHOR: Todd Twiggs
 * 			DATE:   October 12, 2015
 * 
 * 			This is the Node class for Project 2
 */

public class Node {
	
	protected int nodeData;
	protected Node next;

	public Node() {
		nodeData = 0;
		next = null;
	}
	
	public Node(int newNum, Node n) {
		nodeData = newNum;
		next = n;
	}
	
	void setData(int newNum) {
		nodeData = newNum;
	}
	
	int getData(){
		return nodeData;
	}
	
	void setNext(Node n){
		next = n;
	}
	
	Node getNext() {
		return next;
	}

}
