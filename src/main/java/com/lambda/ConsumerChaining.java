package com.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

//This example is non the chain consumers
public class ConsumerChaining {
    public static void main(String[] args) {
        List<String> list = List.of("one","two","three","four","five","six");
        List<String> result = new ArrayList<>();
        Consumer<String> c1 = System.out :: println;
        Consumer<String> c2 = result::add;

        list.forEach(c1.andThen(c2));
        System.out.println("size of the result = "+result.size());

    }
}
