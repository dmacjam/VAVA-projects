package test6;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Moznosti ziskania Locale + praca s ResourceBundle
 * @author Jaroslav Jakubik
 *
 */
public class LocaleTest {

	public static void main(String[] args) {
//		System.out.println(Locale.ENGLISH);
//		System.out.println(new Locale("sk"));
		System.out.println(Locale.getDefault());
//		System.out.println(Locale.forLanguageTag("sk"));
		
		ResourceBundle rb = ResourceBundle.getBundle("Test", new Locale("sk"));
		System.out.println(rb.getString("sk.vasva.fiit.text1"));
	}

}
