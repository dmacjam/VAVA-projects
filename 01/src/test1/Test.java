package test1;

import java.lang.reflect.Constructor;

/**
 * Jednoducha test trieda pre vyskusanie Singleton implementacii.
 * 
 * @author Jaroslav Jakubik
 */
public class Test {

	public static void main(String[] args) throws Throwable {
		//Singleton1 s = new Singleton1();
		
		Singleton1 s = Singleton1.getInstance();
		System.out.println(s);
		
		Constructor<Singleton1> c = Singleton1.class.getDeclaredConstructor();
		c.setAccessible(true);
		Singleton1 s1 = c.newInstance();
		System.out.println(s1);
		Singleton1 s2 = c.newInstance();
		System.out.println(s2);
		
		Singleton2.INSTANCE.printBiznis();
		System.out.println(Singleton2.INSTANCE);
	}

}
