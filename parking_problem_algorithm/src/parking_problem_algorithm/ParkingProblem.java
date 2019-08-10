package parking_problem_algorithm;

public class ParkingProblem {
	static DoubleCycleLinkedList parking = new DoubleCycleLinkedList(); // parking place DCLL
	static Node currentNode; // current node in DCLL
	static boolean flag; // continue flag for main LOOP
	static int count; // total number of cars
	static char oldSign, newSign; // signs on the cars
	static int steps; // number of steps back

	public ParkingProblem() {
		parking = parking.buildLinkedList();
		// build parking place : Double Cycle Linked List
		currentNode = parking.getHead().getNext();
		// next to the head node
		flag = true; // continue flag for the main LOOP
		count = 1; // total number of the cars
		oldSign = 'V'; // V - old sign of the car
		newSign = 'W'; // W - new sign of the car
	}

	public static int calcCars(){
		while(flag) { // main loop begin
			if (currentNode.getData() != oldSign) {
				// usual node : no sign ‘V’
				currentNode = currentNode.getNext();
				// go to the next node
				count++; // increase the counter
			} else { // node with sign ‘V’
				currentNode.setData(newSign);
				steps = count;
				while(steps > 0) { // loop for steps back
					currentNode = currentNode.getPrev();
					// get previous node
					steps-- ; // decrease the step
				} // loop for steps back end
				if (currentNode.getData() == newSign)
					// back to new sign
					flag = false;
				else {
					count = 1;
					currentNode = parking.getHead().getNext();
				}
			}
		} // main loop end
		return count;
	}

	public static int calcCarsPointers(){
		int result = 1;
		Node nodeForward = parking.getHead().getNext();
		Node headNode = parking.getHead();
		while(nodeForward != headNode) {
			nodeForward = nodeForward.getNext();
			result++;
		}
		return result;
	}

	public static void main(String[] args) {
		new ParkingProblem();
		System.out.println("number of cars = " + ParkingProblem.calcCars());
		System.out.println("DCLL : " + ParkingProblem.parking.toString());
		System.out.println();
		System.out.println("number of cars = " + ParkingProblem.calcCarsPointers());
	}

}