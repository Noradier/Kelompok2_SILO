/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silo;

abstract class IMainPageState {
    protected MainPage context = null;
    
    public void showItem(){
        context.setState(new ShowItem(context));
    }
    
    public void showInvoice(){
        context.setState(new ShowInvoice(context));
    }
    
    public void showDeliveryNote(){
        context.setState(new ShowDeliveryNote(context));
    }
}
