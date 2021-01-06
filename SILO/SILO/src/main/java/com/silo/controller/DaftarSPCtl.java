/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silo.controller;

import com.silo.db.DBHandler;
import com.silo.MainPage;
import com.silo.db.Invoice;

public class DaftarSPCtl {
    
    private SearchInvoiceCtl searchInvoiceCtl;
    private ViewInvoiceCtl viewInvoiceCtl;
    private MainPage mainPage;
    static Invoice[] invoices;
    
    public DaftarSPCtl(DBHandler db){
        searchInvoiceCtl = new SearchInvoiceCtl(db);
        viewInvoiceCtl = new ViewInvoiceCtl(db);
    }

    public SearchInvoiceCtl getSearchInvoiceCtl() {
        return searchInvoiceCtl;
    }
    
    public ViewInvoiceCtl getViewInvoiceCtl() {
        return viewInvoiceCtl;
    }

    public MainPage getMainPage() {
        return mainPage;
    }
    
    public void setMainPage(MainPage mainPage) {
        this.mainPage = mainPage;
    }
    
    public void searchInvoice(){
        searchInvoiceCtl.searchAllInvoice();
    }
    
    public void openInvoiceList(Object[][] invoice){
        mainPage.showInvoice(invoice);
    }
    
    public void searchInvoice(String keyword){
        searchInvoiceCtl.searchInvoice(keyword);
    }
    
    public void openInvoiceDescription(){
        viewInvoiceCtl.show();
    }
}
