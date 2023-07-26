package LinkedList;

class Node {
	int data;
	Node next;
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
} 

public class Reverse {
	
	static int left = 0;
	static Node leftNode;
	
	public static void ReverseDR(Node head) {
		left = 0; 
		leftNode = head;
		ReverseDR(head, 0);
		
	}
	
	public static void ReverseDR(Node rightNode, int right) {
		if(rightNode == null) return;
		
		ReverseDR(rightNode.next, right + 1);
		if(left < right) {
			swapData(leftNode, rightNode);
			left++;
			leftNode = leftNode.next;
		}
	}
	
	public static void swapData(Node a, Node b) {
		int temp = a.data;
		a.data = b.data;
		b.data = temp;
	}
	
	
	public static Node ReversePR(Node head) {
		if(head.next == null) return head;

		Node newHead = ReversePR(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
	
	public static Node ReversePI(Node head) { // TC = O(n)
		Node curr = head;
		Node prev = null;
		Node next;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}
	
	public static void display(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	
	
	public static void main(String[] args) {
		Node n5 = new Node(5, null);
		Node n4 = new Node(4, n5);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);
		
		display(n1);
		
//		Node head = ReversePI(n1);
		
//		Node head = ReversePR(n1);
		ReverseDR(n1);
		display(n1);
		
		
	}
}
