package com.baba.advanced_class_design;

public class Test {

    public void changeValue(XXX xxx) {
        xxx.s = "Changed";
    }

    public static void main(String[] args) {
        XXX xxx = new XXX();
        System.out.println(xxx.s);

        Test test = new Test();
        test.changeValue(xxx);
        System.out.println(xxx.s);
    }
}


class XXX {
    String s = "aaa";
}