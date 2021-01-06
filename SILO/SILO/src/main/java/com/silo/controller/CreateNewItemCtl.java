/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silo.controller;

import com.silo.db.DBHandler;
import com.silo.NewItemForm;
import com.silo.db.Item;

public class CreateNewItemCtl {
    private DBHandler db;
    private DaftarItemCtl daftarItemCtl;
    private NewItemForm newItemForm;

    public CreateNewItemCtl(DBHandler db) {
        this.db = db;
    }

    public void setDaftarItemCtl(DaftarItemCtl daftarItemCtl) {
        this.daftarItemCtl = daftarItemCtl;
    }
    
    public void setNewItemForm(NewItemForm newItemForm) {
        this.newItemForm = newItemForm;
    }
    
    public void addItem(Item newItem){
        db.createItem(
                newItem.getBarcode(),
                newItem.getTitle(),
                newItem.getDescription(),
                newItem.getManufacturer(),
                newItem.getUrl(),
                newItem.getNumberOfStock());
        
        Item[] items = db.getAllItem();
        
        DaftarItemCtl.items = items;
        
        Object[][] item = new Object[items.length][4];
        
        for(int i=0; i<items.length; i++){
            item[i][0] = items[i].getId();
            item[i][1] = items[i].getTitle();
            item[i][2] = items[i].getManufacturer();
            item[i][3] = items[i].getNumberOfStock();
        }
        
        openItem(item);
        newItemForm.setVisible(false);
    }
    
    public void show(){
        newItemForm.setVisible(true);
    }
    
    public void openItem(Object[][] item){
        daftarItemCtl.openItemList(item);
    }
}
