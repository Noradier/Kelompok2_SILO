/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silo.controller;

import com.silo.db.DBHandler;
import com.silo.DeliveryNoteForm;
import com.silo.DescriptionOfNewDeliveryNote;
import com.silo.MessageBox;
import com.silo.db.DeliveryNote;
import java.text.SimpleDateFormat;

public class CreateDNCtl {
    private DBHandler db;
    private SuratJalanCtl suratJalanCtl;
    private DeliveryNoteForm deliveryNoteForm;
    private MessageBox confirmation;
    private DescriptionOfNewDeliveryNote descriptionOfNewDeliveryNote;
    private SimpleDateFormat dateFormat;

    public CreateDNCtl(DBHandler db) {
        this.db = db;
        dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    }

    public SimpleDateFormat getDateFormat() {
        return dateFormat;
    }

    public void setSuratJalanCtl(SuratJalanCtl suratJalanCtl) {
        this.suratJalanCtl = suratJalanCtl;
    }

    public void setDeliveryNoteForm(DeliveryNoteForm deliveryNoteForm) {
        this.deliveryNoteForm = deliveryNoteForm;
    }

    public void setConfirmation(MessageBox confirmation) {
        this.confirmation = confirmation;
    }

    public void setDescriptionOfNewDeliveryNote(DescriptionOfNewDeliveryNote descriptionOfNewDeliveryNote) {
        this.descriptionOfNewDeliveryNote = descriptionOfNewDeliveryNote;
    }
    
    public void openConfirmationMessage(String message){
        confirmation.setMessageLabel(message);
        confirmation.setVisible(true);
    }
    
    public void addDeliveryNote(DeliveryNote newDeliveryNote){
        db.createDeliveryNote(
                newDeliveryNote.getInvoiceNumber(),
                newDeliveryNote.getDeliveryNoteNumber(),
                newDeliveryNote.getCustomerName(),
                newDeliveryNote.getStatus(),
                newDeliveryNote.getOrderDate(),
                newDeliveryNote.getDeliveryDate()
        );
        showDescriptionOfNewlyCreatedDeliveryNote(newDeliveryNote);
    }
    
    private void showDescriptionOfNewlyCreatedDeliveryNote(DeliveryNote newDeliveryNote){
        descriptionOfNewDeliveryNote.setDeliveryNoteDescriptionLabel(
                newDeliveryNote.getInvoiceNumber(),
                newDeliveryNote.getDeliveryNoteNumber(),
                newDeliveryNote.getCustomerName(),
                newDeliveryNote.getOrderDateString(),
                newDeliveryNote.getDeliveryDateString(),
                newDeliveryNote.getStatus()
                );
        descriptionOfNewDeliveryNote.setVisible(true);
    }
    
    public void close(){
        descriptionOfNewDeliveryNote.setVisible(false);
        confirmation.setVisible(false);
    }
}
