
package Frontend;

import Backend.Business.Component;
import Backend.Business.ConfiguraFacil;
import Backend.Business.InterfaceFrontend;
import Backend.Business.Package;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class AddPackage extends javax.swing.JFrame {

    /**
     * Creates new form AddPackage
     */
    private String user;
    private String packName;
    private String packDesc;
    private String compatibility;

    private Map<Integer,Component> compAux;
    private Map<Integer,Component> components;
    private InterfaceFrontend cf;
    
    private DefaultTableModel packagetable;
    private DefaultTableModel componentable;
    
    
    
    public AddPackage() {
        initComponents();
        this.compAux = new HashMap<Integer,Component>();
        this.components = new HashMap<Integer,Component>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        componentsTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        AddItemButton = new javax.swing.JButton();
        ConfirmButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        newPackageTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        PriceField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        RemoveItemButton = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("Add Package");

        componentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Description", "Type", "Price"
            }
        ));
        jScrollPane1.setViewportView(componentsTable);

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("New Package Contents");

        AddItemButton.setText("Add Component");
        AddItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddItemButtonActionPerformed(evt);
            }
        });

        ConfirmButton.setText("Confirm");
        ConfirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("ConfiguraFacil");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Components");

        newPackageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Description", "Type", "Price"
            }
        ));
        jScrollPane2.setViewportView(newPackageTable);

        jLabel3.setText("Package Total Price: ");

        jLabel5.setText("€");

        RemoveItemButton.setText("Remove Component");
        RemoveItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveItemButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(128, 128, 128)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(103, 103, 103)
                                        .addComponent(AddItemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 425, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(111, 111, 111))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(ConfirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(PriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(RemoveItemButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AddItemButton)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BackButton)
                                    .addComponent(ConfirmButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RemoveItemButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(PriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
       Error error = new Error();
       MenuAdmin menuadmin = new MenuAdmin();
       try {
            menuadmin.showMenuAdmin(this.user);
            this.hide();
        } catch (Exception ex) {
            System.out.println("Error: " +ex.getMessage());
            error.showError(ex.getMessage());
        }
    }//GEN-LAST:event_BackButtonActionPerformed

    private void ConfirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmButtonActionPerformed
        Error error = new Error();
        Boolean flag = false;
        
        if(!this.components.isEmpty()){
            this.cf = new ConfiguraFacil();
            flag = false;
            
            try {
                double price = Double.valueOf(this.PriceField.getText()) * 0.9; // desconto de 10% em cada pack
                Package packag = new Package(this.packName, this.packDesc, price, this.components, this.compatibility);
                flag = this.cf.addPackage(packag);
            } catch (Exception ex) {
                System.out.println("Error: " +ex.getMessage());
                error.showError(ex.getMessage());
            }
            
            if(flag){
                Success success = new Success();
                success.showSuccess(this.user,"Admin");
                this.hide();        
            } else {
                error.showError("Unable to add Package!!");
            }
        } else {
             error.showError("Please select components to the Package!!");
        } 
    }//GEN-LAST:event_ConfirmButtonActionPerformed

    private void RemoveItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveItemButtonActionPerformed
        Error error = new Error();
        try{
           int row = this.newPackageTable.getSelectedRow();
           int idComponent = Integer.valueOf(this.newPackageTable.getModel().getValueAt(row, 0).toString());
           this.packagetable.removeRow(row);
           this.components.remove(idComponent);
           
           Component c = new Component(this.compAux.get(idComponent));
           this.componentable.addRow(new Object[]{c.getID(),c.getName(),c.getDescription(),c.getType(),c.getPrice()}); // pudemos por a adicionar todos os da lista com aquele type
           
           double count = Double.valueOf(this.PriceField.getText());
           count = count - c.getPrice();
           
           this.PriceField.setText(String.valueOf(count));
           
       } catch(Exception e){
           error.showError("Please select a Component!!");
       }
    }//GEN-LAST:event_RemoveItemButtonActionPerformed

    private void AddItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddItemButtonActionPerformed
        Error error = new Error();
        try{
           int row = this.componentsTable.getSelectedRow();
           int idComponent = Integer.valueOf(this.componentsTable.getModel().getValueAt(row, 0).toString());
           Component c = new Component(this.compAux.get(idComponent));
           
           boolean flag = false;
           
           for(Component comp : this.components.values()){
                if(comp.getType() == c.getType()){
                    flag = true;
                    break;
                }
           }
           
           if(flag == false){
               this.packagetable.addRow(new Object[]{c.getID(),c.getName(),c.getDescription(),c.getType(),c.getPrice()});
               this.componentable.removeRow(row); // pôr a retirar
               // um for e tal vai la ....
               
               this.components.put(c.getID(),c);
               double count = Double.valueOf(this.PriceField.getText());
               count = count + c.getPrice();
               this.PriceField.setText(String.valueOf(count));
           } else {
               error.showError("Please add a Component from a diferent type!!");
           }
 
       } catch(Exception e){
           error.showError("Please select a Component!!");
       }
    }//GEN-LAST:event_AddItemButtonActionPerformed
 
      private void fillTableComponents() throws Exception{
        this.cf = new ConfiguraFacil();   
        List<Component> components = new ArrayList<Component>();
        List<Integer> compsMain = new ArrayList<>();
        compsMain.add(1);
        compsMain.add(2);
        compsMain.add(3);
        compsMain.add(4);
        compsMain.add(7);
        compsMain.add(8);
        compsMain.add(12);
        
        components.addAll(this.cf.getCompentsByComp(this.compatibility));
        
        for(Component c : components){
            if(!compsMain.contains(c.getType())){
                this.compAux.put(c.getID(),c);
                this.componentable.addRow(new Object[]{c.getID(),c.getName(),c.getDescription(),c.getType(),c.getPrice()});
            }
        }
    }
      
    public void initTables(){
        this.packagetable = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return column==5;
            }
        };
        this.componentable = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return column==5;
            }
        };
        this.componentsTable.setModel(this.componentable);
        this.newPackageTable.setModel(this.packagetable);
        
        this.componentable.addColumn("ComponentID");
        this.componentable.addColumn("Name");
        this.componentable.addColumn("Description");
        this.componentable.addColumn("Type");
        this.componentable.addColumn("Price");
        
        this.packagetable.addColumn("ComponentID");
        this.packagetable.addColumn("Name");
        this.packagetable.addColumn("Description");
        this.packagetable.addColumn("Type");
        this.packagetable.addColumn("Price");
        
        this.PriceField.setText("0.0");
    }
    public void showAddPackage(String user, String name, String desc, String comp) throws Exception{
        this.user = user;
        this.packName = name;
        this.packDesc = desc;
        this.compatibility = comp;
        initTables();
        fillTableComponents();
        this.setLocationRelativeTo(null); //center form in the screen
        this.PriceField.enable(false);
        this.setVisible(true);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // deve só fechar a pagina....
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddItemButton;
    private javax.swing.JButton BackButton;
    private javax.swing.JButton ConfirmButton;
    private javax.swing.JTextField PriceField;
    private javax.swing.JButton RemoveItemButton;
    private javax.swing.JTable componentsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable newPackageTable;
    // End of variables declaration//GEN-END:variables
}