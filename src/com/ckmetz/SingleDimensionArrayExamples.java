package com.ckmetz;

import java.util.Arrays;

public class SingleDimensionArrayExamples {
    private int[] scores = {33, 55, 32, 79, 82, 99, 22, 85, 85};

    public void basicFunctions() {
        // Empty Array Declaration
        int[] a = new int[5];
        // Init with data
        String[] message = {"hello", "world"};
        //Set by an index
        message[0] = "goodbye";

        // Use our Lambda for each to print our string
        this.lambdaForEach(message);

    }

    public void forLoop() {
        // Iterate over each value in the array
        for(int i = 0; i < this.scores.length; i++) {
            System.out.println(this.scores[i]);
        }
    }

    public void forEachLoop() {
        // Iterate over each value in the array
        for(int score : this.scores) {
            System.out.println(score);
        }
    }

    public void lambdaForEach() {
        // Using Array stream to iterate over each item in the array
        Arrays.stream(this.scores).forEach(item -> {
            System.out.println(item);
        });
    }

    public void lambdaForEach(String[] printArray) {
        // Using Array stream to iterate over each item in the array
        Arrays.stream(printArray).forEach(System.out::println);
    }
}
