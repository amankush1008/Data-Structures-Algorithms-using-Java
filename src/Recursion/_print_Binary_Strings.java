package Recursion;

public class _print_Binary_Strings {
	public static void printBinary(int n,int lastPlace,String str) {
		//base case
		if(n==0) {
			System.out.println(str);
			return;    
		}
		printBinary(n-1,0,str+("0"));
		if(lastPlace==0) {	
			printBinary(n-1,1,str+("1"));
		}
	}
	public static void main(String[] args) {
		printBinary(3,0,""); 
	}

}
