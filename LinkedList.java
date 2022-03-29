class LinkedList{
	private int size;
	private Node start; // declaration only 

	public LinkedList()
	{
		size=0;
		start=null;  //linkedlist is empty
	}
	public boolean isEmpty()
	{
		if(start== null)
			return(true);
		else
			return(false);
	}

	public int getListSize()
	{
		return(size);
	}

	public void viewList()
	{
		Node t;
		t=start;
		if(isEmpty())
		{
			System.out.println("List is empty");
		}
		else
		{
			for(int i=1; i<size; i++)   // for traversal of the linked list, hopping is used where t is used at the reference and t = start in the begining
			{
				System.out.println(""+t.getData());
				t= t.getNext();
			}
		}
	}

	public void insertAtFirst(int val)
	{ // when we have to add node in the front we set the pointer to start and the set the new node as start as given bellow
		Node n = new Node();
		Node temp; // temporary node 
		n.setData(val);
		n.setNext(start);
		start = n; // new start value here is now n
		size++;
		System.out.println("New Node has been added to the front");
// as n is the 1st and last node so n is start an is pointing to null
	}


	public void insertAtLast(int val)
	{
		Node n = new Node();
		Node temp;
		n.setData(val);
		temp = start;
		if(temp == null){ // same as insertion at first
			start = n; // if there is no node then n is the first node
		}
		else // we check which node's next element is null
		{
			while(temp.getNext()!= null)
			{
				temp = temp.getNext(); // this will ruun till we get the last not pointig to null

			}
			temp.setNext(n);
		}
		size++;
		System.out.println("New Node has been Printed at the end");

	}

	public void insertAtPosition(int pos,int val)
	{
		Node n = new Node();
		Node temp;
		temp = start;
		if(pos == 1)
		{
			insertAtFirst(val);
		}
		else if(pos == size +1)
			insertAtLast(val);
		else if(pos>1 && pos<=size)
		{
			for(int i=1; i<pos-1; i++)
			{
				temp = temp.getNext();// the previous node ie the one at pos-1 
			}		
			n.setData(val);
			n.setNext(temp.getNext()); //setting the next ointer as m 
			temp.setNext(n);
			size++;
		}
		else
	
			System.out.println("the position can'nt be greater than the size of the linkedlist");
	}
	

	public void deleteStart()
	{
		if(start == null)
	{
	System.out.println("the list is empty");
	}
		else if (size == 1)
			{
				start= null;
				size --;

			}
		else
		{
			start = start.getNext();
			size--;
		}
	}

	public void deletePos(int pos)
	{

		if(start == null)
		{
			System.out.println("the list is empty");
		}
		else if(size == 1)
		{
			start = null;
			size--;
		}
		else 
		{
			int i;
			Node temp = new Node();
			temp = start;
			for(i=0; i<pos-1; i++)
			{
				temp = temp.getNext();
			}
			
			Node t = new Node();
			t = temp.getNext();
			temp.setNext(t.getNext());
			size--;
		}

	}

	public void deleteEnd()
	{
		if(start == null)
		{
			System.out.println("This list is empty");
		}
		else if(size ==1)
		{
			start = null;
			size--;
		}
		else
		{
			int i;
			Node temp = new Node();
			temp = start;
			for(i=0; i<size-1; i++)
			{
				temp = temp.getNext();
			}
			temp.setNext(null);
			size--;
		}
	}


	

	


}