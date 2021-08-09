package linkedLists;

public class MergeTwoSortedLinkedList {

	static Node head1,head2,tail1,tail2;
	
	static void insertEnd1(int x) {
		Node temp=new Node(x);
		tail1.next=temp;
		tail1=temp;
	}
	
	static void insertEnd2(int x) {
		Node temp=new Node(x);
		tail2.next=temp;
		tail2=temp;
	}
	
	public static void main(String[] args) {
		head1=new Node(5);
		tail1=head1;
		insertEnd1(10);
		insertEnd1(17);
		insertEnd1(20);
		insertEnd1(24);
		insertEnd1(26);
		insertEnd1(27);
		insertEnd1(270);
		head2=new Node(20);
		tail2=head2;
		insertEnd2(22);
		insertEnd2(23);
		insertEnd2(26);
		Node curr=merge();
		while(curr!=null) {
			System.out.println(curr.data);
			curr=curr.next;
		}
	}

	private static Node merge() {
		if(head1==null || head2==null)
		{
			if(head1==null)
			return head2;
			return head1;
		}
//		if(head1.next)
		Node curr1=head1;
		Node curr2=head2;
		Node head;//=null;
		if(curr1.data<curr2.data) {
			head=curr1;
		}
		else {
			head=curr2;
		}
		while(curr1!=null && curr2!=null) {
//			System.out.println(curr1.data+"FF"+curr2.data);
			if(curr1.data<curr2.data ) {
//				System.out.println("F");
				if(curr1.next==null) {
//					if(head==null) {
//						head=curr1;
//					}
					curr1.next=curr2;
					break;
//					curr2=curr2.next;
//					if(head==null) {
//						curr1=head;
//					}
				}
				else {
						if(curr1.next.data<=curr2.data) {
							curr1=curr1.next;
						}
						else if(curr1.next.data>curr2.data) {
							Node temp=curr2.next;
//							curr2=curr2.next;
							curr2.next=curr1.next;
							curr1.next=curr2;
//							curr2=curr2.next;
							curr2=temp;
						}
				}
			}
//			System.out.println("F");
			else if(curr1.data==curr2.data) {
//				System.out.println("F");
				Node temp=curr2.next;
				curr2.next=curr1.next;
				curr1.next=curr2;
				curr2=temp;
			}
			else {
//				System.out.println("F");
				if(curr1.next==null) {
					curr1.next=curr2;
					break;
				}
				else {
					
					if(curr2.next.data<curr1.data) {
						curr2=curr2.next;
					}
					else if(curr2.next.data>curr1.data) {
//						curr1.next=curr2.next;
//						curr2.next=curr1;
//						curr1=curr1.next;
						Node temp=curr1.next;
//						curr2=curr2.next;
						curr1.next=curr2.next;
						curr2.next=curr1;
//						curr2=curr2.next;
						curr1=temp;
					}
				}
			}
		}
		if(curr1==tail1 && curr2==tail2) {
			return head;
		}
		else {
			if(curr2!=tail2) {
				curr1.next=curr2;
			}
			else {
				curr2.next=curr1;
			}
		}
		return head;
	}

}
