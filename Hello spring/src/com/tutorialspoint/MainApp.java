package com.tutorialspoint;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext();
	    HELLOWORLD obj = (HELLOWORLD) context.getBean("helloWorld");
	      obj.getMessage();
	   }

}
