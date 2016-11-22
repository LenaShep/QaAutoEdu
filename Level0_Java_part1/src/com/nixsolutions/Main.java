package com.nixsolutions;

import com.welcome.Hello;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please, enter your name!");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        Hello hello = new Hello();
        hello.setupName(name);
        hello.welcome();
        System.out.println("Hello, world!");
        hello.byeBye();// write your code here
    }
}
