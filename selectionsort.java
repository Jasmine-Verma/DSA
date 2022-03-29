class selectionsort{
	void sort(int arr[]) {
		int n= arr.length;
		for (int i=0;i<n-1 ;i++ ) {
			int min_id = i;

			for (int j=i+1; j<n ;j++ ) {
				if (arr[j] < arr[min_id]) {
					min_id= j;		
					
				}
			}
			int temp= arr[min_id];
			arr[min_id]= arr[i];
			arr[i] = temp;
			
		}

	}

	void printArray(int arr[]){
		int n = arr.length;
		for (int i=0; i<n ;i++ ) {
			System.out.println(arr[i]+"");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		selectionsort array = new selectionsort();
		int arr[]= { 5,1,2, 4, 6 };
		array.sort(arr);
		System.out.println("Sorted array =" );
		array.printArray(arr);
		
	}
}