package test2;

/**
 * Test classa pre vyskusanie custom annotacie
 * 
 * @author Jaroslav Jakubik
 */
public class TestCls {
	
	@RunMe
	public void test1() {
		System.out.println("test1");
	}

	public void test2() {
		System.out.println("test2");
	}
	
	@RunMe
	public void test3() {
		System.out.println("test3");
	}
	
	public void test4() {
		System.out.println("test4");
	}
	
}
