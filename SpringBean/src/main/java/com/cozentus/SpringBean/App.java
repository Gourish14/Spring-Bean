package com.cozentus.SpringBean;

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
        ApplicationContext ac = new ClassPathXmlApplicationContext("com/cozentus/SpringBean/beanfile.xml");
        User u1 = (User) ac.getBean("mybean");
        System.out.println(u1);
        User u2 = (User) ac.getBean("mybean1");
        System.out.println(u2);
        User u3 = (User) ac.getBean("mybean2");
        System.out.println(u3);
    }
}
