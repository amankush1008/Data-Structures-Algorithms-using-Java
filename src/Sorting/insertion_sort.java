package sorting;

public class insertion_sort {
	
	public static void insert(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			int curr=arr[i];
			int prev=i-1;
			while(prev>=0 && arr[prev]>curr) { // find position
				arr[prev+1]=arr[prev];
				prev--;
			}
			//insertion
			arr[prev+1]=curr;
		}
	}
	
	public static void printarr(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int arr[]= {5,4,1,3,2};
		insert(arr);
		printarr(arr);
	}

}
