package com.baba.advanced_class_design.enums;

public enum Seasons {
    WINTER("Low") {
        public void out() {
            System.out.println("winter out");
        }
    },
    SPRING("Middle"),
    SUMMER("High"),
    FALL("Medium");

    //public abstract void out();

    private final String visitors;

    Seasons(String visitors) {
        this.visitors = visitors;
    }

    public void print() {
        System.out.println(visitors);
    }
}

class TestSeasons {

    public static void main(String[] args) {
        Seasons.SUMMER.print();
    }
}