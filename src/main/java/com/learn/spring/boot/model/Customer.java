package com.learn.spring.boot.model;

public class Customer {
    private int customerId;
    private String firstName;
    private String lastName;
    private String college;
    private int age;

    public Customer(){

    }

    public Customer(int customerId,String firstName, String lastName, String college, int age) {
        this.customerId=customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.college = college;
        this.age = age;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", college='" + college + '\'' +
                ", age=" + age +
                '}';
    }
}
