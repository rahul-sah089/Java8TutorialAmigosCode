package com.functionalInterface;

import java.util.function.Predicate;

//predicate will accept one argument and return boolean
public class __Predicate {
    public static void main(String[] args) {
        System.out.println("Without Predicate");
        System.out.println(isPhoneNumberValid("07090909090"));
        System.out.println(isPhoneNumberValid("09090909090"));
        System.out.println("With Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07090909090"));
        System.out.println(isPhoneNumberValidPredicate.test("09090909090"));
        isPhoneNumberValidPredicate.and(containsNumber3);
        System.out.println("Is phone valid and contains number 3 => "+isPhoneValidAndContains3.test("09090909090"));
        System.out.println("Is phone valid and contains number 3 => "+isPhoneValidAndContains3.test("07090909030"));
        System.out.println("Is phone valid or contains number 3 => "+isPhoneValidAndContains3.test("07090909000"));
    }

    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber
            -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    //Predicate Chaining
    static Predicate<String> isPhoneValidAndContains3 = isPhoneNumberValidPredicate.and(containsNumber3);
    static Predicate<String> isPhoneValidOrContains3 = isPhoneNumberValidPredicate.or(containsNumber3);
    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
}
