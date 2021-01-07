/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silo.controller;

import com.silo.DialogBox;

public class PrintHardcopyCtl {
    
    private SuratJalanCtl suratJalanCtl;
    private DialogBox print;

    public PrintHardcopyCtl() {
    }

    public void setSuratJalanCtl(SuratJalanCtl suratJalanCtl) {
        this.suratJalanCtl = suratJalanCtl;
    }

    public void setPrint(DialogBox print) {
        this.print = print;
    }
    
    public void show(){
        print.setVisible(true);
    }
    
    public void print(){
        
    }
}
