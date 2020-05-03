package UiAdminPenjualan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Koneksi.koneksi;
import Login.Login;
import UiAdminPengawasan.UI_MENU;
import java.awt.GraphicsEnvironment;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_OPTION;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author User
 */
public class UI_MENU_2 extends javax.swing.JFrame {
    String stok;
    private DefaultTableModel model;

    /**
     * Creates new form UI_MENU
     */
    public UI_MENU_2() {
        
        initComponents();
        setLocationRelativeTo(null);
        //setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        
         getDatabase();
        
    }
    static boolean maximized =true;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        logout = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        menustring = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_barang = new javax.swing.JTable();
        et_searchbar = new javax.swing.JTextField();
        searchBar = new javax.swing.JLabel();
        cb_stok = new javax.swing.JComboBox<>();
        cb_jenis = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(37, 37, 37));

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Drawable/xsmol.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });

        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Drawable/logout24.png"))); // NOI18N
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(25, 25, 25));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admin Penjualan");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        menustring.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        menustring.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menustring.setText("Selamat Datang, nama");

        tb_barang.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_barangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_barang);

        et_searchbar.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        et_searchbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                et_searchbarActionPerformed(evt);
            }
        });

        searchBar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Drawable/ic_search.png"))); // NOI18N
        searchBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchBarMouseClicked(evt);
            }
        });

        cb_stok.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Keseluruhan", "Stok Ter-rendah", "Stok Tertinggi" }));
        cb_stok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_stokActionPerformed(evt);
            }
        });

        cb_jenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Keseluruhan", "Makanan", "Minuman", "Rokok", " " }));
        cb_jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_jenisActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Cek berdasarkan Jenis Barang");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Cek berdasarkan Jumlah Stok");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cb_stok, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cb_jenis, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addComponent(searchBar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(et_searchbar)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(340, Short.MAX_VALUE)
                .addComponent(menustring)
                .addGap(340, 340, 340))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(30, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menustring)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchBar, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(cb_jenis, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cb_stok)
                    .addComponent(et_searchbar))
                .addContainerGap(401, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(172, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(58, Short.MAX_VALUE)))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Drawable/minus(1).png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(close, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin Logout? ","Konfirmasi Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(response == JOptionPane.YES_OPTION){
            dispose();
            Login UP = new Login();
            dispose();
            UP.setVisible(true);
        }
    }//GEN-LAST:event_logoutMouseClicked

    private void cb_jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_jenisActionPerformed
        // TODO add your handling code here:
        loadDataJenis();
    }//GEN-LAST:event_cb_jenisActionPerformed

    private void cb_stokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_stokActionPerformed
        // TODO add your handling code here:
        loadDataStok();
    }//GEN-LAST:event_cb_stokActionPerformed

    private void searchBarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchBarMouseClicked
        // TODO add your handling code here:
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        koneksi kon = new koneksi();
        kon.getData();

        try {

            Statement stat = (Statement) kon.getData().createStatement();
            String sql = "Select * from barang where nama_barang like '%" + et_searchbar.getText() + "%'";
            ResultSet rs = stat.executeQuery(sql);

            while (rs.next()){
                Object[] obj = new Object[6];
                obj[0] = rs.getString("id_barang");
                obj[1] = rs.getString("nama_barang");
                obj[2] = rs.getString("stok");
                obj[3] = rs.getString("harga");
                obj[4] = rs.getString("harga_rata");
                obj[5] = rs.getString("jenis_barang");

                model.addRow(obj);
            }
        }catch (SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
            et_searchbar.setText("");
        }
    }//GEN-LAST:event_searchBarMouseClicked

    private void et_searchbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_et_searchbarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_et_searchbarActionPerformed

    private void tb_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_barangMouseClicked
        // TODO add your handling code here:
        int index = tb_barang.getSelectedRow();
        TableModel model = tb_barang.getModel();
        String id = model.getValueAt(index, 0).toString();
        String nama = model.getValueAt(index, 1).toString();
        String stok = model.getValueAt(index, 2).toString();
        String harga = model.getValueAt(index, 3).toString();
        String hargarata = model.getValueAt(index, 4).toString();
        String jenis = model.getValueAt(index, 5).toString();

        u.setVisible(true);
        u.pack();
        u.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        u.et_id.setText(id);
        u.et_nama.setText(nama);
        u.et_stok.setText(stok);
        u.et_stok1.setText(stok);
        u.et_harga.setText(harga);
        u.et_rata.setText(hargarata);
        u.et_jenis.setText(jenis);

    }//GEN-LAST:event_tb_barangMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_jLabel4MouseClicked

    
    updateBarang u = new updateBarang();
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(UI_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI_MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI_MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_jenis;
    private javax.swing.JComboBox<String> cb_stok;
    private javax.swing.JLabel close;
    private javax.swing.JTextField et_searchbar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel menustring;
    private javax.swing.JLabel searchBar;
    private javax.swing.JTable tb_barang;
    // End of variables declaration//GEN-END:variables
 
    private void getDatabase() {
       model = new DefaultTableModel();
       tb_barang.setModel(model);
       
       model.addColumn("ID Barang");
       model.addColumn("Nama Barang");
       model.addColumn("stok");
       model.addColumn("Harga");
       model.addColumn("Harga rata");
       model.addColumn("Jenis Barang");
       
       koneksi kon = new koneksi();
       kon.getData();
        
        try{
            Statement stat = (Statement) kon.getData().createStatement();
            String sql = "SELECT * FROM barang";
            ResultSet rs = stat.executeQuery(sql);
            
            while (rs.next()){
                Object[] obj = new Object[6];
                    obj[0] = rs.getString("id_barang");
                    obj[1] = rs.getString("nama_barang");
                    obj[2] = rs.getString("stok");
                    obj[3] = rs.getString("harga");
                    obj[4] = rs.getString("harga_rata");
                    obj[5] = rs.getString("jenis_barang");
                    
                    model.addRow(obj);
            }
        }catch(SQLException err){
            JOptionPane.showMessageDialog(null, err.getMessage());
        }
       
    }
    
    
    
    private void loadDataStok() {
        koneksi kon = new koneksi();
        kon.getData();
        
         switch(cb_stok.getSelectedIndex()){
            
             case 0:
                 stok = "Keseluruhan";
                 getDatabase();
                 break;
             case 1:
                stok = "Stok Tertinggi";
                
                model.getDataVector().removeAllElements();
                model.fireTableDataChanged();
        
                 
        
                   try {
            
                    Statement stat = (Statement) kon.getData().createStatement();
                    String sql = "Select * from barang order by stok ASC";
                    ResultSet rs = stat.executeQuery(sql);
            
                    while (rs.next()){
                         Object[] obj = new Object[6];
                            obj[0] = rs.getString("id_barang");
                            obj[1] = rs.getString("nama_barang");
                            obj[2] = rs.getString("stok");
                            obj[3] = rs.getString("harga");
                            obj[4] = rs.getString("harga_rata");
                            obj[5] = rs.getString("jenis_barang");
                    
                         model.addRow(obj);
                    }
                    
                   }catch (SQLException err){
                        JOptionPane.showMessageDialog(null, err.getMessage());
                   }
            break;
            
            
            case 2:
                stok = "Stok Ter-Rendah";
                
                model.getDataVector().removeAllElements();
                model.fireTableDataChanged();
        
 
                   try {
            
                    Statement stat = (Statement) kon.getData().createStatement();
                    String sql = "Select * from barang order by stok DESC";
                    ResultSet rs = stat.executeQuery(sql);
            
                    while (rs.next()){
                         Object[] obj = new Object[6];
                            obj[0] = rs.getString("id_barang");
                            obj[1] = rs.getString("nama_barang");
                            obj[2] = rs.getString("stok");
                            obj[3] = rs.getString("harga");
                            obj[4] = rs.getString("harga_rata");
                            obj[5] = rs.getString("jenis_barang");
                    
                         model.addRow(obj);
                    }
                    
                   }catch (SQLException err){
                        JOptionPane.showMessageDialog(null, err.getMessage());
                   }
                   
                break;
   
        }
    }
    
      private void loadDataJenis(){
        koneksi kon = new koneksi();
        kon.getData();
        
         switch(cb_jenis.getSelectedIndex()){
            
             case 0:
                 stok = "Keseluruhan";
                 getDatabase();
                 break;
             case 1:
                stok = "Makanan";
                
                model.getDataVector().removeAllElements();
                model.fireTableDataChanged();
        
                 
        
                   try {
            
                    Statement stat = (Statement) kon.getData().createStatement();
                    String sql = "Select * from barang where jenis_barang='makanan'";
                    ResultSet rs = stat.executeQuery(sql);
            
                    while (rs.next()){
                         Object[] obj = new Object[6];
                            obj[0] = rs.getString("id_barang");
                            obj[1] = rs.getString("nama_barang");
                            obj[2] = rs.getString("stok");
                            obj[3] = rs.getString("harga");
                            obj[4] = rs.getString("harga_rata");
                            obj[5] = rs.getString("jenis_barang");
                    
                         model.addRow(obj);
                    }
                    
                   }catch (SQLException err){
                        JOptionPane.showMessageDialog(null, err.getMessage());
                   }
            break;
            
            
            case 2:
                stok = "Minuman";
                
                model.getDataVector().removeAllElements();
                model.fireTableDataChanged();
        
 
                   try {
            
                    Statement stat = (Statement) kon.getData().createStatement();
                    String sql = "Select * from barang where jenis_barang='minuman'";
                    ResultSet rs = stat.executeQuery(sql);
            
                    while (rs.next()){
                         Object[] obj = new Object[6];
                            obj[0] = rs.getString("id_barang");
                            obj[1] = rs.getString("nama_barang");
                            obj[2] = rs.getString("stok");
                            obj[3] = rs.getString("harga");
                            obj[4] = rs.getString("harga_rata");
                            obj[5] = rs.getString("jenis_barang");
                    
                         model.addRow(obj);
                    }
                    
                   }catch (SQLException err){
                        JOptionPane.showMessageDialog(null, err.getMessage());
                   }
                   
                break;
                
                case 3:
                stok = "Rokok";
                
                model.getDataVector().removeAllElements();
                model.fireTableDataChanged();
        
 
                   try {
            
                    Statement stat = (Statement) kon.getData().createStatement();
                    String sql = "Select * from barang where jenis_barang='Rokok'";
                    ResultSet rs = stat.executeQuery(sql);
            
                    while (rs.next()){
                         Object[] obj = new Object[6];
                            obj[0] = rs.getString("id_barang");
                            obj[1] = rs.getString("nama_barang");
                            obj[2] = rs.getString("stok");
                            obj[3] = rs.getString("harga");
                            obj[4] = rs.getString("harga_rata");
                            obj[5] = rs.getString("jenis_barang");
                    
                         model.addRow(obj);
                    }
                    
                   }catch (SQLException err){
                        JOptionPane.showMessageDialog(null, err.getMessage());
                   }
                   
                break;
   
        }
    }
      
    


}
