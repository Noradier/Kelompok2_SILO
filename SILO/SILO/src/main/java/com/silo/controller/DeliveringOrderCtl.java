/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silo.controller;

import com.silo.db.DBHandler;
import com.silo.DeliveryNoteDesc;
import com.silo.db.DeliveryNote;

public class DeliveringOrderCtl {
    private DBHandler db;
    private DaftarSJCtl daftarSJCtl;
    private DeliveryNoteDesc deliveryNoteDesc;

    public DeliveringOrderCtl(DBHandler db) {
        this.db = db;
    }

    public DaftarSJCtl getDaftarSJCtl() {
        return daftarSJCtl;
    }

    public void setDaftarSJCtl(DaftarSJCtl daftarSJCtl) {
        this.daftarSJCtl = daftarSJCtl;
    }

    public void setDeliveryNoteDesc(DeliveryNoteDesc deliveryNoteDesc) {
        this.deliveryNoteDesc = deliveryNoteDesc;
    }
    
    public void show(){
        DeliveryNote deliveryNote = DaftarSJCtl.deliveryNotes[daftarSJCtl.getMainPage().getEditedCursor()];
        deliveryNoteDesc.setDeliveryNoteDescriptionLabel(
                deliveryNote.getInvoiceNumber(),
                deliveryNote.getDeliveryNoteNumber(),
                deliveryNote.getCustomerName(),
                deliveryNote.getOrderDateString(),
                deliveryNote.getDeliveryDateString(),
                deliveryNote.getStatus()
                );
        deliveryNoteDesc.setVisible(true);
    }
    
    public void changeDNStatus(String deliveryNote, String status){
        db.setDNStatus(deliveryNote, status);
    }
}
