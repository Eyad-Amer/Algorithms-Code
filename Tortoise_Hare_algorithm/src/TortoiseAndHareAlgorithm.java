public class TortoiseAndHareAlgorithm {
	static CircleLinkedList circleLL = new CircleLinkedList();

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) // list size = 10
			circleLL.add(i);
		circleLL.addLoop(4); // first loop node = 4
		System.out.println("\nLoop Linked List size = " + circleLL.getSize());
		System.out.println(circleLL.toString());
		TortoiseAndHareAlgorithm toAndHa = new TortoiseAndHareAlgorithm();

		// * step 1 *
		System.out.println();
		System.out.println("Loop Linked List : has loop - " + toAndHa.hasLoop());

		// * step 2 *
		Node meetingNode = toAndHa.meetingPointInLoop();
		//System.out.println();
		System.out.println("Meeting point : " + meetingNode.getData());

		// * step 3 *
		Node firstInLoop = toAndHa.startOfLoop();
		System.out.println();
		System.out.println("Start of the loop : " + firstInLoop.getData());

		// * step 4 *
		int loopLength = toAndHa.lengthOfLoop();
		System.out.println();
		System.out.println("Length of the loop : " + loopLength);

		// * step 4 *
		int armlength = toAndHa.ArmLength();
		System.out.println();
		System.out.println("Length of the Arm : " + armlength);
	}


	//** Step 1 ***
	public boolean hasLoop() {
		Node slow; // create two pointers
		Node fast;
		slow = fast = circleLL.getHead();
		// place both pointers to the start of the list
		while(true) {
			if (slow.getNext() == null || fast.getNext() == null || fast.getNext().getNext() == null)
				return false;
			slow = slow.getNext(); // move first pointer to 1 node
			fast = fast.getNext().getNext();// move second pointer to 2 nodes
			if (slow == fast) // have a loop
				return true;
		}
	}

	//** Step 2 ***
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

	//** Step 3 ***
	public Node startOfLoop() {
		Node slow = circleLL.getHead();
		Node fast = meetingPointInLoop();

		while(slow != fast) {
			fast = fast.getNext();
			if(slow == fast.getNext())
				break;
			slow = slow.getNext();
			if(fast == slow.getNext())
				break;
			fast = fast.getNext();
		} // end while
		return slow;
	}

	//** Step 4 ***
	int lengthOfLoop() {
		int length = 0;
		Node slow = meetingPointInLoop();
		Node fast = meetingPointInLoop();
		fast = fast.getNext();
		length++;
		while ( slow != fast ) {
			fast=fast.getNext();
			length++;
		} // end while
		return length;
	}

	//** Step 5 ***
	public int ArmLength() {
		int armlength = -1;
		boolean flag = true;
		boolean Run = true;
		Node slow = circleLL.getHead();
		Node fast = circleLL.getHead();

		while(flag) {
			if (slow.getNext() == null || fast.getNext() == null || fast.getNext().getNext() == null) {
				flag = false;
				Run = false;
			}
			slow = slow.getNext();
			fast = fast.getNext().getNext();
			if(fast == slow) {
				flag = false;
				Run = true;
			}
		}

		fast = circleLL.getHead();

		while(Run) {
			armlength++;
			if(slow == fast)
				Run = false;
			else {
				slow = slow.getNext();
				fast = fast.getNext();
			}
		}
		return armlength;
	}
}