class Node{
	private int data;
	private Node next;

	public Node() // constructor (default)
	{
		data =0; // initiate
		next = null; //1st and last node 
	}

	public Node(int d, Node n)
	{
		data =d;
		next = n;
	}

	public void setData(int d)
	{
		data= d;
	}
	public void setNext( Node n)
	{
		next = n;
	}
	public int getData()
	{
		return(data);
	}
	public Node getNext()
	{
		return(next);
	}

}