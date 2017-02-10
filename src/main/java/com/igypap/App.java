package com.igypap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by igypap on 14.01.17.
 */
public class App {
    public static void main(String[] argsn) {
        ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/igypap/beans/beans.xml");

//        Person person = (Person) context.getBean("person");
//        System.out.println(person);
//        System.out.println("===============================");
//        Address address2 = (Address)context.getBean("address2");
//        System.out.println(address2);
        ((FileSystemXmlApplicationContext) context).close();
    }
}




