public class Sorting{
	public static void main(String[] args){
		int[] a = {10, 30, 20, 5, 40,15, 3};
		int c=0;

		System.out.println("Elements of array are: 10, 30, 20, 5, 40, 15, 3" );

		for(int i=0; i<a.length; i++){
			for(int j=i+1; j<a.length; j++){
				if(a[i]>a[j]){
			 c = a[i];
			a[i] = a[j];
			a[j] = c;

				}
			}
		}
		System.out.println("\n Elemnts sorted");
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]+"|");
		}
	}
}