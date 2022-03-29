import java.util.Scanner;
public class Insertelement{
	public static void main(String[] args){
		int n;
		int pos;
		int x;

	Scanner s = new Scanner(System.in);

		int[] a = {1,2,3,4,6,7,8};
		System.out.println("the elemnts give are:");
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}

        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();


	  System.out.print("Enter the position where you want to insert element:");
        pos = s.nextInt();

		
		System.out.println("\n Input the number required:");
		x = s.nextInt();

		for(int i = (n-1); i >= (pos-1); i--)
        {
            a[i+1] = a[i];
        }
         a[pos-1] = x;
        System.out.print("After inserting:");
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.print(a[n]);

		


}
}