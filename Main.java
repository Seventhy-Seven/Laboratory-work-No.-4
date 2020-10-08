package com.company;

public class Main {

    public static void main(String[] args) {

        String [][]ar = new String[7][7];
        String b = "*";
        String d = " ";

        for (int i = 0; i < ar.length; i++){
            for (int j = 0; j<ar[i].length; j++)
                if (i > j ) System.out.print((ar[i][j] = b) + " ");
                else if (i == j) {
                    System.out.print((ar[i][j] = d) + " ");
                }
            System.out.println("\t");
        }
    }
}
