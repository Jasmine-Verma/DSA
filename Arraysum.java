import java.util.Scanner;
public class Arraysum{
	public static void main(String[] args) {
		int sum= 0;
		int sum1 = 0;
		int sum2= 0;

		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("\n enter the elements of the array: ");

		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
			sum = sum + arr[i];
		}

		//SUM OF ALT ELEMENTS
		System.out.println("\n enter the alternate elements of the array: ");

		for(int i=0;i<arr.length;i++){
		if(i % 2 != 0){
         sum1+=arr[i];
      }
      else{
      	sum2 += arr[i];
       }	
	}

	
		System.out.println("the Sum is : "+sum);
		System.out.println("the alternate Sum is : "+sum1);
		System.out.println("the alternate Sum is : "+sum2);
		


		// SECOND LARGEST ELEMENT

		 for(int i=0;i<5;i++){

                for(int j=i+1;j<5;j++){

                    if(arr[i]>arr[j]){
                     int a = 0;
                     a=arr[i];
                        arr[i]=arr[j];
                        arr[j]=a;
            }
        }
    }
    System.out.println("The second largest number is : "+arr[5-2]);



	}
}