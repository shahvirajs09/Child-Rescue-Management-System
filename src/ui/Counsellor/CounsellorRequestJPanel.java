/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Counsellor;

import business.EcoSystem;
import business.Network.Network;
import business.Organization.Organization;
import business.UserAccount.UserAccount;
import business.WorkQueue.CounsellorWorkRequest;
import business.WorkQueue.CaseReporterWorkRequest;
import business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author virajshah
 */
public class CounsellorRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CounsellorRequestJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    CounsellorWorkRequest request;
    Network network;
    public CounsellorRequestJPanel(JPanel userProcessContainer, EcoSystem system, UserAccount userAccount,Organization organization,Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.organization=organization;
        this.userAccount = userAccount;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHeader = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblManageCounsellorRequestDetails = new javax.swing.JTable();
        btnAssignRequest = new javax.swing.JButton();
        btnViewReport = new javax.swing.JButton();
        btnEncounters = new javax.swing.JButton();
        btnCaseComplete = new javax.swing.JButton();

        lblHeader.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeader.setText("Manage Requests");

        tblManageCounsellorRequestDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Time of Assault", "Status", "Assigned to"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblManageCounsellorRequestDetails);

        btnAssignRequest.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAssignRequest.setText("Assign Request");
        btnAssignRequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAssignRequestMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAssignRequestMouseExited(evt);
            }
        });
        btnAssignRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignRequestActionPerformed(evt);
            }
        });

        btnViewReport.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnViewReport.setText("View Report");
        btnViewReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnViewReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnViewReportMouseExited(evt);
            }
        });
        btnViewReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewReportActionPerformed(evt);
            }
        });

        btnEncounters.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEncounters.setText("Ecounters");
        btnEncounters.setBorderPainted(false);
        btnEncounters.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEncountersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEncountersMouseExited(evt);
            }
        });
        btnEncounters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncountersActionPerformed(evt);
            }
        });

        btnCaseComplete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCaseComplete.setText(" Case Complete");
        btnCaseComplete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCaseCompleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCaseCompleteMouseExited(evt);
            }
        });
        btnCaseComplete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaseCompleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAssignRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEncounters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCaseComplete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(171, 171, 171))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssignRequest)
                    .addComponent(btnEncounters, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCaseComplete, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewReport))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignRequestMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssignRequestMouseEntered
        btnAssignRequest.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_btnAssignRequestMouseEntered

    private void btnAssignRequestMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAssignRequestMouseExited
        btnAssignRequest.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnAssignRequestMouseExited

    private void btnAssignRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignRequestActionPerformed

        int selectedRow = tblManageCounsellorRequestDetails.getSelectedRow();
        CounsellorWorkRequest request = (CounsellorWorkRequest)tblManageCounsellorRequestDetails.getValueAt(selectedRow, 2);
        if (CheckOpenCases(userAccount) == 0){
            request.setReceiver(userAccount);
            request.setStatus("Accepted");
            populateTable();
        }else
        {
            JOptionPane.showMessageDialog(null, "Only one case can be accepted at a time");
        }
    }//GEN-LAST:event_btnAssignRequestActionPerformed

    private void btnViewReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewReportMouseEntered
        btnViewReport.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewReportMouseEntered

    private void btnViewReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewReportMouseExited
        btnViewReport.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewReportMouseExited

    private void btnViewReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewReportActionPerformed
        int selectedRow = tblManageCounsellorRequestDetails.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel) tblManageCounsellorRequestDetails.getModel();
        String sta="Waiting";
        String stat=tblManageCounsellorRequestDetails.getValueAt(selectedRow, 2).toString();

        if(sta.equalsIgnoreCase(stat))
        {
            JOptionPane.showMessageDialog(null, "Access Denied");
        }
        else
        {

            if (selectedRow < 0){
                return;
            }

            CounsellorWorkRequest request = (CounsellorWorkRequest)tblManageCounsellorRequestDetails.getValueAt(selectedRow, 2);

            if (request.getReceiver()!=userAccount){
                JOptionPane.showMessageDialog(this, "You cannot view the report of this case. Access Denied.");
            }else{

                CaseReportCJPanel caseReportJPanel = new CaseReportCJPanel(userProcessContainer,system,request.getHswr(),userAccount,network);
                userProcessContainer.add("caseReportJPanel", caseReportJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
                /*CaseReportJPanel casereportJPanel=new CaseReportJPanel(userProcessContainer,system,request);
                casereportJPanel.setVisible(true);*/
            }

        }
    }//GEN-LAST:event_btnViewReportActionPerformed

    private void btnEncountersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncountersMouseEntered
        btnEncounters.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_btnEncountersMouseEntered

    private void btnEncountersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEncountersMouseExited
        btnEncounters.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnEncountersMouseExited

    private void btnEncountersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncountersActionPerformed
        int selectedRow = tblManageCounsellorRequestDetails.getSelectedRow();
        DefaultTableModel model=(DefaultTableModel) tblManageCounsellorRequestDetails.getModel();
        String stat="Waiting";
        String statu=tblManageCounsellorRequestDetails.getValueAt(selectedRow, 2).toString();

        if(stat.equalsIgnoreCase(statu))
        {
            JOptionPane.showMessageDialog(null, "Access Denied");
        }
        else
        {
            if (selectedRow < 0){
                return;
            }
            CounsellorWorkRequest request = (CounsellorWorkRequest)tblManageCounsellorRequestDetails.getValueAt(selectedRow, 2);

            if (request.getReceiver()!=userAccount){
                JOptionPane.showMessageDialog(this, "You cannot view the report of this case. Access Denied.");
            }else{
                CounsellorEncounterJPanel cencounterJPanel = new CounsellorEncounterJPanel(userProcessContainer,system,userAccount,network,organization,request);
                userProcessContainer.add("caseReportJPanel", cencounterJPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);

            }
        }// TODO add your handling code here:
    }//GEN-LAST:event_btnEncountersActionPerformed

    private void btnCaseCompleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCaseCompleteMouseEntered
        btnCaseComplete.setForeground(new Color(0,128,128));        // TODO add your handling code here:
    }//GEN-LAST:event_btnCaseCompleteMouseEntered

    private void btnCaseCompleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCaseCompleteMouseExited
        btnCaseComplete.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_btnCaseCompleteMouseExited

    private void btnCaseCompleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaseCompleteActionPerformed
        int selectedRow = tblManageCounsellorRequestDetails.getSelectedRow();

        String s="Waiting";
        String status=tblManageCounsellorRequestDetails.getValueAt(selectedRow, 2).toString();
        if(s.equalsIgnoreCase(status))
        {
            JOptionPane.showMessageDialog(null, "Access Denied");
        }
        else
        {

            if (selectedRow < 0){
                return;
            }

            WorkRequest request = (CounsellorWorkRequest)tblManageCounsellorRequestDetails.getValueAt(selectedRow, 2);
            //request.setReceiver(userAccount);
            request.setStatus("Case Completed");
            populateTable();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCaseCompleteActionPerformed
    
    private void populateTable() {
        DefaultTableModel model= (DefaultTableModel) tblManageCounsellorRequestDetails.getModel();
        Object[] row=new Object[4];
        model.setRowCount(0);
        
         for(CounsellorWorkRequest request : organization.getWorkQueue().getCounsellarworkRequestList())
         {
         
             //request.getHelpSeekerWorkRequest().getSender().getEmployee().getEmail();
            
             row[0]=request.getHswr().getChildName();
            row[1] = request.getHswr().getDoi();
            row[2] = request;
            if (request.getReceiver()==null){
              row[3] = "Not Assigned";
            }else{
              row[3] = request.getReceiver();
            }
            model.addRow(row);
        }
    }
    
    private int CheckOpenCases(UserAccount userAccount) {
        int a = 0;
        for(CounsellorWorkRequest request : organization.getWorkQueue().getCounsellarworkRequestList())
        {
        
          if (request.getReceiver()==userAccount){
              if (request.getStatus().equalsIgnoreCase("Accepted")){
                  a = a + 1;
              }
          } 
        }
        return a; 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignRequest;
    private javax.swing.JButton btnCaseComplete;
    private javax.swing.JButton btnEncounters;
    private javax.swing.JButton btnViewReport;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JTable tblManageCounsellorRequestDetails;
    // End of variables declaration//GEN-END:variables
}
