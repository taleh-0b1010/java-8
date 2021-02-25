package com.baba.generics_collections.generics;

public class GenericMethodExamples {

    public static <T> void sink(T t) { }

    public static <T> T identity(T t) { return t; }

//  public static T noGood(T t) { return t; }       DOES NOT COMPILE


    public static <T> Crate<T> ship(T t) {
        System.out.println("Preparing " + t);
        return new Crate<>();
    }
}


class Crate<T> {
    private T t;
}