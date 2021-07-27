package linkedLists;

public class ReverseDLL {

	static NodeDLL head, curr;
	
	static void insertAtEnd(int x) {
		NodeDLL temp= new NodeDLL(x);
		curr.next=temp;
		temp.prev=curr;
		curr=temp;
	}
	
	static void insertAtBegin(int x) {
		NodeDLL temp= new NodeDLL(x);
		head.prev=temp;
		temp.next=head;
		head=temp;
	}	
	
	static void insertAtMiddle(int x, int pos) {
		NodeDLL temp= new NodeDLL(x);
		NodeDLL c=head;
		NodeDLL current= head;
		while(pos>=1) {
			current=c;
			c=c.next;
			pos--;
		}
		temp.next=c;
		current.next=temp;
		temp.prev=current;
		c.prev=temp;
	}	
	
	static void reverse() {
		NodeDLL c=head;
		if(c==null) {
			curr=c;
			return;
		}
		if(c.next==null) {
			curr=head;
			return;
		}
		NodeDLL prev=null;
		NodeDLL nextt=null;
		while(c!=null) {
			nextt=c.next;
			c.next=prev;
			c.prev=nextt;
			prev=c;
			c=nextt;
		}
		curr=prev;
	}
	
	public static void main(String[] args) {
		head=new NodeDLL(10);
		NodeDLL a=new NodeDLL(20);
		head.next=a;
		a.prev=head;
		curr=a;
		insertAtEnd(30);
		insertAtBegin(5);
		insertAtMiddle(15,2);
		curr=head;
		while(curr!=null) {
			System.out.println(curr.data);
			curr=curr.next;
		}
		reverse();
		System.out.println("After");
//		curr=head;
		while(curr!=null) {
		System.out.println(curr.data);
		curr=curr.next;
		}
	}

}
