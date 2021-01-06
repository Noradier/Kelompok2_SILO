/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silo.controller;

import com.silo.db.DBHandler;
import com.silo.MainPage;
import com.silo.db.Item;

public class UpdateItemCtl {
    private DBHandler db;

    public UpdateItemCtl(DBHandler db) {
        this.db = db;
    }
    
    public Object[][] updateItem(String id, String barcode, String title, String description, String manufacturer, String url, int numberOfStock){
        db.updateItem(id, barcode, title, description, manufacturer, url, numberOfStock);
        
        Item[] items = db.getAllItem();
        
        DaftarItemCtl.items = items;
        
        Object[][] item = new Object[items.length][4];
        
        for(int i=0; i<items.length; i++){
            item[i][0] = items[i].getId();
            item[i][1] = items[i].getTitle();
            item[i][2] = items[i].getManufacturer();
            item[i][3] = items[i].getNumberOfStock();
        }
        
        return item;
    }
    
    public void openEditItemForm(MainPage mainPage, int i){
        Item item = DaftarItemCtl.items[i];
        mainPage.setItemFormTF(item.getBarcode(), item.getTitle(), item.getDescription(), item.getManufacturer(), item.getUrl(), item.getNumberOfStock());
        mainPage.openEditItemForm();
    }
}
