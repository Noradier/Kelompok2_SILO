/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silo.db;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Invoice {
    private String invoiceNumber, poNumber, supplierName, status;
    private Date orderDate, deliveryDate;
    private SimpleDateFormat dateFormat;

    public Invoice(String invoiceNumber, String poNumber, String supplierName, String status, Date orderDate, Date deliveryDate) {
        this.invoiceNumber = invoiceNumber;
        this.poNumber = poNumber;
        this.supplierName = supplierName;
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        
        dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public String getPoNumber() {
        return poNumber;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public String getStatus() {
        return status;
    }

    public String getOrderDateString() {
        return dateFormat.format(orderDate);
    }

    public String getDeliveryDateString() {
        return dateFormat.format(deliveryDate);
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
