package com.baba.integer;

public class LoopToMax {

    public static void main(String[] args) {
        System.out.println(test(Integer.MAX_VALUE-1,Integer.MAX_VALUE));
    }

    private static int test(int azalan,int cixan) {


        int i = 0;
        while(azalan != i + cixan){
         ++i;
        }
        System.out.println(i);
        return i;
    }
}
