package com.company;

import java.awt.print.Book;

public class Main {

    static String name;

    static {
        name = "sanghun";
    }

    public static void main(String[] args) {
	// write your code here
        ClassLoader classLoader = Main.class.getClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
    }
}
