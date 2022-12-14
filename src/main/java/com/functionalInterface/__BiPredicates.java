package com.functionalInterface;

import java.util.function.BiPredicate;

//BiPredicate takes two argument and return one result
public class __BiPredicates {
    public static void main(String[] args) {
        System.out.println(checkAgeAndPhone("07090909091",23));
        System.out.println(checkAgeAndPhone("0709090909",34));
        System.out.println(checkAgeAndPhoneValid.test("07090909091",23));
    }
    static boolean checkAgeAndPhone(String phoneNumber, int age) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11 && (age >= 18 && age <= 60);
    }

    static BiPredicate<String, Integer> checkAgeAndPhoneValid = (phoneNumber, age) ->
                    phoneNumber.startsWith("07") && phoneNumber.length() == 11 && (age >= 18 && age <= 60);
}
