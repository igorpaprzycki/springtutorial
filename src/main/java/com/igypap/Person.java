package com.igypap;

/**
 * Created by igypap on 14.01.17.
 */
public class Person {
    private int id;
    private String name;
    private String surname;
    private int age;
    private int taxId;
    private Address address;


    public Person(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }



    public static Person getInstance(int id, String name, String surname, int age){
        System.out.println("Creating person using factory method");
        return new Person(id,name,surname,age);
    }

    public void onCreate() {
        System.out.println("Person created: " + this);
    }

    public void onDestroy() {
        System.out.println("Person destroyed: " + this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String speak() {
        return "Siema! Nazywam się " + name + " " + surname + " i mam " + age + " lat.";
    }

    public int getTaxId() {
        return taxId;
    }

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", taxId=" + taxId +
                ", address=" + address +
                '}';
    }


}
