package ArrayList;

import java.util.ArrayList;
import java.util.Collections;


public class _CollectionSort {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		// add elemenet
		
		list.add(2);
		list.add(5);
		list.add(9);
		list.add(3);
		list.add(6);
		
		System.out.println(list);
		
		// COllection sort in Asceneding order
		Collections.sort(list);
		System.out.println("Ascending Order "+list);
		
		// decensding
		Collections.sort(list,Collections.reverseOrder());
		//comparator -- Fnx logic
		
		System.out.println("Descending Order " +list);
	}
}
















































































































