package com.dicoding.javafundamental.inputoutput;

import java.util.Scanner;
public class inputOutputFunction {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("program penjumlahan");
        System.out.print("Masukan Angka Pertama:");
        int value = scanner.nextInt();
        System.out.print("Masukkan Angkat kedua :");
        int anothervalue = scanner.nextInt();
        int result = value + anothervalue ;
        System.out.println("Hasilnya : " + result);
    }
}
