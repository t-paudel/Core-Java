package LinkedList;

public class Main extends LinkedList
{
	public static void main(String args[])
	{
		LinkedList list = new LinkedList();
		list = LinkedList.insert(list, 1);
		list = LinkedList.insert(list, 5);
		list = LinkedList.insert(list, 4);
		list = LinkedList.insert(list, 3);
		list = LinkedList.insert(list, 2);
		
		LinkedList.printList(list);
		

	}

}
