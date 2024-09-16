package com.navspring.spring.DOM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Appc 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        Laptop1  obj = new Dell();
//        obj.disp();
        
        ApplicationContext context=new ClassPathXmlApplicationContext("SpringAbhi.xml");
      laptop1 obj =(laptop1)context.getBean("lenovo");  
      obj.disp();
    }
}
