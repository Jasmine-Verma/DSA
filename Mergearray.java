import java.util.Scanner;
public class Mergearray{
	public static void main(String[] args) {
		int i;
		int[] ar1 = new int[] {10,20,30,40};
		System.out.println("the elements of Array 1:");
		for( i=0; i<ar1.length; i++);
			System.out.println(ar1[i] +",");

		int[] ar2 = new int[] {50,60,70,80};
		System.out.println("the elements of Array 2:");
		for( i=0; i<ar2.length; i++);
			System.out.println(ar2[i] +",");

		int n = ar1.length+ ar2.length;

		int[] c = new int[n];
		for( i=0; i<ar1.length-1; i++){
			c[i] = ar1[i];
		} 

		for( i=0; i<ar2.length-1; i++){
			c[ar1.length+ i]= ar2[i];
		}

		System.out.println("elemnts of New Array:");
		for( i=0; i<c.length; i++){
			System.out.println(c[i]+",");
		}

	}
}