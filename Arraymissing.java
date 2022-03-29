public class Arraymissing{
	public static void main(String[] args){

		int[] missing = {1,2,3,4,5,6,7,8,9,11,12,13,14,15,16,17,18,19,20};

		int x = 20;
		int total= (x*(x+1))/2;

		int sum = 0;
		for(int i=0; i<missing.length; i++){
			sum += missing[i];
		}

		int diff = total - sum;
		System.out.print("the missing digit is = "+diff);

	}
}