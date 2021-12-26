/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karyawanpendataan;
import java.util.Calendar;
/**
 *
 * @author User
 */
public class ClassGaji implements MyInterface2{
    String kode, nama, alamat, gol, tanggal;
    
    int status, anak, usia, statusKaryawan, jumlahAnak,gapok;
    int tunjNikah,tunjUsia,tunjAnak,gator;
    double potongan,gajiBersih;
    
    
    public ClassGaji(String kode, String nama, String alamat,String tanggal, String gol, int status, int anak){
        this.kode = kode;   
        this.nama = nama;
        this.alamat = alamat;
        this.tanggal = tanggal;
        this.gol = gol;
        this.status = status;
        this.anak = anak;
        
        Calendar kalender = Calendar.getInstance();
        int tahun = kalender.get(Calendar.YEAR);
        
        String[] arrString = this.tanggal.split("-");
        int lahir = Integer.parseInt(arrString[0]);
        
        int umur = tahun - lahir;
        this.usia = umur;
        
        switch(this.gol){
            case "A":
                this.gapok = 5000000;
                break;
            case "B":
                this.gapok = 6000000;
                break;
            case "C":
                this.gapok = 7000000;
                break;
        }
        
        switch(this.status){
            case 1:
                this.tunjNikah= 10 * this.gapok/100;

                break;
        }
        
        if(this.usia>30){
            this.tunjUsia = 15*this.gapok/100;

        }
        
        switch(this.status){
            case 1:
                if(this.anak>0){
                    this.tunjAnak = this.anak*5*this.gapok/100;

                }
                break;
        }
        
        this.gator = this.gapok + this.tunjNikah + this.tunjUsia + this.tunjAnak;
        this.potongan = this.gator * 2.5 /100;
        this.gajiBersih = this.gator - this.potongan;
    }

    
    @Override
    public void dataKaryawan(){
        System.out.println("===================================");
        System.out.println("DATA PROFILE KARYAWAN");
        System.out.println("-----------------------------------");
        System.out.println("Kode Karyawan           : " + this.kode);
        System.out.println("Nama Karyawan           : " + this.nama);
        System.out.println("Golongan                : " + this.gol);
        System.out.println("Usia                    : " + this.usia);
        
        if(this.status == 0){
            System.out.println("Status Menikah          : Belum Menikah");
            System.out.println("-----------------------------------");
        } else{
            System.out.println("Status Menikah          : Sudah Menikah");
            System.out.println("Jumlah Anak             : " + this.anak);
            System.out.println("-----------------------------------");
        }
       
        System.out.println("Gaji Pokok              : Rp " + this.gapok);
        System.out.println("Tunjangan Istri/Suami   : Rp " + this.tunjNikah);
        System.out.println("Tunjangan Pegawai       : Rp " + this.tunjUsia);
        System.out.println("Tunjangan Anak          : Rp " + this.tunjAnak);
        System.out.println("----------------------------------- + ");
        System.out.println("Gaji Kotor              : Rp " + this.gator);
        System.out.println("Potongan                : Rp " + this.potongan);
        System.out.println("----------------------------------- - ");
        System.out.println("Gaji Bersih             : Rp " + this.gajiBersih);
        
    }
}
