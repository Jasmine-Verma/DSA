import java.util.Scanner;
class Doublearray{
	public static void main(String args[]){
	int i
	Scanner s = new Scanner(System.in);
	int[][] a = new int[3][3];
	System.out.println("Enter the elements of the array ");
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
		a[i][j] = s.nextInt();
		}	
	}
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
		System.out.print(" "+a[i][j]);
		}
	System.out.println();
	}
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
		if(a[i][j]%2!=0){
			a[i][j] = a[i][j]*2;
		}
		}
	}
	System.out.println();
	for(i=0;i<3;i++){
		for(j=0;j<3;j++){
		System.out.print(" "+a[i][j]);
		}
	System.out.println();
	}

	}
}