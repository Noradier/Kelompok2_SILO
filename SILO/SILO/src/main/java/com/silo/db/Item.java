/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silo.db;

/**
 *
 * @author user
 */
public class Item {
    private String id, barcode, title, description, manufacturer, url;
    private int numberOfStock;

    public Item(String id, String barcode, String title, String description, String manufacturer, String url, int numberOfStock) {
        this.id = id;
        this.barcode = barcode;
        this.title = title;
        this.description = description;
        this.manufacturer = manufacturer;
        this.url = url;
        this.numberOfStock = numberOfStock;
    }

    public String getId() {
        return id;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getUrl() {
        return url;
    }

    public int getNumberOfStock() {
        return numberOfStock;
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", barcode=" + barcode + ", title=" + title + ", description=" + description + ", manufacturer=" + manufacturer + ", url=" + url + ", numberOfStock=" + numberOfStock + '}';
    }
}
