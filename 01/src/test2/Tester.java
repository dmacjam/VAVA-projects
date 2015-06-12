package test2;

import java.lang.reflect.Method;

/**
 * Nastroj, ktory s vyuzitim reflexie spusta oannotovane metody.
 * 
 * @author Jaroslav Jakubik
 */
public class Tester {

	public static void main(String[] args) throws Throwable {
		String cls = "test2.TestCls";
		
		Class<?> c1 = Class.forName(cls);
		Object o = c1.newInstance();
		
		for(Method m : c1.getMethods()) {
			RunMe anot = m.getAnnotation(RunMe.class);
			if(anot != null) {
				m.invoke(o);
			}
		}
	}

}
