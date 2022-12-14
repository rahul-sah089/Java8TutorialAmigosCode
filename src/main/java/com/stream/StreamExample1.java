package com.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample1 {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Rahul Sah",GENDER.MALE,34),
                new Person("Anjali Sah",GENDER.MALE,40),
                new Person("Sandhya Sah",GENDER.MALE,38),
                new Person("Siddhartha Sah",GENDER.MALE,36),
                new Person("Indu Sah",GENDER.MALE,57),
                new Person("Jay Sah",GENDER.MALE,66)
                );

        Predicate<Person> pr1 = person -> person.getAge() > 40;
        persons.stream().filter(pr1).collect(Collectors.toList()).forEach(System.out :: println);
    }
}

class Person{
    private final String name;
    private final GENDER gender;

    private final Integer age;

    public String getName() {
        return name;
    }

    public GENDER getGender() {
        return gender;
    }

    public Integer getAge() {
        return age;
    }

    public Person(String name, GENDER gender, Integer age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}

enum GENDER{
    MALE,FEMALE,PREFER_NOT_ANSWER
}
