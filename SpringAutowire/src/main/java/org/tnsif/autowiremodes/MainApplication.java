package org.tnsif.autowiremodes;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*program to demonstrate on autoWiring modes*/
//driver class
public class MainApplication {

	public static void main(String[] args) {
		ApplicationContext a=new ClassPathXmlApplicationContext("beans.xml");
		TextEditor t=(TextEditor) a.getBean("text");
		t.display();



	}

}
