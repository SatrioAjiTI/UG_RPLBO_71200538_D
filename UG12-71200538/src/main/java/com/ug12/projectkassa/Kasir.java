package com.ug12.projectkassa;

public class Kasir {
    private String password;
    private long totalPenjualan;
    private String username;
    private String name;

    public Kasir( String name, String username, String password) {
        this.password = password;
        this.username = username;
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public long getTotalPenjualan() {
        return totalPenjualan;
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public void setTotalPenjualan(long totalPenjualan) {
        this.totalPenjualan = totalPenjualan;
    }
}
