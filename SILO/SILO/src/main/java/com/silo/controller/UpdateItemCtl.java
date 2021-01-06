/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silo.controller;

import com.silo.EditItemForm;
import com.silo.db.DBHandler;
import com.silo.MainPage;
import com.silo.db.Item;

public class UpdateItemCtl {
    private DBHandler db;
    private DaftarItemCtl daftarItemCtl;
    private EditItemForm editItemForm;

    public UpdateItemCtl(DBHandler db) {
        this.db = db;
    }

    public DaftarItemCtl getDaftarItemCtl() {
        return daftarItemCtl;
    }
    
    public void setDaftarItemCtl(DaftarItemCtl daftarItemCtl) {
        this.daftarItemCtl = daftarItemCtl;
    }

    public void setEditItemForm(EditItemForm editItemForm) {
        this.editItemForm = editItemForm;
    }
    
    public void updateItem(Item item){
        db.updateItem(
                item.getId(),
                item.getBarcode(),
                item.getTitle(),
                item.getManufacturer(),
                item.getUrl(),
                item.getDescription(),
                item.getNumberOfStock());
        
        Item[] items = db.getAllItem();
        
        DaftarItemCtl.items = items;
        
        Object[][] updatedItem = new Object[items.length][4];
        
        for(int i=0; i<items.length; i++){
            updatedItem[i][0] = items[i].getId();
            updatedItem[i][1] = items[i].getTitle();
            updatedItem[i][2] = items[i].getManufacturer();
            updatedItem[i][3] = items[i].getNumberOfStock();
        }
        
        openItem(updatedItem);
        editItemForm.setVisible(false);
    }
    
    private void openItem(Object[][] item){
        daftarItemCtl.openItemList(item);
    }
    
    public void show(){
        Item item = DaftarItemCtl.items[daftarItemCtl.getMainPage().getEditedCursor()];
        editItemForm.setTextField(
                item.getBarcode(),
                item.getTitle(),
                item.getDescription(),
                item.getManufacturer(),
                item.getUrl(),
                item.getNumberOfStock());
        editItemForm.setVisible(true);
    }
}
