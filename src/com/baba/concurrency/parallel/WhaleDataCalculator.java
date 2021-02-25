package com.baba.concurrency.parallel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WhaleDataCalculator {

    private Integer processRecord(int input) {
        try {
//            System.out.println(input);
            Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Interrupted exception: " + e.getMessage());
        }
        return input + 1;
    }

    private void processAllDataSerial(List<Integer> data) {
        data.stream()
                .map(this::processRecord)
                .collect(Collectors.toSet());
    }

    private void processAllDataParallel(List<Integer> data) {
        data.parallelStream()
                .map(this::processRecord)
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        WhaleDataCalculator calculator = new WhaleDataCalculator();

        //Define the data
        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < 4000; i++) {
            data.add(i);
        }

        //Process the data
        long start = System.currentTimeMillis();
        calculator.processAllDataParallel(data);
        double time = (System.currentTimeMillis() - start)/1000.0;

        //Report results
        System.out.println("\nTasks completed in: " + time + " seconds");
    }
}
