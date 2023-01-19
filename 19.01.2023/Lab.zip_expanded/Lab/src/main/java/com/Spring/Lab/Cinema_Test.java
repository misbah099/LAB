package com.Spring.Lab;
/*a.. constructor injection with collection*/
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.Spring.Lab.entity.Cinema;


public class Cinema_Test {
	public static void main(String[] args) {
		Resource res=new ClassPathResource("ApplicationContext1.xml");
		BeanFactory b=new XmlBeanFactory(res);
		Cinema cn=(Cinema) b.getBean("cin");
		cn.display();
	}
}
