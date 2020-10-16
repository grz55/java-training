package com.grz55.javatraining.algorithms;

public class HillsAndValleysCastlesAlgorithm {

    // The king builds castles in valleys or on top of the hills
    // When input array is ground levels
    // Count how many castles the king has to build
    // (how many hills and valleys exist)

    public static int countCastles(int[] terrainLevels) {

        boolean sameNumbersInArray = sameNumbersInArray(terrainLevels);
        if (sameNumbersInArray) {
            return 1;
        }
        int[] levelChanges = new int[terrainLevels.length - 1];

        for (int i = 0, j = 0; i < terrainLevels.length - 1; i++) {
            if (terrainLevels[i] < terrainLevels[i + 1]) {
                levelChanges[j++] = 1;              //grows
            } else if (terrainLevels[i] > terrainLevels[i + 1]) {
                levelChanges[j++] = -1;             //falls
            } else {
                levelChanges[j++] = 0;              //equal
            }
        }

        System.out.println("Level changes:");
        for (int i : levelChanges) {
            System.out.print(i + " ");
        }

        boolean grows = firstGrows(levelChanges);

        int castles = 2;
        for (int i : levelChanges) {
            if (i > 0 && (!grows)) {
                grows = true;
                castles++;
            }
            if (i < 0 && (grows)) {
                grows = false;
                castles++;
            }
        }
        return castles;
    }

    private static boolean firstGrows(int[] a) {
        for (int i : a) {
            if (i > 0) {
                return true;
            }
            if (i < 0) {
                return false;
            }
        }
        return false;
    }

    private static boolean sameNumbersInArray(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] terrainLevels = {2, 3, 4, -2, -1, 5, 4};
        System.out.println("\nNeeds to build " + countCastles(terrainLevels) + " castles");
    }
}
