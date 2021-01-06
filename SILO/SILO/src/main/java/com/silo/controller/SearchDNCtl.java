/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silo.controller;

import com.silo.db.DBHandler;
import com.silo.db.DeliveryNote;

public class SearchDNCtl {
    
    private DBHandler db;
    private DaftarSJCtl daftarSJCtl;

    public SearchDNCtl(DBHandler db) {
        this.db = db;
    }

    public void setDaftarSJCtl(DaftarSJCtl daftarSJCtl) {
        this.daftarSJCtl = daftarSJCtl;
    }
    
    public void searchAllDeliveryNote(){
        DeliveryNote[] deliveryNotes = db.getAllDeliveryNote();
        
        DaftarSJCtl.deliveryNotes = deliveryNotes;
        
        Object[][] deliveryNote = new Object[deliveryNotes.length][6];
        
        for(int i=0; i<deliveryNotes.length; i++){
            deliveryNote[i][0] = deliveryNotes[i].getInvoiceNumber();
            deliveryNote[i][1] = deliveryNotes[i].getDeliveryNoteNumber();
            deliveryNote[i][2] = deliveryNotes[i].getCustomerName();
            deliveryNote[i][3] = deliveryNotes[i].getOrderDateString();
            deliveryNote[i][4] = deliveryNotes[i].getDeliveryDateString();
            deliveryNote[i][5] = deliveryNotes[i].getStatus();
        }
        
        openDeliveryNote(deliveryNote);
    }
    
    private void openDeliveryNote(Object[][] deliveryNote){
        daftarSJCtl.openDNList(deliveryNote);
    }
    
    public void searchDeliveryNote(String keyword){
        DeliveryNote[] deliveryNotes = db.getDeliveryNote(keyword);
        
        DaftarSJCtl.deliveryNotes = deliveryNotes;
        
        Object[][] deliveryNote = new Object[deliveryNotes.length][6];
        
        for(int i=0; i<deliveryNotes.length; i++){
            deliveryNote[i][0] = deliveryNotes[i].getInvoiceNumber();
            deliveryNote[i][1] = deliveryNotes[i].getDeliveryNoteNumber();
            deliveryNote[i][2] = deliveryNotes[i].getCustomerName();
            deliveryNote[i][3] = deliveryNotes[i].getOrderDateString();
            deliveryNote[i][4] = deliveryNotes[i].getDeliveryDateString();
            deliveryNote[i][5] = deliveryNotes[i].getStatus();
        }
        
        openDeliveryNote(deliveryNote);
    }
}
