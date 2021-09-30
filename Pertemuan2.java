/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 *
 * @author Windows 10
 */
public class Pertemuan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pertemuan2 per = new Pertemuan2();
        System.out.println("====Variable====");
        per.perVariable();
        System.out.println("====Percabangan====");
        per.perCabanganIf();
        per.perCabanganIfElse();
        per.perCabanganIfElseIf();
        per.perCabanganSwitchCase();
    }
    void perVariable(){
//        deklarasi variabel
        String nama_depan, namaBelakang, alamat; 
        int npm, umur, noHp;
//        mengisi variabel (input)
        nama_depan = "Dita";
        namaBelakang = "Zuliany";
        alamat = "Padang Pariaman";
        npm = 19100093;
        umur = 20;
        noHp = 82288;
//       output
        System.out.println("NPM : " + npm);
        System.out.println("Nama : " + nama_depan + "" + namaBelakang);
        System.out.println("No HP : " + noHp);
        System.out.println("Alamat : " + alamat);       
}
    void perCabanganIf(){
        int belanja = 150000;
        
        System.out.println("Total Belanjaan Rp : " + belanja + "");
        
        if (belanja > 100000){
            System.out.println("Selamat Anda Mendapatkan Hadiah");
        }
        System.out.println("Terimakasih...");
    }
    void perCabanganIfElse(){
        int nilai;
        String nama;
        
        nilai = 60;
        nama = "Dita Zuliany";
        
        System.out.println("Nama : " + nama);
        System.out.println("Nilai : " + nilai);
        
        if (nilai >= 70) {
            System.out.println("Selamat " + nama + ", Anda Lulus!");
        } else {
            System.out.println("Maaf " + nama + ", Anda Gagal");
        }
    }
    void perCabanganIfElseIf(){
        int nilai;
        String grade;
        
        System.out.println("Inputkan nilai : ");
        nilai = 81;
        
        if (nilai > 90 && nilai <= 100) {
            grade = "A";
        } else if (nilai > 80 && nilai <= 90) {
            grade = "B+";
        } else if (nilai > 70 && nilai <= 80) {
            grade = "B";
        } else if (nilai > 60 && nilai <= 70) {
            grade = "C+";
        } else if (nilai > 50 && nilai <= 60) {
            grade = "C";
        } else if (nilai > 40 && nilai <= 50) {
            grade = "D";
        } else {
            grade = "E";
        }
        System.out.println("Grade : " + grade);
    }
    void perCabanganSwitchCase(){
        String lampu;
        
        System.out.println("Inputkan Nama Warna: ");
        lampu = "merah";
        
        switch(lampu){
        case "merah":
            System.out.println("Lampu merah, Berhenti!");
            break;
        case "kuning":
            System.out.println("Lampu Kuning, Harap Hati-Hati!");
            break;
        case "hijau":
            System.out.println("Lampu Hijau, Silahkan Jalan!");
            break;
        default:
            System.out.println("Warna Lampu Salah!");
    }
    }
}
