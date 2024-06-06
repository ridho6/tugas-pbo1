/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas;
//import perpustakaan.*;
//import java.util.Scanner;
import CURD.databases; 
//import java.util.Date;

/**
 *
 * @author Ridho Syahputra
 */
public class Tugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        databases dbConnect = new databases();
        /*UJI*/
//        dbConnect.simpanUJI("123", "Ridho", "08123", "cemara");
//        dbConnect.ubahUJI("123", "Ridho", "08111", "cemara");
//        dbConnect.hapusUJI("123");
//        dbConnect.cariUJI("123");
//        dbConnect.dataUJI();
        
        /*ANGGOTA*/
//        dbConnect.simpanANGGOTA("2", "ridho", "pria", "4M");
//        dbConnect.ubahANGGOTA("1", "bayu", "pria", "4M");
//        dbConnect.hapusANGGOTA("2");
//        dbConnect.cariANGGOTA("2");
//        dbConnect.dataANGGOTA();
        
        /*PINJAM*/
//        dbConnect.simpanPINJAM(12, 2, 5, "2024-06-07");
//        dbConnect.ubahPINJAM(12, 2, 5, "2024-05-07");
//        dbConnect.hapusPINJAM(12);
//        dbConnect.cariPINJAM(12);
//        dbConnect.dataPINJAM();
        
        /*KEMBALI*/
//        Date tgl_kembali = new Date(124, 5, 3);
//        dbConnect.simpanKEMBALI(12, 12, 11, 11, tgl_kembali);
//        dbConnect.ubahKEMBALI(12, 12, 11, 9, tgl_kembali);
//        dbConnect.hapusKEMBALI(12);
//        dbConnect.cariKEMBALI(12);
//        dbConnect.dataKEMBALI();

        /*DENDA*/
//        dbConnect.simpanDENDA(5, 12, 12, 50000);
//        dbConnect.ubahDENDA(5, 12, 12, 55000);
//        dbConnect.hapusDENDA(5);
//        dbConnect.cariDENDA(5);
        dbConnect.dataDENDA();
    
//        anggota saya = new anggota();
//        Scanner input = new Scanner(System.in);
//        
//        System.out.print("Masukkan Nama Anggota : ");
//        saya.inputNmAnggota(input.nextLine());
//        
//        System.out.print("Masukkan Kelas : ");
//        saya.inputKelas(input.nextLine());
//        
//        System.out.print("Masukkan Jenis Kelamin (Pria/Wanita) : ");
//        saya.inputJenisKel(input.nextLine());
//        
//        System.out.print("Masukkan No Anggota : ");
//        saya.inputnoAnggota(input.nextLine());
//        
//        System.out.print("Masukkan Tanggal Pinjam : ");
//        saya.inputTglPinjam(input.nextLine());
//       
//        System.out.print("Masukkan No Trans Pinjam : ");
//        saya.inputNoTransPinjam(input.nextInt());
//        
//        System.out.print("Masukkan No Buku : ");
//        saya.inputNoBuku(input.nextInt());
    }
    
}