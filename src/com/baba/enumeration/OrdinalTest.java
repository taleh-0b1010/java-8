package com.baba.enumeration;

public class OrdinalTest {

    public static void main(String[] args) {
        String extension = "jpg";
        for (Type type : Type.values()) {
            if (type.toString().equalsIgnoreCase(extension)) {
                System.out.println(type);
            }
        }
    }
}


enum Type {

    JPEG, JPG, PNG
}
