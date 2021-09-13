package com.company;
class Matrica {
    public static void main(String args[]) {
        int i, j;
        int[][]mas = new int[2][2];
        int[][]mast = new int[2][2];
        for (i = 0; i < 2; ++i) {
            for (j = 0; j < 2; ++j) {
                mas[i][j] = (int)(Math.random() * 20 - 10);
                System.out.print (mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(" ");
        for (i = 0; i < 2; ++i) {
            for (j = 0; j < 2; ++j) {
                mast[j][i] = mas[i][j];
            }
        }
        for (i = 0; i < 2; ++i) {
            for (j = 0; j < 2; ++j) {
                System.out.print (mast[i][j] + " ");
            }
            System.out.println();
        }
    }
}

