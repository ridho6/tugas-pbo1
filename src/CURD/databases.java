/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CURD;
import java.sql.Connection; //mendapatkan database
import java.sql.DriverManager; //menghubungkan database
import java.sql.PreparedStatement; // perintah sql (CURD)
import java.sql.ResultSet;
import java.sql.Statement;


/**
 *
 * @author Ridho Syahputra
 */
public class databases {
    private String databaseName ="2210010533_muhammad_ridho_syahputra";
    private String username = "root";
    private String password = "";
    public static Connection connectionDB;
    
    public databases (){
        try {
          String location = "jdbc:mysql://localhost/"+databaseName;
          Class.forName("com.mysql.jdbc.Driver");
          connectionDB = DriverManager.getConnection(location,username,password);
          System.out.println("database terkoneksi");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }   
        /*UJI*/
        public void simpanUJI(String nik, String nama, String telp, String alamat){
            try {
                String sql = "insert into uji (nik, nama, telp, alamat) value (?, ?, ?, ?)";
                PreparedStatement perintah = connectionDB.prepareStatement(sql);
                perintah.setString(1, nik);
                perintah.setString(2, nama);
                perintah.setString(3, telp);
                perintah.setString(4, alamat);
                perintah.executeUpdate();
                System.out.println("data berhasil disimpan");
            } catch (Exception e) {
                System.out.println(e.getMessage());  
            }
    }
        public void ubahUJI(String nik, String nama, String telp, String alamat){
            try {
                String sql = "update uji set nama=?, telp=?, alamat=? where nik = ?";
                PreparedStatement perintah = connectionDB.prepareStatement(sql);
                perintah.setString(1, nama);
                perintah.setString(2, telp);
                perintah.setString(3, alamat);
                perintah.setString(4, nik);
                perintah.executeUpdate();
                System.out.println("data berhasil diubah");
            } catch (Exception e) {
                System.out.println(e.getMessage());  
            }
        }
            public void hapusUJI(String nik){
            try {
                String sql = "delete from uji where nik = ?";
                PreparedStatement perintah = connectionDB.prepareStatement(sql);
                perintah.setString(1, nik);
                perintah.executeUpdate();
                System.out.println("data berhasil dihapus");
            } catch (Exception e) {
                System.out.println(e.getMessage());  
            }
        }
            public void cariUJI(String nik) {
                try{
                String sql = "SELECT*FROM uji WHERE nik=?";
                PreparedStatement perintah = connectionDB.prepareStatement(sql);
                perintah.setString(1, nik);
                ResultSet data = perintah.executeQuery();
                while(data.next()){
                    System.out.println("NIK :"+data.getString("nik"));
                    System.out.println("Nama :"+data.getString("nama"));
                    System.out.println("Telp :"+data.getString("telp"));
                    System.out.println("Alamat :"+data.getString("alamat"));
                }
                }catch (Exception e) {
                System.err.println(e.getMessage());    
                }
            }
            public void dataUJI(){
                try{
                    Statement stmt = connectionDB.createStatement();
                    ResultSet baris = stmt.executeQuery("SELECT*FROM uji ORDER BY nik ASC");
                    while(baris.next()){
                        System.out.println(baris.getString("nik")+" | "+
                                baris.getString("nama")+" | "+
                                baris.getString("telp")+" | "+
                                baris.getString("alamat"));
                    }
                }catch (Exception e) {
                    System.err.println(e.getMessage());    
                }
            }
            
            /*ANGOTA*/
            public void simpanANGGOTA(String no_anggota, String nm_anggota, String kelas, String jenis_kel){
            try {
                String sql = "insert into anggota (no_anggota, nm_anggota, jenis_kel, kelas) value (?, ?, ?, ?)";
                PreparedStatement perintah = connectionDB.prepareStatement(sql);
                perintah.setString(1, no_anggota);
                perintah.setString(2, nm_anggota);
                perintah.setString(3, jenis_kel);
                perintah.setString(4, kelas);
                perintah.executeUpdate();
                System.out.println("data berhasil disimpan");
            } catch (Exception e) {
                System.out.println(e.getMessage());  
            }
    }
            public void ubahANGGOTA(String no_anggota, String nm_anggota, String kelas, String jenis_kel){
            try {
                String sql = "update anggota set nm_anggota=?, kelas=?, jenis_kel=? where no_anggota = ?";
                PreparedStatement perintah = connectionDB.prepareStatement(sql);
                perintah.setString(1, nm_anggota);
                perintah.setString(2, kelas);
                perintah.setString(3, jenis_kel);
                perintah.setString(4, no_anggota);
                perintah.executeUpdate();
                System.out.println("data berhasil diubah");
            } catch (Exception e) {
                System.out.println(e.getMessage());  
            }
    }
            public void hapusANGGOTA(String no_anggota){
            try {
                String sql = "delete from anggota where no_anggota = ?";
                PreparedStatement perintah = connectionDB.prepareStatement(sql);
                perintah.setString(1, no_anggota);
                perintah.executeUpdate();
                System.out.println("data berhasil dihapus");
            } catch (Exception e) {
                System.out.println(e.getMessage());  
            }
    }
            public void cariANGGOTA(String no_anggota) {
                try{
                String sql = "SELECT*FROM anggota WHERE no_anggota=?";
                PreparedStatement perintah = connectionDB.prepareStatement(sql);
                perintah.setString(1, no_anggota);
                ResultSet data = perintah.executeQuery();
                while(data.next()){
                    System.out.println("NO Anggota :"+data.getString("no_anggota"));
                    System.out.println("Nama Anggota:"+data.getString("nm_anggota"));
                    System.out.println("Jenis Kelamin :"+data.getString("jenis_kel"));
                    System.out.println("Kelas :"+data.getString("kelas"));
                }
                }catch (Exception e) {
                System.err.println(e.getMessage());    
                }
            }
            public void dataANGGOTA(){
                try{
                    Statement stmt = connectionDB.createStatement();
                    ResultSet baris = stmt.executeQuery("SELECT*FROM anggota ORDER BY no_anggota ASC");
                    while(baris.next()){
                        System.out.println(baris.getString("no_anggota")+" | "+
                                baris.getString("nm_anggota")+" | "+
                                baris.getString("jenis_kel")+" | "+
                                baris.getString("kelas"));
                    }
                }catch (Exception e) {
                    System.err.println(e.getMessage());    
                }
            }
            
            /*PINJAM*/
            public void simpanPINJAM(int no_trans_pinjam, int no_anggota, int no_buku, String tgl_pinjam){
            try {
                String sql = "insert into pinjam (no_trans_pinjam, no_anggota, no_buku, tgl_pinjam) value (?, ?, ?, ?)";
                PreparedStatement perintah = connectionDB.prepareStatement(sql);
                perintah.setInt(1, no_trans_pinjam);
                perintah.setInt(2, no_anggota);
                perintah.setInt(3, no_buku);
                perintah.setString(4, tgl_pinjam);
                perintah.executeUpdate();
                System.out.println("data berhasil disimpan");
            } catch (Exception e) {
                System.out.println(e.getMessage());  
            }
    }
            public void ubahPINJAM(int no_trans_pinjam, int no_anggota, int no_buku, String tgl_pinjam){
            try {
                String sql = "update pinjam set no_anggota=?, no_buku=?, tgl_pinjam=? where no_trans_pinjam = ?";
                PreparedStatement perintah = connectionDB.prepareStatement(sql);
                perintah.setInt(1, no_anggota);
                perintah.setInt(2, no_buku);
                perintah.setString(3, tgl_pinjam);
                perintah.setInt(4, no_trans_pinjam);
                perintah.executeUpdate();
                System.out.println("data berhasil diubah");
            } catch (Exception e) {
                System.out.println(e.getMessage());  
            }
        }
            public void hapusPINJAM(int no_trans_pinjam){
            try {
                String sql = "delete from pinjam where no_trans_pinjam = ?";
                PreparedStatement perintah = connectionDB.prepareStatement(sql);
                perintah.setInt(1, no_trans_pinjam);
                perintah.executeUpdate();
                System.out.println("data berhasil dihapus");
            } catch (Exception e) {
                System.out.println(e.getMessage());  
            }
        }
             public void cariPINJAM(int no_trans_pinjam) {
                try{
                String sql = "SELECT*FROM pinjam WHERE no_trans_pinjam=?";
                PreparedStatement perintah = connectionDB.prepareStatement(sql);
                perintah.setInt(1, no_trans_pinjam);
                ResultSet data = perintah.executeQuery();
                while(data.next()){
                    System.out.println("NO Trans Pinjam :"+data.getString("no_trans_pinjam"));
                    System.out.println("NO Anggota :"+data.getString("no_anggota"));
                    System.out.println("NO Buku :"+data.getString("no_buku"));
                    System.out.println("Tanggal Pinjam :"+data.getString("tgl_pinjam"));
                }
                }catch (Exception e) {
                System.err.println(e.getMessage());    
                }
            }     
            public void dataPINJAM(){
                try{
                    Statement stmt = connectionDB.createStatement();
                    ResultSet baris = stmt.executeQuery("SELECT*FROM pinjam ORDER BY no_trans_pinjam ASC");
                    while(baris.next()){
                        System.out.println(baris.getString("no_trans_pinjam")+" | "+
                                baris.getString("no_anggota")+" | "+
                                baris.getString("no_buku")+" | "+
                                baris.getString("tgl_pinjam"));
                    }
                }catch (Exception e) {
                    System.err.println(e.getMessage());    
                }
            }
             
            /*KEMBALI*/
            public void simpanKEMBALI(int no_trans_kembali, int no_trans_pinjam, int no_anggota, int no_buku, String tgl_kembali){
            try {
                String sql = "insert into kembali (no_trans_kembali, no_trans_pinjam, no_anggota, no_buku, tgl_kembali) value (?, ?, ?, ?, ?)";
                PreparedStatement perintah = connectionDB.prepareStatement(sql);
                perintah.setInt(1, no_trans_kembali);
                perintah.setInt(2, no_trans_pinjam);
                perintah.setInt(3, no_anggota);
                perintah.setInt(4, no_buku);
                perintah.setString(5,tgl_kembali);
                perintah.executeUpdate();
                System.out.println("data berhasil disimpan");
            } catch (Exception e) {
                System.out.println(e.getMessage());  
            }
    }
            public void ubahKEMBALI(int no_trans_kembali, int no_trans_pinjam, int no_anggota, int no_buku, String tgl_kembali){
            try {
                String sql = "update kembali set no_trans_pinjam=?, no_anggota=?, no_buku=?, tgl_kembali=? where no_trans_kembali = ?";
                PreparedStatement perintah = connectionDB.prepareStatement(sql);
                perintah.setInt(1, no_trans_pinjam);
                perintah.setInt(2, no_anggota);
                perintah.setInt(3, no_buku);
                perintah.setString(4, tgl_kembali);
                perintah.setInt(5, no_trans_kembali);
                perintah.executeUpdate();
                System.out.println("data berhasil diubah");
            } catch (Exception e) {
                System.out.println(e.getMessage());  
            }
   }
            public void hapusKEMBALI(int no_trans_kembali){
            try {
                String sql = "delete from kembali where no_trans_kembali = ?";
                PreparedStatement perintah = connectionDB.prepareStatement(sql);;
                perintah.setInt(1, no_trans_kembali);
                perintah.executeUpdate();
                System.out.println("data berhasil dihapus");
            } catch (Exception e) {
                System.out.println(e.getMessage());  
            }
    }
            public void cariKEMBALI(int no_trans_kembali) {
                try{
                String sql = "SELECT*FROM kembali WHERE no_trans_kembali=?";
                PreparedStatement perintah = connectionDB.prepareStatement(sql);
                perintah.setInt(1, no_trans_kembali);
                ResultSet data = perintah.executeQuery();
                while(data.next()){
                    System.out.println("NO Trans Kembali :"+data.getString("no_trans_kembali"));
                    System.out.println("NO Trans Pinjam :"+data.getString("no_trans_pinjam"));
                    System.out.println("No Anggota :"+data.getString("no_anggota"));
                    System.out.println("NO Buku :"+data.getString("no_buku"));
                    System.out.println("Tanggal Kembali :"+data.getString("tgl_kembali"));
                }
                }catch (Exception e) {
                System.err.println(e.getMessage());    
                }
            }  
            public void dataKEMBALI(){
                try{
                    Statement stmt = connectionDB.createStatement();
                    ResultSet baris = stmt.executeQuery("SELECT*FROM kembali ORDER BY no_trans_kembali ASC");
                    while(baris.next()){
                        System.out.println(baris.getString("no_trans_kembali")+" | "+
                                baris.getString("no_trans_pinjam")+" | "+
                                baris.getString("no_anggota")+" | "+
                                baris.getString("no_buku")+" | "+
                                baris.getString("tgl_kembali"));
                    }
                }catch (Exception e) {
                    System.err.println(e.getMessage());    
                }
            }
            
            /*DENDA*/
            public void simpanDENDA(int no_bukti_denda, int no_trans_pinjam, int no_trans_kembali, int jumlah_denda){
            try {
                String sql = "insert into denda (no_bukti_denda, no_trans_pinjam, no_trans_kembali, jumlah_denda) value (?, ?, ?, ?)";
                PreparedStatement perintah = connectionDB.prepareStatement(sql);
                perintah.setInt(1, no_bukti_denda);
                perintah.setInt(2, no_trans_pinjam);
                perintah.setInt(3, no_trans_kembali);
                perintah.setInt(4, jumlah_denda);
                perintah.executeUpdate();
                System.out.println("data berhasil disimpan");
            } catch (Exception e) {
                System.out.println(e.getMessage());  
            }
    }
            public void ubahDENDA(int no_bukti_denda, int no_trans_pinjam, int no_trans_kembali, int jumlah_denda){
            try {
                String sql = "update denda set no_trans_pinjam=?, no_trans_kembali=?, jumlah_denda=? where no_bukti_denda = ?";
                PreparedStatement perintah = connectionDB.prepareStatement(sql);
                perintah.setInt(1, no_trans_pinjam);
                perintah.setInt(2, no_trans_kembali);
                perintah.setInt(3, jumlah_denda);
                perintah.setInt(4, no_bukti_denda);
                perintah.executeUpdate();
                System.out.println("data berhasil diubah");
            } catch (Exception e) {
                System.out.println(e.getMessage());  
            }
    }
            public void hapusDENDA(int no_bukti_denda){
            try {
                String sql = "delete from denda where no_bukti_denda = ?";
                PreparedStatement perintah = connectionDB.prepareStatement(sql);
                perintah.setInt(1, no_bukti_denda);
                perintah.executeUpdate();
                System.out.println("data berhasil dihapus");
            } catch (Exception e) {
                System.out.println(e.getMessage());  
            }
    }
            public void cariDENDA(int no_bukti_denda) {
                try{
                String sql = "SELECT*FROM denda WHERE no_bukti_denda=?";
                PreparedStatement perintah = connectionDB.prepareStatement(sql);
                perintah.setInt(1, no_bukti_denda);
                ResultSet data = perintah.executeQuery();
                while(data.next()){
                    System.out.println("NO Bukti Denda :"+data.getString("no_bukti_denda"));
                    System.out.println("NO Trans Pinjam :"+data.getString("no_trans_pinjam"));
                    System.out.println("NO Trans Kembali :"+data.getString("no_trans_kembali"));
                    System.out.println("Jumlah Dendaa :"+data.getString("jumlah_denda"));
                }
                }catch (Exception e) {
                System.err.println(e.getMessage());    
                }
            }
            public void dataDENDA(){
                try{
                    Statement stmt = connectionDB.createStatement();
                    ResultSet baris = stmt.executeQuery("SELECT*FROM denda ORDER BY no_bukti_denda ASC");
                    while(baris.next()){
                        System.out.println(baris.getString("no_bukti_denda")+" | "+
                                baris.getString("no_trans_pinjam")+" | "+
                                baris.getString("no_trans_kembali")+" | "+
                                baris.getString("jumlah_denda"));
                    }
                }catch (Exception e) {
                    System.err.println(e.getMessage());    
                }
            }
}