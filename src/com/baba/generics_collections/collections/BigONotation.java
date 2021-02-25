package com.baba.generics_collections.collections;

public class BigONotation {

    /**
     * -----------------------------------------Big O Notation---------------------------------------------
     *
     * In computer programming, we use big O notation to talk about the performance of algorithms.
     * It’s pretty clear that it is better for code to take 1 second than 10 seconds to do the same thing.
     * This is called an order of magnitude difference.
     *
     * Big O notation lets you compare the order of magnitude of performance rather than
     * the exact performance. It also assumes the worst-case response time. If you write an
     * algorithm that could take a while or be instantaneous, big O uses the longer one. It
     * uses an n to reflect the number of elements or size of the data you are talking about.
     * The following lists the most common big O notation values that you will see and what
     * they mean:
     *
     *      O(1)—constant time: It doesn’t matter how large the collection is, the answer will
     *      always take the same time to return. Returning the string literal “Panda” from a method
     *      will take constant time, as will returning the last element of an array.
     *
     *      O(log n)—logarithmic time: A logarithm is a mathematical function that grows
     *      much more slowly than the data size. You don’t need to know this for the
     *      exam, but log(8) gives you 3 in base 2 and log(1024) gives you 10 in base 2.
     *      The point is that logarithmic time is better than linear time. Binary search runs
     *      in logarithmic time because it doesn’t look at the majority of the elements for
     *      large collections.
     *
     *      O(n)—linear time: The performance will grow linearly with respect to the size
     *      of the collection. Looping through a list and returning the number of elements
     *      matching “Panda” will take linear time.
     *
     *      O(n 2 )—n squared time: Code that has nested loops where each loop goes through
     *      the data takes n squared time. An example would be putting every pair of pandas
     *      together to see if they’ll share an exhibit.
     */
}
