public class Array1{
	public static void main(String[] args){

		int[] firstSet = {2,4,6,8,1,3,7,10};

		int[] neww = firstSet;
		neww[0] = firstSet[7];
		neww[7] = firstSet[0];

		for (int i=0; i<firstSet.length; i++){
			System.out.println(neww[i]);

		}



		//int[] secondSet = new int[5];
		 //secondSet[0] = 1;
		// secondSet[1] = 2;
		// secondSet[2] = 4353;
		 //secondSet[3] = 4;
		 //secondSet[4] = 5;

		 //for(int num: secondSet){
		 	//System.out.println(num);

		 //}

	}
	
}