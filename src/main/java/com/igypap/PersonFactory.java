package com.igypap;

/**
 * Created by igypap on 14.01.17.
 */
public class PersonFactory {
    public Person createPerson(int id, String name, String surname, int age) {
        System.out.println("Using PersonFactory to create bean Person");
        return new Person(id, name, surname, age);
    }
}
