/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.farhanfadhilah.goacademycalculator;

public class App {
    double displayedNumber = 0.0;
    public String getGreeting() {
        return "Hello World!";
    }

    @Override
    public String toString() {
        return String.valueOf(displayedNumber);
    }

    public String cancel() {
        displayedNumber = 0.0;
        return toString();
    }

    public void main(String[] args) {
        System.out.println(toString());
        System.out.println();
    }
}
