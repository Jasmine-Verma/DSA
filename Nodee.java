import java.util.*;
class Nodee{
	int data;
	Node next;

	Nodee()
	{
		data =0;
		next = n;
	}
	public void Nodee(int data, Node next)
	{
		data = d;
		next = n;

	}
	public void gettData()
	{
		return(data);
	}
	public void getNext()
	{
		return(next);
	}
	public void setNext(Node next)
	{
		next = n;
	}
	public void setData(int data)
	{
		data = d;
	}

}

class Linkedlist{
	int size;
	Node start;

	public LinkedList()
	{
		size = 0;
		start = null;
	}
	public boolean isEmpty()
	{
		if(start == null)
			return(true);
		else 
			return(false);
	}
	public int getListSize()
	{
		return(size);
	}
	public int insertStFirst(int val)
	{
		Node n = new Node(); // when we have to add node in the front we set the pointer to start and the set the new node as start as given bellow
		n.setData(val);
		n.setNext(start);
		start =n;
		size++;

		System.out.println("New node has bwwn added to the front ")
	}
	public insertAtLast(int val)
	{
		Node n = new Node();
		Node temp; // temp node to traverse till we get the last node
		n.setData(val);
		temp = start;
		if(start == null)
		 start = n;
		else {
			while ( temp.getNext()!= null)
			{
				temp = temp.getNext();
			}
			temp.setNext(n);
		}
		size++;
		System.out.println("New Node is added to the last");
	}

	public insetAtPosition(int val , int pos)
	{
		Node n = new Node();
		Node temp;
		n.setData(val);
		temp = start;
		if(pos ==1)
		{
			insertStFirst();
		}
		else if(pos == size)
		{
			insertAtLast();
		}
		else if(pos>1 && pos<=size)
		{
			for(int i =0; i= pos-1; i++)
			{
				temp = temp.getNext();
			}
			n.setNext(temp.getNext());
			temp.setNext(n);
			size++;
		}
		else
			System.out.println("position can not be greater than the size of the linkedlist");

	}

	public deleteAtFirst()
	{
		if(start == null)
			System.out.println("this list is already empty");
		else if(size==1)
		{
			start = null;
			size--;
		}
		else
		{
			start = start.getNext();
			size--;
		}
	}
	public deleteAtLast()
	{
		if(start == null)
			System.out.println("this list is already empty");
		else if(size ==1)
		{
			start = null;
			size --;
		}
		else
		{
			for(int i=0; i=size-1; i++)
			{
				Node temp= temp.getNext();
			}
			temp.setNext(null);
			size--;
		}
	}
	public deleteAtPosition()
	{
		Node temp = new Node();
		Node temp;
		temp = start;
		if(start == null)
			System.out.println("lis is already empty");
		else if(size==1)
		{
			start = null;
			size --;
		}
		else
		{
			for(int i=0; i=pos-1;i++)
			{
				temp = temp.getNext();

			}
			Node t = new Node();
			t=temp.getNext();
			temp.setNext(t.getNext());
			size--;
		}
	}

}