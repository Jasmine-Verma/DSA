import java.util.*;

class CircularDeq{
    
    int front;
    int rear;
    int max = 10;
    int queue[] = new int[max]; 

    CircularDeq(){
        front = -1;
        rear = -1;
    }

    int getSize(){
        int s = queue.length;
        return s;
    } 

    boolean isEmpty()
    {
        if(rear == -1 && front == -1)
            return true;
        else
            return false;
    } 

    boolean isFull()
    {
        if((rear+1) % max == front)
            return true;
        else
            return false;
    } 

    void enqueue(int val)
    {
        if(isFull())
        {
            System.out.println("Queue overflow!");
        }
        else if(front == -1 && rear == -1)
        {
            front = rear = 0;
        }
        else
        {
            rear = (rear+1) % max;
        }
        queue[rear] = val;
    } 

    void dequeue()
    {
        if(isEmpty())
        {
            System.out.println("Queue underflow!");
        }
        else{
            int val = queue[front];
            if(val%2 == 0)
            {
                if(front == rear)
                {
                    front = rear = -1;
                }
                else
                {
                    front = (front+1) % max;
                }
            }
        }
    } 
    
    void peek()
    {
        System.out.println(queue[front]);
    } 

    void display()
    {
        for(int i=front; i<=rear; i++)
        {
            System.out.print(queue[i]+" ");
        }
        System.out.println("");
    }
}

class delete{
    public static void main(String args[])
    {
        
        CircularDeq q = new CircularDeq();
        int l;

        q.enqueue(2);
        q.enqueue(4);
        q.enqueue(6);
        q.enqueue(8);
        q.enqueue(10);
        q.enqueue(1);
        q.enqueue(5);
        q.enqueue(3);
        q.enqueue(7);
        q.enqueue(9);
        System.out.println("Original queue:");
        q.display();
    
        for(int j=0;j<10;j++)
        {
            q.dequeue();
        }
        System.out.println("Queue after deletion:");
        q.display();
    }
}