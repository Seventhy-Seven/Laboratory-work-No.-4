package com.company;

public class Main {

    public static void main(String[] args) {

        int[][] ar = new int[4][4];

        for (int i=0; i<ar.length; i++)
        {
            for (int j=0; j<ar[i].length;j++)
                System.out.print(ar[i][j] = (int) (Math.random() * 10));
            System.out.println();
        }


        System.out.println();

        int[][] arr = new int[4][4];
        int b = (int) (Math.random() * 2);

        int i = 3;
        int c = i - b;

        for (i = c; i<arr.length; i++)
        {
            int j = 0;
            int d = b - j;
            for (j = d; j < arr[i].length; j++)
                System.out.print(arr[i][j] = (int) (Math.random() * 10));
            System.out.println();
        }
    }
}