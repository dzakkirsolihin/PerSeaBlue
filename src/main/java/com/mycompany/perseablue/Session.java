/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perseablue;

/**
 *
 * @author AQU_HP
 */
public class Session {
    private static Session instance; // Satu-satunya instance dari kelas Session
    private String userEmail; // Variabel untuk menyimpan email pengguna

    private Session() {} // Konstruktor private untuk mencegah pembuatan instance baru

    public static Session getInstance() {
        if (instance == null) {
            instance = new Session(); // Membuat instance baru jika belum ada
        }
        return instance; // Mengembalikan instance yang ada
    }

    public String getUserEmail() {
        return userEmail; // Mengembalikan email pengguna
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail; // Menyimpan email pengguna
    }
}
