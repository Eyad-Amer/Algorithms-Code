public class CircleLinkedList {

	private Node head;
	private Node tail;
	private int size;

	public CircleLinkedList() { // Constructor : Build empty list
		head = null;
		tail = null;
		size = 0;
	}

	public Node getHead() {
		return head;
	}

	public int getSize() {
		return size;
	}

	public void add(int n) {
		if (head == null) { // list is empty - add first node
			head = new Node(n);
			tail = head;
		} else { // list is not empty - add next node
			Node oldTail = tail;
			tail = new Node(n);
			oldTail.setNext(tail);
		}
		size++;
	}

	public void addLoop(int index) { // index - first loop's node
		Node current = head;
		while (current.getData() != index) {
			if (current.getNext() == null)
				return;
			current = current.getNext();
		}
		tail.setNext(current);
	}

	public String toString() {
		Node current = head;
		String result = "";
		int count = 0;
		while(current != null) {
			result += "[" + current.getData() + "]";
			current = current.getNext();
			count++;
			if (count % 10 == 0 || count % 16 == 0)
				result = result + " ";
			if (count == 20) // maybe linked list has a loop
				break;
		}
		return result;
	}

	public static void main(String[] args) {
		CircleLinkedList linearLL = new CircleLinkedList();
		for (int i = 1; i < 10; i++) // list size = 10
			linearLL.add(i);
		System.out.println("Linear Linked List size = " + linearLL.getSize());
		System.out.println(linearLL.toString());
		CircleLinkedList circleLL = new CircleLinkedList();
		for (int i = 1; i < 10; i++) // list size = 10 circleLL.add(i);
			circleLL.addLoop(4); // first loop node = 4
		System.out.println("\nLoop Linked List size = " + circleLL.getSize()); 
		System.out.println(circleLL.toString());
	}
}