package test4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Jednoduchy performance test pre kolekcie ArrayList a LinkedList
 * @author Jaroslav Jakubik
 *
 */
public class CollectionPerfTest {

	private static final int ITEM_NUMBER = 500000;
	private static final int ITEM_READ_NUMBER = 5000;
	
	public static void main(String[] args) {
		List<Double> d1 = new ArrayList<Double>();
		List<Double> d2 = new LinkedList<Double>();
		
		generateWithTime(d1);
		generateWithTime(d2);
		
		readWithTime(d1);
		readWithTime(d2);
	}

	/**
	 * nahodne vygeneruje hodnoty do zoznamu (aj s meranim casu)
	 * @param lst
	 */
	private static void generateWithTime(List<Double> lst) {
		long start = System.currentTimeMillis();
		generateValues(lst);
		long end = System.currentTimeMillis();
		
		System.out.println((end - start));
	}
	
	/**
	 * nahodne vygeneruje hodnoty do zoznamu 
	 * @param lst
	 */
	private static void generateValues(List<Double> lst) {
		for(int i=0; i<ITEM_NUMBER; i++) {
			lst.add(Math.random());
		}
	}
	
	/**
	 * nahodne precita vybrane hodnoty zo zoznamu(aj s meranim casu)
	 * @param lst
	 */
	private static void readWithTime(List<Double> lst) {
		long start = System.currentTimeMillis();
		readValues(lst);
		long end = System.currentTimeMillis();
		
		System.out.println((end - start));		
	}
	
	/**
	 * nahodne precita vybrane hodnoty zo zoznamu
	 * @param lst
	 */
	private static void readValues(List<Double> lst) {
		for(int i=0; i<ITEM_READ_NUMBER; i++) {
			Random r = new Random();
			int index = r.nextInt(ITEM_NUMBER);
			
			lst.get(index);
		}
	}
}
