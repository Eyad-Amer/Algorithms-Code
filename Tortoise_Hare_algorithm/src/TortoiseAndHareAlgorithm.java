public class TortoiseAndHareAlgorithm {
	static CircleLinkedList linearLL = new CircleLinkedList();
	static CircleLinkedList circleLL = new CircleLinkedList();
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) // list size = 10
			linearLL.add(i);
		System.out.println("Linear Linked List size = " +
				linearLL.getSize());
		System.out.println(linearLL.toString());

		for (int i = 1; i < 10; i++) // list size = 10
			circleLL.add(i);
		circleLL.addLoop(4); // first loop node = 4
		System.out.println("\nLoop Linked List size = "
				+ circleLL.getSize());
		System.out.println(circleLL.toString());
		TortoiseAndHareAlgorithm toAndHa =
				new TortoiseAndHareAlgorithm();
		// ** step 1 **
		System.out.println();
		System.out.println("Linear Linked List : has loop - "
				+ toAndHa.hasLoop(linearLL));
		System.out.println("Loop Linked List : has loop - "
				+ toAndHa.hasLoop(circleLL));

		// ** step 2 **
		Node meetingNode = toAndHa.meetingPointInLoop();
		//System.out.println();
		System.out.println("Meeting point : " + meetingNode.getData());

		// ** step 3 **
		Node firstInLoop = toAndHa.startOfLoop(meetingNode);
		System.out.println();
		System.out.println("Start of the loop : " + firstInLoop.getData());

		// ** step 4 **
		int loopLength = toAndHa.lengthOfLoop(meetingNode);
		System.out.println();
		System.out.println("Length of the loop : " + loopLength);
	}

	//**** Step 1 *****
	public boolean hasLoop(CircleLinkedList LL) {
		Node slow; // create two pointers
		Node fast;
		slow = fast = LL.getHead();
		// place both pointers to the start of the list
		while(true) {
			if (slow.getNext() == null)
				return false;
			if (fast.getNext() == null)
				return false;
			slow = slow.getNext(); // move first pointer to 1 node
			fast = fast.getNext().getNext();// move second pointer to 2 nodes
			if (slow == null || fast == null) // no loop
				return false;
			if (slow == fast) // have a loop
				return true;
		}
	}


	//**** Step 2 *****
	public Node meetingPointInLoop() {
		int steps = 0;
		Node fast = circleLL.getHead();
		Node slow = circleLL.getHead();
		fast = fast.getNext().getNext();
		slow = slow.getNext();
		steps++;
		while (fast != slow) {
			fast=fast.getNext().getNext();
			slow=slow.getNext();
			steps++;
			if(fast == slow)
				break;
		} // end while
		System.out.println("\nSteps to meeting point : " + steps);
		return fast; // fast ( or slow )
	}

	//**** Step 3 *****
	public Node startOfLoop(Node meet) {
		Node slow = circleLL.getHead();
		Node fast = meet;
		while(slow != fast) {
			fast = fast.getNext();
			if(slow == fast.getNext())
				break;
			slow = slow.getNext();
		} // end while
		return slow;
	}

	//**** Step 4 *****
	//*************
	int lengthOfLoop(Node meet) {
		int length = 0;
		Node slow = meet;
		Node fast = meet;
		fast = fast.getNext();
		length++;
		while ( slow != fast ) {
			fast=fast.getNext();
			length++;
		} // end while
		return length;
	}
} // end class