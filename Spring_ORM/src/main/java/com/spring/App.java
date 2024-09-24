package com.spring;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/config.xml");
        HibernateTemplate tem=context.getBean("template",HibernateTemplate.class);
        System.out.println(tem);
        
    }
}
