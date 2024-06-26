/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI.XuLy;

import BLL.ThanhVienBLL;
import BLL.XuLyBLL;
import DAL.XuLy.xuly;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Dat dep trai
 */
public class updateXuly extends javax.swing.JFrame {

    xuly Xuly;
    XuLyBLL xlBLL;
    ThanhVienBLL tvBLL;
    private xulyPanel parent;
    public updateXuly(xulyPanel parent, xuly xuly) {
        initComponents();
        this.Xuly = xuly;
        tvBLL = new ThanhVienBLL();
        xlBLL = new XuLyBLL();
        loadInformation();
        this.parent = parent;
        cbHinhthucxl.addItem("Khóa thẻ 1 tháng");
        cbHinhthucxl.addItem("Khóa thẻ 2 tháng");
        cbHinhthucxl.addItem("Bồi thường");
        cbHinhthucxl.addItem("Khóa thẻ 1 tháng và bồi thường");
        
        
        cbTrangthaixl.addItem("0");
        cbTrangthaixl.addItem("1");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public void loadInformation(){
        String Sotien = String.valueOf(Xuly.getSoTien());
        txtSotien.setText(Sotien);
        String ngayXLString = String.valueOf(Xuly.getNgayXL());
        txtNgayxl.setText(ngayXLString);
        String Maxl = String.valueOf(Xuly.getMaXL());
        txtMaXl.setText(Maxl);

        // Thêm MaTV từ Xuly vào cbMatv
        String selectedMaTV = String.valueOf(Xuly.getMaTV());
        cbMatv.addItem(selectedMaTV);
        
        List<String> matvList = tvBLL.getAllMaTV();
        for (String MaTV : matvList) {
            if (!MaTV.equals(selectedMaTV)) {
                cbMatv.addItem(MaTV);
            }
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaXl = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSotien = new javax.swing.JTextField();
        txtNgayxl = new javax.swing.JTextField();
        cbMatv = new javax.swing.JComboBox<>();
        cbHinhthucxl = new javax.swing.JComboBox<>();
        cbTrangthaixl = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel1.setText("MaXl");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setText("MaTV");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setText("NgayXl");

        txtMaXl.setEditable(false);
        txtMaXl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaXlActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setText("HinhThucXL");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setText("TrangThaiXL");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setText("SoTien");

        jLabel8.setBackground(new java.awt.Color(204, 204, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 255));
        jLabel8.setText("CHỈNH SỬA XỬ LÝ");

        txtSotien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSotienActionPerformed(evt);
            }
        });

        cbMatv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMatvActionPerformed(evt);
            }
        });

        cbHinhthucxl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHinhthucxlActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(204, 255, 255));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbHinhthucxl, 0, 185, Short.MAX_VALUE)
                            .addComponent(cbMatv, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMaXl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtSotien, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(txtNgayxl)
                            .addComponent(cbTrangthaixl, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSotien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaXl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbMatv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNgayxl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbHinhthucxl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTrangthaixl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaXlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaXlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaXlActionPerformed

    private void cbHinhthucxlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHinhthucxlActionPerformed
         if(cbHinhthucxl.getSelectedItem().equals("Bồi thường") || cbHinhthucxl.getSelectedItem().equals("Khóa thẻ 1 tháng và bồi thường")){
            txtSotien.setEditable(true);
        }else{
            txtSotien.setEditable(false);
        }
    }//GEN-LAST:event_cbHinhthucxlActionPerformed

    private void cbMatvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMatvActionPerformed
       
        
    }//GEN-LAST:event_cbMatvActionPerformed

    private void txtSotienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSotienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSotienActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String selectedMaXL = (String) txtMaXl.getText();
        String selectedMaTV = (String) cbMatv.getSelectedItem();
        String HinhthucXL = (String) cbHinhthucxl.getSelectedItem();
        Integer Sotien = txtSotien.getText().isEmpty() ? null : Integer.valueOf(txtSotien.getText());
        
        String Trangthaistring = (String) cbTrangthaixl.getSelectedItem();
        int Trangthai = Integer.parseInt(Trangthaistring);
        // Lấy ngày giờ hiện tại
        Date currentDate = new Date();

        // Định dạng ngày giờ thành chuỗi
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateFormat.format(currentDate);

        xuly newXuly = new xuly(Integer.parseInt(selectedMaXL), Integer.parseInt(selectedMaTV) ,HinhthucXL , Sotien, formattedDateTime, Trangthai);
        if ( xlBLL.capnhatXuly(newXuly) == true){
            JOptionPane.showMessageDialog(this, "Cập nhật thành công");
            this.dispose();
            parent.loadXuLy();
        }else{
            JOptionPane.showMessageDialog(this, "Cập nhật không thành công! Thành viên có vi phạm chưa được xử lý");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbHinhthucxl;
    private javax.swing.JComboBox<String> cbMatv;
    private javax.swing.JComboBox<String> cbTrangthaixl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtMaXl;
    private javax.swing.JTextField txtNgayxl;
    private javax.swing.JTextField txtSotien;
    // End of variables declaration//GEN-END:variables
}
