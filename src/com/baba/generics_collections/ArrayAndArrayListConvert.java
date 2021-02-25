package com.baba.generics_collections;

import java.util.Arrays;
import java.util.List;

/**
 * @author - Taleh Qurbanzada
 * @created - 2019-Oct-08 12:38 PM
 * @project - java-8-features
 */
public class ArrayAndArrayListConvert {

    public static void main(String[] args) {

        convert();

    }

    private static void convert(){

        String[] array1 = { "gerbil", "mouse" };
        List<String> list = Arrays.asList(array1);
        System.out.println("Array:\n" + array1[0] + ", " + array1[1] + "\n" + "List:\n" + list);
        System.out.println();



        list.set(1, "test");
        System.out.println("Array:\n" + array1[0] + ", " + array1[1] + "\n" + "List:\n" + list);
        System.out.println();



        array1[0] = "new";
        System.out.println("Array:\n" + array1[0] + ", " + array1[1] + "\n" + "List:\n" + list);
        System.out.println();



        Object[] array2 = list.toArray();
        array2[0] = "renew";
        System.out.println("Array:\n" + array2[0] + ", " + array2[1] + "\n" + "List:\n" + list);



        list.remove(1);                              //throws UnsupportedOperationException
    }
}
