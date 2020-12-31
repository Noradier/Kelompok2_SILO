/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silo;

import com.silo.db.DBHandler;
import com.silo.controller.DaftarItemCtl;

public class SILO {
    
    public static void main(String[] args){
        DBHandler db = new DBHandler();
        DaftarItemCtl daftarItemCtl = new DaftarItemCtl(db);
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                MainPage mainPage = new MainPage();
                mainPage.setDaftarItemCtl(daftarItemCtl);
                mainPage.setVisible(true);
            }
        });
    }
}
