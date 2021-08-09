package linkedLists;

public class ReverseInGroups {
	static Node head;
	static Node tail;
	static void insertEnd(int x) {
		Node temp=new Node(x);
		tail.next=temp;
		tail=temp;
	}
	public static void main(String[] args) {
		head=new Node(5);
		tail=head;
		insertEnd(10);
		insertEnd(17);
		insertEnd(20);
		insertEnd(21);
		insertEnd(22);
		insertEnd(23);
		insertEnd(24);
		insertEnd(25);
		insertEnd(26);
		Node curr=reverseInGroup(3);
//		Node curr=head;
		while(curr!=null) {
			System.out.println(curr.data);
			curr=curr.next;
		}
	}
	private static Node reverseInGroup(int k) {
		Node curr=head;
		Node prevBefore=null;
		Node prev=null;
		Node nextt=null;
		while(curr!=null) {
			int count=0;
			prev=null;
			Node connect=curr;
			while(curr!=null && count<k) {
				nextt=curr.next;
				curr.next=prev;
				prev=curr;
				curr=nextt;
				count++;
			}
			if(prevBefore==null) {
				head=prev;
			}
			else {
				prevBefore.next=prev;
			}
			prevBefore=connect;
		}
		return head;
	}
} 