package org.example;

import java.util.Arrays;
import java.util.List;

public class Loops {

    public static void main(String args[]) {
        Loops loops = new Loops();
        loops.forEachExample();
    }
    public void forEachExample() {
        List<Person> persons = Arrays.asList(
                new Person(50, "John", "Doe"),
                new Person(33, "Steve", "Smith"),
                new Person(38, "Virat", "Kohli")
        );

        for(Person p: persons) {
            System.out.printf("First name: %s & Last name: %s age: %d", p.getFirstName(), p.getLastName(), p.getAge());
        }
    }
}

class Person {
    public int getAge() {
        return age;
    }

    public Person(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
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

    int age;
    String firstName;
    String lastName;
}