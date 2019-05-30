public class Main
{
	public static void main(String[] args)
  {
		LinkedList list = new LinkedList();
		list.insert(18);
		list.insert(45);
		list.insert(12);
		list.insert(97);
	  list.deleteStart();
		list.insertAtStart(25);
		list.insertAtInd(3,57);
		list.deleteAtInd(3);
		list.show();
	}
}
class Node
{
int data;
Node next;
}
class LinkedList 
{
	Node head;
	
	public void insert(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head==null)
		{
			head = node;
		}
		else
		{
			Node n = head;
			while(n.next!=null)
			{
				n = n.next;
			}
			n.next =  node;
		}
		
	}
	public void insertStart(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}
	public void deleteAtStart()
	{
	    head=head.next;
	    
	}
	
	public void insertAtInd(int index,int data)
	{
	    Node node=new Node();
	    node.data=data;node.next=null;
	    if(head==null)
	    {
	       head=node; 
	    }
	    else{
	        Node n=head;
	    for(int i=0;i<index-1;i++)
	    {
	        n=n.next;
	    }
	    node.next=n.next;
	    n.next=node;
	        
	    }
	}
	public void deleteend()
	{
	    Node n=head;
	    Node pre=n;
	    while(pre.next!=null)
	    {
	        n=n.next;
	        pre=n.next;
	        
	    }n.next=null;
	}
	public void deleteAtInd(int index)
	{
	    Node n=head;
	    
	    Node n1=null;
	    for(int i=0;i<index-1;i++)
	    {
	        n=n.next;
	    }
	    n1=n.next;
	    n.next=n1.next;
	    n1=null;
	    
	}
	public void show()
	{
		Node node = head;
		
		while(node.next!=null)
		{
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
}
