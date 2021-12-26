/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karyawanpendataan;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Karyawan implements MyInterface{
    ArrayList<ClassGaji> data = new ArrayList<ClassGaji>();
        
    int menu;
    int ulang;
    
    public void tambah(ClassGaji data) {
        this.data.add(data);
    }

    boolean hapus = false;
    public void delete(String kodeKaryawan) {
        for(int a=0; a<this.data.size(); a++){
            if(this.data.get(a).kode.equals(kodeKaryawan)){
                this.data.remove(a);
                hapus = true;
            }
        }
    }
    
    boolean cari = false;
    int list = 0;
    public void CariData(String kode) {
        for(int a=0; a<this.data.size(); a++){
            if(this.data.get(a).kode.equals(kode)){
                list = a;
                cari = true;
            }
        }
        if(cari){
            this.data.get(list).dataKaryawan();
        }
    }

    @Override
    public void dataProfile() {
        System.out.println("===========================================================================================");
        System.out.println("===================================DATA PROFILE KARYAWAN===================================");
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("KODE KARYAWAN   NAMA KARYAWAN	GOLONGAN    USIA    STATUS NIKAH        JUMLAH ANAK");
        System.out.println("-------------------------------------------------------------------------------------------");
        
        for(int a=0; a<this.data.size(); a++){
            String kode = this.data.get(a).kode;
            String nama = this.data.get(a).nama;
            String gol = this.data.get(a).gol;
            int usia = this.data.get(a).usia;
            String status = "Belum Menikah";
            int anak = 0;
            if(this.data.get(a).status == 0){
                status = "Belum Menikah";
                anak = 0;
            } else{
                status = "Menikah";
                anak = this.data.get(a).anak;
            }
            
            System.out.println(kode + " " + nama + "        " + gol + "    " + usia + "    " + status + "      " + anak);
        }
     
    }

}
