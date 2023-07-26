package LinkedList;

public class Cycle {
	
	public static boolean hasCycle(Node head) {
		
		Node fast = head, slow = head;
		int count = 1;
		
		while(fast != null && fast.next != null) {
			if(fast == slow) {
				if(count == 1) count++;
				else return true;
			}
			fast = fast.next.next;
			slow = slow.next;
		}
		return false;
	}
	
	public static void startingPointOfCycle(Node head) {
		Node fast = head, slow = head;
		int count = 1;
		
		
		while(true) {
			if(fast == slow) {
				if(count == 1) count++;
				else break;
			}
			fast = fast.next.next;
			slow = slow.next;
		}
		
		slow = head;
		
		while(fast != slow) {
			fast = fast.next;
			slow = slow.next;
			
		}
		
		System.out.println(fast.data);
		
	}
	
	public static void main(String[] args) {
		Node n5 = new Node(5, null);
		Node n4 = new Node(4, n5);
		Node n3 = new Node(3, n4);
		Node n2 = new Node(2, n3);
		Node n1 = new Node(1, n2);
			
		n5.next = n5;
		
		System.out.println(hasCycle(n1));
		startingPointOfCycle(n1);
		
	}

}
