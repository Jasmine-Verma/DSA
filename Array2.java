public class Array2{
	public static void main(String[] args){

		int min, max;

		int[] array = new int[4];
		array[0] = 3;
		array[1] = 5;
		array[2] =1;
		array[3] = 10;

		min = array[0];
		for(int i=0; i<array.length; i++){
			if(array[0]>array[i]){
			min = array[i];
			}
		}

		max = array[0];
		for(int i=0; i<array.length; i++){
			if(array[0]<array[i]){
			max = array[i];
			}
		}

		int diff = max - min;
		System.out.print.("the difference is"+diff);

	}
}