package test5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * "Performance" test operacie plus vs. StringBuffer/StringBuilder
 * @author Jaroslav Jakubik
 */
public class StringTest {

	private static final int STR_NUM = 50000;
	
	public static void main(String[] args) {
		List<String> strs = generateStrs();
		
		doPlusWithStringBuffer(strs);
		doPlus(strs);
		
	}
	
	/**
	 * nahodne vygeneruje zoznam stringov 
	 * @return
	 */
	private static List<String> generateStrs() {
		List<String> result = new ArrayList<String>(STR_NUM);
		
		Random r = new Random();
		for(int i=0; i<STR_NUM; i++) {
			result.add(String.valueOf(r.nextInt()));
		}
		
		return result;
	}
	
	/**
	 * spaja retazce zo zoznamu cez operaciu +
	 * @param strs
	 * @return
	 */
	private static String doPlus(List<String> strs) {
		long start = System.currentTimeMillis();
		
		String result = "";
		for(String curStr : strs) {
			result += curStr;
		}
		
		long end = System.currentTimeMillis();
		System.out.println("doPlus " + (end - start));
		
		return result;
	}
	
	/**
	 * spaja retazce zo zoznamu cezStringBuffer
	 * @param strs
	 * @return
	 */
	private static String doPlusWithStringBuffer(List<String> strs) {
		long start = System.currentTimeMillis();
		
		StringBuffer result = new StringBuffer();
		for(String curStr : strs) {
			result.append(curStr);
		}
		
		long end = System.currentTimeMillis();
		System.out.println("doPlusWithStringBuffer " + (end - start));
		
		return result.toString();
	}
}
