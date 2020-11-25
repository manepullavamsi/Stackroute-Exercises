package com.pratcise.demo.Task1;

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
        Actor actor= context.getBean(Actor.class);
        Movie movie=context.getBean(Movie.class);
        System.out.print(movie.toString());
    }
}
