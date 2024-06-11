/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.perseablue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author WIN11
 */
public class koneksidb {
    // Mendeklarasikan variabel statis 'conn' dari tipe Connection
    public static Connection conn;

    // Metode untuk mengkonfigurasi dan mengembalikan koneksi database
    public static Connection configDB() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost/db_perseablue"; // URL database
            String user = "root"; // user database
            String password = ""; // password database

            // Memuat driver JDBC MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Membuat koneksi ke database menggunakan DriverManager dan menyimpan dalam variabel 'conn'
            conn = DriverManager.getConnection(url, user, password);
            //JOptionPane.showMessageDialog(null, "Koneksi Berhasil Terhubung!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Koneksi Gagal Terhubung!");
            System.err.println("Koneksi gagal " + e.getMessage()); // perintah menampilkan error
        }
        return conn; // Mengembalikan objek Connection
    }

    /*
    public static void main(String[] args) throws SQLException {
        Connection conn = (Connection)koneksidb.configDB();
        PreparedStatement pst;
        ResultSet rs;
        try {
            String sqlQuery = "SELECT * FROM data_users";
            pst = conn.prepareStatement(sqlQuery);
            rs = pst.executeQuery();
            if (rs.next()) {
                String name = rs.getString(2);
                System.out.println("Email: " + name);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }*/
}
