package com.baba.generics_collections.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

    public static void main(String[] args) {
        compareString();
        compareInt();
    }

    private static void compareString() {
        List<Duck> list = new ArrayList<>();
        list.add(new Duck("Quack"));
        list.add(new Duck("Puddles"));
        Collections.sort(list);
        System.out.println(list);
    }

    private static void compareInt() {
        List<Animal> list = new ArrayList<>();
        list.add(new Animal(5));
        list.add(new Animal(7));
        list.add(new Animal(0));
        Collections.sort(list);
        System.out.println(list);
    }
}

class Duck implements Comparable<Duck> {

    private final String name;

    Duck(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Duck duck) {
        return name.compareTo(duck.name);
    }

    @Override
    public String toString() {
        return name;
    }
}

class Animal implements Comparable<Animal> {

    private final int id;

    Animal(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Animal animal) {
        return id - animal.id;
    }

    @Override
    public String toString() {
        return id+"";
    }
}
