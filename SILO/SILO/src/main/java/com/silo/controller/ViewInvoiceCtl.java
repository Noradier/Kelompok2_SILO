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
    private DaftarSPCtl daftarSPCtl;
    private InvoiceDescription invoiceDescription;

    public ViewInvoiceCtl(DBHandler db) {
        this.db = db;
    }

    public DaftarSPCtl getDaftarSPCtl() {
        return daftarSPCtl;
    }

    public void setDaftarSPCtl(DaftarSPCtl daftarSPCtl) {
        this.daftarSPCtl = daftarSPCtl;
    }

    public void setInvoiceDescription(InvoiceDescription invoiceDescription) {
        this.invoiceDescription = invoiceDescription;
    }

    public InvoiceDescription getInvoiceDescription() {
        return invoiceDescription;
    }
    
    public void show(){
        Invoice invoice = DaftarSPCtl.invoices[daftarSPCtl.getMainPage().getEditedCursor()];
        invoiceDescription.setInvoiceDescriptionLabel(
                invoice.getInvoiceNumber(),
                invoice.getPoNumber(),
                invoice.getSupplierName(),
                invoice.getOrderDateString(),
                invoice.getDeliveryDateString(),
                invoice.getStatus());
        invoiceDescription.setVisible(true);
    }
    
    public void setInvoiceStatus(String invoice, String status){
        db.setInvoiceStatus(invoice, status);
        invoiceDescription.setVisible(false);
    }
}
