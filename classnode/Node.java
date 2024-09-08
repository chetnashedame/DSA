package classnode;

class Node {
	String data;
	Node next;

	public Node(String data) {
		this.data = data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public void setNext(Node node) {
		this.next = node;
	}

	public String getData() {
		return this.data;
	}

	public Node getNext() {
		return this.next;
	}
}

class Linkedlist {

	private Node head;
	private Node tail;

	public Node getHead() {
		return this.head;
	}

	public Node getTail() {
		return this.tail;
	}

	// Creating new node//
	public void addAtEnd(String data) {
		Node node = new Node(data);
		// check if the list is empty if yes then make the node as head and tail//
		if (this.head == null)
			this.head = this.tail = node;
		else {
			// if list is not empty add element at the end//
			this.tail.setNext(node);
			// make the new node as tail/
			this.tail = node;
		}

	}

	// adding an element at the beginning//
	public void addAtBeginning(String data) {
		Node node = new Node(data);
		if (this.head == null)
			this.head = this.tail = node;
		else {
			node.setNext(this.head);
			this.head = node;

		}
	}

	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}

	}

	public Node find(String data) {
		Node temp = this.head;
		while (temp != null) {
			if (temp.getData().equals(data))
				return temp;
			temp = temp.getNext();

		}
		return null;
	}

	public void insert(String data, String dataBefore) {
		Node node = new Node(data);
		if (this.head == null)
			this.head = this.tail = node;
		else {
			Node nodeBefore = this.find(dataBefore);
			if (nodeBefore != null) {
				node.setNext(nodeBefore.getNext());
				nodeBefore.setNext(node);
				if (nodeBefore == this.tail)
					this.tail = node;
			} else
				System.out.println("node not found");
		}
	}

	public void delete(String data) {
		// check if the list is empty
		if (this.head == null)
			System.out.println("list is empty");
		else {
			// find the node to be deleted
			Node node = this.find(data);
			// if the node is not found
			if (node == null)
				System.out.println("node not found");
			// if the node to be deleted is head node
			else if (node == this.head) {
				this.head = this.head.getNext();
				node.setNext(null);
				// if node to be deleted is tail
				if (node == this.tail)
					tail = null;
			} else {
				// taverse the node present before the node to be deleted
				Node nodeBefore = null;
				Node temp = this.head;
				while (temp != null) {
					if (temp.getNext() == node) {
						nodeBefore = temp;
						break;
					}
					temp = temp.getNext();
				}
				// remove the node
				nodeBefore.setNext(node.getNext());
				// if the node to be deleted is tail node then make previous node tail
				if (node == this.tail)
					this.tail = nodeBefore;
				node.setNext(null);
			}
		}
	}

	public static void main(String[] args) {
		Linkedlist list = new Linkedlist();
		list.addAtEnd("milan");
		list.addAtEnd("venice");
		list.addAtEnd("munich");
		list.addAtEnd("vienna");
		list.addAtBeginning("london");
		list.insert("prague", "munich");
		list.display();
		System.out.println("--------------------------------------------------");
		list.delete("venice");
		list.display();
		// if (list.find("venice") != null)
		// System.out.println("node found");
		// else
		// System.out.println("node not found");
	}
}
