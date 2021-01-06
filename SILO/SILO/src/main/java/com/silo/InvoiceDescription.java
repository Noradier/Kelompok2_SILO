/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silo;

import com.silo.controller.ViewInvoiceCtl;

/**
 *
 * @author user
 */
public class InvoiceDescription extends javax.swing.JFrame {
    private ViewInvoiceCtl viewInvoiceCtl;
    
    public InvoiceDescription() {
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
        invoicePONumberLabel = new javax.swing.JLabel();
        invoiceSupplierNameLabel = new javax.swing.JLabel();
        invoiceOrderDateLabel = new javax.swing.JLabel();
        invoiceDeliveryDateLabel = new javax.swing.JLabel();
        invoiceStatusLabel = new javax.swing.JLabel();
        invoiceNumberLabelFill = new javax.swing.JLabel();
        invoicePONumberLabelFill = new javax.swing.JLabel();
        invoiceSupplierNameLabelFill = new javax.swing.JLabel();
        invoiceOrderDateLabelFill = new javax.swing.JLabel();
        invoiceDeliveryDateLabelFill = new javax.swing.JLabel();
        invoiceStatusLabelFill = new javax.swing.JLabel();
        invoiceAcceptButton = new javax.swing.JButton();
        invoicePendingButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invoiceNumberLabel.setText("Invoice Number");
        invoiceNumberLabel.setPreferredSize(new java.awt.Dimension(100, 16));

        invoicePONumberLabel.setText("PO Number");
        invoicePONumberLabel.setPreferredSize(new java.awt.Dimension(100, 16));

        invoiceSupplierNameLabel.setText("Supplier Name");
        invoiceSupplierNameLabel.setPreferredSize(new java.awt.Dimension(100, 16));

        invoiceOrderDateLabel.setText("Order Date");
        invoiceOrderDateLabel.setPreferredSize(new java.awt.Dimension(100, 16));

        invoiceDeliveryDateLabel.setText("Delivery Date");
        invoiceDeliveryDateLabel.setPreferredSize(new java.awt.Dimension(100, 16));

        invoiceStatusLabel.setText("Status");
        invoiceStatusLabel.setPreferredSize(new java.awt.Dimension(100, 16));

        invoiceNumberLabelFill.setPreferredSize(new java.awt.Dimension(200, 16));

        invoicePONumberLabelFill.setPreferredSize(new java.awt.Dimension(200, 16));

        invoiceSupplierNameLabelFill.setPreferredSize(new java.awt.Dimension(200, 16));

        invoiceOrderDateLabelFill.setPreferredSize(new java.awt.Dimension(200, 16));

        invoiceDeliveryDateLabelFill.setPreferredSize(new java.awt.Dimension(200, 16));

        invoiceStatusLabelFill.setPreferredSize(new java.awt.Dimension(200, 16));

        invoiceAcceptButton.setText("Accept");
        invoiceAcceptButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onAcceptButtonClick(evt);
            }
        });

        invoicePendingButton.setText("Pending");
        invoicePendingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onPendingButtonClick(evt);
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
                        .addComponent(invoiceDeliveryDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(invoiceDeliveryDateLabelFill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(invoiceDescriptionLayout.createSequentialGroup()
                        .addComponent(invoiceOrderDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(invoiceOrderDateLabelFill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(invoiceDescriptionLayout.createSequentialGroup()
                        .addComponent(invoiceSupplierNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(invoiceSupplierNameLabelFill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(invoiceDescriptionLayout.createSequentialGroup()
                        .addComponent(invoicePONumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(invoicePONumberLabelFill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(invoiceDescriptionLayout.createSequentialGroup()
                        .addComponent(invoiceNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(invoiceNumberLabelFill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, invoiceDescriptionLayout.createSequentialGroup()
                        .addComponent(invoiceStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(invoiceStatusLabelFill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(invoiceDescriptionLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(invoiceAcceptButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(invoicePendingButton)))
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
                    .addComponent(invoicePONumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoicePONumberLabelFill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(invoiceDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoiceSupplierNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoiceSupplierNameLabelFill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(invoiceDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoiceOrderDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoiceOrderDateLabelFill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(invoiceDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoiceDeliveryDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoiceDeliveryDateLabelFill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(invoiceDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoiceStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoiceStatusLabelFill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(invoiceDescriptionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(invoiceAcceptButton)
                    .addComponent(invoicePendingButton))
                .addContainerGap(89, Short.MAX_VALUE))
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

    private void onAcceptButtonClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onAcceptButtonClick
        // TODO add your handling code here:
        viewInvoiceCtl.acceptInvoice(invoiceNumberLabelFill.getText());
        this.setVisible(false);
    }//GEN-LAST:event_onAcceptButtonClick

    private void onPendingButtonClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onPendingButtonClick
        // TODO add your handling code here:
        viewInvoiceCtl.pendingInvoice(invoiceNumberLabelFill.getText());
        this.setVisible(false);
    }//GEN-LAST:event_onPendingButtonClick

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton invoiceAcceptButton;
    private javax.swing.JLabel invoiceDeliveryDateLabel;
    private javax.swing.JLabel invoiceDeliveryDateLabelFill;
    private javax.swing.JPanel invoiceDescription;
    private javax.swing.JLabel invoiceNumberLabel;
    private javax.swing.JLabel invoiceNumberLabelFill;
    private javax.swing.JLabel invoiceOrderDateLabel;
    private javax.swing.JLabel invoiceOrderDateLabelFill;
    private javax.swing.JLabel invoicePONumberLabel;
    private javax.swing.JLabel invoicePONumberLabelFill;
    private javax.swing.JButton invoicePendingButton;
    private javax.swing.JLabel invoiceStatusLabel;
    private javax.swing.JLabel invoiceStatusLabelFill;
    private javax.swing.JLabel invoiceSupplierNameLabel;
    private javax.swing.JLabel invoiceSupplierNameLabelFill;
    // End of variables declaration//GEN-END:variables

    public void setViewInvoiceCtl(ViewInvoiceCtl viewInvoiceCtl){
        this.viewInvoiceCtl = viewInvoiceCtl;
        this.viewInvoiceCtl.setInvoiceDescription(this);
    }
    
    public void setInvoiceDescriptionLabel(String invoiceNumber, String poNumber, String supplierName, String orderDate, String deliveryDate, String status){
        invoiceNumberLabelFill.setText(invoiceNumber);
        invoicePONumberLabelFill.setText(poNumber);
        invoiceSupplierNameLabelFill.setText(supplierName);
        invoiceOrderDateLabelFill.setText(orderDate);
        invoiceDeliveryDateLabelFill.setText(deliveryDate);
        invoiceStatusLabelFill.setText(status);
    }
}
