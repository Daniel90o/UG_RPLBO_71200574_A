package com.ug12.aplikasistockbit;

import java.util.HashMap;

public class Investor {
    private String username;
    private String nama;
    private String password;
    private HashMap<Saham,Integer> portfolio = new HashMap<Saham, Integer>();
    public Investor(String nama, String username, String password){
        this.username = username;
        this.password = password;
        this.nama = nama;
    }
    public String getUsername() {
        return username;
    }
    public String getNama() {
        return nama;
    }
    public String getPassword() {
        return password;
    }
    public HashMap<Saham, Integer> getPortfolio() {
        return portfolio;
    }
}
