public class LinkList {

	Node head;
	public static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data=d;
		}
	}
	
	public static LinkList insert(LinkList list,int data)
	{
		Node node=new Node(data);
		node.next=null;
		
		if(list.head==null)
		{
			list.head=node;
		}
		else
		{
			Node last = list.head;
			while(last.next!=null)
			{
				last=last.next;
			}
		      last.next=node;
		}
		return list;
	}
	
	 public static void printlist(LinkList list)
	{
		
		Node n=list.head;
		System.out.print("linklist is: ");
		while(n!=null)
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
		
	}
	
	public static void main(String [] args)
	{
		LinkList list = new LinkList();
		
		list =insert(list,1);
		list =insert(list,7);
		list =insert(list,2);
		list =insert(list,3);
		list =insert(list,6);
		
		
		printlist(list);
	}
}