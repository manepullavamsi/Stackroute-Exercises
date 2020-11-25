package com.pratcise.demo.Task2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
        Movie bean1=context.getBean("movie1",Movie.class);
        Movie bean2=context.getBean("movie2",Movie.class);

        System.out.println(bean1.toString());
        System.out.println(bean1==bean2);
        
    }
}
