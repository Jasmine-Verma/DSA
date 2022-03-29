public class Arrayswap{
	public static void main(String[] args){

		int[] firstSet = {2,4,6,8,1,3,7,10};

		int[] neww = firstSet;

		int c;
		 c = neww[0];
		neww[0] = neww[7];
		neww[7] = c;

		for (int i=0; i<neww.length; i++){
			System.out.println(neww[i]);

		}

	}
}

		
