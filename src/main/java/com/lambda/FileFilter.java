package com.lambda;

import java.io.File;

public interface FileFilter {
    public boolean accept(File file);

    public static void main(String[] args) {
        JavaFileFilter filter = new JavaFileFilter();
        File file = new File("C:\\Users\\rahul\\OneDrive\\Desktop\\Interview 2023\\Java8Tutorial\\src\\Main.java");
        System.out.println(filter.accept(file));

        //Example of Anonymous Class
        FileFilter javaFileFilter = new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.getName().endsWith(".java");
            }
        };

        //Example of Lambda expressions
        FileFilter javaFileFilter1 = (File filePathName) -> file.getName().endsWith(".java");

        //Running Anonymous function
        System.out.println(javaFileFilter.accept(file));
        //Running Lambda Expression
        System.out.println(javaFileFilter1.accept(file));

    }
}

class JavaFileFilter implements FileFilter{
    public boolean accept(File file){
        return file.getName().endsWith(".java");
    }
}