//package com.codelab;

import java.util.ArrayList;
import java.util.Scanner;

class Mahasiswa{

  String nama;
  String NIM;
  String jurusan;

  Mahasiswa (String nama,String NIM,String jurusan){
    this.nama=nama;
    this.NIM=NIM;
    this.jurusan=jurusan;
  }

  static void tampilUniversitas(){
    System.out.println("Universitas Muhammadiyah Malang");
  }
  
  void tampilDataMahasiswa(){

    System.out.println("Nama    :  " +nama);
    System.out.println("NIM     :  " +NIM);
    System.out.println("Jurusan :  " +jurusan);
    System.out.print("\n");
  }
}


public class Main {
  public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);
    ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    while (true) {
    System.out.println("Menu :");
    System.out.println("1. Tambah Data Mahasiswa ");
    System.out.println("2. Tampilkan Data Mahasiswa");
    System.out.println("3. Exit ");
    System.out.print("Pilihan (1-3): ");
    int pilihan=inputUser.nextInt(); 

    switch (pilihan) {
      case 1:
        tambahData(inputUser,daftarMahasiswa);
        break;
      case 2:  
        showData(daftarMahasiswa);
        break;
      case 3:
        exit();
        break;       
      default:
        System.out.println("Pilihan Tidak Valid !!! Masukan Angka (1-3) !!!");
        break;
    }
  }

      }private static void tambahData(Scanner inputUser,ArrayList <Mahasiswa> daftarMahasiswa){
        
        System.out.print("Masukan Nama Mahasiswa : ");
        inputUser.nextLine();
        String nama = inputUser.nextLine();
        
        String NIM;
        do {
        System.out.print("Masukan NIM Mahasiswa  : ");
        NIM = inputUser.nextLine();
        if(NIM.length()!=15)
          System.out.println("NIM harus 15 digit !!!");
        }while(NIM.length()!=15);
    
        System.out.print("Masukan Jurusan        : ");
        String jurusan = inputUser.nextLine();
      
        Mahasiswa mhs = new Mahasiswa(nama,NIM,jurusan);
        daftarMahasiswa.add(mhs);
        System.out.println("Data Berhasil Ditambahkan");
 

      }private static void showData(ArrayList <Mahasiswa> daftarMahasiswa){
        
        Mahasiswa.tampilUniversitas();
        System.out.println("\nData Mahasiswa : ");
        for (Mahasiswa dataMahasiswa : daftarMahasiswa) {
          dataMahasiswa.tampilDataMahasiswa();
        }


      }private static void exit(){
        
        System.out.println("\nTerima Kasih");
        System.exit(0);
      }
  }
