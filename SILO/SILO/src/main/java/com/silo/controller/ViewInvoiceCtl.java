/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silo.controller;

import com.silo.db.DBHandler;
import com.silo.InvoiceDescription;
import com.silo.db.Invoice;

public class ViewInvoiceCtl {
    private DBHandler db;
    private InvoiceDescription invoiceDescription;

    public ViewInvoiceCtl(DBHandler db) {
        this.db = db;
    }

    public void setInvoiceDescription(InvoiceDescription invoiceDescription) {
        this.invoiceDescription = invoiceDescription;
    }

    public InvoiceDescription getInvoiceDescription() {
        return invoiceDescription;
    }
    
    public void openInvoiceDescription(int i){
        Invoice invoice = DaftarSPCtl.invoices[i];
        invoiceDescription.setInvoiceDescriptionLabel(
                invoice.getInvoiceNumber(),
                invoice.getPoNumber(),
                invoice.getSupplierName(),
                invoice.getOrderDateString(),
                invoice.getDeliveryDateString(),
                invoice.getStatus());
        invoiceDescription.setVisible(true);
        
    }
    
    public void acceptInvoice(String invoiceNumber){
        db.setInvoiceStatus(invoiceNumber, "complete");
    }
    
    public void pendingInvoice(String invoiceNumber){
        db.setInvoiceStatus(invoiceNumber, "pending");
    }
}
