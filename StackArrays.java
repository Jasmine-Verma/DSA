class Stack {
  private int max = 100, top;
  private int arr[] = new int[max];

  Stack() {
    top = -1;
  }

  boolean isEmpty() {
    return (top < 0);
  }

  public void push(String val) {
    if (top >= (max - 1)) {
      System.out.println("Stack Overflow! ");
    } else {

      arr[++top] = val;
      System.out.println(val);

    }

  }

  public int pop() {
    if (top < 0) {
      System.out.println("Stack Underflow!");
      return 0;
    } else {
      int val = arr[top--];
      return val;
    }
  }

  public int peek() {
    if (top < 0) {
      System.out.println("Stack Underflow! ");
      return 0;
    } else {
      int val = arr[top];
      return val;
    }
  }

  public void reverse(String k) {
    String[] token = k.split(" ");
    for (String word: token) {
      push(word);

    }
    while (!isEmpty()) {
      System.out.println(peek() + " ");
      pop();
    }
  }
}

public class StackArrays {

  public static void main(String[] args) {

    Stack s = new Stack();
    String k = "my java world!";
    s.reverse(k);

  }

}