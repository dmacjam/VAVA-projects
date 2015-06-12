package test1;

/**
 * Jednoducha implementacia singleton triedy
 * 
 * @author Jaroslav Jakubik
 */
public class Singleton1 {

	private static Singleton1 SINGLETON = new Singleton1();
	
	/**
	 * privatny konstruktor pre neumoznenie vytvarania instancii
	 */
	private Singleton1() {
	}
	
	public void printBiznis() {
		System.out.println("Biznis");
	}
	
	/**
	 * vratenie jedinej moznej instancie triedy
	 */
	public static Singleton1 getInstance() {
		return SINGLETON;
	}
}
