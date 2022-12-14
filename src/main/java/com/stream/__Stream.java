package com.stream;

import com.imperative.Main;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.stream.__Stream.GENDER.*;


public class __Stream {
    public static void main(String[] args) {
        List<Person> peoples = List.of(
                new Person("Ayyapa", MALE),
                new Person("Rahul", MALE),
                new Person("Sangram", MALE),
                new Person("Ayesha", FEMALE),
                new Person("Sanjana", PREFER_NOT_SAY),
                new Person("Luqman", MALE));

        //Steam peoples list, we perform transformation, collect to set and print it
        //peoples.stream().map(people -> people.gender).collect(Collectors.toSet()).forEach(System.out::println);
       //peoples.stream().map(people -> people.name).mapToInt(String::length).forEach(System.out::println);
        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        boolean containsOnlyFemales = peoples.stream().filter(personPredicate).allMatch(personPredicate);
        System.out.println(containsOnlyFemales);
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
        MALE,FEMALE,PREFER_NOT_SAY
    }
}
