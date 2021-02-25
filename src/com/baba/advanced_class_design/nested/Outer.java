package com.baba.advanced_class_design.nested;

public class Outer {

    private int lenght = 5;

    private void calculate() {
        final int width = 20;

        class Inner {
            private void multiply() {
                System.out.println(lenght*width);
            }
        }

        Inner inner = new Inner();
        inner.multiply();
    }

    public static void main(String[] args) {
        new Outer().calculate();
    }
}
