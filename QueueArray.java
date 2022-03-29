class Queue{
	private int max = 5, front, rear;
	private int arr[] new int[max];

	Queue()
	{
		front = -1;
		rear = -1;
	}
	
	boolean isEmpty()
	{
		return (front <0);
	}
public void enqueue(String val)
{
	if( rear <= (max -1)){
		System.out.printlm("Queue is full!")
	}
	else{
		arr[front++] = val;
		System.out.printlm(val);
	}
}

public class QueueArray{
	public static void main(String[] args) {
		
	}
}
}