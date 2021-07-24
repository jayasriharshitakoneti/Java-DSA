package linkedLists;

class NodeDLL{
	NodeDLL next;
	int data;
	NodeDLL prev;
	NodeDLL(int x){
		prev=null;
		data=x;
		next=null;
	}
}

public class DoublyLinkedList {
	
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
	
	static void delete(int x) {
		NodeDLL c=head;
		NodeDLL current=head;
		if(head==null || c.next==null) {
			if(c.data==x || c==null) {
				head=null;
			}
		}
		while(c.next!=null) {
			if(c.data==x) {
				break;
			}
			current=c;
			c=c.next;
		}
		
		if(c==head) {
			head=c.next;
			head.prev=null;
		}
		else if(c.next==null) {
			if(c.data==x) {
				current.next=null;
			}
			System.out.println(c.data);
		}
		else {
		current.next=c.next;
		c.next.prev=current;
		}
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
//		delete(5);
//		delete(15);
//		delete(30);
//		delete(8);
		curr=head;
		while(curr!=null) {
		System.out.println(curr.data);
		curr=curr.next;
		}
	}
}
