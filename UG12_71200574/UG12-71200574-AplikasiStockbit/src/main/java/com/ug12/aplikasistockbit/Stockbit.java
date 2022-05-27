package com.ug12.aplikasistockbit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Stockbit {
    private ArrayList<Investor> arrInvestor = new ArrayList<Investor>();
    private Investor investor;
    public Stockbit() {
    }
    public void login(String username, String password) {
        int counter = 0;
        for (Investor akun : arrInvestor) {
            if (akun.getUsername().equals(username) && akun.getPassword().equals(password)) {
                System.out.println("Login berhasil!");
                this.investor = akun;
                break;
            } else if (counter == arrInvestor.size() - 1) {
                System.out.println("Username/Password Anda salah!");
            } else {
                counter += 1;
            }
        }
    }
    public void orderBeli(Saham saham, int lot) {
        investor.getPortfolio().put(saham, lot);
        System.out.println("Order beli " + saham.getKode() + " sebanyak " + lot + " lot sukses!");
    }
    public void printPortfolio() {
        HashMap<Saham, Integer> printPorto = investor.getPortfolio();
        int counter = 1;
        long total = 0;
        System.out.println("==========Print Portfolio Client==========");
        System.out.println("Client : " + investor.getNama());
        System.out.println("No. Kode Saham\tJumlah Lot\t\tHarga\t\tSub Total");
        for (Map.Entry dataPorto : printPorto.entrySet()) {
            Saham saham = (Saham) dataPorto.getKey();
            long hargaLot = saham.getHarga();
            int jumlahLot = (int) dataPorto.getValue();
            long subTotal = hargaLot * jumlahLot * 100;
            System.out.println(counter + ".\t" + saham.getKode() + "\t\t"
                    + jumlahLot + "x" + "\t\t\t\t" + hargaLot + "\t\t" + subTotal);
            counter += 1;
            total += subTotal;
        }
        System.out.println("Total Investasi: Rp" + total);
    }
    public void orderJual(Saham saham, int lot) {
        HashMap<Saham, Integer> porto = this.investor.getPortfolio();
        if (porto.containsKey(saham)) {
            if (porto.get(saham) >= lot) {
                porto.put(saham, porto.get(saham) - lot);
                System.out.println("Order jual " + saham.getKode() + " sebanyak " + lot + " sukses!");
            } else {
                System.out.println("Order jual gagal!");
            }
        }
    }
    public void register(Investor investor) {
        this.arrInvestor.add(investor);
        System.out.println("Registrasi akun atas nama " + investor.getNama() + " sukses!");
    }
}



