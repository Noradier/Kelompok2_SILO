/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silo.controller;

import com.silo.db.DBHandler;
import com.silo.MainPage;
import com.silo.db.DeliveryNote;

public class DaftarSJCtl {
    private MainPage mainPage;
    private SearchDNCtl searchDNCtl;
    private DeliveringOrderCtl deliveringOrderCtl;
    
    static DeliveryNote[] deliveryNotes;

    public DaftarSJCtl(DBHandler db) {
        searchDNCtl = new SearchDNCtl(db);
        deliveringOrderCtl = new DeliveringOrderCtl(db);
    }

    public MainPage getMainPage() {
        return mainPage;
    }

    public SearchDNCtl getSearchDNCtl() {
        return searchDNCtl;
    }

    public DeliveringOrderCtl getDeliveringOrderCtl() {
        return deliveringOrderCtl;
    }

    public void setMainPage(MainPage mainPage) {
        this.mainPage = mainPage;
    }
    
    public void searchDeliveryNote(){
        searchDNCtl.searchAllDeliveryNote();
    }
    
    public void openDNList(Object[][] deliveryNote){
        mainPage.showDeliveryNote(deliveryNote);
    }
    
    public void searchDeliveryNote(String keyword){
        searchDNCtl.searchDeliveryNote(keyword);
    }
    
    public void openDNDescription(){
        deliveringOrderCtl.show();
    }
}
