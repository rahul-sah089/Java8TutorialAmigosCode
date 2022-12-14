package com.imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> peoples = List.of(
                new Person("Ayyapa",GENDER.MALE),
                new Person("Rahul",GENDER.MALE),
                new Person("Sangram",GENDER.MALE),
                new Person("Ayesha",GENDER.FEMALE),
                new Person("Luqman",GENDER.MALE));

        //imperative approach
        System.out.println("Imperative Approach");
        List<Person> females = new ArrayList<>();
        for(Person person: peoples){
            if(GENDER.FEMALE.equals(person.getGender())){
                females.add(person);
            }
        }

        //Print the filtered person
        for(Person female: females){
            System.out.println(female);
        }

        //Declarative Approach
        //from people array list, make the stream, get the abstract mode, collect to a list and finally print everything
        System.out.println("Declarative Approach");

        //Predicate get the argument person and returns true or false based on the person gender
        Predicate<Person> personPredicate = person -> GENDER.FEMALE.equals(person.getGender());

        List<Person> females2 = peoples.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());
        females2.forEach(System.out::println);

    }

    static class Person{
        private final String name;
        private final GENDER gender;

        public Person(String name, GENDER gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }

        public String getName() {
            return name;
        }

        public GENDER getGender() {
            return gender;
        }
    }

    enum GENDER{
        MALE,FEMALE
    }
}
