package linkedLists;

import java.util.Scanner;

public class CircularLL {
static Node head=null;
static Node tail=null;
	
	static void print(Node curr) {
		if(curr==null) {
			return;
		}
//		if(curr)
		System.out.print(curr.data+" ");
		print(curr.next);
	}
	
	static void insertBegin(int x){
		Node temp=new Node(x);
		temp.next=head;
		head=temp;
		tail.next=head;
	}
	
	static void insertEnd(int x) {
		Node temp=new Node(x);
		if(head==null) {
			head=temp;
			return;
		}
		Node curr=head;
		while(curr.next!=head) {
			curr=curr.next;
		}
		
		curr.next=temp;
		temp.next=head;
		tail=temp;
		tail.next=head;
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
		if(head==null || head.next==head) {
			head=null;
			return;
		}
		while(curr.next.next!=head) {
			curr=curr.next;
			tail=curr;
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
		tail=b;
		insertBegin(5);
		insertEnd(25);
		insertMiddle(13,2);
		delete(2);
		deleteEnd();
		Node curr=head;
		tail.next=head;
		while(curr.next!=head) {
			System.out.println(curr.data);
			curr=curr.next;
		}
//		do {
//			System.out.println(curr.data);
//			curr=curr.next;
//		}
//		while(curr!=head);
		System.out.println(curr.data);
	}
}
