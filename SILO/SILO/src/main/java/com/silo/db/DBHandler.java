/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silo.db;

import java.util.ArrayList;
import java.util.List;

public class DBHandler {
    private List<Item> items;
    
    public DBHandler(){
        initItem();
    }
    
    public void initItem(){
        items = new ArrayList<Item>();
        items.add(new Item("FM001", null, "Pumpkin", null, "Farmer", null, 12));
        items.add(new Item("FM002", null, "Melon", null, "Farmer", null, 12));
        items.add(new Item("FM003", null, "Bread", null, "Farmer", null, 16));
    }
    
    public Item[] getAllItem(){
        Item[] data = new Item[items.size()];
        for(int i=0; i<items.size(); i++)
            data[i] = items.get(i);
        
        return data;
    }
}
