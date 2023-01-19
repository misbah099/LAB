package com.Spring.Lab;
/*c.. constructor injection with Double based value*/
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Spring.Lab.entity.Classroom;


public class Classroom_Test {
	public static void main(String[] args) {
		Resource res=new ClassPathResource("ApplicationContext1.xml");
		BeanFactory b=new XmlBeanFactory(res);
		Classroom c=(Classroom) b.getBean("M");
	    c.display();
}
}
