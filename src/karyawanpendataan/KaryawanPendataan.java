/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karyawanpendataan;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class KaryawanPendataan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Karyawan data = new Karyawan();
        
        while (true){
            System.out.println("MENU UTAMA");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Lihat Data");
            System.out.println("5. Exit");
            
            Scanner input = new Scanner(System.in);
            System.out.print("Menu Pilihan: ");
            int menuUtama = Integer.valueOf(input.nextInt());
            
            switch(menuUtama){
                case 1:
                    boolean tambahData = true;
                    while(tambahData){
                        String debug = input.nextLine();
                        System.out.print("Masukkan Kode Karyawan    : ");
                        String kode = input.nextLine();
                        System.out.print("Masukkan Nama Karyawan    : ");
                        String nama = input.nextLine();
                        System.out.print("Masukkan Alamat Karyawan  : ");
                        String alamat = input.nextLine();
                        System.out.print("Masukkan Tanggal Lahir    : ");
                        String tanggal = input.nextLine();
                        System.out.print("Golongan \n"
                                + "A \n"
                                + "B \n"
                                + "C \n");
                        System.out.print("Masukkan Golongan         : ");
                        String gol = input.nextLine();
                        System.out.print("Status Menikah \n"
                                + "0. Belum Menikah \n"
                                + "1. Sudah Menikah \n");
                        System.out.print("Masukkan Status Menikah   : ");
                        int status = input.nextInt();
                        int anak;
                        if (status == 1){
                            System.out.print("Masukkan Jumlah anak  : ");
                            anak = input.nextInt();
                        }else{
                            anak = 0;
                        }
                        
                        ClassGaji ClassGaji = new ClassGaji(kode, nama, alamat, tanggal, gol, status, anak);
                        
                        data.tambah(ClassGaji);
                        
                        System.out.println("Pilih SubMenu: \n"
                                + "1. Kembali ke menu utama \n"
                                + "2. Tambah Data Kembali");
                        System.out.print("Menu Pilihan: ");
                        int subMenu =input.nextInt();
                        if(subMenu == 1){
                            tambahData = false;
                        } else if(subMenu != 2){
                            System.out.println("Pilihan SubMenu Tidak Ada");
                        }
                    }
                    break;
                
                case 2:
                    boolean deleteData = true;
                    while(deleteData){
                        String debug = input.nextLine();
                        System.out.print("Masukkan Kode Karyawan Yang Mau Dihapus: ");
                        String kode = input.nextLine();
                        data.delete(kode);
                        
                        System.out.println("Pilih SubMenu: \n"
                                + "1. Kembali ke menu utama \n"
                                + "2. Hapus Data Kembali");
                        System.out.print("Menu Pilihan: ");
                        int subMenu =input.nextInt();
                        if(subMenu == 1){
                            deleteData = false;
                        } else if(subMenu != 2){
                            System.out.println("Pilihan SubMenu Tidak Ada");
                        }
                    }
                    break;
                    
                case 3:
                    boolean cari = true;
                    while(cari){
                        String debug = input.nextLine();
                        System.out.print("Masukkan Kode Karyawan : ");
                        String kode = input.nextLine();
                        data.CariData(kode);                 
                        System.out.println("Pilih SubMenu: \n"
                                + "1. Kembali ke menu utama \n");
                        System.out.print("Menu Pilihan: ");
                        int subMenu =input.nextInt();
                        if(subMenu == 1){
                            cari = false;
                        } else if(subMenu != 2){
                            System.out.println("Pilihan SubMenu Tidak Ada");
                        }
                    }
                    break;
                
                case 4:
                    boolean lihat = true;
                    while(lihat){
                        data.dataProfile();
                        System.out.println("Pilih SubMenu: \n"
                                + "1. Kembali ke menu utama \n");
                        System.out.print("Menu Pilihan: ");
                        int subMenu =input.nextInt();
                        if(subMenu == 1){
                            lihat = false;
                        } else if(subMenu != 2){
                            System.out.println("Pilihan SubMenu Tidak Ada");
                        }
                    }
                    break;
                
                case 5:
                    System.out.print("Exit...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan Tidak Ada!");
            }
        
        }
    }
    
}
