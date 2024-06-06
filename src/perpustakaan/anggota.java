/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author Ridho Syahputra
 */
public class anggota extends pinjam{
    
    String  no_anggota, nm_anggota, kelas, jenis_kel;
    
    public anggota () {}
    public anggota(String no_anggota, String nm_anggota, String kelas, String jenis_kel){
        this.no_anggota = no_anggota;
        this.nm_anggota = nm_anggota;
        this.kelas = kelas;
        this.jenis_kel = jenis_kel;
    }
    
    public void inputNOANGGOTA(String no_anggota) {
        this.no_anggota = no_anggota;
    }
    
    public String ambilNOANGGOTA() {
        return this.no_anggota;
    }
    
    public void inputNMANGGOTA(String nm_anggota) {
        this.nm_anggota = nm_anggota;
    }
    
    public String ambilNMANGGOTA(){
        return this.nm_anggota;
    }
    
    public void inputKELAS(String kelas) {
        this.kelas = kelas;
    }
    
    public String ambilKELAS(){
        return this.kelas;
    }
    
    public void inputJENISKEL(String jenis_kel) {
        this.jenis_kel = jenis_kel;
    }
    
    public String ambilJENISKEL(){
        return this.jenis_kel;
    }
    
}
