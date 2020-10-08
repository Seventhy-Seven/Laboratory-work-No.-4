package com.company;

import static java.lang.Math.random;

public class Main {

    public static void main(String[] args) {

        int[][] ar =new int[4][6];
        for (int i=0;i < ar.length;i++){
            for (int j=0;j < ar[i].length;j++){
                ar[i][j]=(int)(random()*10);
            }
        }
        for (int i=0;i < ar.length;i++,System.out.println()){
            for (int j=0;j < ar[i].length;j++){
                System.out.print(ar[i][j]+" ");
            }
        }

        System.out.println();


        int[][] arr =new int[6][4];
        for (int i=0;i < arr.length;i++){
            for (int j=0;j < arr[i].length;j++){
                arr[i][j]=(int)(random()*10);
            }
        }

        for (int i=0;i < arr.length;i++,System.out.println()){
            for (int j=0;j < arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
        }


    }

}
