package edu.kiet.firstspring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App 
{
    public static void main( String[] args )
    {
    	 Resource resource=new ClassPathResource("edu/kiet/firstspring/first.xml");  
    	    BeanFactory context=new XmlBeanFactory(resource);  
    	      
    	    Student student=context.getBean("student",Student.class);  
    	    student.displayInfo();
    }
}
