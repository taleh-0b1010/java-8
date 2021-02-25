package com.baba.stream.primitive;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Statistic {

    public static void main(String[] args) {
        System.out.println(range());
    }

    private static int range() {
        IntSummaryStatistics statistics = IntStream.rangeClosed(1, 6)
                .summaryStatistics();
        System.out.println(statistics);
        if (statistics.getCount() == 0) throw new RuntimeException();
        return statistics.getMax() - statistics.getMin();
    }
}
