/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.ThongKe;

import BLL.ThongKeBLL;
import DAL.ThongTinSuDung.thongtinsd;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author hp_pc
 */
public class thietBiDangMuon extends javax.swing.JPanel {

    /**
     * Creates new form thietBiDaDangMuonPanel
     */
    ThongKeBLL tkBLL;
    DefaultTableModel model=new DefaultTableModel();
    ArrayList< thongtinsd>ttList;
    
    public thietBiDangMuon() {
        initComponents();
        tkBLL=new ThongKeBLL();
        loadData();
         createPieChart();
    }
    public void loadData(){
        ttList=(ArrayList<thongtinsd>) tkBLL.getthietbidangmuon();
         model.setRowCount(0);
        model=(DefaultTableModel)jTable1.getModel();
       
        int stt=0;
        for(thongtinsd tt:ttList){
            stt+=1;
            model.addRow(new Object[]{stt,tt.getMaTB(),tkBLL.getthietbi(tt.getMaTB()).getTenTB(), tt.getMaTV(),
            tkBLL.getThanhVien(tt.getMaTV()).getHo_ten(),tt.getTGMuon()});
        }
    }
      public  void createPieChart(){
        JPanelChart.removeAll();
        JPanelChart.revalidate();
        JPanelChart.repaint();
         DefaultPieDataset dataset=new DefaultPieDataset();
        int sl_tongTB=tkBLL.getTongTB();
        int sl_tbDangMuon=tkBLL.getthietbidangmuon().size();
        
        dataset.setValue("Đang Mượn", (sl_tbDangMuon*100)/sl_tongTB);
        dataset.setValue("Còn Lại", ((sl_tongTB-sl_tbDangMuon)*100)/sl_tongTB);
        JFreeChart chart=ChartFactory.createPieChart("THỐNG KÊ THIẾT BỊ ĐANG MƯỢN", dataset, true, true, true);
        ChartPanel chartPanel=new ChartPanel(chart);
        chartPanel.setPreferredSize(getPreferredSize());
        JPanelChart.setLayout(new BorderLayout());
        JPanelChart.add(chartPanel,BorderLayout.CENTER);
        JPanelChart.validate();

       
    }
      @Override
public Dimension getPreferredSize() {
    // given some values of w & h
    return new Dimension(400, 300);
}
   public void loadThietBiThoiGian(){
        String from = new SimpleDateFormat("yyyy-MM-dd").format( fromDate.getDate());
       String to = new SimpleDateFormat("yyyy-MM-dd").format( toDate.getDate());
       ttList=(ArrayList<thongtinsd>) tkBLL.getThietBiThoiGian(from, to);
        model.setRowCount(0);
       model=(DefaultTableModel)jTable1.getModel();
      
       int stt=0;
       for(thongtinsd tt:ttList){
           stt+=1;
            model.addRow(new Object[]{stt,tt.getMaTB(),tkBLL.getthietbi(tt.getMaTB()).getTenTB(),
                tt.getMaTV(),
            tkBLL.getThanhVien(tt.getMaTV()).getHo_ten(),tt.getTGMuon()});
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        JPanelChart = new javax.swing.JPanel();
        panelTime = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        toDate = new com.toedter.calendar.JDateChooser();
        fromDate = new com.toedter.calendar.JDateChooser();
        btnSeach = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã Thiết Bị", "Tên Thiết BỊ", "Mã SV", "Tên Sinh Viên", "Thời Gian Mượn"
            }
        ));
        jTable1.setRowHeight(30);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        javax.swing.GroupLayout JPanelChartLayout = new javax.swing.GroupLayout(JPanelChart);
        JPanelChart.setLayout(JPanelChartLayout);
        JPanelChartLayout.setHorizontalGroup(
            JPanelChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );
        JPanelChartLayout.setVerticalGroup(
            JPanelChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setText("Thời gian");

        btnSeach.setText("Tìm kiếm");
        btnSeach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeachActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTimeLayout = new javax.swing.GroupLayout(panelTime);
        panelTime.setLayout(panelTimeLayout);
        panelTimeLayout.setHorizontalGroup(
            panelTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTimeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fromDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(toDate, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(btnSeach)
                .addContainerGap())
        );
        panelTimeLayout.setVerticalGroup(
            panelTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTimeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSeach)
                    .addComponent(toDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelTimeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(fromDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panelTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JPanelChart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(panelTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                    .addComponent(JPanelChart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeachActionPerformed
      loadThietBiThoiGian();
        
    }//GEN-LAST:event_btnSeachActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        loadData();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelChart;
    private javax.swing.JButton btnSeach;
    private com.toedter.calendar.JDateChooser fromDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelTime;
    private com.toedter.calendar.JDateChooser toDate;
    // End of variables declaration//GEN-END:variables
}
