/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silo;

import com.silo.controller.DaftarItemCtl;

public class MainPage extends javax.swing.JFrame {
    
    private int state;
    private static final int showItem = 1, addItem = 2, editItem = 3;
    private static String editedItemId;
    
    DaftarItemCtl daftarItemCtl;
    
    public MainPage() {
        initComponents();
        initItemForm();
        
        state = 0;
        header.setVisible(false);
        content.setVisible(false);
        buttonHolder.setVisible(false);
        itemForm.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        searchBar = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        content = new javax.swing.JScrollPane();
        contentList = new javax.swing.JTable();
        itemForm = new javax.swing.JPanel();
        buttonHolder = new javax.swing.JScrollPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        itemMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 600));

        addButton.setText("Add");
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onAddButtonClick(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onSearchButtonClick(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addButton)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton)))
                .addContainerGap(528, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(addButton)
                .addContainerGap())
        );

        contentList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Title", "Manufacturer", "Number of Stock", ""
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        content.setViewportView(contentList);

        javax.swing.GroupLayout itemFormLayout = new javax.swing.GroupLayout(itemForm);
        itemForm.setLayout(itemFormLayout);
        itemFormLayout.setHorizontalGroup(
            itemFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        itemFormLayout.setVerticalGroup(
            itemFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        buttonHolder.setPreferredSize(new java.awt.Dimension(81, 100));

        itemMenu.setText("Item");
        itemMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onItemMenuClicked(evt);
            }
        });
        jMenuBar1.add(itemMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(itemForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 151, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(content, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonHolder, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initItemForm(){
        itemForm = new javax.swing.JPanel();
        itemBarcodeLabel = new javax.swing.JLabel();
        itemBarcodeTF = new javax.swing.JTextField();
        itemTitleLabel = new javax.swing.JLabel();
        itemTitleTF = new javax.swing.JTextField();
        itemDescriptionLabel = new javax.swing.JLabel();
        itemManufacturerLabel = new javax.swing.JLabel();
        itemUrlLabel = new javax.swing.JLabel();
        itemDescriptionPane = new javax.swing.JScrollPane();
        itemDescriptionTF = new javax.swing.JTextArea();
        itemManufacturerTF = new javax.swing.JTextField();
        itemUrlTF = new javax.swing.JTextField();
        itemStockLabel = new javax.swing.JLabel();
        itemStockTF = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        
        itemBarcodeLabel.setText("Barcode");
        itemBarcodeLabel.setPreferredSize(new java.awt.Dimension(100, 22));

        itemBarcodeTF.setPreferredSize(new java.awt.Dimension(200, 22));

        itemTitleLabel.setText("Title");
        itemTitleLabel.setPreferredSize(new java.awt.Dimension(100, 22));

        itemTitleTF.setPreferredSize(new java.awt.Dimension(200, 22));

        itemDescriptionLabel.setText("Description");
        itemDescriptionLabel.setPreferredSize(new java.awt.Dimension(100, 22));

        itemManufacturerLabel.setText("Manufacturer");
        itemManufacturerLabel.setPreferredSize(new java.awt.Dimension(100, 22));

        itemUrlLabel.setText("URL");
        itemUrlLabel.setPreferredSize(new java.awt.Dimension(100, 22));

        itemDescriptionTF.setColumns(20);
        itemDescriptionTF.setRows(5);
        itemDescriptionTF.setLineWrap(true);
        itemDescriptionPane.setViewportView(itemDescriptionTF);

        itemManufacturerTF.setPreferredSize(new java.awt.Dimension(200, 22));

        itemUrlTF.setPreferredSize(new java.awt.Dimension(200, 22));
        
        submitButton.setText("Submit");
        submitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onSubmitButtonClick(evt);
            }
        });

        itemStockLabel.setText("Number of Stock");
        itemStockLabel.setPreferredSize(new java.awt.Dimension(100, 22));

        itemStockTF.setPreferredSize(new java.awt.Dimension(200, 22));

        javax.swing.GroupLayout itemFormLayout = new javax.swing.GroupLayout(itemForm);
        itemForm.setLayout(itemFormLayout);
        itemFormLayout.setHorizontalGroup(
            itemFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(itemFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(itemFormLayout.createSequentialGroup()
                        .addComponent(itemBarcodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(itemBarcodeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(itemFormLayout.createSequentialGroup()
                        .addComponent(itemTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(itemTitleTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(itemFormLayout.createSequentialGroup()
                        .addComponent(itemDescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(itemDescriptionPane, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(itemFormLayout.createSequentialGroup()
                        .addComponent(itemManufacturerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(itemManufacturerTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(itemFormLayout.createSequentialGroup()
                        .addComponent(itemUrlLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(itemUrlTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(itemFormLayout.createSequentialGroup()
                        .addComponent(itemStockLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(itemFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(submitButton)
                            .addComponent(itemStockTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(357, Short.MAX_VALUE))
        );
        itemFormLayout.setVerticalGroup(
            itemFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(itemFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(itemFormLayout.createSequentialGroup()
                        .addGroup(itemFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itemBarcodeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemBarcodeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(itemFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itemTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemTitleTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(itemDescriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addComponent(itemDescriptionPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(itemFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemManufacturerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemManufacturerTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemUrlLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemUrlTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemStockLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemStockTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(submitButton)
                .addContainerGap(265, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itemForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itemForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }
    
    private void onItemMenuClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onItemMenuClicked
        // TODO add your handling code here:
        Object[][] item = daftarItemCtl.searchItem();
        
        showItemList(item);
        state = showItem;
    }//GEN-LAST:event_onItemMenuClicked

    private void onSearchButtonClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onSearchButtonClick
        // TODO add your handling code here:
        switch(state){
            case showItem:
                Object[][] item = daftarItemCtl.searchItem(searchBar.getText().toLowerCase());
                showItemList(item);
                break;
        }
    }//GEN-LAST:event_onSearchButtonClick

    private void onAddButtonClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onAddButtonClick
        // TODO add your handling code here:
        daftarItemCtl.showNewItemForm();
    }//GEN-LAST:event_onAddButtonClick

    private void onSubmitButtonClick(java.awt.event.MouseEvent evt){
        Object[][] item;
        switch(state){
            case addItem:
                item = daftarItemCtl.getCreateNewItemCtl().addItem(
                    itemBarcodeTF.getText(),
                    itemTitleTF.getText(),
                    itemDescriptionTF.getText(),
                    itemManufacturerTF.getText(),
                    itemUrlTF.getText(),
                    Integer.parseInt(itemStockTF.getText())
                );
                
                showItemList(item);
                break;
            case editItem:
                item = daftarItemCtl.getUpdateItemCtl().updateItem(
                    editedItemId,
                    itemBarcodeTF.getText(),
                    itemTitleTF.getText(),
                    itemDescriptionTF.getText(),
                    itemManufacturerTF.getText(),
                    itemUrlTF.getText(),
                    Integer.parseInt(itemStockTF.getText())
                );
                
                showItemList(item);
                break;
        }
        
        
        state = showItem;
    }
    
    private void onEditButtonClick(java.awt.event.MouseEvent evt){
        javax.swing.JButton jButton = (javax.swing.JButton)evt.getSource();
        editedItemId = jButton.getName();
        daftarItemCtl.showEditItemForm(evt.getY() / 16);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JScrollPane buttonHolder;
    private javax.swing.JScrollPane content;
    private javax.swing.JTable contentList;
    private javax.swing.JPanel header;
    private javax.swing.JPanel itemForm;
    private javax.swing.JMenu itemMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
    
    // Item Form
    private javax.swing.JLabel itemBarcodeLabel;
    private javax.swing.JTextField itemBarcodeTF;
    private javax.swing.JLabel itemDescriptionLabel;
    private javax.swing.JTextArea itemDescriptionTF;
    private javax.swing.JLabel itemManufacturerLabel;
    private javax.swing.JTextField itemManufacturerTF;
    private javax.swing.JLabel itemTitleLabel;
    private javax.swing.JTextField itemTitleTF;
    private javax.swing.JLabel itemUrlLabel;
    private javax.swing.JTextField itemUrlTF;
    private javax.swing.JScrollPane itemDescriptionPane;
    private javax.swing.JLabel itemStockLabel;
    private javax.swing.JTextField itemStockTF;
    private javax.swing.JButton submitButton;
    
    
    
    private javax.swing.JButton[] editButtons;
    
    public void setDaftarItemCtl(DaftarItemCtl daftarItemCtl){
        this.daftarItemCtl = daftarItemCtl;
        this.daftarItemCtl.setMainPage(this);
    }
    
    public void showItemList(Object[][] item){
        
        contentList.setModel(new javax.swing.table.DefaultTableModel(
            item,
            new String [] {
                "Id", "Title", "Manufacturer", "Number of Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        content.setViewportView(contentList);
        
        
        buttonHolder.removeAll();
        editButtons = new javax.swing.JButton[item.length];
        for(int i=0; i<item.length; i++){
            editButtons[i] = new javax.swing.JButton("Edit");
            editButtons[i].setSize(80,15);
            editButtons[i].setLocation(0, 16 * i);
            editButtons[i].setName(item[i][0].toString());
            editButtons[i].addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
//                    ((javax.swing.JButton) evt.getSource()).getP|
                    onEditButtonClick(evt);
                }
            });
            
            buttonHolder.add(editButtons[i]);
        }
        buttonHolder.repaint();
        
        if(state != showItem){
            itemForm.setVisible(false);
            header.setVisible(true);
            content.setVisible(true);
            buttonHolder.setVisible(true);
        } else{
            buttonHolder.repaint();
        }
    }
    
    public void setHeaderVisible(boolean bool){
        header.setVisible(bool);
    }
    
    public void setItemFormTF(){
        itemBarcodeTF.setText("");
        itemTitleTF.setText("");
        itemDescriptionTF.setText("");
        itemManufacturerTF.setText("");
        itemUrlTF.setText("");
        itemStockTF.setText("");
        
        submitButton.setText("Submit");
    }
    
    public void setItemFormTF(String barcode, String title, String description, String manufacturer, String url, int numberOfStock){
        itemBarcodeTF.setText(barcode);
        itemTitleTF.setText(title);
        itemDescriptionTF.setText(description);
        itemManufacturerTF.setText(manufacturer);
        itemUrlTF.setText(url);
        itemStockTF.setText(Integer.toString(numberOfStock));
        
        submitButton.setText("Update");
    }
    
    public void openNewItemForm(){
        header.setVisible(false);
        content.setVisible(false);
        buttonHolder.setVisible(false);
        itemForm.setVisible(true);
        
        setStateToAddItem();
    }
    
    public void openEditItemForm(){
        header.setVisible(false);
        content.setVisible(false);
        buttonHolder.setVisible(false);
        itemForm.setVisible(true);
        
        setStateToEditItem();
    }
    
    public void setStateToAddItem(){
        state = addItem;
    }
    
    public void setStateToEditItem(){
        state = editItem;
    }
}
