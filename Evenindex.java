public class Evenindex{
	public static void main(String[] args){
		int[] a = {1,20, 11, 3, 4, 7, 9, 12, 0};
			System.out.println("Elements present in Even index are as follows: ");
	for(int i=0;i<a.length;i++){
		if(a[i]%2==0){
		System.out.println(a[i]);}
	}
	System.out.println("Odd Elemets of the array are as follows ");
	for(int i=0;i<a.length;i++){
		if(a[i]%2!=0){
			System.out.println(a[i]);
		}
	}
	}
}