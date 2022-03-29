import java.util.Scanner;
class Removeelement{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of array : ");
	int size =sc.nextInt();

	int[] arr= new int[size];
	System.out.println("\n Enter the elements of the array : ");
	for(int i=0;i<size;i++){
		arr[i]=sc.nextInt();
	}

	System.out.println("Enter the index whose element needs to be removed : ");
	int r = sc.nextInt();
	for(int i=r+1;i<size;i++){
		arr[i-1]=arr[i];
		size--;
	}

	System.out.println("New Array : ");
	for(int i=0;i<size;i++){
		System.out.println(+arr[i]);
	}
}
}