package com.Spring.Lab;
/*b.. constructor injection with Dependent object*/
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Spring.Lab.entity.Worker;


public class Worker_Test {
	public static void main(String[] args) {
		Resource res=new ClassPathResource("ApplicationContext1.xml");
		BeanFactory b=new XmlBeanFactory(res);
		Worker w=(Worker) b.getBean("wor");
		w.display();
	}
}
