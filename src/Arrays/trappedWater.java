package defaults;

public class trappedWater {
	
	public static int rainWater(int height[]) {
		int n=height.length;
		int left[]=new int[n];
		left[0]=height[0];
		
		for(int i=1;i<n;i++) {
			left[i]=Math.max(height[i], left[i-1]);
			
		}
		
		int right[]=new int[n];
		right[n-1]=height[n-1];
		for(int i=n-2;i>=0;i--) {
			right[i]=Math.max(height[i], right[i+1]);
		}
		int trapped=0;
		for(int i=0;i<n;i++) {
			int waterlevel=Math.min(left[i], right[i]);
			
			trapped+=waterlevel-height[i];
		}
		return trapped;
		
		
		
		
	}
	public static void main(String[] args) {
		int height[]= {4,2,0,6,3,2,5};
		System.out.println(rainWater(height));
		
	}

}
