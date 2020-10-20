package com.grz55.javatraining.algorithms.warmup;

import java.io.*;
import java.util.*;

public class CountingValleysAlgorithm {

    // (HACKERRANK.COM)
    // Finding how many valleys exist in the string
    // Valleys are sequences of negative numbers
    // Algorithm counts number of negative sequences
    // For given input UDDDUUUDDDUUU --> UD(DDUU)UD(DDUU)U <-- valleys in brackets
    // There are 2 valleys

    static int countingValleys(int n, String s) {

        int elevation = 0;
        int valleys = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'U') {
                elevation++;
            }
            if (s.charAt(i) == 'D') {
                elevation--;
            }
            if (elevation == 0 && s.charAt(i) == 'U') {
                valleys++;
            }
            System.out.print(elevation + " ");
        }
        return valleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println("Provide array size - number of steps (n)");

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        System.out.println("Provide the steps (consists only U and D)");

        String s = scanner.nextLine();

        System.out.println("Path given = " + s);

        int result = countingValleys(n, s);

        System.out.println("\nResult = " + result);

        scanner.close();
    }
}

// OLD VERSION

/*static int countingValleys(int n, String s) {

        int elevation = 0;
        int valleys = 0;
        boolean fullValley;

        for(int i=0;i<n;i++){
            if(s.charAt(i) == 'U'){
                elevation++;
            }
            if(s.charAt(i) == 'D'){
                elevation--;
            }
            System.out.print(elevation + " ");

            if(elevation<0){
                fullValley = false;
                for(int j=(i+1);j<n;j++){
                    if(s.charAt(j) == 'U'){
                        elevation++;
                    }
                    if(s.charAt(j) == 'D'){
                        elevation--;
                    }
                    System.out.print(elevation + " ");

                    if(elevation>=0){
                        valleys++;
                        fullValley = true;
                    }
                    i=j;
                    if(fullValley == true){
                        break;
                    }
                }

            }
            System.out.print(elevation + " ");
        }
        System.out.println();

        return valleys;
    }*/

