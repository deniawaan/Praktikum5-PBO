/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tugaspraktikum.modul5;

/**
 *
 * @author HP
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class BukuHarian {

    String namaPemilik;
    String namaFile;

    public BukuHarian(String namaPemilik) {
        this.namaPemilik = namaPemilik;
        this.namaFile = "diary_" + namaPemilik.replace(" ", "_") + ".txt";
    }

    public void tulisCatatan(String tanggal, String isi) {
        try {
            FileWriter writer = new FileWriter(namaFile, true);

            writer.write("[" + tanggal + "] - " + isi + "\n");

            writer.close();

            System.out.println("Catatan berhasil disimpan.");
        } catch (IOException e) {
            System.out.println("Gagal menyimpan catatan.");
        }
    }

    public void bacaCatatan() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(namaFile));

            String baris;
            boolean adaCatatan = false;

            while ((baris = reader.readLine()) != null) {
                System.out.println(baris);
                adaCatatan = true;
            }

            reader.close();

            if (!adaCatatan) {
                System.out.println("Belum ada catatan harian.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Belum ada catatan harian.");
        } catch (IOException e) {
            System.out.println("Gagal membaca catatan.");
        }
    }
}