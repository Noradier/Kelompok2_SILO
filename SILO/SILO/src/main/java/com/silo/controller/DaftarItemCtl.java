/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silo.controller;

import com.silo.db.DBHandler;
import com.silo.MainPage;
import com.silo.db.Item;

public class DaftarItemCtl {
    
    private SearchItemCtl searchItemCtl;
    private CreateNewItemCtl createNewItemCtl;
    private UpdateItemCtl updateItemCtl;
    private MainPage mainPage;
    
    static Item[] items;
    
    public DaftarItemCtl(DBHandler db){
        searchItemCtl = new SearchItemCtl(db);
        createNewItemCtl = new CreateNewItemCtl(db);
        updateItemCtl = new UpdateItemCtl(db);
    }
    
    public CreateNewItemCtl getCreateNewItemCtl(){
        return createNewItemCtl;
    }
    
    public UpdateItemCtl getUpdateItemCtl(){
        return updateItemCtl;
    }

    public SearchItemCtl getSearchItemCtl() {
        return searchItemCtl;
    }
    
    public MainPage getMainPage(){
        return mainPage;
    }
    
    public void setMainPage(MainPage mainPage){
        this.mainPage = mainPage;
    }
    
    public void searchItem(){
        searchItemCtl.searchAllItem();
    }
    
    public void openItemList(Object[][] item){
        mainPage.showItems(item);
    }
    
    public void searchItem(String keyword){
        searchItemCtl.searchItem(keyword);
    }
    
    public void openNewItemForm(){
        createNewItemCtl.show();
    }
    
    public void openEditItemForm(){
        updateItemCtl.show();
    }
    
}
