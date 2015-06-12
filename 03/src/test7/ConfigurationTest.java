package test7;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 * Nacitanie konfiguracie z properties suboru a precitanie vybraneho parametra
 * @author Jaroslav Jakubik
 *
 */
public class ConfigurationTest {

	public static void main(String[] args) throws Exception {

		InputStream is = new FileInputStream(new File("etc/config.properties"));
		
		Properties p = new Properties();
		p.load(is);
		
		is.close();
		
		System.out.println(p.getProperty("timeout"));
	}

}
