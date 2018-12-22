package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите количество строк массива:");
        Scanner sc = new Scanner(System.in);
        int m = 0, n;

        if (sc.hasNextInt()) {
            m = sc.nextInt();
        }

        int[][] riders = new int[m][];


        for (int i = 0; i < m; i++) {
            n = (int) (Math.random() * 9 + 1);
            // System.out.println("" + n);
            riders[i] = new int[n];
           System.out.println("riders[" + i + "].length= " + riders[i].length);
        }

int temp =0; int tt=0;
      for (int i = 0; i < m ; i++) {
         for (int j=0; j< m ; j++) {
             if (riders[i].length < riders[j].length) {
                 temp = riders[j].length;
                 tt = riders[i].length;
                 riders[j] = new int[tt];
                 riders[i] = new int[temp];
             }
         }
        }

        for (final int[] iLine : riders) {
            for (int element : iLine) {
                element = (int) (Math.random() * (10) + 1);
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

// System.out.println("матрица");
// for (; i < riders.length;  i++) {
//     for (; j < riders[i].length; j++) {
//         System.out.print(riders[i][j] + " ");
//     }
//     System.out.println();