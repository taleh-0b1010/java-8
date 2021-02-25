package com.baba.exceptions;

public class Cage implements AutoCloseable {
    @Override
    public void close() {
        System.out.println("Cage does not close!");
    }

    public static void main(String[] args) {
        try {
            throw new RuntimeException("Test");
        }finally {
            System.out.println("In the finally!");
        }
    }
}
