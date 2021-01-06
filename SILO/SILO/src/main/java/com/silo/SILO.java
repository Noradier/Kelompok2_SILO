/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silo;

import com.silo.db.DBHandler;
import com.silo.controller.DaftarItemCtl;
import com.silo.controller.DaftarSJCtl;
import com.silo.controller.DaftarSPCtl;

public class SILO {
    
    static DBHandler db;
    static DaftarItemCtl daftarItemCtl;
    static DaftarSPCtl daftarSPCtl;
    static DaftarSJCtl daftarSJCtl;
    static MainPage mainPage;
    static NewItemForm newItemForm;
    static EditItemForm editItemForm;
    static InvoiceDescription invoiceDescription;
    static DeliveryNoteDesc deliveryNoteDesc;
    
    public static void main(String[] args){
        db = new DBHandler();
        daftarItemCtl = new DaftarItemCtl(db);
        daftarItemCtl.getSearchItemCtl().setDaftarItemCtl(daftarItemCtl);
        daftarItemCtl.getCreateNewItemCtl().setDaftarItemCtl(daftarItemCtl);
        daftarItemCtl.getUpdateItemCtl().setDaftarItemCtl(daftarItemCtl);
        daftarSPCtl = new DaftarSPCtl(db);
        daftarSPCtl.getSearchInvoiceCtl().setDaftarSPCtl(daftarSPCtl);
        daftarSPCtl.getViewInvoiceCtl().setDaftarSPCtl(daftarSPCtl);
        daftarSJCtl = new DaftarSJCtl(db);
        daftarSJCtl.getSearchDNCtl().setDaftarSJCtl(daftarSJCtl);
        daftarSJCtl.getDeliveringOrderCtl().setDaftarSJCtl(daftarSJCtl);
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                mainPage = new MainPage();
                mainPage.setDaftarItemCtl(daftarItemCtl);
                mainPage.setDaftarSPCtl(daftarSPCtl);
                mainPage.setDaftarSJCtl(daftarSJCtl);
                mainPage.setVisible(true);
                
                newItemForm = new NewItemForm();
                newItemForm.setCreateNewItemCtl(daftarItemCtl.getCreateNewItemCtl());
                newItemForm.setVisible(false);
                
                editItemForm = new EditItemForm();
                editItemForm.setUpdateItemCtl(daftarItemCtl.getUpdateItemCtl());
                editItemForm.setVisible(false);
                
                invoiceDescription = new InvoiceDescription();
                invoiceDescription.setViewInvoiceCtl(daftarSPCtl.getViewInvoiceCtl());
                invoiceDescription.setVisible(false);
                
                deliveryNoteDesc = new DeliveryNoteDesc();
                deliveryNoteDesc.setDeliveringOrderCtl(daftarSJCtl.getDeliveringOrderCtl());
                deliveryNoteDesc.setVisible(false);
            }
        });
    }
}
