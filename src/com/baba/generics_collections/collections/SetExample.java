package com.baba.generics_collections.collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    /**
     * --------------------------------------HashSet----------------------------------------
     * A HashSet stores its elements in a hash table. This means that it uses the hashCode()
     * method of the objects to retrieve them more efficiently.
     *
     * The main benefit is that adding elements and checking if an element is in the set both
     * have constant time. The tradeoff is that you lose the order in which you inserted the
     * elements. Most of the time, you aren’t concerned with this in a set anyway, making HashSet
     * the most common set.
     *
     * --------------------------------------TreeSet----------------------------------------
     * A TreeSet stores its elements in a sorted tree structure. The main benefit is that the set
     * is always in sorted order. The tradeoff is that adding and checking if an element is pres-
     * ent are both O(log n).
     */

    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(6);
        System.out.println(s);
    }
}
