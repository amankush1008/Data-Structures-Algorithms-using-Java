package graphs;
import java.util.*;
public class _Knapsack_01 {
	
	public static int knapsack(int[] weights,int[]values,int capacity) {
		int n=weights.length;
		int [][]dp=new int[n+1][capacity+1];
		
		//for table
		for(int i=0;i<=n;i++) {
			for(int w=0;w<=capacity;w++) {
				if(i==0 || w==0) {
					dp[i][w]= 0;
				}
				else if(weights[i-1]<=w) {
					dp[i][w]=Math.max(values[i-1]+dp[i-1][w-weights[i-1]], dp[i-1][w]);
				}
				else {
					dp[i][w]=dp[i-1][w];
				}
			}
		}
		return dp[n][capacity];
		
	}
	public static void main(String[] args) {
		int[]weights= {2,4 ,6,3};
		int [] values= {2,3,3,12};
		int capacity=8;
		int maxValue=knapsack(weights,values,capacity);
		System.out.println("Maximum profit obtained is "+maxValue);
		
	}

}
