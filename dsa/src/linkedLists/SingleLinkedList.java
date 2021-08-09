package linkedLists;

import java.util.Scanner;



public class SingleLinkedList {
	
	static Node head=null;
	
	static void removeDups() {
		Node curr=head;
		if(curr==null) {
			return;
		}
		if(curr.next==null) {
			return;
		}
		while(curr.next!=null) {
			if(curr.data==curr.next.data) {
				curr.next=curr.next.next;
			}
			else {
				curr=curr.next;
			}
		}
		return;
	}
	
	static void print(Node curr) {
		if(curr==null) {
			return;
		}
		System.out.print(curr.data+" ");
		print(curr.next);
	}
	
	static void insertBegin(int x){
		Node temp=new Node(x);
		temp.next=head;
		head=temp;
	}
	
	static void insertEnd(int x) {
		Node temp=new Node(x);
		if(head==null) {
			head=temp;
			return;
		}
		Node curr=head;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=temp;
	}
	
	static void insertMiddle(int x,int pos) {
		Node temp=new Node(x);
		Node curr=head;
		while(pos>1) {
			curr=curr.next;
			pos--;
		}
		temp.next=curr.next;
		curr.next=temp;
	}
	
	static void deleteEnd() {
		Node curr=head;
		if(head==null || head.next==null) {
			head=null;
			return;
		}
		while(curr.next.next!=null) {
			curr=curr.next;
		}
		curr.next=null;
	}
	
	static void delete(int pos) {
		
		Node curr=head;
		if(pos==0) {
			head=head.next;
		}
		
		while(pos>1) {
			pos--;
			curr=curr.next;
		}
		curr.next=curr.next.next;
	}
	
	static int searchIterative(int req,int pos) {
		Node curr=head;
		while(curr!=null) {
			pos++;
			if(curr.data==req) {
				return pos;
			}
			curr=curr.next;
		}
		
		return -1;
	}
	
	static int searchRecursive(int req,int pos,Node curr) {
		if(curr==null) {
			return -1;
		}
		if(curr.data==req) {
			return pos;
		}
		return searchRecursive(req,pos+1,curr.next);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		head= new Node(10);
		Node a=new Node(15);
		Node b=new Node(20);
		
		a.next=b;
		head.next=a;
		in.close();
		
		insertBegin(5);
		
		insertEnd(15);
		insertMiddle(15,2);
		insertMiddle(15,2);
		insertMiddle(15,2);
		delete(2);
		deleteEnd();
		insertEnd(20);
		insertEnd(20);
		insertBegin(5);
//		insertEnd(25);
		Node curr=head;
//		print(curr);
		removeDups();
//		System.out.println();		
//		System.out.println();
//		System.out.println(1+searchIterative(10,-1));
//		System.out.println(1+searchRecursive(20,0,head));
		while(curr!=null) {
			System.out.println(curr.data);
			curr=curr.next;
		}
	}

}
