package test3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Jednoduchy priklad pre pouzitie Comparable a Comparator
 * @author Jaroslav Jakubik
 *
 */
public class CollTest {

	private static final long ITEM_NUMBER = 500;
	
	public static void main(String[] args) {
		List<CollItem> l1 = new ArrayList<CollItem>();
		
		generateValues(l1);
		
		sortList1(l1);
		sortList2(l1);
		
		printValues(l1);
	}
	
	/**
	 * nahodne vygeneruje objekty CollItem do zoznamu
	 * @param lst
	 */
	private static void generateValues(List<CollItem> lst) {
		for(int i=0; i<ITEM_NUMBER; i++) {
			CollItem ci = new CollItem();
			ci.setD1(Math.random());
			ci.setD2(Math.random());
			
			lst.add(ci);
		}
	}
	
	/**
	 * vypise hodnoty cez zoznam 
	 * @param lst
	 */
	private static void printValues(List<?> lst) {
		for(Object o : lst) {
			System.out.print(o.toString() + ", ");
		}
		System.out.println();
	}
	
	/**
	 * usporiada hodnoty v zozname (cez Comparable)
	 * @param lst
	 */
	private static void sortList1(List<CollItem> lst) {
		Collections.sort(lst);
	}

	/**
	 * usporiada hodnoty v zozname (cez Comparator)
	 * @param lst
	 */
	private static void sortList2(List<CollItem> lst) {
		Collections.sort(lst, new Comparator<CollItem>(){
			@Override
			public int compare(CollItem o1, CollItem o2) {
				if(o1.getSum() > o2.getSum()) {
					return 1;
				} else if(o1.getSum() < o2.getSum()) {
					return -1;
				} else {
					return 0;
				}
			}});
	}
}
