package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner masuk=new Scanner(System.in);
    int pilih;
    TabunganKonvensional K_71200574=new TabunganKonvensional();
    TabunganBerjangka I_71200574=new TabunganBerjangka();

    System.out.println("Pilihan:");
    System.out.println("1.Penyetoran");
    System.out.println("2.Penarikan");
    System.out.println("3.Lihat Saldo");
    Scanner a=new Scanner(System.in);
    System.out.println("Masukan Pilihan:"); pilih=a.nextInt();
    if (pilih==1){
        K_71200574.penyetoran(200000);
        I_71200574.penyetoran(1000000);
    }
    else if (pilih==2){
        K_71200574.penarikan(50000);
        I_71200574.penarikan(5000);
    }
    else if (pilih==3){
        K_71200574.penyetoran(100000);
        I_71200574.penyetoran(200000);
        }
    }
}
