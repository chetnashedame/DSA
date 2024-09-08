package Shiftrightleft;

public class Node {
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

class LinkedList {

	Node head;
	Node tail;

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
}

class Tester {

	public static void main(String[] args) {
		LinkedList linkedList1 = new LinkedList();
		linkedList1.addAtEnd("ABC");
		linkedList1.addAtEnd("DFG");
		linkedList1.addAtEnd("XYZ");
		linkedList1.addAtEnd("EFG");

		LinkedList linkedList2 = new LinkedList();
		linkedList2.addAtEnd("ABC");
		linkedList2.addAtEnd("DFG");
		linkedList2.addAtEnd("XYZ");
		linkedList2.addAtEnd("EFG");
		linkedList2.addAtEnd("HIJ");

		System.out.println("Initial List");
		linkedList1.display();

		System.out.println("\nList after shifting Left by 2 positions");
		shiftListLeft(linkedList1, 2);
		linkedList1.display();

		System.out.println("Initial List");
		linkedList2.display();

		System.out.println("\nList after shifting Right by 2 positions");
		shiftListRight(linkedList2, 2);
		linkedList2.display();

	}

	public static void shiftListLeft(LinkedList linkedList, int n) {
		int length = 0;
		Node temp = linkedList.getHead();
		while (temp != null) {
			length++;
			temp = temp.getNext();
		}
		n = n % length;
		if (n == 0) {
			return;
		}
		Node current = linkedList.getHead();
		Node prev = null;

		for (int i = 0; i < n; i++) {
			prev = current;
			current = current.getNext();
		}
		prev.setNext(null);
		Node newHead = current;

		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(linkedList.getHead());
		linkedList.head = newHead;

	}

	public static void shiftListRight(LinkedList linkedList, int n) {
		int length = 0;
		Node temp = linkedList.getHead();
		while (temp != null) {
			length++;
			temp = temp.getNext();
		}
		n = length - n;
		n = n % length;
		if (n == 0) {
			return;
		}
		Node current = linkedList.getHead();
		Node prev = null;

		for (int i = 0; i < n; i++) {
			prev = current;
			current = current.getNext();
		}
		prev.setNext(null);
		Node newHead = current;

		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(linkedList.getHead());
		linkedList.head = newHead;

	}

}
