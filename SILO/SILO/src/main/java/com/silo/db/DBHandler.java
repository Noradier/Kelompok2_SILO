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
        items.add(new Item("FM004", null, "White Wool", null, "Shepherd", null, 16));
        items.add(new Item("FM005", null, "White Carpet", null, "Shepherd", null, 16));
    }
    
    public Item[] getAllItem(){
        Item[] data = new Item[items.size()];
        for(int i=0; i<items.size(); i++)
            data[i] = items.get(i);
        
        return data;
    }
    
    public Item[] getItem(String keyword){
        List<Item> matchedItem = new ArrayList<Item>();
        for(int i=0; i<items.size(); i++){
            Item temp = items.get(i);
            if(temp.getId().toLowerCase().contains(keyword) ||
                    temp.getTitle().toLowerCase().contains(keyword) ||
                    temp.getManufacturer().toLowerCase().contains(keyword))
                matchedItem.add(temp);
        }
        
        Item[] data = new Item[matchedItem.size()];
        for(int i=0; i<matchedItem.size(); i++)
            data[i] = matchedItem.get(i);
        
        return data;
    }
    
    public void createItem(String barcode, String title, String description, String manufacturer, String url, int numberOfStock){
        items.add(new Item(String.format("IT%03d", items.size() + 1), barcode, title, description, manufacturer, url, numberOfStock));
    }
    
    public void updateItem(String id, String barcode, String title, String description, String manufacturer, String url, int numberOfStock){
        for(int i=0; i<items.size(); i++){
            Item temp = items.get(i);
            if(temp.getId().equals(id)){
                temp.setBarcode(barcode);
                temp.setTitle(title);
                temp.setDescription(description);
                temp.setManufacturer(manufacturer);
                temp.setUrl(url);
                temp.setNumberOfStock(numberOfStock);
                
                break;
            }
        }
    }
}
