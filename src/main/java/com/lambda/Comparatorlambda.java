package com.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparatorlambda {
    public static void main(String[] args) {
        //Implementation of the Comparator using anonymous function
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };
        List<String> list = Arrays.asList("***", "****", "********", "****", "*");
        //Collections.sort(list, comparator);

        Comparator<String> comparatorLambda = (String s1, String s2)  -> Integer.compare(s1.length(), s2.length());
        Collections.sort(list, comparator);

        for (String s : list) {
            System.out.println(s);
        }
    }

}
