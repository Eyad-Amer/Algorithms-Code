package parking_problem_algorithm;

public class Node { 

	// *** private data ***
	private char data;
	private Node prev, next;

	// *** constructor ***
	public Node(char data, Node prev, Node next){
		this.data = data;
		this.next = next;
		this.prev = prev;
	}

	// *** Getters and Setters ***
	public char getData() {
		return data;
	}
	public void setData(char data) {
		this.data = data;
	}
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public String toString() {
		return "" + this.data;
	}
}