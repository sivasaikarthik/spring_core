package org.karthik.spring;

//\import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.FileSystemResource;

//import org.springframework.beans.factory.BeanFactory;

public class Drawingapp {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		//triangle t=new triangle();
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("NewFile.xml"));
		//class path xml u dont need to send file system resource
		ApplicationContext c=new ClassPathXmlApplicationContext("spring.xml");
		triangle t=(triangle)  c.getBean("t");
		t.draw();

	}

}
