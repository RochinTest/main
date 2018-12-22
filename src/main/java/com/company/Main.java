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
            riders[i] = new int[n];
        }

        int temp = 0;
        int tt = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
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

//Все добра работает!!!!!