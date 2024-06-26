/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.ThongKe;

import java.awt.BorderLayout;
import java.awt.Color;

/**
 *
 * @author trant
 */
public class ThongKePanel extends javax.swing.JPanel {
    
    private ThanhVienPanel tvPanel = new ThanhVienPanel();
    private ThietBiDaMuon tbPanel = new ThietBiDaMuon();
    viphamPanel vpPanel=new viphamPanel();
    thietBiDangMuon tbdm=new thietBiDangMuon();
    /**
     * Creates new form ThongKePanel
     */
    public ThongKePanel() {
       
        initComponents();
         jPanel2.setLayout(new BorderLayout());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnMember = new javax.swing.JButton();
        btnBorrowed = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        btnMember.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/icon/user.png"))); // NOI18N
        btnMember.setText("Thành viên");
        btnMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberActionPerformed(evt);
            }
        });

        btnBorrowed.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/icon/device.png"))); // NOI18N
        btnBorrowed.setText("Thiết bị được mượn");
        btnBorrowed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrowedActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/icon/device.png"))); // NOI18N
        jButton3.setText("Thiết bị đang mượn");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/icon/condemn.png"))); // NOI18N
        jButton4.setText("Vi phạm");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(btnMember)
                .addGap(64, 64, 64)
                .addComponent(btnBorrowed)
                .addGap(76, 76, 76)
                .addComponent(jButton3)
                .addGap(66, 66, 66)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3)
                    .addComponent(btnBorrowed)
                    .addComponent(btnMember))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberActionPerformed
        // TODO add your handling code here:
        jPanel2.removeAll();
        jPanel2.add(tvPanel);
        jPanel2.revalidate(); // Revalidate to reflect the changes
        jPanel2.repaint();    // Repaint to refresh the display
         btnMember.setBackground(new Color(225, 219, 219));
         btnBorrowed.setBackground(new Color(255,255,255));
         
    }//GEN-LAST:event_btnMemberActionPerformed

    private void btnBorrowedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrowedActionPerformed
        // TODO add your handling code here:
        jPanel2.removeAll();
        jPanel2.add(tbPanel);
        jPanel2.revalidate(); // Revalidate to reflect the changes
        jPanel2.repaint();    // Repaint to refresh the display
        btnBorrowed.setBackground(new Color(225, 219, 219));
        btnMember.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_btnBorrowedActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
          jPanel2.removeAll();
        jPanel2.add(tbdm);
        jPanel2.revalidate(); // Revalidate to reflect the changes
        jPanel2.repaint();    // Repaint to refresh the display
         jButton4.setBackground(new Color(255,255,255));
         btnMember.setBackground(new Color(255,255,255));
         jButton3.setBackground(new Color(225,219,219));
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jPanel2.removeAll();
        jPanel2.add(vpPanel);
        jPanel2.revalidate(); // Revalidate to reflect the changes
        jPanel2.repaint();    // Repaint to refresh the display
         jButton4.setBackground(new Color(225, 219, 219));
         btnMember.setBackground(new Color(255,255,255));
         jButton3.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrowed;
    private javax.swing.JButton btnMember;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
