/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silo;

import com.silo.controller.CreateDNCtl;
import com.silo.controller.SuratJalanCtl;

public class DescriptionOfNewDeliveryNote extends javax.swing.JFrame {
    
    private CreateDNCtl createDNCtl;
    private SuratJalanCtl suratJalanCtl;
    
    public DescriptionOfNewDeliveryNote() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        invoiceDescription = new javax.swing.JPanel();
        invoiceNumberLabel = new javax.swing.JLabel();
        deliveryNoteNumberLabel = new javax.swing.JLabel();
        deliveryCustomerNameLabel = new javax.swing.JLabel();
        deliveryNoteOrderDateLabel = new javax.swing.JLabel();
        deliveryNoteDeliveryDateLabel = new javax.swing.JLabel();
        deliveryNoteStatusLabel = new javax.swing.JLabel();
        invoiceNumberLabelFill = new javax.swing.JLabel();
        deliveryNoteNumberLabelFill = new javax.swing.JLabel();
        deliveryCustomerNameLabelFill = new javax.swing.JLabel();
        deliveryNoteOrderDateLabelFill = new javax.swing.JLabel();
        deliveryNoteDeliveryDateFill = new javax.swing.JLabel();
        deliveryNoteStatusLabelFill = new javax.swing.JLabel();
        emailbutton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invoiceNumberLabel.setText("Invoice Number");
        invoiceNumberLabel.setPreferredSize(new java.awt.Dimension(100, 16));

        deliveryNoteNumberLabel.setText("Delivery Note No.");
        deliveryNoteNumberLabel.setPreferredSize(new java.awt.Dimension(100, 16));

        deliveryCustomerNameLabel.setText("Customer Name");
        deliveryCustomerNameLabel.setPreferredSize(new java.awt.Dimension(100, 16));

        deliveryNoteOrderDateLabel.setText("Order Date");
        deliveryNoteOrderDateLabel.setPreferredSize(new java.awt.Dimension(100, 16));

        deliveryNoteDeliveryDateLabel.setText("Delivery Date");
        deliveryNoteDeliveryDateLabel.setPreferredSize(new java.awt.Dimension(100, 16));

        deliveryNoteStatusLabel.setText("Status");
        deliveryNoteStatusLabel.setPreferredSize(new java.awt.Dimension(100, 16));

        invoiceNumberLabelFill.setPreferredSize(new java.awt.Dimension(200, 16));

        deliveryNoteNumberLabelFill.setPreferredSize(new java.awt.Dimension(200, 16));

        deliveryCustomerNameLabelFill.setPreferredSize(new java.awt.Dimension(200, 16));

        deliveryNoteOrderDateLabelFill.setPreferredSize(new java.awt.Dimension(200, 16));

        deliveryNoteDeliveryDateFill.setPreferredSize(new java.awt.Dimension(200, 16));

        deliveryNoteStatusLabelFill.setPreferredSize(new java.awt.Dimension(200, 16));

        emailbutton.setText("Email");
        emailbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onEmailButtonClick(evt);
            }
        });

        printButton.setText("Print");
        printButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onPrintButtonClick(evt);
            }
        });

        javax.swing.GroupLayout invoiceDescriptionLayout = new javax.swing.GroupLayout(invoiceDescription);
        invoiceDescription.setLayout(invoiceDescriptionLayout);
        invoiceDescriptionLayout.setHorizontalGroup(
            invoiceDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invoiceDescriptionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(invoiceDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(invoiceDescriptionLayout.createSequentialGroup()
                        .addComponent(deliveryNoteDeliveryDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deliveryNoteDeliveryDateFill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(invoiceDescriptionLayout.createSequentialGroup()
                        .addComponent(deliveryNoteOrderDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deliveryNoteOrderDateLabelFill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(invoiceDescriptionLayout.createSequentialGroup()
                        .addComponent(deliveryCustomerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deliveryCustomerNameLabelFill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(invoiceDescriptionLayout.createSequentialGroup()
                        .addComponent(deliveryNoteNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deliveryNoteNumberLabelFill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(invoiceDescriptionLayout.createSequentialGroup()
                        .addComponent(invoiceNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(invoiceNumberLabelFill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, invoiceDescriptionLayout.createSequentialGroup()
                        .addComponent(deliveryNoteStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(invoiceDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deliveryNoteStatusLabelFill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(invoiceDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(emailbutton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(printButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        invoiceDescriptionLayout.setVerticalGroup(
            invoiceDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invoiceDescriptionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(invoiceDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoiceNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoiceNumberLabelFill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(invoiceDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deliveryNoteNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deliveryNoteNumberLabelFill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(invoiceDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deliveryCustomerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deliveryCustomerNameLabelFill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(invoiceDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deliveryNoteOrderDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deliveryNoteOrderDateLabelFill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(invoiceDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deliveryNoteDeliveryDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deliveryNoteDeliveryDateFill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(invoiceDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deliveryNoteStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deliveryNoteStatusLabelFill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(emailbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(printButton)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(invoiceDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(invoiceDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onEmailButtonClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onEmailButtonClick
        // TODO add your handling code here:
        showSendingForm();
    }//GEN-LAST:event_onEmailButtonClick
    
    private void showSendingForm(){
        suratJalanCtl.openSendingForm();
    }
    
    private void onPrintButtonClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onPrintButtonClick
        // TODO add your handling code here:
        showPrintDialogBox();
    }//GEN-LAST:event_onPrintButtonClick

    private void showPrintDialogBox(){
        suratJalanCtl.openPrintDialogBox();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel deliveryCustomerNameLabel;
    private javax.swing.JLabel deliveryCustomerNameLabelFill;
    private javax.swing.JLabel deliveryNoteDeliveryDateFill;
    private javax.swing.JLabel deliveryNoteDeliveryDateLabel;
    private javax.swing.JLabel deliveryNoteNumberLabel;
    private javax.swing.JLabel deliveryNoteNumberLabelFill;
    private javax.swing.JLabel deliveryNoteOrderDateLabel;
    private javax.swing.JLabel deliveryNoteOrderDateLabelFill;
    private javax.swing.JLabel deliveryNoteStatusLabel;
    private javax.swing.JLabel deliveryNoteStatusLabelFill;
    private javax.swing.JButton emailbutton;
    private javax.swing.JPanel invoiceDescription;
    private javax.swing.JLabel invoiceNumberLabel;
    private javax.swing.JLabel invoiceNumberLabelFill;
    private javax.swing.JButton printButton;
    // End of variables declaration//GEN-END:variables
    
    public void setDeliveryNoteDescriptionLabel(String invoiceNumber, String deliveryNoteNumber, String customerName, String orderDate, String deliveryDate, String status){
        invoiceNumberLabelFill.setText(invoiceNumber);
        deliveryNoteNumberLabelFill.setText(deliveryNoteNumber);
        deliveryCustomerNameLabelFill.setText(customerName);
        deliveryNoteOrderDateLabelFill.setText(orderDate);
        deliveryNoteDeliveryDateFill.setText(deliveryDate);
        deliveryNoteStatusLabelFill.setText(status);
    }

    public void setCreateDNCtl(CreateDNCtl createDNCtl){
        this.createDNCtl = createDNCtl;
        this.createDNCtl.setDescriptionOfNewDeliveryNote(this);
    }
    
    public void setSuratJalanCtl(SuratJalanCtl suratJalanCtl) {
        this.suratJalanCtl = suratJalanCtl;
        this.suratJalanCtl.setDescriptionOfNewDeliveryNote(this);
    }
}