import java.util.Scanner;
public class Frequency{
	public static void main(String[] args) {

		int i, n, count=0; 
		int[] arr = new int[] {10,20, 40,10,15,10,10,15,10,26};

		System.out.println("Given Array:");
		for(i=0;i<arr.length; i++){
			System.out.println(arr[i]+",");
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("\n number who's frequency is to be found:");
		n = scan.nextInt();

		for(i=0; i<arr.length; i++){
			if(arr[i] == n){
				count++;
				continue;

			}
		}

		 System.out.println("the frequency of the element is:"+count);
	}
}