/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silo.controller;

import com.silo.DescriptionOfNewDeliveryNote;
import com.silo.db.DBHandler;
import com.silo.MainPage;

public class SuratJalanCtl {
    
    private CreateDNCtl createDNCtl;
    private PrintHardcopyCtl printHardcopyCtl;
    private SendSoftcopyCtl sendSoftcopyCtl;
    private MainPage mainPage;
    private DescriptionOfNewDeliveryNote descriptionOfNewDeliveryNote;

    public SuratJalanCtl(DBHandler db) {
        createDNCtl = new CreateDNCtl(db);
        printHardcopyCtl = new PrintHardcopyCtl();
        sendSoftcopyCtl = new SendSoftcopyCtl();
    }

    public CreateDNCtl getCreateDNCtl() {
        return createDNCtl;
    }

    public PrintHardcopyCtl getPrintHardcopyCtl() {
        return printHardcopyCtl;
    }

    public SendSoftcopyCtl getSendSoftcopyCtl() {
        return sendSoftcopyCtl;
    }

    public DescriptionOfNewDeliveryNote getDescriptionOfNewDeliveryNote() {
        return descriptionOfNewDeliveryNote;
    }

    public void setMainPage(MainPage mainPage) {
        this.mainPage = mainPage;
    }

    public void setDescriptionOfNewDeliveryNote(DescriptionOfNewDeliveryNote descriptionOfNewDeliveryNote) {
        this.descriptionOfNewDeliveryNote = descriptionOfNewDeliveryNote;
    }
    
    public void openDNForm(){
        mainPage.showForm();
    }

    public void openPrintDialogBox() {
        printHardcopyCtl.show();
    }
    
    public void openSendingForm(){
        sendSoftcopyCtl.show();
    }
    
    public void closeFormsOtherThanMainPage(){
        createDNCtl.close();
    }
}
