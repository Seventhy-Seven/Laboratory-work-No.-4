package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("Введите текст для шифрования:");
        Scanner InCMD = new Scanner(System.in);
        String a = InCMD.nextLine();

        System.out.print("Введите ключ:");
        InCMD = new Scanner(System.in);
        int b = InCMD.nextInt();

        char [] ars = a.toCharArray();

        byte Random = (byte)(Math.random()*b);

        StringBuilder c = new StringBuilder();

        new StringBuilder();

        for (byte i=0; i< ars.length; i++)
        {
            ars[i] = (char)(ars[i] - b);
            c.append(ars[i]);
        }
        System.out.println("Текст после преобразования: " + c);

    }
}

