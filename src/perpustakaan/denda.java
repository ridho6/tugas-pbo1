/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

import java.util.Date;


/**
 *
 * @author Ridho Syahputra
 */
public class denda {
    int no_bukti_denda, no_trans_pinjam, no_trans_kembali, jumlah_denda;

    public denda (){}
    public denda (int no_bukti_denda, int no_trans_pinjam, int no_trans_kembali, int jumlah_denda){
        this.no_bukti_denda = no_bukti_denda;
        this.no_trans_pinjam = no_trans_pinjam;
        this.no_trans_kembali = no_trans_kembali;
        this.jumlah_denda = jumlah_denda;
    }
    
    public void inputNoBuktiDenda(int no_bukti_denda) {
        this.no_bukti_denda = no_bukti_denda;
    }
    
    public int ambilNoBuktiDenda() {
        return no_bukti_denda;
    }

    public void inputNoTransPinjam(int no_trans_pinjam) {
        this.no_trans_pinjam = no_trans_pinjam;
    }
    
    public int ambilNoTransPinjam() {
        return no_trans_pinjam;
    }
    
    public void inputNoTransKembali(int no_trans_kembali) {
        this.no_trans_kembali = no_trans_kembali;
    }
    
    public int ambilNoTransKembali() {
        return no_trans_kembali;
    }

    public void inputJumlahDenda(int jumlah_denda) {
        this.jumlah_denda = jumlah_denda;
    }
    
    public int ambilJumlahDenda() {
        return jumlah_denda;
    }
}
