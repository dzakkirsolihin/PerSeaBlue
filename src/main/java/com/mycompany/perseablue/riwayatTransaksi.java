/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.perseablue;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WIN11
 */
public class riwayatTransaksi extends javax.swing.JInternalFrame {

    /**
     * Creates new form riwayatTransaksi
     */
    public riwayatTransaksi() {
        initComponents();
        tampil_table();
    }

    private void tampil_table(){
        DefaultTableModel tb = new DefaultTableModel();
        tb.addColumn("No");
        tb.addColumn("Nomor Identitas");
        tb.addColumn("Nama");
        tb.addColumn("Email");
        tb.addColumn("Nomor Hp");
        tb.addColumn("Jumlah");
        tb.addColumn("Id Pertandingan");
        tb.addColumn("Pertandingan");
        tb.addColumn("Tribun");
        tb.addColumn("Harga");
       
        String email = Session.getInstance().getUserEmail(); // Ambil email dari session

        try {
            int counter = 1;
            String query = "SELECT * FROM data_pesanan WHERE email = ? ";
             Connection koneksi = (Connection)koneksidb.configDB();
             PreparedStatement state = koneksi.prepareStatement(query);
            state.setString(1, email); // Set parameter email
            ResultSet Result = state.executeQuery();
            while (Result.next()) {
                tb.addRow(new Object[]{
                    counter++, Result.getString("nomorIdentitas"), Result.getString("nama"), Result.getString("email"), Result.getString("nomorHp"), Result.getString("jumlah"), Result.getString("id_pertandingan"), Result.getString("pertandingan"), Result.getString("tribun"), Result.getString("harga")
                });
            }
             tabelTransaksi.setModel(tb);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Data Gagal Ditampilkan");
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        layar = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        inputNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputNomorHp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        inputNomorIdentitas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        inputJumlah = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        inputTribun = new javax.swing.JTextField();
        inputHarga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        inputIdPertandingan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        inputPertandingan = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelTransaksi = new javax.swing.JTable();

        layar.setBackground(new java.awt.Color(255, 255, 255));
        layar.setPreferredSize(new java.awt.Dimension(1000, 975));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(802, 1000));

        jPanel1.setBackground(new java.awt.Color(0, 1, 36));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 1000));
        jPanel1.setLayout(null);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nama");

        inputNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Email");

        inputEmail.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("No Hp");

        inputNomorHp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomorHpActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Tribun");

        inputNomorIdentitas.setEditable(false);
        inputNomorIdentitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomorIdentitasActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("No");

        inputJumlah.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("jumlah");

        inputTribun.setEditable(false);
        inputTribun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTribunActionPerformed(evt);
            }
        });

        inputHarga.setEditable(false);
        inputHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputHargaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Harga");

        inputIdPertandingan.setEditable(false);
        inputIdPertandingan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdPertandinganActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("ID Pertandingan ");

        jButton2.setText("Hapus");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Riwayat Transaksi");

        inputPertandingan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPertandinganActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Pertandingan");

        tabelTransaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelTransaksiMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelTransaksi);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(inputPertandingan))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputNomorHp, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputNomorIdentitas, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(3, 3, 3))
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputTribun, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputIdPertandingan, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addGap(75, 75, 75))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(245, 245, 245))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputNomorIdentitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(inputTribun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(inputEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(inputIdPertandingan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNomorHp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputPertandingan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(40, 50, 710, 610);

        jScrollPane1.setViewportView(jPanel1);

        layar.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layarLayout = new javax.swing.GroupLayout(layar);
        layar.setLayout(layarLayout);
        layarLayout.setHorizontalGroup(
            layarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
        );
        layarLayout.setVerticalGroup(
            layarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layarLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layar, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(layar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaActionPerformed

    private void inputNomorHpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomorHpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomorHpActionPerformed

    private void inputNomorIdentitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomorIdentitasActionPerformed
        // TODO add your handling code here:
        String Nama = inputNama.getText();
        String No = inputNomorIdentitas.getText();
        try{
            String QueryPesan = "SELECT nama FROM data_pesanan WHERE no= '"+No+"'";
            java.sql.Connection koneksi = (java.sql.Connection)koneksidb.configDB();
            //Kirim Paramater java ke sql
            java.sql.PreparedStatement SQL =koneksi.prepareStatement(QueryPesan);
            //eksekusi Query
            SQL.execute();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Data Gagal Dinputkan");
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_inputNomorIdentitasActionPerformed

    private void inputTribunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTribunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTribunActionPerformed

    private void inputHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputHargaActionPerformed

    private void inputIdPertandinganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdPertandinganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIdPertandinganActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String NomorIdentitas = inputNomorIdentitas.getText();
        String Nama = inputNama.getText();
        String Email = inputEmail.getText();
        String NoHp = inputNomorHp.getText();
        String Jumlah = Integer.toString((Integer) inputJumlah.getValue());
        String Tribun = inputTribun.getText();
        String idTanding = inputIdPertandingan.getText();
        String Tanding = inputPertandingan.getText();
        String Harga = inputHarga.getText();

        int response = JOptionPane.showConfirmDialog(null, "Apakah Anda yakin ingin menghapus riwayat pesanan?", "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
            Connection koneksi = null;
            PreparedStatement stateUpdate = null;

            try{
                String QueryDelete ="DELETE FROM data_pesanan WHERE nomorIdentitas='"+NomorIdentitas+"';";
                java.sql.Connection PenghubungDatabase = (java.sql.Connection)koneksidb.configDB();
                java.sql.PreparedStatement SQL = PenghubungDatabase.prepareStatement(QueryDelete);
                SQL.execute();
                tampil_table();
                bersihInput();
                this.setVisible(false);
                new riwayatTransaksi().setVisible(true);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Data Gagal Dihapus");
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        bersihInput();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void inputPertandinganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPertandinganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPertandinganActionPerformed

    private void tabelTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelTransaksiMouseClicked
        // TODO add your handling code here:
        try {
            int baris = tabelTransaksi.rowAtPoint(evt.getPoint());

            // Ambil nilai dari tabel dan cek validitasnya
            Object noObj = tabelTransaksi.getValueAt(baris, 1);
            String no = noObj != null ? noObj.toString() : "";
            inputNomorIdentitas.setText(no);

            Object nmObj = tabelTransaksi.getValueAt(baris, 2);
            String nm = nmObj != null ? nmObj.toString() : "";
            inputNama.setText(nm);

            Object emailObj = tabelTransaksi.getValueAt(baris, 3);
            String email = emailObj != null ? emailObj.toString() : "";
            inputEmail.setText(email);

            Object jmlhObj = tabelTransaksi.getValueAt(baris, 5);
            String jmlh = jmlhObj != null ? jmlhObj.toString() : "";
            // Pastikan inputJumlah menerima tipe data yang sesuai
            inputJumlah.setValue(Integer.parseInt(jmlh)); // Asumsi inputJumlah adalah JFormattedTextField

            Object nohpObj = tabelTransaksi.getValueAt(baris, 4);
            String nohp = nohpObj != null ? nohpObj.toString() : "";
            inputNomorHp.setText(nohp);

            Object TandingObj = tabelTransaksi.getValueAt(baris, 7);
            String Tanding = TandingObj != null ? TandingObj.toString() : "";
            inputPertandingan.setText(Tanding);

            Object tribObj = tabelTransaksi.getValueAt(baris, 8);
            String trib = tribObj != null ? tribObj.toString() : "";
            inputTribun.setText(trib);

            Object hargaObj = tabelTransaksi.getValueAt(baris, 9);
            String harga = hargaObj != null ? hargaObj.toString() : "";
            inputHarga.setText(harga);

            Object idTandingObj = tabelTransaksi.getValueAt(baris, 6);
            String idTanding = idTandingObj != null ? idTandingObj.toString() : "";
            inputIdPertandingan.setText(idTanding);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error: Illegal number format - " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_tabelTransaksiMouseClicked

    private void bersihInput(){
        inputNomorIdentitas.setText("");
        inputNama.setText("");
        inputEmail.setText("");
        inputNomorHp.setText("");
        inputJumlah.setValue(0);
        inputTribun.setText("");
        inputIdPertandingan.setText("");
        inputPertandingan.setText("");
        inputHarga.setText("");
      }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputEmail;
    private javax.swing.JTextField inputHarga;
    private javax.swing.JTextField inputIdPertandingan;
    private javax.swing.JSpinner inputJumlah;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputNomorHp;
    private javax.swing.JTextField inputNomorIdentitas;
    private javax.swing.JTextField inputPertandingan;
    private javax.swing.JTextField inputTribun;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JDesktopPane layar;
    private javax.swing.JTable tabelTransaksi;
    // End of variables declaration//GEN-END:variables
}
