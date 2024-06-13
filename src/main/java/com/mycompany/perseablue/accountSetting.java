/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.perseablue;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Image;

/**
 *
 * @author WIN11
 */
public class accountSetting extends javax.swing.JInternalFrame {

    private javax.swing.JButton uploadBtn;
    private javax.swing.JLabel profilePicLabel;
    private javax.swing.JPanel profilePicPanel;

    public accountSetting() {
        initComponents(); // Inisialisasi komponen
        String email = Session.getInstance().getUserEmail(); // Ambil email dari session
        if (email != null && !email.isEmpty()) {
            loadUserData(email); // Panggil metode untuk memuat data pengguna berdasarkan email
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        fieldEmail = new javax.swing.JTextField();
        fieldNoHP = new javax.swing.JTextField();
        fieldNama = new javax.swing.JTextField();
        fieldNoIdentitas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        editbtn = new javax.swing.JButton();
        fieldJK = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        fieldAlamat = new javax.swing.JTextArea();
        uploadBtn = new javax.swing.JButton();
        profilePicPanel = new javax.swing.JPanel();
        profilePicLabel = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jPanel2.setBackground(new java.awt.Color(239, 244, 255));

        fieldEmail.setEditable(false);
        fieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldEmailActionPerformed(evt);
            }
        });

        fieldNoIdentitas.setEditable(false);
        fieldNoIdentitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNoIdentitasActionPerformed(evt);
            }
        });

        jLabel1.setText("Nama");

        jLabel2.setText("Email");

        jLabel3.setText("Nomor HP");

        jLabel4.setText("Jenis Kelamin");

        jLabel5.setText("Alamat");

        jLabel6.setText("Nomor Identitas");

        editbtn.setBackground(new java.awt.Color(0, 0, 153));
        editbtn.setForeground(new java.awt.Color(255, 255, 255));
        editbtn.setText("Edit");
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });

        fieldJK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));
        fieldJK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldJKActionPerformed(evt);
            }
        });

        fieldAlamat.setColumns(20);
        fieldAlamat.setRows(5);
        jScrollPane1.setViewportView(fieldAlamat);

        uploadBtn.setText("Upload Foto Profil");
        uploadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadBtnActionPerformed(evt);
            }
        });

        profilePicPanel.setBackground(new java.awt.Color(255, 255, 255));
        profilePicPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        profilePicLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profilePicLabel.setText("Foto Profil");

        javax.swing.GroupLayout profilePicPanelLayout = new javax.swing.GroupLayout(profilePicPanel);
        profilePicPanel.setLayout(profilePicPanelLayout);
        profilePicPanelLayout.setHorizontalGroup(
            profilePicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(profilePicLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        profilePicPanelLayout.setVerticalGroup(
            profilePicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(profilePicLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fieldNama)
                    .addComponent(fieldNoHP)
                    .addComponent(fieldNoIdentitas)
                    .addComponent(fieldEmail)
                    .addComponent(editbtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fieldJK, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uploadBtn)
                    .addComponent(profilePicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNoHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNoIdentitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(editbtn)
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(profilePicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(uploadBtn)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void uploadBtnActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("Image files", "jpg", "jpeg", "png"));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                BufferedImage img = ImageIO.read(selectedFile);
                ImageIcon icon = new ImageIcon(img.getScaledInstance(profilePicLabel.getWidth(), profilePicLabel.getHeight(), Image.SCALE_SMOOTH));
                profilePicLabel.setIcon(icon);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // </editor-fold>//GEN-END:initComponents

    private void fieldNoIdentitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNoIdentitasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNoIdentitasActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        // TODO add your handling code here:
        // Ambil data dari input field
        String email = fieldEmail.getText();
        String nama = fieldNama.getText();
        String nomorHP = fieldNoHP.getText();
        String jenisKelamin = (String)fieldJK.getSelectedItem();
        String alamat = fieldAlamat.getText();

        // Tampilkan dialog konfirmasi
        int response = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin mengubah data akun?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
            Connection koneksi = null;
            PreparedStatement stateUpdate = null;

            try {
                koneksi = (Connection) koneksidb.configDB(); // Koneksi ke database
                String sqlUpdate = "UPDATE data_users SET nama = ?, nomorhp = ?, jenisKelamin = ?, alamat = ? WHERE email = ?"; // Query untuk update data pengguna
                stateUpdate = koneksi.prepareStatement(sqlUpdate); // Persiapan statement
                stateUpdate.setString(1, nama); // Set parameter nama
                stateUpdate.setString(2, nomorHP); // Set parameter nomor HP
                stateUpdate.setString(3, jenisKelamin); // Set parameter jenis kelamin
                stateUpdate.setString(4, alamat); // Set parameter alamat
                stateUpdate.setString(5, email); // Set parameter email
                int rowsUpdated = stateUpdate.executeUpdate(); // Eksekusi update

                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(null, "Data berhasil diperbarui"); // Notifikasi jika update berhasil
                    // Navigasi ke dashboard setelah update berhasil
                    dashboard dashboard = new dashboard(); // Buat instance dari DashboardForm
                    dashboard.setVisible(true); // Tampilkan DashboardForm
                    this.dispose(); // Tutup form saat ini (MyForm)
                } else {
                    JOptionPane.showMessageDialog(null, "Data tidak ada perubahan"); // Notifikasi jika data tidak ditemukan atau tidak ada perubahan
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage()); // Tampilkan pesan error jika ada
            } finally {
                try {
                    if (stateUpdate != null) stateUpdate.close(); // Tutup statement
                    if (koneksi != null) koneksi.close(); // Tutup koneksi
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage()); // Tampilkan pesan error jika ada
                }
            }
        }
    }//GEN-LAST:event_editbtnActionPerformed

    private void fieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldEmailActionPerformed

    private void fieldJKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldJKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldJKActionPerformed

    private void loadUserData(String email) {
        Connection koneksi = null;
        PreparedStatement stateEmail = null;
        ResultSet hasilEmail = null;
    
        try {
            koneksi = koneksidb.configDB(); // Koneksi ke database
            String sqlEmail = "SELECT * FROM data_users WHERE email = ?"; // Query untuk mengambil data pengguna berdasarkan email
            stateEmail = koneksi.prepareStatement(sqlEmail); // Persiapan statement
            stateEmail.setString(1, email); // Set parameter email
            hasilEmail = stateEmail.executeQuery(); // Eksekusi query
    
            if (hasilEmail.next()) {
                fieldNama.setText(hasilEmail.getString("nama")); // Set field nama dengan data dari database
                fieldEmail.setText(hasilEmail.getString("email")); // Set field email dengan data dari database
                fieldNoHP.setText(hasilEmail.getString("nomorhp")); // Set field nomor HP dengan data dari database
                fieldJK.setSelectedItem(hasilEmail.getString("jenisKelamin")); // Set field jenis kelamin dengan data dari database
                fieldAlamat.setText(hasilEmail.getString("alamat")); // Set field alamat dengan data dari database
                fieldNoIdentitas.setText(hasilEmail.getString("nomorIdentitas")); // Set field nomor identitas dengan data dari database
            } else {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan"); // Notifikasi jika data tidak ditemukan
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage()); // Tampilkan pesan error jika ada
        } finally {
            try {
                if (hasilEmail != null) hasilEmail.close(); // Tutup result set
                if (stateEmail != null) stateEmail.close(); // Tutup statement
                if (koneksi != null) koneksi.close(); // Tutup koneksi
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + e.getMessage()); // Tampilkan pesan error jika ada
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editbtn;
    private javax.swing.JTextArea fieldAlamat;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JComboBox<String> fieldJK;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JTextField fieldNoHP;
    private javax.swing.JTextField fieldNoIdentitas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
