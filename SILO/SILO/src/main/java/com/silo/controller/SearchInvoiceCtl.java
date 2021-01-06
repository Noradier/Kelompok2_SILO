/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silo.controller;

import com.silo.db.DBHandler;
import com.silo.db.Invoice;

public class SearchInvoiceCtl {

    private DBHandler db;
    private DaftarSPCtl daftarSPCtl;
    
    public SearchInvoiceCtl(DBHandler db) {
        this.db = db;
    }

    public void setDaftarSPCtl(DaftarSPCtl daftarSPCtl) {
        this.daftarSPCtl = daftarSPCtl;
    }
    
    public void searchAllInvoice(){
        Invoice[] invoices = db.getAllInvoice();
        
        DaftarSPCtl.invoices = invoices;
        
        Object[][] invoice = new Object[invoices.length][6];
        
        for(int i=0; i<invoices.length; i++){
            invoice[i][0] = invoices[i].getInvoiceNumber();
            invoice[i][1] = invoices[i].getPoNumber();
            invoice[i][2] = invoices[i].getSupplierName();
            invoice[i][3] = invoices[i].getOrderDateString();
            invoice[i][4] = invoices[i].getDeliveryDateString();
            invoice[i][5] = invoices[i].getStatus();
        }
        
        openInvoice(invoice);
    }
    
    public void openInvoice(Object[][] invoice){
        daftarSPCtl.openInvoiceList(invoice);
    }
    
    public void searchInvoice(String keyword){
        Invoice[] invoices = db.getInvoice(keyword);
        
        DaftarSPCtl.invoices = invoices;
        
        Object[][] invoice = new Object[invoices.length][6];
        
        for(int i=0; i<invoices.length; i++){
            invoice[i][0] = invoices[i].getInvoiceNumber();
            invoice[i][1] = invoices[i].getPoNumber();
            invoice[i][2] = invoices[i].getSupplierName();
            invoice[i][3] = invoices[i].getOrderDateString();
            invoice[i][4] = invoices[i].getDeliveryDateString();
            invoice[i][5] = invoices[i].getStatus();
        }
        
        openInvoice(invoice);
    }
}
