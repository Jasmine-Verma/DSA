import java.util.Scanner;
public class Binarysearch{
	public static void main(String[] args) {
		int [] ar = {10,20,30,40,50};
		System.out.println("Elements of array are:");
		for(int i=0; i<ar.length; i++){
			System.out.println(ar[i]+",");
		}

		Scanner sc = new Scanner(System.in);

		System.out.println("The element to be searched is :");
		int n = sc.nextInt();
		System.out.println(n);

		int l=0, h=4;
		int mid = (l+h)/2;

		while(l<=h){
			if( ar[mid]==n){
				System.out.println(ar[mid]);
				break;
			}
			elseif(a[mid] < n){
				l= mid+i;
				h=4;
			
			else 
				h= mid -1;
				 l=o;
			}
		}

		if(l>h){
			System.out.println("Element is not found.");
		}

		

	}
}