/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author Ridho Syahputra
 */
public class pinjam{
    String Tgl_pinjam;
    int No_trans_pinjam, Noanggota, No_buku;

    // Constructor
    public pinjam (){}
    public pinjam(String Tgl_pinjam, int No_trans_pinjam, int No_anggota, int No_buku) {
        this.No_trans_pinjam = No_trans_pinjam;
        this.Noanggota = No_anggota;
        this.No_buku = No_buku;
        this.Tgl_pinjam = Tgl_pinjam;
    }

    public void inputNoTransPinjam(int No_trans_pinjam) {
        this.No_trans_pinjam = No_trans_pinjam;
    }
    
    public int ambilNoTransPinjam() {
        return No_trans_pinjam;
    }

    public void inputNoAnggota(int Noanggota) {
        this.Noanggota = Noanggota;
    }
    
    public int ambilNoAnggota() {
        return Noanggota;
    }

    public void inputNoBuku(int No_buku) {
        this.No_buku = No_buku;
    }
    
    public int ambilNoBuku() {
        return No_buku;
    }

    public void inputTglPinjam(String Tgl_pinjam) {
        this.Tgl_pinjam = Tgl_pinjam;
    }
    public String ambilTglPinjam() {
        return Tgl_pinjam;
    }
}
