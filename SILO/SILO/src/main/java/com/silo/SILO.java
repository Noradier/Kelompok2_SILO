/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silo;

import com.silo.db.DBHandler;
import com.silo.controller.DaftarItemCtl;

public class SILO {
    
    static DBHandler db;
    static DaftarItemCtl daftarItemCtl;
    static MainPage mainPage;
    
    public static void main(String[] args){
        db = new DBHandler();
        daftarItemCtl = new DaftarItemCtl(db);
        
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                mainPage = new MainPage();
                mainPage.setDaftarItemCtl(daftarItemCtl);
                mainPage.setVisible(true);
            }
        });
        
        daftarItemCtl.setMainPage(mainPage);
    }
}
