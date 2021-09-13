package com.company;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
public class Main {
    private static int[][] getNonSquarMatrix(int row) {
        int[][] ret = new int[row][];
        for (int i = 0; i < row; i++) {
            int col = ThreadLocalRandom.current().nextInt(1, 6);
            ret[i] = new int[col];
            for (int j = 0; j < col; j++) {
                ret[i][j] = ThreadLocalRandom.current().nextInt(1, 10);
            }
        }
        return ret;
    }
    private static void print2DimArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(j + 1 < arr[i].length ? "" + arr[i][j] + ", " : "" + arr[i][j] + '\n');
            }
        }
        System.out.println(" ");
    }
    private static int[] getOneDimArrFromTwoDimArray(int [][] matrix) {
        int countElem = 0;
        for (int [] tmpArr : matrix)
            countElem += tmpArr.length;
        int [] ret = new int[countElem];
        int indRet = 0;
        for (int [] tmpArr : matrix)
            for (int elemTmpArr : tmpArr)
                ret[indRet++] = elemTmpArr;
        return ret;
    }
    public static void main(String[] args) {
        int [][] twoNonSquDimArr = getNonSquarMatrix(4);
        print2DimArray(twoNonSquDimArr);
        int [] oneDimArrFromTwo = getOneDimArrFromTwoDimArray(twoNonSquDimArr);
        System.out.println(Arrays.toString(oneDimArrFromTwo));
    }
}