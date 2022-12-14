package com.functionalInterface;

import java.util.function.Function;

//It accepts one argument and produces one result
public class __Function {
    public static void main(String[] args) {
        int incrementedValue1 = incrementByOne(0);
        System.out.println(incrementedValue1);
        int incrementedValue2 = incrementByOneFunction.apply(12);
        System.out.println(incrementedValue2);
        //Chain function together
        int incrementAndMultipledValue1 = addBy1andMultipleBy10.apply(13);
        System.out.println(incrementAndMultipledValue1);


    }

    //Represents a function that take one argument and produces one result
    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    static Function<Integer, Integer> multipleBy10 = number -> number * 10;

    //Functional Interface Chaining
    static Function<Integer,Integer> addBy1andMultipleBy10 = incrementByOneFunction.andThen(multipleBy10);

    static int incrementByOne(int number) {
        return number + 1;
    }



}
