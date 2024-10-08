package defaults;

public class binarySearch {
	public static int binarySearch(int numbers[],int key) {
		int start=0, end=numbers.length-1;
		
		while(start<=end) {
			int mid=(start+end)/2;
			
			//comparisons
			if(numbers[mid]==key) { // found
				return mid;
			}
			if(numbers[mid]<key) { //right
				start=mid+1;
			}
			else { //left
				end=mid-1;
			}
		}
		return -1;
		  
	}
	public static void main(String[] args) {
		int numbers[]= {2,4,6,8,10,12,14,16,23};
		int key=23;
		System.out.println("The Index key is "+binarySearch(numbers,key));
		
	}

}
