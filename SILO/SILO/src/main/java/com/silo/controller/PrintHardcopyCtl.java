/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silo.controller;

import com.silo.PrintDialogBox;

public class PrintHardcopyCtl {
    
    private SuratJalanCtl suratJalanCtl;
    private PrintDialogBox printDialogBox;

    public PrintHardcopyCtl() {
    }

    public void setSuratJalanCtl(SuratJalanCtl suratJalanCtl) {
        this.suratJalanCtl = suratJalanCtl;
    }

    public void setPrintDialogBox(PrintDialogBox print) {
        this.printDialogBox = print;
    }
    
    public void show(){
        printDialogBox.setVisible(true);
    }
    
    public void print(){
        
    }
}
