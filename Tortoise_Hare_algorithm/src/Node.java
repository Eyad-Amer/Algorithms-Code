public class Node {

	// *** private data ***
	private int data;
	private Node next;

	// *** constructor ***
	public Node(int d) {
		data = d;
		next = null;
	}


	public void setNext(Node n) {
		next = n;
	}
	public Node getNext() {
		return this.next;
	}
	public int getData() {
		return data;
	}
	public String toString() {
		return "" + this.data;
	}
}