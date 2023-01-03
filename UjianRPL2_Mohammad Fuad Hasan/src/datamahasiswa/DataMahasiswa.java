/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datamahasiswa;

public class DataMahasiswa {
    private String nomor;
    private String nama;
    private String harga;
    private boolean jebar;

    public DataMahasiswa(String nomor, String nama, String harga, boolean jebar){
        this.nomor = nomor;
        this.nama = nama;
        this.harga = harga;
        this.jebar = jebar;
    }
    
    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public boolean isJebar() {
        return jebar;
    }

    public void setJebar(boolean jebar) {
        this.jebar = jebar;
    }
}







