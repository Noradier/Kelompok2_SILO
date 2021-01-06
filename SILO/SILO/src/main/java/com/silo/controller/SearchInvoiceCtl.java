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
    
    public SearchInvoiceCtl(DBHandler db) {
        this.db = db;
    }
    
    public Object[][] searchAllInvoice(){
        Invoice[] invoices = db.getAllInvoice();
        
        DaftarSPCtl.invoices = invoices;
        
        Object[][] item = new Object[invoices.length][6];
        
        for(int i=0; i<invoices.length; i++){
            item[i][0] = invoices[i].getInvoiceNumber();
            item[i][1] = invoices[i].getPoNumber();
            item[i][2] = invoices[i].getSupplierName();
            item[i][3] = invoices[i].getOrderDateString();
            item[i][4] = invoices[i].getDeliveryDateString();
            item[i][5] = invoices[i].getStatus();
        }
        
        return item;
    }
    
    public Object[][] searchInvoice(String keyword){
        Invoice[] invoices = db.getInvoice(keyword);
        
        DaftarSPCtl.invoices = invoices;
        
        Object[][] item = new Object[invoices.length][6];
        
        for(int i=0; i<invoices.length; i++){
            item[i][0] = invoices[i].getInvoiceNumber();
            item[i][1] = invoices[i].getPoNumber();
            item[i][2] = invoices[i].getSupplierName();
            item[i][3] = invoices[i].getOrderDateString();
            item[i][4] = invoices[i].getDeliveryDateString();
            item[i][5] = invoices[i].getStatus();
        }
        
        return item;
    }
}
