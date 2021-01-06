/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silo;

import com.silo.db.DBHandler;
import com.silo.controller.DaftarItemCtl;
import com.silo.controller.DaftarSPCtl;

public class SILO {
    
    static DBHandler db;
    static DaftarItemCtl daftarItemCtl;
    static DaftarSPCtl daftarSPCtl;
    static MainPage mainPage;
    static InvoiceDescription invoiceDescription;
    
    public static void main(String[] args){
        db = new DBHandler();
        daftarItemCtl = new DaftarItemCtl(db);
        daftarSPCtl = new DaftarSPCtl(db);
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                mainPage = new MainPage();
                mainPage.setDaftarItemCtl(daftarItemCtl);
                mainPage.setDaftarSPCtl(daftarSPCtl);
                mainPage.setVisible(true);
                
                invoiceDescription = new InvoiceDescription();
                invoiceDescription.setViewInvoiceCtl(daftarSPCtl.getViewInvoiceCtl());
                invoiceDescription.setVisible(false);
            }
        });
    }
}
