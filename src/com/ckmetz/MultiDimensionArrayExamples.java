package com.ckmetz;

import java.util.Arrays;

public class MultiDimensionArrayExamples {
    private int[][]  scores = {{33, 55, 32}, {79, 82, 99}, {22, 85, 85}};

    public void basicManipulation() {
        // Set size array init
        String[][] setSizeArray = new String[10][10];
        // Init with data
        String [][] doubleMessage = {{"hello",  "world"}, {"goodbye", "world"}};
        // Replacing "world with "Cleveland" in first nested array
        doubleMessage[0][1] = "Cleveland";
        // Setting hello to the value "hello" from the array
        String hello = doubleMessage[0][0];
        // Setting goodbye to the value "goodbye" from the array
        String goodbye = doubleMessage[1][0];

        // use our lambda for each to print our string
        this.lambdaForEach(doubleMessage);
    }

    public void forLoop() {
        // This will increment over each row
        for(int i = 0; i < this.scores.length; i++) {
            // This will increment over each column
            for(int j = 0; j < this.scores[i].length; j++) {
                System.out.println(this.scores[i][j]);
            }
        }
    }

    public void forEachLoop() {
        // Iterating over each row
        for(int[] scoresRow : this.scores) {
            // Iterating over each column in that row
            for(int score : scoresRow) {
                System.out.println(score);
            }
        }
    }

    public void lambdaForEach() {
        // Using Array stream to iterate over each item in the array
        Arrays.stream(this.scores).forEach(item -> {
            System.out.println(item);
        });
    }

    public void lambdaForEach(String[][] printArray) {
        // Using Array stream to iterate over each item in the array
        Arrays.stream(printArray).forEach(System.out::println);
    }
}
