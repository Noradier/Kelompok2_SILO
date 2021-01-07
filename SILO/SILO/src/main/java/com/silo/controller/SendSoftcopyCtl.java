/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silo.controller;

import com.silo.Alert;
import com.silo.SendingForm;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import javafx.event.ActionEvent;
import javax.swing.Timer;

public class SendSoftcopyCtl {

    private SuratJalanCtl suratJalanCtl;
    private SendingForm sendingForm;
    private Alert alert;
    private Timer timer;
    
    public SendSoftcopyCtl() {
    }

    public void setSuratJalanCtl(SuratJalanCtl suratJalanCtl) {
        this.suratJalanCtl = suratJalanCtl;
    }

    public void setSendingForm(SendingForm sendingForm) {
        this.sendingForm = sendingForm;
    }
    
    public void show(){
        sendingForm.setVisible(true);
    }
    
    public void showAlert(){
        EventQueue.invokeLater(new Runnable(){
            @Override
            public void run(){
                alert = new Alert();
                alert.setVisible(true);
                
                timer = new Timer(3000, new ActionListener(){
                    @Override
                    public void actionPerformed(java.awt.event.ActionEvent e){
                        alert.dispose();
                    }
                });
                
                timer.start();
            }
        });
        hide();
    }
    
    private void hide(){
        sendingForm.setVisible(false);
        showMainPage();
    }
    
    private void showMainPage(){
//        suratJalanCtl.closeFormsOtherThanMainPage();
    }
}
