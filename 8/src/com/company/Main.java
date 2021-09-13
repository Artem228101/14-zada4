package com.company;
public class Main {
    static int n=0;
    static int array[][]={{1,2,3,4},{5,6,7,8},{9,8,7,6},{5,4,3,2}};
    private static void meth(int k){
        for(int i=0;i<array.length;i++){
            if(k>array[i].length && k<=0)
                throw new IllegalArgumentException();}
        n=k-1;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(j==n)array[i][j]=0;
            }
        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++)
                System.out.print(array[i][j]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        meth(1);
    }
}
