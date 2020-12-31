/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silo.controller;

import com.silo.db.DBHandler;

public class DaftarItemCtl {
    
    private SearchItemCtl searchItemCtl;
    
    public DaftarItemCtl(DBHandler db){
        searchItemCtl = new SearchItemCtl(db);
    }
    
    public Object[][] searchItem(){
        return searchItemCtl.searchAllItem();
    }
    
}
