package com.functionalInterface;

import java.util.List;
import java.util.function.Supplier;

//
public class __Supplier {
    public static void main(String[] args) {
        System.out.println(getDbConnectURl());
        System.out.println(getDbConnectURlSupplier.get());
        System.out.println(getDbConnectURlSuppliers.get());
    }

    static String getDbConnectURl() {
        return "jdbc://localhost:5432/users";
    }

    static List<String> getDbConnectionURLs() {
        return List.of(
                "jdbc://localhost:5432/users",
                "jdbc://localhost:5432/admin",
                "jdbc://localhost:5432/information",
                "jdbc://localhost:5432/together",
                "jdbc://localhost:5432/gang");
    }

    static Supplier<String> getDbConnectURlSupplier = () -> "jdbc://localhost:5432/users";
    static Supplier<List<String>> getDbConnectURlSuppliers = () -> List.of(
            "jdbc://localhost:5432/users",
            "jdbc://localhost:5432/admin",
            "jdbc://localhost:5432/information",
            "jdbc://localhost:5432/together",
            "jdbc://localhost:5432/gang");

}
