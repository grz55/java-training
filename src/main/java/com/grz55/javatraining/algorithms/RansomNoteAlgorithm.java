package com.grz55.javatraining.algorithms;

import java.util.*;

public class RansomNoteAlgorithm {

    //HACKER RANK
    //Checks if the word can be created from the words in note array
    //Destination array - magazine
    //Prints answer Yes or No

    static void checkMagazine(String[] magazine, String[] note) {
        boolean canCreateRansomNote = true;
        List<String> magazineList = new LinkedList<>(Arrays.asList(magazine));
        List<String> noteList = new LinkedList<>(Arrays.asList(note));

        Iterator<String> iter = noteList.iterator();

        while (iter.hasNext()) {
            String str = iter.next();
            if (magazineList.contains(str)) {
                iter.remove();
                magazineList.remove(str);
            } else {
                canCreateRansomNote = false;
                break;
            }
        }

        if (canCreateRansomNote) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Give length of magazine array and ransom note array (separate with spaces)");
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        System.out.println("Give magazine words");

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        System.out.println("Give ransom note words");

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
