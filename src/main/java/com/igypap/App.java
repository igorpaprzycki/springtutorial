package com.igypap;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by igypap on 14.01.17.
 */
public class App {
    public static void main(String[] argsn) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        context.close();
    }
}




