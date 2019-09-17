package LinkedList;

public class LinkedList
{
	Node head;
	
	public static LinkedList insert(LinkedList list, int data)
	{
		Node new_node = new Node(data);
		new_node.next=null;
		
		if(list.head == null)
			list.head = new_node;
		else
		{
			Node last_node = list.head;
			while(last_node.next!=null)
				last_node = last_node.next;
		
			last_node.next = new_node;
		}
		return list;
	}	
	
	public static void printList(LinkedList list)
	{
		Node last = list.head;
		while(last.next != null)
		{
			System.out.println(last.data);
			last = last.next;
		}
		
		System.out.println(last.data);
	}
	
	
}
