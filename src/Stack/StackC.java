package stack;
import java.util.*;
public class StackC {
	
	public static void main(String[] args) {
		Stack<Integer> stk=new Stack<>();
		stk.push(1);
		stk.push(2);
		stk.push(3);
		
		while(!stk.isEmpty()) {
			System.out.println(stk.peek());
			stk.pop();
		}
	}
	
}
