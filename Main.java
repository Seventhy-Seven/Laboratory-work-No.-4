package com.company;

public class Main {

    public static void main(String[] args) {

        char[][] ar = new char[11][23];
        char a = '|';
        char b = ' ';
        char c = '+';
        char d = '-';

        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++)
                if (((i == 0) ^ (i == 10)) && ((j == 0) ^ (j == 22))) System.out.print(ar[i][j] = c);
                else if (((i == 0) ^ (i == 10)) && ((j == ar.length) ^ (j !=22))) System.out.print(ar[i][j] = d);
                else if (((i == 0) ^ (i == 10)) && (j == 11)) System.out.print(ar[i][j] = d);
                else if ((((j == 0) ^ (j==22)) && ((i == ar[i].length) ^ (i != 22)))) System.out.print(ar[i][j] = a);
                else System.out.print(ar[i][j] = b);
            System.out.println("\t");
        }
    }
}

