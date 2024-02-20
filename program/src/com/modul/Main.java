package com.modul;

import java.util.*;
import java.time.LocalDate;
import java.time.Period;


public class Main {
    public static void main(String[] args) {

        Scanner Input= new Scanner(System.in);

        System.out.print("Masukan Nama Anda : ");
        String nama= Input.nextLine();

        System.out.print("Masukan Kelamin Anda (P/L) : ");
        char kelamin= Input.next().charAt(0);
        Input.nextLine();

        if (!(kelamin == 'L' || kelamin == 'l' || kelamin == 'P' || kelamin == 'p')) {
            System.out.println("Inputan Tidak Valid (Masukkan P/L)!!");
            System.exit(0);
        }

        System.out.print("Tanggal Lahir (yyyy-mm-dd) : ");
        String inputLahir= Input.nextLine();
        LocalDate lahir= LocalDate.parse(inputLahir);

        LocalDate timeReal=LocalDate.now();
        Period umur=Period.between(lahir,timeReal);

        int tahun= umur.getYears();
        int bulan= umur.getMonths();

        System.out.print("\n");
        System.out.println("========================");
        System.out.println("Nama : "+nama);

        if (kelamin=='L'||kelamin=='l'){
            System.out.println("Jenis Kelamin : Laki-Laki");
        }else{
            System.out.println("Jenis Kelamin : Perempuan");
        }

        System.out.println("Umur Anda : "+tahun+" tahun "+bulan+" bulan");


    }

}

