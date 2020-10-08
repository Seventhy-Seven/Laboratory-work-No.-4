package com.company;

public class Main {

    public static void main(String[] args) {

        int [][] ar = new int[5][7];
        int a = 2;

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++)
                System.out.print((ar[i][j] = a) + " ");
            System.out.println("\t");
        }
    }
}
