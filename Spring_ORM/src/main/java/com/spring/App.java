package com.spring;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.spring.dao.StudentDao;

import java.util.List;

import java.applet.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args ){
    	
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/config.xml");
//        HibernateTemplate tem=context.getBean("template",HibernateTemplate.class);
//        System.out.println(tem);
        
        StudentDao dao = context.getBean("stDao",StudentDao.class);
        
        Student st=new Student();
        st.setId(1);
        st.setName("rmspring");
        st.setAddress("mumbai,maharashtra");
        
//        int i=dao.saveStudent(st);
//        System.out.println("Insert successfully: "+i);
//        Student st=dao.getStudent(2);
//        System.out.println(st);
        
        
        
        
//        dao.updateStudent(st);
//        System.out.println("update Successfully");
        
        dao.deleteStudent(2);
        List<Student> list= dao.getAllStudent();
        for(Student s:list) {
        	System.out.println(st);
        }
        
        
    }
}
