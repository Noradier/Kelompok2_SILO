/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silo.db;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class DBHandler {
    private List<Item> items;
    private List<Invoice> invoices;
    private List<DeliveryNote> deliveryNotes;
    private SimpleDateFormat dateFormat;
    
    public DBHandler(){
        dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        initItem();
        initInvoice();
        initDeliveryNote();
    }
    
    public void initItem(){
        items = new ArrayList<Item>();
        
        try{
            File itemDb = new File("ItemDB.txt");
            Scanner scanner = new Scanner(itemDb);
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                String[] str = data.split("/");
                items.add(new Item(str[0], str[1], str[2], str[3], str[4], str[5], Integer.parseInt(str[6])));
            }
        } catch(FileNotFoundException e){
            
        }
    }
    
    public void initInvoice(){
        invoices = new ArrayList<Invoice>();
        
        try{
            File invoiceDb = new File("InvoiceDB.txt");
            Scanner scanner = new Scanner(invoiceDb);
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                String[] str = data.split("/");
                Date orderDate = null, deliveryDate = null;
                try{
                    orderDate = dateFormat.parse(str[4]);
                    deliveryDate = dateFormat.parse(str[5]);
                } catch(ParseException e){
                    
                }
                
                invoices.add(new Invoice(str[0], str[1], str[2], str[3], orderDate, deliveryDate));
            }
        } catch(FileNotFoundException e){
            
        }
    }
    
    public void initDeliveryNote(){
        deliveryNotes = new ArrayList<DeliveryNote>();
        
        try{
            File deliveryNoteDb = new File("DeliveryNoteDB.txt");
            Scanner scanner = new Scanner(deliveryNoteDb);
            while(scanner.hasNextLine()){
                String data = scanner.nextLine();
                String[] str = data.split("/");
                Date orderDate = null, deliveryDate = null;
                try{
                    orderDate = dateFormat.parse(str[4]);
                    deliveryDate = dateFormat.parse(str[5]);
                } catch(ParseException e){
                    
                }
                
                deliveryNotes.add(new DeliveryNote(str[0], str[1], str[2], str[3], orderDate, deliveryDate));
            }
        } catch(FileNotFoundException e){
            
        }
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
        saveItemIntoDB();
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
        
        saveItemIntoDB();
    }
    
    public void saveItemIntoDB(){
        try{
            FileWriter itemDbWriter = new FileWriter("ItemDB.txt");
            
            for(int i=0; i<items.size(); i++){
                Item temp = items.get(i);
                itemDbWriter.write(
                    temp.getId() + "/" +
                            temp.getBarcode() + "/" +
                            temp.getTitle() + "/" +
                            temp.getDescription() + "/" +
                            temp.getManufacturer() + "/" +
                            temp.getUrl() + "/" +
                            Integer.toString(temp.getNumberOfStock()) + "\n"
                );
            }
            itemDbWriter.close();
        } catch(IOException e){
            System.out.println("An error occurred.");
        }
    }
    
    public Invoice[] getAllInvoice(){
        Invoice[] data = new Invoice[invoices.size()];
        for(int i=0; i<invoices.size(); i++)
            data[i] = invoices.get(i);
        
        return data;
    }
    
    public Invoice[] getInvoice(String keyword){
        List<Invoice> matchedInvoice = new ArrayList<Invoice>();
        for(int i=0; i<invoices.size(); i++){
            Invoice temp = invoices.get(i);
            if(temp.getInvoiceNumber().toLowerCase().contains(keyword) ||
                    temp.getPoNumber().toLowerCase().contains(keyword) ||
                    temp.getSupplierName().toLowerCase().contains(keyword) ||
                    temp.getOrderDateString().toLowerCase().contains(keyword) ||
                    temp.getDeliveryDateString().toLowerCase().contains(keyword) ||
                    temp.getStatus().toLowerCase().contains(keyword))
                matchedInvoice.add(temp);
        }
        
        Invoice[] data = new Invoice[matchedInvoice.size()];
        for(int i=0; i<matchedInvoice.size(); i++)
            data[i] = matchedInvoice.get(i);
        
        return data;
    }
    
    public void setInvoiceStatus(String invoiceNumber, String status){
        for(int i=0; i<invoices.size(); i++){
            Invoice temp = invoices.get(i);
            if(temp.getInvoiceNumber().equals(invoiceNumber)){
                temp.setStatus(status);
                
                break;
            }
        }
        
        saveInvoiceIntoDB();
    }
    
    public void saveInvoiceIntoDB(){
        try{
            FileWriter invoiceDbWriter = new FileWriter("InvoiceDB.txt");
            
            for(int i=0; i<invoices.size(); i++){
                Invoice temp = invoices.get(i);
                invoiceDbWriter.write(
                    temp.getInvoiceNumber() + "/" +
                            temp.getPoNumber() + "/" +
                            temp.getSupplierName() + "/" +
                            temp.getStatus() + "/" +
                            temp.getOrderDateString() + "/" +
                            temp.getDeliveryDateString() + "\n"
                );
            }
            invoiceDbWriter.close();
        } catch(IOException e){
            System.out.println("An error occurred.");
        }
    }
    
    public DeliveryNote[] getAllDeliveryNote(){
        DeliveryNote[] data = new DeliveryNote[deliveryNotes.size()];
        for(int i=0; i<deliveryNotes.size(); i++)
            data[i] = deliveryNotes.get(i);
        
        return data;
    }
    
    public DeliveryNote[] getDeliveryNote(String keyword){
        List<DeliveryNote> matchedDeliveryNote = new ArrayList<DeliveryNote>();
        for(int i=0; i<deliveryNotes.size(); i++){
            DeliveryNote temp = deliveryNotes.get(i);
            if(temp.getInvoiceNumber().toLowerCase().contains(keyword) ||
                    temp.getDeliveryNoteNumber().toLowerCase().contains(keyword) ||
                    temp.getCustomerName().toLowerCase().contains(keyword) ||
                    temp.getOrderDateString().toLowerCase().contains(keyword) ||
                    temp.getDeliveryDateString().toLowerCase().contains(keyword) ||
                    temp.getStatus().toLowerCase().contains(keyword))
                matchedDeliveryNote.add(temp);
        }
        
        DeliveryNote[] data = new DeliveryNote[matchedDeliveryNote.size()];
        for(int i=0; i<matchedDeliveryNote.size(); i++)
            data[i] = matchedDeliveryNote.get(i);
        
        return data;
    }
    
    public void setDNStatus(String deliveryNoteNumber, String status){
        for(int i=0; i<deliveryNotes.size(); i++){
            DeliveryNote temp = deliveryNotes.get(i);
            if(temp.getDeliveryNoteNumber().equals(deliveryNoteNumber)){
                temp.setStatus(status);
                
                break;
            }
        }
        
        saveDeliveryNoteIntoDB();
    }
    
    public void saveDeliveryNoteIntoDB(){
        try{
            FileWriter deliveryNoteDbWriter = new FileWriter("InvoiceDB.txt");
            
            for(int i=0; i<invoices.size(); i++){
                DeliveryNote temp = deliveryNotes.get(i);
                deliveryNoteDbWriter.write(
                    temp.getInvoiceNumber() + "/" +
                            temp.getDeliveryNoteNumber() + "/" +
                            temp.getCustomerName() + "/" +
                            temp.getStatus() + "/" +
                            temp.getOrderDateString() + "/" +
                            temp.getDeliveryDateString() + "\n"
                );
            }
            deliveryNoteDbWriter.close();
        } catch(IOException e){
            System.out.println("An error occurred.");
        }
    }
    
    public void createDeliveryNote(String invoiceNumber, String deliveryNoteNumber, String customerName, String status, Date orderDate, Date deliveryDate){
        deliveryNotes.add(new DeliveryNote(invoiceNumber, deliveryNoteNumber, customerName, status, orderDate, deliveryDate));
        saveDNIntoDB();
    }
    
    public void saveDNIntoDB(){
        try{
            FileWriter deliveryNoteDbWriter = new FileWriter("DeliveryNoteDB.txt");
            
            for(int i=0; i<deliveryNotes.size(); i++){
                DeliveryNote temp = deliveryNotes.get(i);
                deliveryNoteDbWriter.write(
                    temp.getInvoiceNumber() + "/" +
                            temp.getDeliveryNoteNumber() + "/" +
                            temp.getCustomerName() + "/" +
                            temp.getStatus() + "/" +
                            temp.getOrderDateString() + "/" +
                            temp.getDeliveryDateString() + "\n"
                );
            }
            deliveryNoteDbWriter.close();
        } catch(IOException e){
            System.out.println("An error occurred.");
        }
    }
}
