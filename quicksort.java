class quicksort{
	int partition (int a[], int start, int end)
	{
		int pivot = a[end]; // pivot is the last element
		int i = (start -1);
		for(int j=start; j<= end-1; j++){
			if (a[j] < pivot) {

				i++;
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp = a[i+1];
		a[i+1] = a[end];
		a[end] = temp;
		return(i+1);
	}

	void quicksort( int a[], int start, int end){
		if (start<end) 
		{
			int p = partition(a,start,end);
			quicksort(a, start, p-1);
			quicksort(a, p+1, end);
		}
	}

	void printArr(int a[], int n)
	{
		int i;
		for (i=0;i<n ;i++ ) {
			System.out.println(a[i]+"");
		}
	}

	public static void main(String[] args) {
		int a[] = {10, 30, 3, 20, 4,5,7,8};  // low =0, high = n-1 or a.length - 1
		int n= a.length;
		System.out.println("elements of the array are:");
		quicksort q = new quicksort();
		q.printArr(a,n);
		q.quicksort(a,0,n-1);

		System.out.println("After sorting:");
		q.printArr(a,n);

	}
}