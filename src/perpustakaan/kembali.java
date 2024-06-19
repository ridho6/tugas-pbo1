/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;


/**
 *
 * @author Ridho Syahputra
 */
public class kembali extends denda{
    
    int no_trans_kembali, no_trans_pinjam,  no_anggota,  no_buku;
    String tgl_kembali;
    
    public kembali () {}
    public kembali(int no_trans_kembali, int no_trans_pinjam, int no_anggota, int no_buku, String tgl_kembali){
        this.no_trans_kembali = no_trans_kembali;
        this.no_trans_pinjam = no_trans_pinjam;
        this.no_anggota = no_anggota;
        this.no_buku = no_buku;
        this.tgl_kembali = tgl_kembali;
    }
    
    public void inputNoTransKembali(int no_trans_kembali) {
        this.no_trans_kembali = no_trans_kembali;
    }
    
    public int ambilNoTransKembali() {
        return no_trans_kembali;
    }

    public void inputNoTransPinjam(int no_trans_pinjam) {
        this.no_trans_pinjam = no_trans_pinjam;
    }
    
    public int ambilNoTransPinjam() {
        return no_trans_pinjam;
    }
    
    public void inputNoAnggota(int no_anggota) {
        this.no_anggota = no_anggota;
    }
    
    public int ambilNoAnggota() {
        return no_anggota;
    }

    public void inputNoBuku(int no_buku) {
        this.no_buku = no_buku;
    }
    
    public int ambilNoBuku() {
        return no_buku;
    }

    public void inputTglKembali(String tgl_kembali) {
        this.tgl_kembali = tgl_kembali;
    }
    public String ambilTglKembali() {
        return tgl_kembali;
    }
}