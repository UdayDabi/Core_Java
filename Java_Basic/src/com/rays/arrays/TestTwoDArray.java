package com.rays.arrays;

public class TestTwoDArray {

    public static void main(String[] args) {

        int[][] table = new int[3][3];

        table[0][0] = 10;
        table[0][1] = 20;
        table[0][2] = 30;

        table[1][0] = 40;
        table[1][1] = 50;
        table[1][2] = 60;

        table[2][0] = 70;
        table[2][1] = 80;
        table[2][2] = 90;

        for (int i = 0; i < table.length; i++) {

            for (int j = 0; j < table[i].length; j++) {

                System.out.print(table[i][j] + "\t");
            }

            System.out.println();
        }
    }
}