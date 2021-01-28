package org.karthik.spring.objects;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext d=new ClassPathXmlApplicationContext("injectionObjects.xml");
		tri treat=(tri)  d.getBean("treat");
		treat.draw();
      
	}

}
