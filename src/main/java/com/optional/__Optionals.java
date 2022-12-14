package com.optional;

import java.util.Optional;

public class __Optionals {
    public static void main(String[] args) {
        Object value = Optional.ofNullable("Hello").orElseGet(() -> "default value");
        System.out.println(value);
    }
}
