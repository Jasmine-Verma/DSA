import java.util.Scanner;
public class Arrayaltsum{
	public static void main(String[] args) {
		int sum= 0;
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("\n enter the elements of the array: ");
		for(int i=0; i<arr.length; i=i+2){
			arr[i]= sc.nextInt();
			sum = sum + arr[i];
		}

		System.out.println("the alternate Sum is : "+sum);


	}
}