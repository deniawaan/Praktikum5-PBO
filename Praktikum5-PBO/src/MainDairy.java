/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tugaspraktikum.modul5;

/**
 *
 * @author HP
 */
public class MainDiary {

    public static void main(String[] args) {

        BukuHarian diary = new BukuHarian("Deni Septiawan");

        diary.tulisCatatan(
            "12-09-2026",
            "Hari ini saya mengikuti praktikum PBO."
        );

        diary.tulisCatatan(
            "13-09-2026",
            "Hari ini saya belajar tentang persistensi data."
        );
        
        diary.bacaCatatan();
    }
}
