package linkedLists;

public class OddsEvens {
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
//		Node curr=head;
		Node curr=oddsEven();
		while(curr!=null) {
			System.out.println(curr.data);
			curr=curr.next;
		}
	}

	private static Node oddsEven() {
		if(head==null) {
			return null;
		}
		if(head.next==null) {
			return head;
		}
		Node curr=head;
		Node odd_first=null;
		Node even_first=null;
		Node odd_tail=null;
		Node even_tail=null;
		while(curr!=null) {
			if(curr.data%2!=0) {
				if(odd_first==null) {
					odd_first=curr;
					odd_tail=curr;
				}
				else {
					odd_tail.next=curr;
					odd_tail=curr;
				}
			}
			else {
				if(even_first==null) {
					even_first=curr;
					even_tail=curr;
				}
				else {
					even_tail.next=curr;
					even_tail=curr;
				}
			}
			curr=curr.next;
		}
		even_tail.next=odd_first;
		odd_tail.next=null;
		return even_first;
	}

}
