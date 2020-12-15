package com.dicoding.javafundamental.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {
    public static void main (String[] args)
    {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        System.out.println("program penjumlahan");
        int value = 0 ;
        int anothervalue = 0;
        try{
            System.out.print("masukan angka pertama :");
            value = Integer.parseInt(bufferedReader.readLine());
            System.out.print("masukkan angka kedua :");
            anothervalue = Integer.parseInt(bufferedReader.readLine());
        }
        catch(IOException e) {
        e.printStackTrace();
        }

        int result = value + anothervalue ;
        System.out.println("Hasilnya : " + result ) ;
    }

}
