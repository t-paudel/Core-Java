package LinkedList;

public class Main extends LinkedList
{
	public static void main(String args[])
	{
		LinkedList list = new LinkedList();
		for(int i=0;i<100;i++)
		{
		list = LinkedList.insert(list, 1);
		list = LinkedList.insert(list, 5);
		list = LinkedList.insert(list, 4);
		list = LinkedList.insert(list, 3);
		list = LinkedList.insert(list, 2);
		}
		//LinkedList.insert(list, 10, 5);
		LinkedList.printList(list);
		
		
	}

}

//1568806666034
//1568806666041
//
//