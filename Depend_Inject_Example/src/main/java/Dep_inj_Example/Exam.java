package Dep_inj_Example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
public static void main(String arg[])
{
	
	ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
	System.out.println("config......Loaded");
	
	Student a=c.getBean("a",Student.class);
	a.disp();
	}
}
