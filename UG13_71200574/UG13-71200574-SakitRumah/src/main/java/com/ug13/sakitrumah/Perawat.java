package com.ug13.sakitrumah;

public class Perawat {
    private String nama;

    public Perawat(String nama){
        this.nama = nama;
    }
    public void screening(Pengunjung pengunjung, Jadwal jadwal){
        if(jadwal.getPengunjung() == pengunjung){
            jadwal.setStatusScreening(true);
        }else{
            System.out.println("=======================HARUS MELAKUKAN PROSES PENDAFTARAN TERLEBIH DAHULU DI BAGIAN PELAYAN=======================");
        }
    }

}
