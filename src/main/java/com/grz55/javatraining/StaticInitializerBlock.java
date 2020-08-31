package com.grz55.javatraining;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

// HACKER RANK

public class StaticInitializerBlock {

    static boolean flag = true;
    static int B = 3;
    static int H = 2;

    static {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        if ((B <= 0) || (H <= 0)) {
            flag = false;
            System.out.println("Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }

}