package LinkedList;

import java.util.Date;

public class LinkedList
{
	Node head;
	
	public static LinkedList insert(LinkedList list, int data)
	{
		Node newNode = new Node(data);
		newNode.next=null;
		
		if(list.head == null)
			list.head = newNode;
		else
		{
			Node lastNode = list.head;
			while(lastNode.next!=null)
				lastNode = lastNode.next;
		
			lastNode.next = newNode;
		}
		return list;
	}
	
	public static LinkedList insert(LinkedList list, int data, int position)
	{
		int counter = 1;
		Node newNode = new Node(data);
		Node node;
		
		if(list.head == null)
			list.head = newNode;
		else
		{
			Node lastNode = list.head;
			
			while(lastNode.next!=null && counter!=position)
			{
				counter++;
				lastNode = lastNode.next;
			}
			node = lastNode.next;
			lastNode.next=newNode;
			newNode.next=node;
		}
		
		return list;
	}
	
	public static void printList(LinkedList list)
	{
		Node last = list.head;
		Date d = new Date();
		System.out.println(d.getTime());
		while(last.next != null)
		{
			System.out.println(last.data);
			last = last.next;
		}
		
		System.out.println(last.data);
		
		d = new Date();
		System.out.println(d.getTime());
	}
	
	
	
}
