package org.example;

public class Main {
    public static void main(String[] args) {

        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(3, 12));
        System.out.println(intsCalc.mult(4, 7));
        System.out.println(intsCalc.pow(2, 7));
    }
}