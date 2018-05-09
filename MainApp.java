package com.pjbielec;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Przemek on 25.04.2018.
 */
public class MainApp {

    public static void main (String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        HelloWorld obj = (HelloWorld)context.getBean("helloWorld");
        obj.getMessage();
        context.registerShutdownHook();

    }
}
