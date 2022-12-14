package com.functionalInterface;

import java.util.function.BiFunction;

//BiFunction accepts two argument and return one result
public class __BiFunction {

    public static void main(String[] args) {
        System.out.println(incrementByOneAndMutiple(12,12));
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(12, 12));
    }

    //Takes two argument and produces one result
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMultplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultplyBy;

    static int incrementByOneAndMutiple(int numberToAdd, int numberToMultiply) {
        return (numberToAdd + 1) * numberToMultiply;
    }
}
