package com.grz55.javatraining.algorithms.arrays;

public class CountRectanglesComarchAlgorithm {

    //How many rectangles we can create
    //from 2D boolean array
    //Rectangle exists if all nodes are true

    public static int countRectangles(boolean[][] dots) {
        int rectangles = 0;
        for (int i = 0; i < dots.length - 1; i++) {
            for (int j = 0; j < dots[i].length - 1; j++) {
                if (dots[i][j]) {
                    for (int k = i + 1; k < dots.length; k++) {
                        for (int l = j + 1; l < dots[i].length; l++) {
                            if (dots[i][j] && dots[i][l] && dots[k][j] && dots[k][l]) {
                                rectangles++;
                                //System.out.println("[" + i + "][" + j + "]" + ",[" + i + "][" + l + "]" + ",[" + k + "][" + j + "]" + ",[" + k + "][" + l + "]");
                            }
                        }
                    }
                }
            }
            //System.out.println();
        }
        return rectangles;
    }

    public static void printDotsMatrix(boolean[][] dots) {
        for (int i = 0; i < dots.length; i++) {
            for (int j = 0; j < dots[i].length; j++) {
                if (dots[i][j]) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        boolean[][] dots = {{true, false, true, true}, {false, true, true, true}, {true, true, false, true}, {true, true, true, true}};
        boolean[][] dots2 = {{true, true}, {true, true}};
        boolean[][] dots3 = {{true, true, true}, {true, true, true}};
        printDotsMatrix(dots);
        System.out.println("Rectangles: " + countRectangles(dots));
        printDotsMatrix(dots2);
        System.out.println("Rectangles: " + countRectangles(dots2));
        printDotsMatrix(dots3);
        System.out.println("Rectangles: " + countRectangles(dots3));

    }

}
