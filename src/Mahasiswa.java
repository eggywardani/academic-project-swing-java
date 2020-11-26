import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import javax.swing.JOptionPane;
import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
public class Mahasiswa extends javax.swing.JFrame {

    
    public Mahasiswa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtnim = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbojekel = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txttempatlahir = new javax.swing.JTextField();
        txttgllahir = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        cmdsave = new javax.swing.JButton();
        cmdupdate = new javax.swing.JButton();
        cmddelete = new javax.swing.JButton();
        cmdcancel = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtcari = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tmahasiswa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("DATA MAHASISWA");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("NIM");

        jLabel3.setText("NAMA");

        jLabel4.setText("JENIS KELAMIN");

        cbojekel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Laki-laki", "Perempuan" }));

        jLabel5.setText("TEMPAT LAHIR");

        jLabel6.setText("TGL.LAHIR");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        jLabel7.setText("(contoh: 2020-11-13)");

        jLabel8.setText("ALAMAT");

        txtalamat.setColumns(20);
        txtalamat.setRows(5);
        jScrollPane1.setViewportView(txtalamat);

        cmdsave.setText("SAVE");
        cmdsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdsaveActionPerformed(evt);
            }
        });

        cmdupdate.setText("UPDATE");
        cmdupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdupdateActionPerformed(evt);
            }
        });

        cmddelete.setText("DELETE");
        cmddelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmddeleteActionPerformed(evt);
            }
        });

        cmdcancel.setText("CANCEL");
        cmdcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbojekel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnim, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txttgllahir, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(43, 43, 43)
                                .addComponent(txttempatlahir, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(75, 75, 75)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cmdsave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdupdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmddelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdcancel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(cbojekel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txttempatlahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txttgllahir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 64, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmdsave)
                            .addComponent(cmdupdate)
                            .addComponent(cmddelete)
                            .addComponent(cmdcancel))))
                .addContainerGap())
        );

        jLabel9.setText("SEARCH");

        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcariKeyPressed(evt);
            }
        });

        tmahasiswa.setModel(new javax.swing.table.DefaultTableModel(
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
        tmahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tmahasiswaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tmahasiswa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(43, 43, 43)
                                .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(82, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /*
     Nama : Eggy Andika Wardani
     NIM  : 20185102
    Kelas : 5E
     */
    
    String koneksi ="jdbc:mysql://localhost/dbakademik";
    String user ="root";
    String pass ="";
    Connection connection;
    Statement statement;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi= "jdbc:mysql://localhost/dbakademik";
            connection = (Connection) DriverManager.getConnection(koneksi, user, pass);
            statement = (Statement) connection.createStatement();
            
        } catch (Exception DBException) {
            JOptionPane.showMessageDialog(this, "Koneksi gagal", "error", JOptionPane.ERROR_MESSAGE);
            System.err.println("Error : " + DBException);
        }
        
        bersih();
        cmdupdate.setEnabled(false);
        cmddelete.setEnabled(false);
        txtnim.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void cmdsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdsaveActionPerformed
        try {
            String sql;
            {
                sql = "insert into mahasiswa values('";
                sql+= txtnim.getText()+"','";
                sql+= txtnama.getText()+"','";
                sql+= cbojekel.getSelectedItem()+"','";
                sql+= txttempatlahir.getText()+"','";
                sql+= txttgllahir.getText()+"','";
                sql+= txtalamat.getText()+"')";
                
            }
            
            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Simpan data berhasil", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception DBException) {
            JOptionPane.showMessageDialog(this, "Simpan data gagal", "Error", JOptionPane.ERROR_MESSAGE);
            System.err.println("Error: "+ DBException);
            
        }
        bersih();
        txtnim.requestFocus();
        
    }//GEN-LAST:event_cmdsaveActionPerformed

    private void cmdupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdupdateActionPerformed
        try {
            String sql;
            {
                sql = "update mahasiswa set nama='";
                sql+= txtnama.getText()+"',jekel='";
                sql+= cbojekel.getSelectedItem()+"',tempat='";
                sql+= txttempatlahir.getText()+"',tgllahir='";
                sql+= txttgllahir.getText()+"',alamat='";
                sql+= txtalamat.getText()+"'";
                sql+= "where nim='" + txtnim.getText() +"'";       
            }
            
            statement.executeUpdate(sql);
            JOptionPane.showMessageDialog(this, "Update data berhasil", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception DBException) {
            JOptionPane.showMessageDialog(this, "Update data gagal", "Error", JOptionPane.ERROR_MESSAGE);
            System.err.println("Error: "+ DBException);   
        }
        bersih();
        txtnim.setEditable(true);
        txtnim.requestFocus(true);
        cmdsave.setEnabled(true);
        cmdupdate.setEnabled(false);
        cmddelete.setEnabled(false);   
    }//GEN-LAST:event_cmdupdateActionPerformed

    private void cmddeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmddeleteActionPerformed
        try {
            int reply = JOptionPane.showConfirmDialog(this, "Apakah anda yakin menghapus data ini?","Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (reply == JOptionPane.YES_OPTION) {
                String sql = "delete from mahasiswa where nim='" +txtnim.getText() +"'";
                statement.executeUpdate(sql);
            }
        } catch (Exception DBException) {
            JOptionPane.showMessageDialog(this, "Hapus data gagal", "Error", JOptionPane.ERROR_MESSAGE);
            System.err.println("Error: "+ DBException);
        }
        bersih();
        cmdupdate.setEnabled(false);
        cmddelete.setEnabled(false);
        cmdsave.setEnabled(true);
        txtnim.setEditable(true);
        txtnim.requestFocus();
    }//GEN-LAST:event_cmddeleteActionPerformed

    private void cmdcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcancelActionPerformed
        dispose();
    }//GEN-LAST:event_cmdcancelActionPerformed

    private void tmahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmahasiswaMouseClicked
        txtnim.setText(tmahasiswa.getValueAt(tmahasiswa.getSelectedRow(), 0).toString());
        txtnama.setText(tmahasiswa.getValueAt(tmahasiswa.getSelectedRow(), 1).toString());
        cbojekel.setSelectedItem(tmahasiswa.getValueAt(tmahasiswa.getSelectedRow(), 2).toString());
        txttempatlahir.setText(tmahasiswa.getValueAt(tmahasiswa.getSelectedRow(), 3).toString());
        txttgllahir.setText(tmahasiswa.getValueAt(tmahasiswa.getSelectedRow(), 4).toString());
        txtalamat.setText(tmahasiswa.getValueAt(tmahasiswa.getSelectedRow(), 5).toString());
        cmdupdate.setEnabled(true);
        cmddelete.setEnabled(true);
        txtnim.setEditable(false);
        cmdsave.setEnabled(false);
        
    }//GEN-LAST:event_tmahasiswaMouseClicked

    private void txtcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyPressed
        DefaultTableModel tabel = new DefaultTableModel();
        tabel.addColumn("NIM");
        tabel.addColumn("NAMA");
        tabel.addColumn("JENIS KELAMIN");
        tabel.addColumn("TEMPAT");
        tabel.addColumn("TGL LAHIR");
        tabel.addColumn("ALAMAT");
        try {
            String sql = "select * from mahasiswa where nim like '%" + txtcari.getText()+ "%'"+ "or nama like '%" + txtcari.getText() +"%'";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                tabel.addRow(new Object[]{
                
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getString(4),
                rs.getString(5),
                rs.getString(6)  
            });
            }
            tmahasiswa.setModel(tabel);
        } catch (Exception DBException) {
            System.err.println("Error "+ DBException);
        }
    }//GEN-LAST:event_txtcariKeyPressed

    private void bersih() {
        txtnim.setText("");
        txtnama.setText("");
        cbojekel.setSelectedIndex(0);
        txttempatlahir.setText("");
        txttgllahir.setText("");
        txtalamat.setText("");
        try {
            String sql = "select * from mahasiswa order by nim asc";
            ResultSet rs= statement.executeQuery(sql);
            final String[] header = {"NIM", "NAMA", "JENIS KELAMIN", "TEMPAT LAHIR", "TGL LAHIR","ALAMAT"};
            rs.last();
            int n = rs.getRow();
            Object[][] data = new Object[n][6];
            int p=0;
            rs.beforeFirst();
            while (rs.next()) {
                data[p][0]=rs.getString(1);
                data[p][1]=rs.getString(2);
                data[p][2]=rs.getString(3);
                data[p][3]=rs.getString(4);
                data[p][4]=rs.getString(5);
                data[p][5]=rs.getString(6);
                p++;   
            }
            tmahasiswa.setModel(new DefaultTableModel(data, header));
            tmahasiswa.setAlignmentX(CENTER_ALIGNMENT);       
        } catch (Exception DBException) {
            System.err.println("Error" + DBException);
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbojekel;
    private javax.swing.JButton cmdcancel;
    private javax.swing.JButton cmddelete;
    private javax.swing.JButton cmdsave;
    private javax.swing.JButton cmdupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tmahasiswa;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtnim;
    private javax.swing.JTextField txttempatlahir;
    private javax.swing.JTextField txttgllahir;
    // End of variables declaration//GEN-END:variables

    
}
