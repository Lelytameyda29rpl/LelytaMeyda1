/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elbey.program;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class KartuPelajarSiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama,no_induk,ttl,agama,alamat;
        int nisn;
        
        //Menginput
        Scanner input = new Scanner(System.in);
        
        System.out.println("KARTU SISWA");
        System.out.println("MTsN 1 TULUNGAGUNG");
        System.out.println("Jl. Ki Hajar Dewantara Beji Boyolangu Tulungagung Telp. 0355-321914");
        System.out.println("-------------------------------------------------------------------");
        
        System.out.println("Masukkan Nama Anda:");
        nama = input.nextLine();
        System.out.println("Masukkan No.Induk Anda:");
        no_induk = input.nextLine(); 
        System.out.println("Masukkan TTL Anda:");
        ttl = input.nextLine();
        System.out.println("Masukkan Agama Anda:");
        agama = input.nextLine();
        System.out.println("Masukkan Alamat Anda:");
        alamat = input.nextLine();
        System.out.println("Masukkan NISN Anda:");
        nisn = input.nextInt();
    }
    
}
