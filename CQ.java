// DELETE EVEN ELEMENTS FROM CIRCULAR QUEU //
class CQ{
	int rear, front, max= 100; 
	int[] a = new int[max];
	CQ()
	{
	rear= -1;
	front=-1;
	}

boolean isFull() {
if (front == 0 && rear== max - 1 11 front == rear + 1)
 { return true;
	} 
	else 
	{
	return false;
	}
}
boolean isEmpty() {
if(front==-1) 
{
	return true;
		}
		 else 
		{
		return false;
		}
}
public int dequeue() {

	if (isEmpty()) 
		{
		System.out.println("Queue is Empty! "); 
		return (-1);
		} 
	else 
		{
		int item= a[front]; if (front == rear) 
		{
		front=-1; rear= -1;
		} 
	else
		{
		front= (front+ 1) % max;
		}
	return item;
	}

}

void display() {
int i;
	if (isEmpty())
	System.out.println("Queue is empty.");
	else 
		{
		}

	for (i = front; i != rear; i = (i + 1) % max)
		{
		 System.out.print(a[i] +" ");
		System.out.println(a[i]); 

	}
}





}