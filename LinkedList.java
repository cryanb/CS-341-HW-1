class LinkedList {
	Node head;

	public LinkedList() {

		head = null;
	}
	void push(int number) {
		
		Node temp = new Node(number);
		temp.next = head;
		head = temp;
	}
	

	public double mean() {
		double sum = 0;
		double count = 0;
		Node temp = head;
		while (temp != null) {
			sum += temp.n;
			count++;
			temp = temp.next;
		}
		return sum / count;
	}

	public void sd(double mean) {
		double difference = 0;
		double count = 0;
		Node temp = head;
		while (temp != null) {
			difference += Math.pow(temp.n - mean, 2);
			count++;
			temp = temp.next;
		}
		double meanDeviation = difference / count;
		double totalDeviation = Math.sqrt(meanDeviation);
		System.out.print(totalDeviation);
	}
}
