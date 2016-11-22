package com.welcome;

/**
 * Created by shepelevich on 11/12/2016.
 */
public class Hello {
    private String name;

    public void setupName(String name) {
        this.name = name;
    }

    public void welcome() {
        System.out.println("Hello, " + name);
    }

    public void byeBye() {
        System.out.println("Bye, " + name);
    }
}
