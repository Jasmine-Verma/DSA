import java.util.*;
 class Node {
     int data;
     Node next;
     Node prev;

     Node(int data) {
         this.data = data;
     }
     Node(int data, Node next) {
         this.data = data;
         this.next = next;
     }
 }
class DLinkedList {
    public static Node start, tail = null;
    public static void main(String args[]) {
        int num, pos;
        Scanner sc = new Scanner(System.in);
        int flag = 1;
        while (flag == 1) {
            System.out.println("Enter your choice");
            System.out.println("1. Create a linked list");
            System.out.println("2. Insert at position");
            System.out.println("3. Insert at Last");
            System.out.println("4. Print List");
            System.out.println("0. To Exit");

            int choice;
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the data");
                    num = sc.nextInt();
                    create_link(num);
                    break;
                case 2:
                    System.out.println("Enter the data and position");
                    num = sc.nextInt();
                    pos = sc.nextInt();
                    insert_node(num, pos);
                    break;

                case 3:
                    System.out.println("Enter the data");
                    num = sc.nextInt();
                    insert_last(num);
                    break;

                case 4:
                    print_list(start);
                    break;
                

            }
            System.out.println("Press 1 to continue");
            flag = sc.nextInt();
        }
    }

    public static void create_link(int num) {
        Node newnode = new Node(num);
        if (start == null) {
            start = tail = newnode;
        } else {
            newnode.prev = tail;
            tail.next = newnode;
            tail = newnode;
        }
    }

    public static void print_list(Node start) {
        Node temp;
        for (temp = start; temp != null; temp = temp.next) {
            System.out.println(temp.data);
        }

    }

    public static void insert_last(int num) {
        Node new_node = new Node(num);
        new_node.next = start.next;
        start.next = new_node;
        new_node.prev = start;
        if (new_node.next != null)
            new_node.next.prev = new_node;
    }
    public static void insert_node(int num, int pos) {
        Node newnode = new Node(num);
        if (pos == 1) {
            newnode.next = start;
            start.prev = newnode;
            start = newnode;
        } else {
            int i = 0;

            Node current = start;
            Node prev = null;

            while (i < pos - 1) {
                prev = current;
                current = current.next;
                if (current == null) {
                    break;
                }
                i++;
            }

            newnode.next = current;
            newnode.prev = prev;
            prev.next = newnode;
            current.prev = newnode;
        }
    }
}