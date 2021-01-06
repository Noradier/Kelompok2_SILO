/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silo;

/**
 *
 * @author user
 */
public class InvoiceList {
    public static void show(Object[][] invoice, javax.swing.JScrollPane jScrollPane){
        javax.swing.JTable table = new javax.swing.JTable();
        
        table.setModel(new javax.swing.table.DefaultTableModel(
            invoice,
            new String [] {
                "Invoice Number", "PO Number", "Supplier Name", "Order Date", "Delivery Date", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class,
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        
        jScrollPane.setViewportView(table);
    }
}
