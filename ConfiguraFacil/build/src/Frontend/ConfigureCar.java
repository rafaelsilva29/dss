package Frontend;
import Backend.Business.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;


public class ConfigureCar extends javax.swing.JFrame {

    private String username;
    private InterfaceFrontend cf;
    private Double totalPrice;
    private int update;
    
    private DefaultTableModel packagetable;
    
    private Map<String,Component> engines;
    private Map<String,Component> paints;
    private Map<String,Component> suspens;
    private Map<String,Component> rims;
    private Map<String,Component> steerings;
    private Map<String,Component> radios;
    private Map<String,Component> seats;
    private Map<String,Component> parkcams;
    private Map<String,Component> roofs;
    private Map<String,Component> heads;
    private Map<String,Component> windows;
    private Map<String,Component> screens;
    private Map<String,Component> mats;
    private Map<String,Component> gps;
    private Map<String,Component> sSystems;

    private Map<Integer,Component> components;
    private Map<Integer,Backend.Business.Package> packages;
    /**
     * Creates new form configureCar
     */
    
    
    public ConfigureCar() {
        initComponents();
        this.update       = 0;
        this.cf           = new ConfiguraFacil(); 
        this.engines      = new HashMap<String,Component>();
        this.paints       = new HashMap<String,Component>();
        this.rims         = new HashMap<String,Component>();
        this.steerings    = new HashMap<String,Component>();
        this.radios       = new HashMap<String,Component>();
        this.seats        = new HashMap<String,Component>();
        this.parkcams     = new HashMap<String,Component>();
        this.roofs        = new HashMap<String,Component>();
        this.heads        = new HashMap<String,Component>();
        this.windows      = new HashMap<String,Component>();
        this.screens      = new HashMap<String,Component>();
        this.mats         = new HashMap<String,Component>();
        this.gps          = new HashMap<String,Component>();
        this.sSystems     = new HashMap<String,Component>();
        this.suspens      = new HashMap<String,Component>(); // name/Component
        
        this.components   = new HashMap<Integer,Component>(); // type/component
        this.packages     = new HashMap<Integer,Backend.Business.Package>(); // id/component
        
        this.totalPrice   = 0.00;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ModelComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        SportCheckBox = new javax.swing.JCheckBox();
        EconomicCheckBox = new javax.swing.JCheckBox();
        ComfortCheckBox = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        BrandComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        EngineComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        SuspensionComboBox = new javax.swing.JComboBox<>();
        PaintComboBox = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        SteeringWheelComboBox = new javax.swing.JComboBox<>();
        TotalPriceField = new javax.swing.JTextField();
        EnginePriceField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        PaintPriceField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        SuspensionPriceField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        SteeringWheelPriceField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        SeatsComboBox = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        SeatsTextField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        RadioComboBox = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        RadioPriceField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        SlidingRoofBox = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        SlidingPriceField = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        ParkingComboBox = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        ParkingPriceField = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        RimsComboBox7 = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        RimsPriceField = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        MatsComboBox = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        MatsPriceField = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        GPSComboBox = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        GPSPriceField = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        BackSeatsScreenComboBox = new javax.swing.JComboBox<>();
        jLabel37 = new javax.swing.JLabel();
        BackSeatsPriceField = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        HeadComboBox = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        HeadLightsPriceField = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        SoundSystemComboBox = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        CustomWindowPriceField = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        CustomWindowComboBox = new javax.swing.JComboBox<>();
        SoundSystemPriceField = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        packTable = new javax.swing.JTable();
        addPackB = new javax.swing.JButton();
        RemovePackB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("ConfiguraFacil");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Configure Car");

        jLabel3.setText("Brand");

        jLabel4.setText("Model");

        ModelComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        ModelComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ModelComboBoxItemStateChanged(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel8.setText("Main Packages");

        SportCheckBox.setText("Sport");
        SportCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SportCheckBoxActionPerformed(evt);
            }
        });

        EconomicCheckBox.setText("Economic");
        EconomicCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EconomicCheckBoxActionPerformed(evt);
            }
        });

        ComfortCheckBox.setText("Comfort");
        ComfortCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComfortCheckBoxActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel9.setText("Customize Exterior");

        BrandComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ford", "Mazda"}));
        BrandComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrandComboBoxActionPerformed(evt);
            }
        });

        jLabel5.setText("Paint");

        jLabel6.setText("Suspension");

        EngineComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        EngineComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                EngineComboBoxItemStateChanged(evt);
            }
        });

        jLabel7.setText("Engine");

        SuspensionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        SuspensionComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SuspensionComboBoxItemStateChanged(evt);
            }
        });

        PaintComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        PaintComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                PaintComboBoxItemStateChanged(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel14.setText("Total Price");

        jLabel15.setText("€");

        jLabel16.setText("Steering Wheel");

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel18.setText("Customize Interior");

        SteeringWheelComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        SteeringWheelComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SteeringWheelComboBoxItemStateChanged(evt);
            }
        });

        jLabel10.setText("€");

        jLabel11.setText("€");

        jLabel12.setText("€");

        jLabel13.setText("€");

        jLabel17.setText("Seats");

        SeatsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        SeatsComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SeatsComboBoxItemStateChanged(evt);
            }
        });

        jLabel19.setText("€");

        jLabel20.setText("Radio");

        RadioComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        RadioComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RadioComboBoxItemStateChanged(evt);
            }
        });

        jLabel21.setText("€");

        jLabel22.setText("Sliding Roof");

        SlidingRoofBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        SlidingRoofBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SlidingRoofBoxItemStateChanged(evt);
            }
        });

        jLabel23.setText("€");

        jLabel26.setText("Parking Camera");

        jLabel27.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel27.setText("Exterior Extras");

        ParkingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        ParkingComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ParkingComboBoxItemStateChanged(evt);
            }
        });

        jLabel28.setText("€");

        jLabel29.setText("Rims");

        RimsComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        RimsComboBox7.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RimsComboBox7ItemStateChanged(evt);
            }
        });

        jLabel30.setText("€");

        jLabel31.setText("Mats");

        MatsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        MatsComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                MatsComboBoxItemStateChanged(evt);
            }
        });

        jLabel32.setText("€");

        jLabel33.setText("GPS");

        GPSComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        GPSComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                GPSComboBoxItemStateChanged(evt);
            }
        });

        jLabel34.setText("€");

        jLabel35.setText("Back Seats Screen");

        jLabel36.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel36.setText("Interior Extras");

        BackSeatsScreenComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        BackSeatsScreenComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                BackSeatsScreenComboBoxItemStateChanged(evt);
            }
        });

        jLabel37.setText("€");

        jLabel25.setText("Headlights");

        HeadComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        HeadComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                HeadComboBoxItemStateChanged(evt);
            }
        });

        jLabel38.setText("€");

        jLabel39.setText("Sound System");

        SoundSystemComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        SoundSystemComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SoundSystemComboBoxItemStateChanged(evt);
            }
        });

        jLabel40.setText("€");

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear All");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel41.setText("Custom Window");

        CustomWindowComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        CustomWindowComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CustomWindowComboBoxItemStateChanged(evt);
            }
        });

        jLabel42.setText("€");

        jLabel24.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel24.setText("Extra Packages");

        packTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Description", "Price", "Selected"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        packTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(packTable);

        addPackB.setText("Add Pack");
        addPackB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPackBActionPerformed(evt);
            }
        });

        RemovePackB.setText("Remove Pack");
        RemovePackB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemovePackBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(ModelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BrandComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(EconomicCheckBox)
                            .addComponent(SportCheckBox)
                            .addComponent(ComfortCheckBox)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EngineComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EnginePriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(SuspensionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(RimsComboBox7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(RimsPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SuspensionPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel30)))
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel29)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(PaintComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PaintPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11))
                                    .addComponent(jLabel5)))
                            .addComponent(jLabel18)
                            .addComponent(jLabel16)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SteeringWheelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SteeringWheelPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13))
                            .addComponent(jLabel17)
                            .addComponent(jLabel20)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RadioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RadioPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SeatsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel41)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(CustomWindowComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(CustomWindowPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(ParkingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(ParkingPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(SlidingRoofBox, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(SlidingPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel28)
                                                    .addComponent(jLabel23)))
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel26)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(250, 250, 250)
                                                .addComponent(jLabel42))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(HeadComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(HeadLightsPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(19, 19, 19)
                                                .addComponent(jLabel38))
                                            .addComponent(jLabel25)))
                                    .addComponent(jLabel27))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel36)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel35)
                                            .addComponent(jLabel31)
                                            .addComponent(jLabel33)
                                            .addComponent(jLabel39)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(GPSComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, 180, Short.MAX_VALUE)
                                                    .addComponent(MatsComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(BackSeatsScreenComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(SoundSystemComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(21, 21, 21)
                                                        .addComponent(jLabel2))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(SoundSystemPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel40))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(GPSPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel34))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(MatsPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel32))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(BackSeatsPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel37))))))))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(addPackB)
                                    .addGap(18, 18, 18)
                                    .addComponent(RemovePackB)
                                    .addGap(230, 230, 230)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(TotalPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel15))
                                        .addComponent(jLabel14)))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(confirmButton)
                                .addGap(18, 18, 18)
                                .addComponent(clearButton)
                                .addGap(18, 18, 18)
                                .addComponent(backButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BrandComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(ModelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EngineComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EnginePriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(21, 21, 21)
                        .addComponent(jLabel8)
                        .addGap(12, 12, 12)
                        .addComponent(SportCheckBox)
                        .addGap(25, 25, 25)
                        .addComponent(EconomicCheckBox)
                        .addGap(34, 34, 34)
                        .addComponent(ComfortCheckBox)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(PaintComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(PaintPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel11))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel6)
                                                .addGap(8, 8, 8)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(SuspensionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(SuspensionPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel12))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel29)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(RimsComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(RimsPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel30)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(143, 143, 143)
                                                .addComponent(jLabel18))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel26)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(ParkingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ParkingPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel28))
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(SlidingRoofBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SlidingPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel23))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel25)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(HeadComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(HeadLightsPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel38))
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel41)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(CustomWindowComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CustomWindowPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel42))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BackSeatsScreenComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BackSeatsPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel37))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(MatsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MatsPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel32))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(GPSComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(GPSPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel34))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SoundSystemComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SoundSystemPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel40))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SteeringWheelComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SteeringWheelPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel24))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel20)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(RadioComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(RadioPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel21))
                                                .addGap(31, 31, 31)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(SeatsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(SeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel19)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(addPackB)
                                    .addComponent(RemovePackB))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(confirmButton)
                                    .addComponent(clearButton)
                                    .addComponent(backButton)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TotalPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))))
                        .addGap(26, 26, 26))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private boolean checkPacks(Backend.Business.Package pack){
        boolean allgood = true;
        
        for (Backend.Business.Package p : packages.values()){
            for (Component component : pack.getComponents().values()){
                for (Component c : p.getComponents().values()){
                    if(component.getType() == c.getType()) allgood = false;
                }
            }
        }
        return allgood;
    }    
    
    private boolean addExtraPack(String name, String compatibility){
        boolean allGood = false;
        try{
            Error erro = new Error();
            int type;
            Backend.Business.Package pack = cf.getPackageNameComp(compatibility,name);
            allGood = checkPacks(pack);
            this.update = 1;
            
            if (allGood){
                this.packages.put(pack.getPackageID(), pack);
                this.totalPrice += pack.getPrice();
                TotalPriceField.setText(this.totalPrice.toString());
                for(Component c : pack.getComponents().values()){
                    type = c.getType();
                    removeComponent(type);
                    switch(type){
                        case 5 :  GPSComboBox.setSelectedItem(c.getName()); GPSComboBox.setEnabled(false); break;
                        case 6 :  ParkingComboBox.setSelectedItem(c.getName()); ParkingComboBox.setEnabled(false); break;
                        case 9 :  SoundSystemComboBox.setSelectedItem(c.getName()); SoundSystemComboBox.setEnabled(false); break;
                        case 10 : HeadComboBox.setSelectedItem(c.getName()); HeadComboBox.setEnabled(false); break;
                        case 11 : CustomWindowComboBox.setSelectedItem(c.getName()); CustomWindowComboBox.setEnabled(false); break;
                        case 13 : SlidingRoofBox.setSelectedItem(c.getName()); SlidingRoofBox.setEnabled(false); break;
                        case 14 : BackSeatsScreenComboBox.setSelectedItem(c.getName()); BackSeatsScreenComboBox.setEnabled(false); break;
                        case 15 : MatsComboBox.setSelectedItem(c.getName()); MatsComboBox.setEnabled(false); break;
                        default : System.out.println("ERROR"); break;   
                    }
                }
            }
            else {
                erro.showError("There are confliting Types with another Package!"); 
            }  
        }catch(Exception e){
            System.out.println(e);
        }finally{
            this.update = 0;
        }
        return allGood;
    }
    private void removeExtraPack(String name){
        int packToRemove = 0;
        Double priceToRemove = 0.0;
        try{
            int type;
            for (Backend.Business.Package pack : this.packages.values()){
                if (pack.getName().equals(name)){
                    packToRemove = pack.getPackageID();
                    priceToRemove = pack.getPrice();
                    for(Component c : pack.getComponents().values()){
                        type = c.getType();
                        switch(type){
                            case 5 :  GPSComboBox.setSelectedItem(c.getName()); GPSComboBox.setEnabled(true); newPrice(c,type);break;
                            case 6 :  ParkingComboBox.setSelectedItem(c.getName()); ParkingComboBox.setEnabled(true); newPrice(c,type);break;
                            case 9 :  SoundSystemComboBox.setSelectedItem(c.getName()); SoundSystemComboBox.setEnabled(true); newPrice(c,type);break;
                            case 10 : HeadComboBox.setSelectedItem(c.getName()); HeadComboBox.setEnabled(true);newPrice(c,type); break;
                            case 11 : CustomWindowComboBox.setSelectedItem(c.getName()); CustomWindowComboBox.setEnabled(true);newPrice(c,type); break;
                            case 13 : SlidingRoofBox.setSelectedItem(c.getName()); SlidingRoofBox.setEnabled(true);newPrice(c,type); break;
                            case 14 : BackSeatsScreenComboBox.setSelectedItem(c.getName()); BackSeatsScreenComboBox.setEnabled(true); newPrice(c,type);break;
                            case 15 : MatsComboBox.setSelectedItem(c.getName()); MatsComboBox.setEnabled(true);newPrice(c,type); break;
                            default : System.out.println("ERROR"); break;   
                        }
                
                    }   
                }        
            }
            this.packages.remove(packToRemove);
            this.totalPrice -= priceToRemove;
            TotalPriceField.setText(this.totalPrice.toString());
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    
    private void addMainPack(String name, String compatibility){
        try{
            int type;
            Backend.Business.Package pack = cf.getPackageNameComp(compatibility,name);
            this.update = 1;
            this.packages.put(pack.getPackageID(), pack);
            this.totalPrice += pack.getPrice();
            TotalPriceField.setText(this.totalPrice.toString());
        
            for(Component c : pack.getComponents().values()){
                type = c.getType();
                removeComponent(type);
                switch(type){
                    case 1 : RimsComboBox7.setSelectedItem(c.getName()); RimsComboBox7.setEnabled(false); break;
                    case 2 : EngineComboBox.setSelectedItem(c.getName()); EngineComboBox.setEnabled(false); break;
                    case 3 : RadioComboBox.setSelectedItem(c.getName()); RadioComboBox.setEnabled(false); break;
                    case 4 : SeatsComboBox.setSelectedItem(c.getName()); SeatsComboBox.setEnabled(false); break;
                    case 7 : SuspensionComboBox.setSelectedItem(c.getName()); SuspensionComboBox.setEnabled(false); break;
                    case 8 : PaintComboBox.setSelectedItem(c.getName()); PaintComboBox.setEnabled(false); break;
                    case 12 : SteeringWheelComboBox.setSelectedItem(c.getName()); SteeringWheelComboBox.setEnabled(false); break;
                    default : System.out.println("ERROR"); break;   
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }finally{
            this.update = 0;
        }
    }
    private void removeMainPack(String name){
        int packToRemove = 0;
        Double priceToRemove = 0.0;
        try{
            int type;
            for (Backend.Business.Package pack : this.packages.values()){
                if (pack.getName().equals(name)){
                    packToRemove = pack.getPackageID();
                    priceToRemove = pack.getPrice();
                    for(Component c : pack.getComponents().values()){
                        type = c.getType();
                        switch(type){
                            case 1 : RimsComboBox7.setEnabled(true); RimsComboBox7.setSelectedItem(c.getName()); newPrice(c,type); break;
                            case 2 : EngineComboBox.setEnabled(true); EngineComboBox.setSelectedItem(c.getName()); newPrice(c,type); break;
                            case 3 : RadioComboBox.setEnabled(true); RadioComboBox.setSelectedItem(c.getName()); newPrice(c,type); break;
                            case 4 : SeatsComboBox.setEnabled(true); SeatsComboBox.setSelectedItem(c.getName()); newPrice(c,type); break;
                            case 7 : SuspensionComboBox.setEnabled(true); SuspensionComboBox.setSelectedItem(c.getName()); newPrice(c,type); break;
                            case 8 : PaintComboBox.setEnabled(true); PaintComboBox.setSelectedItem(c.getName()); newPrice(c,type); break;
                            case 12 : SteeringWheelComboBox.setEnabled(true); SteeringWheelComboBox.setSelectedItem(c.getName()); newPrice(c,type); break;
                            default : System.out.println("ERROR"); break;   
                        }
                    }   
                }        
            }
            this.packages.remove(packToRemove);
            this.totalPrice -= priceToRemove;
            TotalPriceField.setText(this.totalPrice.toString());
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    private void EconomicCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EconomicCheckBoxActionPerformed
        // TODO add your handling code here:
        if(EconomicCheckBox.isSelected()){
        ComfortCheckBox.setSelected(false);
        SportCheckBox.setSelected(false);
        ComfortCheckBox.setEnabled(false);
        SportCheckBox.setEnabled(false);
        addMainPack("EconomicPack",BrandComboBox.getSelectedItem().toString());
        }
        else {
        ComfortCheckBox.setEnabled(true);
        SportCheckBox.setEnabled(true);   
        removeMainPack("EconomicPack");
        }
    }//GEN-LAST:event_EconomicCheckBoxActionPerformed

    private void ComfortCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComfortCheckBoxActionPerformed
        // TODO add your handling code here:
        if(ComfortCheckBox.isSelected()){
        EconomicCheckBox.setSelected(false);
        SportCheckBox.setSelected(false);
        EconomicCheckBox.setEnabled(false);
        SportCheckBox.setEnabled(false);
        addMainPack("ComfortPack",BrandComboBox.getSelectedItem().toString());}
        else {
        EconomicCheckBox.setEnabled(true);
        SportCheckBox.setEnabled(true);  
        removeMainPack("ComfortPack");
        }
    }//GEN-LAST:event_ComfortCheckBoxActionPerformed

    private void BrandComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrandComboBoxActionPerformed
        // TODO add your handling code here:
        if (BrandComboBox.getSelectedItem()=="BMW"){//cada marca tem os seus modelos
            ModelComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None","BMW_1", "BMW_2", "BMW_3", "BMW_4" }));
            ModelComboBox.setEnabled(true);}//ao escolher oma marca os modelos mudam na box de baixo
        else if (BrandComboBox.getSelectedItem()=="Mini"){//cada marca tem os seus modelos
            ModelComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None","Mini_1", "Mini_2", "Mini_3", "Mini_4" }));
            ModelComboBox.setEnabled(true);}
        else if (BrandComboBox.getSelectedItem()=="RollsRoyce"){//cada marca tem os seus modelos
            ModelComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None","RollsRoyce_1", "RollsRoyce_2", "RollsRoyce_3", "RollsRoyce_4" }));
            ModelComboBox.setEnabled(true);}
        else if (BrandComboBox.getSelectedItem()=="None"){//cada marca tem os seus modelos
            ModelComboBox.setSelectedIndex(0);
            ModelComboBox.setEnabled(false);
            clearAll();
            clear();
        }
    }//GEN-LAST:event_BrandComboBoxActionPerformed

    private void SportCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SportCheckBoxActionPerformed
        // TODO add your handling code here:
        if(SportCheckBox.isSelected()){
        EconomicCheckBox.setSelected(false);
        ComfortCheckBox.setSelected(false);
        EconomicCheckBox.setEnabled(false);
        ComfortCheckBox.setEnabled(false);
        addMainPack("SportPack",BrandComboBox.getSelectedItem().toString());}
        else {
        EconomicCheckBox.setEnabled(true);
        ComfortCheckBox.setEnabled(true);  
        removeMainPack("SportPack");
        }
        
    }//GEN-LAST:event_SportCheckBoxActionPerformed
    
    public void newPrice (Component comp, int type){
        Double actualPrice = this.totalPrice;
        Double oldCompPrice = 0.00;
        Double newCompPrice = comp.getPrice();      
        if (this.components.containsKey(type)){
            oldCompPrice  = components.get(type).getPrice();
            actualPrice  -= oldCompPrice;
            actualPrice  += newCompPrice;
            this.components.replace(type, comp);
            this.totalPrice = actualPrice;
            TotalPriceField.setText(this.totalPrice.toString());
        }
        else {
            actualPrice  += newCompPrice;
            this.components.put(type, comp);
            this.totalPrice = actualPrice;
            TotalPriceField.setText(this.totalPrice.toString());
        }
    }
    
    
    private void initEngineComboBox(String brand){
        EngineComboBox.setEnabled(true); 
        int type = 2;
        List<Component> comps = new ArrayList<Component>();
        Double price = 0.00;
        Component comp;
        try{
                comps.addAll(cf.getComponentBy(brand, type));
                String[] oi = new String[comps.size()];
                if (comps.isEmpty()){
                    EngineComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None"}));
                    EnginePriceField.setText("0");
                }
                else{
                    int i = 0;
                    String name;
                    for(Component f : comps)
                    {
                        name = f.getName();
                        this.engines.put(name,f);
                        oi[i]=(name);
                        i++;
                    }
                    comp = comps.get(0);
                    price = comp.getPrice();
                    EnginePriceField.setText(price.toString());
                    newPrice(comp,type);
                }
                
                EngineComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(oi));
        }catch (Exception e){
        }
    }
    private void initPaintComboBox(String brand){
        PaintComboBox.setEnabled(true);
        int type = 8;
        Double price = 0.00;
        List<Component> comps = new ArrayList<Component>();
        Component comp;
        try{
                comps.addAll(cf.getComponentBy(brand, type));
                String[] oi = new String[comps.size()];
                if (comps.isEmpty()){
                    PaintComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None"}));
                    PaintPriceField.setText("0");
                }
                else{
                    int i = 0;
                    String name;
                    for(Component f : comps)
                    {
                        name = f.getName();
                        this.paints.put(name,f);
                        oi[i]=(name);
                        i++;
                    }
                    comp = comps.get(0);
                    price = comp.getPrice();
                    PaintPriceField.setText(price.toString());
                    newPrice(comp,type);
                }
                PaintComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(oi));
        }catch (Exception e){
            
        }
    }
    private void initSuspensionComboBox(String brand){
     SuspensionComboBox.setEnabled(true);
     int type = 7;
        List<Component> comps = new ArrayList<Component>();
        Double price = 0.00;
        Component comp;
        try{
                comps.addAll(cf.getComponentBy(brand, type));
                String[] oi = new String[comps.size()];
                if (comps.isEmpty()){
                    SuspensionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None"}));
                    SuspensionPriceField.setText("0");
                }
                else{
                    int i = 0;
                    String name;
                    for(Component f : comps)
                    {
                        name = f.getName();
                        this.suspens.put(name,f);
                        oi[i]=(name);
                        i++;
                    }
                    comp = comps.get(0);
                    price = comp.getPrice();
                    SuspensionPriceField.setText(price.toString());
                    newPrice(comp,type);
                }
                SuspensionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(oi));
        }catch (Exception e){
            
        }
    }
    private void initRimsComboBox(String brand){
        RimsComboBox7.setEnabled(true);
        int type = 1;
        Double price = 0.00;
        List<Component> comps = new ArrayList<Component>();
        Component comp;
        try{
                comps.addAll(cf.getComponentBy(brand, type));
                String[] oi = new String[comps.size()];
                if (comps.isEmpty()){
                    RimsComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None"}));
                    RimsPriceField.setText("0");
                }
                else{
                    int i = 0;
                    String name;
                    for(Component f : comps)
                    {
                        name = f.getName();
                        this.rims.put(name,f);
                        oi[i]=(name);
                        i++;
                    }
                    comp = comps.get(0);
                    price = comp.getPrice();
                    RimsPriceField.setText(price.toString());
                    newPrice(comp,type);
                }
                RimsComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(oi));
        }catch (Exception e){
            
        }
    }
    private void initSteeringComboBox(String brand){
      SteeringWheelComboBox.setEnabled(true);
      int type = 12;
      Double price = 0.00;
        List<Component> comps = new ArrayList<Component>();
        Component comp;
        try{
                comps.addAll(cf.getComponentBy(brand, type));
                String[] oi = new String[comps.size()];
                if (comps.isEmpty()){
                    SteeringWheelComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None"}));
                    SteeringWheelPriceField.setText("0");
                }
                else{
                    int i = 0;
                    String name;
                    for(Component f : comps)
                    {
                        name = f.getName();
                        this.steerings.put(name,f);
                        oi[i]=(name);
                        i++;
                    }
                    comp = comps.get(0);
                    price = comp.getPrice();
                    SteeringWheelPriceField.setText(price.toString());
                    newPrice(comp,type);
                }
                SteeringWheelComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(oi));
        }catch (Exception e){
            
        }
    } 
    private void initSeatsComboBox(String brand){
        SeatsComboBox.setEnabled(true);
        int type = 4;
        Double price = 0.00;
        List<Component> comps = new ArrayList<Component>();
        Component comp;
        try{
                comps.addAll(cf.getComponentBy(brand, type));
                String[] oi = new String[comps.size()];
                if (comps.isEmpty()){
                    SeatsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None"}));
                    SeatsTextField.setText("0");
                }
                else{
                    int i = 0;
                    String name;
                    for(Component f : comps)
                    {
                        name = f.getName();
                        this.seats.put(name,f);
                        oi[i]=(name);
                        i++;
                    }
                    comp = comps.get(0);
                    price = comp.getPrice();
                    SeatsTextField.setText(price.toString());
                    newPrice(comp,type);
                }
                SeatsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(oi));
        }catch (Exception e){
            
        }
    }
    private void initRadioComboBox(String brand){
        RadioComboBox.setEnabled(true);
        int type = 3;
        Double price = 0.00;
        List<Component> comps = new ArrayList<Component>();
        Component comp;
        try{
                comps.addAll(cf.getComponentBy(brand, type));
                String[] oi = new String[comps.size()];
                if (comps.isEmpty()){
                    RadioComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None"}));
                    RadioPriceField.setText("0");
                }
                else{
                    int i = 0;
                    String name;
                    for(Component f : comps)
                    {
                        name = f.getName();
                        this.radios.put(name,f);
                        oi[i]=(name);
                        i++;
                    }
                    comp = comps.get(0);
                    price = comp.getPrice();
                    RadioPriceField.setText(price.toString());
                    newPrice(comp,type);
                }
                RadioComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(oi));
        }catch (Exception e){
            
        }
    }
    private void initParkingComboBox(String brand){
     ParkingComboBox.setEnabled(true);
     int type = 6;
        List<Component> comps = new ArrayList<Component>();
        try{
                comps.addAll(cf.getComponentBy(brand, type));
                String[] oi = new String[comps.size()+1];
                if (comps.isEmpty()){
                    ParkingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None"}));
                    ParkingPriceField.setText("0");
                }
                else{
                    int i = 1;
                    oi[0] = "None";
                    String name;
                    for(Component f : comps)
                    {
                        name = f.getName();
                        this.parkcams.put(name,f);
                        oi[i]=(name);
                        i++;
                    }
                    ParkingPriceField.setText("0");
                }
                ParkingComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(oi));
        }catch (Exception e){
            
        }
    }
    private void initRoofComboBox(String brand){
     SlidingRoofBox.setEnabled(true);
     int type = 13;
        List<Component> comps = new ArrayList<Component>();
        try{
                comps.addAll(cf.getComponentBy(brand, type));
                String[] oi = new String[comps.size()+1];
                if (comps.isEmpty()){
                    SlidingRoofBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None"}));
                     SlidingPriceField.setText("0");
                }
                else{
                    int i = 1;
                    oi[0] = "None";
                    String name;
                    for(Component f : comps)
                    {
                        name = f.getName();
                        this.roofs.put(name,f);
                        oi[i]=(name);
                        i++;
                    }
                    SlidingPriceField.setText("0");
                }
                SlidingRoofBox.setModel(new javax.swing.DefaultComboBoxModel<>(oi));
        }catch (Exception e){
            
        }
    }
    private void initSeatsScreenComboBox(String brand){
     BackSeatsScreenComboBox.setEnabled(true);
     int type = 14;
        List<Component> comps = new ArrayList<Component>();
        try{
                comps.addAll(cf.getComponentBy(brand, type));
                String[] oi = new String[comps.size()+1];
                if (comps.isEmpty()){
                    BackSeatsScreenComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None"}));
                    BackSeatsPriceField.setText("0");
                }
                else{
                    int i = 1;
                    oi[0] = "None";
                    String name;
                    for(Component f : comps)
                    {
                        name = f.getName();
                        this.screens.put(name,f);
                        oi[i]=(name);
                        i++;
                    }
                    BackSeatsPriceField.setText("0");
                }
                BackSeatsScreenComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(oi));
        }catch (Exception e){
            
        }
    }
    private void initMatsComboBox(String brand){
     MatsComboBox.setEnabled(true);
     int type = 15;
        List<Component> comps = new ArrayList<Component>();
        try{
                comps.addAll(cf.getComponentBy(brand, type));
                String[] oi = new String[comps.size()+1];
                if (comps.isEmpty()){
                    MatsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None"}));
                    MatsPriceField.setText("0");
                }
                else{
                    int i = 1;
                    oi[0] = "None";
                    String name;
                    for(Component f : comps)
                    {
                        name = f.getName();
                        this.mats.put(name,f);
                        oi[i]=(name);
                        i++;
                    }
                    MatsPriceField.setText("0");
                }
                MatsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(oi));
        }catch (Exception e){
            
        }
    }
    private void initGPSComboBox(String brand){
     GPSComboBox.setEnabled(true);
     int type = 5;
        List<Component> comps = new ArrayList<Component>();
        try{
                comps.addAll(cf.getComponentBy(brand, type));
                String[] oi = new String[comps.size()+1];
                if (comps.isEmpty()){
                    GPSComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None"}));
                    GPSPriceField.setText("0");
                }
                else{
                    int i = 1;
                    oi[0] = "None";
                    String name;
                    for(Component f : comps)
                    {
                        name = f.getName();
                        this.gps.put(name,f);
                        oi[i]=(name);
                        i++;
                    }
                    GPSPriceField.setText("0");
                }
                GPSComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(oi));
        }catch (Exception e){
            
        }
    }
    private void initHeadComboBox(String brand){
     HeadComboBox.setEnabled(true);
     int type = 10;
        List<Component> comps = new ArrayList<Component>();
        try{
                comps.addAll(cf.getComponentBy(brand, type));
                String[] oi = new String[comps.size()+1];
                if (comps.isEmpty()){
                    HeadComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None"}));
                    HeadLightsPriceField.setText("0");
                }
                else{
                    int i = 1;
                    oi[0] = "None";
                    String name;
                    for(Component f : comps)
                    {
                        name = f.getName();
                        this.heads.put(name,f);
                        oi[i]=(name);
                        i++;
                    }
                    HeadLightsPriceField.setText("0");
                }
                HeadComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(oi));
        }catch (Exception e){
            
        }
    }
    private void initSoundComboBox(String brand){
     SoundSystemComboBox.setEnabled(true);
     int type = 9;
        List<Component> comps = new ArrayList<Component>();
        try{
                comps.addAll(cf.getComponentBy(brand, type));
                String[] oi = new String[comps.size()+1];
                if (comps.isEmpty()){
                    SoundSystemComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None"}));
                    SoundSystemPriceField.setText("0");
                }
                else{
                    int i = 1;
                    oi[0] = "None";
                    String name;
                    for(Component f : comps)
                    {
                        name = f.getName();
                        this.sSystems.put(name,f);
                        oi[i]=(name);
                        i++;
                    }
                    SoundSystemPriceField.setText("0");
                }
                SoundSystemComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(oi));
        }catch (Exception e){
            
        }
    }
    private void initCustomComboBox(String brand){
     CustomWindowComboBox.setEnabled(true);
     int type = 11;
        List<Component> comps = new ArrayList<Component>();
        try{
                comps.addAll(cf.getComponentBy(brand, type));
                String[] oi = new String[comps.size()+1];
                if (comps.isEmpty()){
                    CustomWindowComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None"}));
                    CustomWindowPriceField.setText("0");
                }
                else{
                    int i = 1;
                    oi[0] = "None";
                    String name;
                    for(Component f : comps)
                    {
                        name = f.getName();
                        this.windows.put(name,f);
                        oi[i]=(name);
                        i++;
                    }
                    CustomWindowPriceField.setText("0");
                }
                CustomWindowComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(oi));
        }catch (Exception e){
            
        }
    }
    
    private void initPackTable(String brand){
        this.packagetable = new DefaultTableModel(new String [][]{}, new String []{"Name", "Description", "Price", "Select"}){
        @Override
                public Class getColumnClass(int columnIndex){
                    switch (columnIndex){
                        case 3: return Boolean.class;
                        default: return String.class;
                    }
                }
        @Override
            public boolean isCellEditable(int row, int column) {
            return column==4;
            }
        };
         
        packTable.setModel(packagetable);
        fillPackTable(brand);
    }
    
    private void fillPackTable(String brand){
        packTable.setEnabled(true); 
        List<Backend.Business.Package> packs = new ArrayList<Backend.Business.Package>();
        String name;
        try{
            packs.addAll(this.cf.getPackagesByCompatibility(brand));
            if (packs.size()>0){
                for(Backend.Business.Package p : packs){
                    name = p.getName();
                    if( name.equals("EconomicPack") || name.equals("SportPack") || name.equals("ComfortPack")){}
                    else{
                        packagetable.addRow(new Object[]{name,p.getDescription(),p.getPrice(),false});
                    }
                }
            }
        }catch(Exception e){}
    }
    
    private void setDefaultPrice(String model){
        if (model.equals("BMW_1"))                {this.totalPrice = 15000.00;}
            else if (model.equals("BMW_2"))       {this.totalPrice = 18000.00;}
            else if (model.equals("BMW_3"))       {this.totalPrice = 20000.00;}
            else if (model.equals("BMW_4"))       {this.totalPrice = 25000.00;}
            else if (model.equals("Mini_1"))      {this.totalPrice = 17000.00;}
            else if (model.equals("Mini_2"))      {this.totalPrice = 19000.00;}
            else if (model.equals("Mini_3"))      {this.totalPrice = 22000.00;}
            else if (model.equals("Mini_4"))      {this.totalPrice = 25000.00;}
            else if (model.equals("RollsRoyce_1")){this.totalPrice = 20000.00;}
            else if (model.equals("RollsRoyce_2")){this.totalPrice = 25000.00;}
            else if (model.equals("RollsRoyce_3")){this.totalPrice = 30000.00;}
            else if (model.equals("RollsRoyce_4")){this.totalPrice = 35000.00;}
    }
    
    private void ModelComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ModelComboBoxItemStateChanged
        // TODO add your handling code here:
        String brand = BrandComboBox.getSelectedItem().toString();
        String model = ModelComboBox.getSelectedItem().toString();
        this.components = new HashMap<Integer,Component>();
        this.packages   = new HashMap<Integer,Backend.Business.Package>();
        
        
        if (model.equals("None")){
            clearAll();
            clear();
        }
        else{
            setDefaultPrice(model);           
            initEngineComboBox(brand);            
            initPaintComboBox(brand);          
            initSuspensionComboBox(brand);           
            initRimsComboBox(brand);         
            initSteeringComboBox(brand);
            initSeatsComboBox(brand);         
            initRadioComboBox(brand);            
            initParkingComboBox(brand);
            initRoofComboBox(brand);
            initSeatsScreenComboBox(brand);
            initMatsComboBox(brand);
            initGPSComboBox(brand);
            initHeadComboBox(brand);
            initSoundComboBox(brand);
            initCustomComboBox(brand);
            initPackTable(brand);
            confirmButton.setEnabled(true);
            SportCheckBox.setEnabled(true);
            EconomicCheckBox.setEnabled(true);
            ComfortCheckBox.setEnabled(true);
        }
    }//GEN-LAST:event_ModelComboBoxItemStateChanged

    private void clear() // falta dar clear na table
    {
        EngineComboBox.setSelectedIndex(0);
        SportCheckBox.setSelected(false);
        EconomicCheckBox.setSelected(false);
        ComfortCheckBox.setSelected(false);
        PaintComboBox.setSelectedIndex(0);
        SuspensionComboBox.setSelectedIndex(0);
        RimsComboBox7.setSelectedIndex(0);  
        SteeringWheelComboBox.setSelectedIndex(0);
        SeatsComboBox.setSelectedIndex(0);
        RadioComboBox.setSelectedIndex(0);
        ParkingComboBox.setSelectedIndex(0);
        SlidingRoofBox.setSelectedIndex(0);
        BackSeatsScreenComboBox.setSelectedIndex(0);
        MatsComboBox.setSelectedIndex(0);
        HeadComboBox.setSelectedIndex(0);
        CustomWindowComboBox.setSelectedIndex(0);
        SoundSystemComboBox.setSelectedIndex(0);
          
        TotalPriceField.setText("");
        EnginePriceField.setText("");
        PaintPriceField.setText("");
        SuspensionPriceField.setText("");
        RimsPriceField.setText("");
        SteeringWheelPriceField.setText("");
        SeatsTextField.setText("");
        RadioPriceField.setText("");
        ParkingPriceField.setText("");
        SlidingPriceField.setText("");
        BackSeatsPriceField.setText("");
        MatsPriceField.setText("");
        GPSPriceField.setText("");
        HeadLightsPriceField.setText("");
        CustomWindowPriceField.setText("");
        SoundSystemPriceField.setText("");
    }
 
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        MenuSeller ms = new MenuSeller();
        this.clear();
        this.clearAll();
        this.hide();
        try{
        ms.showMenuSeller(username);} catch(Exception e) {}
    }//GEN-LAST:event_backButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        this.clear();
        this.clearAll();
        
    }//GEN-LAST:event_clearButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
        Map<Integer,Component> finalComps = new HashMap<Integer,Component>();
        for (Component c : this.components.values()){
            finalComps.put(c.getID(),c);
        }
        Car finalCar = new Car(BrandComboBox.getSelectedItem().toString(),ModelComboBox.getSelectedItem().toString(),finalComps,this.packages);
        MenuOrder menuorder = new MenuOrder();
        try {
            menuorder.showMenuOrder(finalCar, username, Double.valueOf(this.TotalPriceField.getText()));
            this.hide();
        } catch (Exception ex) {
            Logger.getLogger(ConfigureCar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void EngineComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_EngineComboBoxItemStateChanged
        // TODO add your handling code here:
        Component comp = engines.get(((String) EngineComboBox.getSelectedItem()));
        EnginePriceField.setText(comp.getPrice().toString());
        if (this.update == 0){
            newPrice(comp,2);}
    }//GEN-LAST:event_EngineComboBoxItemStateChanged

    private void PaintComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_PaintComboBoxItemStateChanged
        // TODO add your handling code here:
        Component comp = paints.get(((String) PaintComboBox.getSelectedItem()));
        PaintPriceField.setText(comp.getPrice().toString());
        if (this.update == 0){
            newPrice(comp,8);}
        
    }//GEN-LAST:event_PaintComboBoxItemStateChanged

    private void SuspensionComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SuspensionComboBoxItemStateChanged
        // TODO add your handling code here:
        Component comp = suspens.get(((String) SuspensionComboBox.getSelectedItem()));
        SuspensionPriceField.setText(comp.getPrice().toString());
        if (this.update == 0){
            newPrice(comp,7);}
    }//GEN-LAST:event_SuspensionComboBoxItemStateChanged

    private void RimsComboBox7ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RimsComboBox7ItemStateChanged
        // TODO add your handling code here:
        Component comp = rims.get(((String) RimsComboBox7.getSelectedItem()));
        RimsPriceField.setText(comp.getPrice().toString());
        if (this.update == 0){
            newPrice(comp,1);}
    }//GEN-LAST:event_RimsComboBox7ItemStateChanged

    private void SteeringWheelComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SteeringWheelComboBoxItemStateChanged
        // TODO add your handling code here:
        Component comp = steerings.get(((String) SteeringWheelComboBox.getSelectedItem()));
        SteeringWheelPriceField.setText(comp.getPrice().toString());
        if (this.update == 0){
            newPrice(comp,12);}
    }//GEN-LAST:event_SteeringWheelComboBoxItemStateChanged

    private void RadioComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RadioComboBoxItemStateChanged
        // TODO add your handling code here:
        Component comp = radios.get(((String) RadioComboBox.getSelectedItem()));
        RadioPriceField.setText(comp.getPrice().toString());
        if (this.update == 0){
            newPrice(comp,3);}
    }//GEN-LAST:event_RadioComboBoxItemStateChanged

    private void SeatsComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SeatsComboBoxItemStateChanged
        // TODO add your handling code here:
        Component comp = seats.get(((String) SeatsComboBox.getSelectedItem()));
        SeatsTextField.setText(comp.getPrice().toString());
        if (this.update == 0){
            newPrice(comp,4);}
    }//GEN-LAST:event_SeatsComboBoxItemStateChanged

    private void ParkingComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ParkingComboBoxItemStateChanged
        // TODO add your handling code here:
        String p = ((String) ParkingComboBox.getSelectedItem());
        if (p.equals("None")){
            ParkingPriceField.setText("0");
            removeComponent(6);
        }
        else{
            Component comp = parkcams.get(p);
            ParkingPriceField.setText(comp.getPrice().toString());
            if (this.update == 0){
            newPrice(comp,6);}
        }
    }//GEN-LAST:event_ParkingComboBoxItemStateChanged

    private void SlidingRoofBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SlidingRoofBoxItemStateChanged
        // TODO add your handling code here:
        String p = ((String) SlidingRoofBox.getSelectedItem());
        Component comp;
        if (p.equals("None")){
            SlidingPriceField.setText("0");
            removeComponent(13);
        }
        else{
            comp = roofs.get(p);
            SlidingPriceField.setText(comp.getPrice().toString());
            if (this.update == 0){
            newPrice(comp,13);}
        }
    }//GEN-LAST:event_SlidingRoofBoxItemStateChanged

    private void HeadComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_HeadComboBoxItemStateChanged
        // TODO add your handling code here:
        String p = ((String) HeadComboBox.getSelectedItem());
        if (p.equals("None")){
            HeadLightsPriceField.setText("0");
            removeComponent(10);
        }
        else{
            Component comp = heads.get(p);
            HeadLightsPriceField.setText(comp.getPrice().toString());
            if (this.update == 0){
            newPrice(comp,10);}
        }
    }//GEN-LAST:event_HeadComboBoxItemStateChanged

    private void CustomWindowComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CustomWindowComboBoxItemStateChanged
        // TODO add your handling code here:
        String p = ((String) CustomWindowComboBox.getSelectedItem());
        if (p.equals("None")){
            CustomWindowPriceField.setText("0");
            removeComponent(11);
        }
        else{
            Component comp = windows.get(p);
            CustomWindowPriceField.setText(comp.getPrice().toString());
            if (this.update == 0){
            newPrice(comp,11);}
        }
    }//GEN-LAST:event_CustomWindowComboBoxItemStateChanged

    private void BackSeatsScreenComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_BackSeatsScreenComboBoxItemStateChanged
        // TODO add your handling code here:
        String p = ((String) BackSeatsScreenComboBox.getSelectedItem());
        if (p.equals("None")){
            BackSeatsPriceField.setText("0");
            removeComponent(14);
        }
        else{
            Component comp = screens.get(p);
            BackSeatsPriceField.setText(comp.getPrice().toString());
            if (this.update == 0){
            newPrice(comp,14);}
        }
    }//GEN-LAST:event_BackSeatsScreenComboBoxItemStateChanged

    private void MatsComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_MatsComboBoxItemStateChanged
        // TODO add your handling code here:
        String p = ((String) MatsComboBox.getSelectedItem());
        if (p.equals("None")){
            MatsPriceField.setText("0");
            removeComponent(15);
        }
        else{
            Component comp = mats.get(p);
            MatsPriceField.setText(comp.getPrice().toString());
            if (this.update == 0){
            newPrice(comp,15);}
        }
    }//GEN-LAST:event_MatsComboBoxItemStateChanged

    private void GPSComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_GPSComboBoxItemStateChanged
        // TODO add your handling code here:
        String p = ((String) GPSComboBox.getSelectedItem());
        if (p.equals("None")){
            GPSPriceField.setText("0");
            removeComponent(5);
        }
        else{
            Component comp = gps.get(p);
            GPSPriceField.setText(comp.getPrice().toString());
            if (this.update == 0){
            newPrice(comp,5);}
        }
    }//GEN-LAST:event_GPSComboBoxItemStateChanged

    private void SoundSystemComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SoundSystemComboBoxItemStateChanged
        // TODO add your handling code here:
        String p = ((String) SoundSystemComboBox.getSelectedItem());
        if (p.equals("None")){
            SoundSystemPriceField.setText("0");
            removeComponent(9);
        }
        else{
            Component comp = sSystems.get(p);
            SoundSystemPriceField.setText(comp.getPrice().toString());
            if (this.update == 0){
            newPrice(comp,9);}
        }
    }//GEN-LAST:event_SoundSystemComboBoxItemStateChanged

    private void addPackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPackBActionPerformed
        boolean allGood = false;
        int selectedRow = packTable.getSelectedRow();
        System.out.println("Packs: " + this.packages);
        if ((Boolean) this.packTable.getModel().getValueAt(selectedRow, 3) == false){
            allGood = addExtraPack(this.packTable.getModel().getValueAt(selectedRow, 0).toString(),BrandComboBox.getSelectedItem().toString());
            if(allGood){this.packTable.getModel().setValueAt(true, selectedRow, 3); System.out.println("Packs: " + this.packages);}
        }
        else { 
            System.out.println("Pack allready added");
        }
    }//GEN-LAST:event_addPackBActionPerformed

    private void RemovePackBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemovePackBActionPerformed
        int selectedRow = packTable.getSelectedRow();
        System.out.println("Packs: " + this.packages);
        if ((Boolean) this.packTable.getModel().getValueAt(selectedRow, 3) == true){
            removeExtraPack(this.packTable.getModel().getValueAt(selectedRow, 0).toString());
            this.packTable.getModel().setValueAt(false, selectedRow, 3);
            System.out.println("Packs: " + this.packages);
        }
        else { 
            System.out.println("Pack not in map");
        }
    }//GEN-LAST:event_RemovePackBActionPerformed

    private void initBrandComboBox(){
        BrandComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "BMW", "Mini", "RollsRoyce"}));
    }
    
    private void removeComponent(int type){
        Component comp;
        Double price;
        if (components.containsKey(type)){
            comp = components.get(type);
            price = comp.getPrice();
            components.remove(type);
            this.totalPrice -= price;
            TotalPriceField.setText(this.totalPrice.toString());
        }
    }
    
    private void clearAll(){
       EngineComboBox.setEnabled(false);
       EnginePriceField.setEnabled(false);
       SportCheckBox.setEnabled(false);
       EconomicCheckBox.setEnabled(false);
       ComfortCheckBox.setEnabled(false);
       TotalPriceField.setEnabled(false);
       PaintComboBox.setEnabled(false);
       PaintPriceField.setEnabled(false);
       SuspensionComboBox.setEnabled(false);
       SuspensionPriceField.setEnabled(false);
       RimsComboBox7.setEnabled(false);
       RimsPriceField.setEnabled(false);
       SteeringWheelComboBox.setEnabled(false);
       SteeringWheelPriceField.setEnabled(false);
       SeatsComboBox.setEnabled(false);
       SeatsTextField.setEnabled(false);
       RadioComboBox.setEnabled(false);
       RadioPriceField.setEnabled(false);
       ParkingComboBox.setEnabled(false);
       ParkingPriceField.setEnabled(false);
       SlidingRoofBox.setEnabled(false);
       SlidingPriceField.setEnabled(false);
       BackSeatsScreenComboBox.setEnabled(false);
       BackSeatsPriceField.setEnabled(false);
       MatsComboBox.setEnabled(false);
       MatsPriceField.setEnabled(false);
       GPSComboBox.setEnabled(false);
       GPSPriceField.setEnabled(false);
       HeadComboBox.setEnabled(false);
       HeadLightsPriceField.setEnabled(false);
       CustomWindowComboBox.setEnabled(false);
       CustomWindowPriceField.setEnabled(false);
       SoundSystemComboBox.setEnabled(false);
       SoundSystemPriceField.setEnabled(false);
       confirmButton.setEnabled(false);   
       packTable.setEnabled(false);
    }
     
   public void showConfigureCar(String username){
       this.username = username;
       ModelComboBox.setEnabled(false);
       EngineComboBox.setEnabled(false);
       EnginePriceField.setEnabled(false);
       SportCheckBox.setEnabled(false);
       EconomicCheckBox.setEnabled(false);
       ComfortCheckBox.setEnabled(false);
       TotalPriceField.setEnabled(false);
       PaintComboBox.setEnabled(false);
       PaintPriceField.setEnabled(false);
       SuspensionComboBox.setEnabled(false);
       SuspensionPriceField.setEnabled(false);
       RimsComboBox7.setEnabled(false);
       RimsPriceField.setEnabled(false);
       SteeringWheelComboBox.setEnabled(false);
       SteeringWheelPriceField.setEnabled(false);
       SeatsComboBox.setEnabled(false);
       SeatsTextField.setEnabled(false);
       RadioComboBox.setEnabled(false);
       RadioPriceField.setEnabled(false);
       ParkingComboBox.setEnabled(false);
       ParkingPriceField.setEnabled(false);
       SlidingRoofBox.setEnabled(false);
       SlidingPriceField.setEnabled(false);
       BackSeatsScreenComboBox.setEnabled(false);
       BackSeatsPriceField.setEnabled(false);
       MatsComboBox.setEnabled(false);
       MatsPriceField.setEnabled(false);
       GPSComboBox.setEnabled(false);
       GPSPriceField.setEnabled(false);
       HeadComboBox.setEnabled(false);
       HeadLightsPriceField.setEnabled(false);
       CustomWindowComboBox.setEnabled(false);
       CustomWindowPriceField.setEnabled(false);
       SoundSystemComboBox.setEnabled(false);
       SoundSystemPriceField.setEnabled(false);
       confirmButton.setEnabled(false);
       packTable.setEnabled(false);
       initBrandComboBox();
       this.setLocationRelativeTo(null); //center form in the screen
       this.setVisible(true);
       this.pack();
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BackSeatsPriceField;
    private javax.swing.JComboBox<String> BackSeatsScreenComboBox;
    private javax.swing.JComboBox<String> BrandComboBox;
    private javax.swing.JCheckBox ComfortCheckBox;
    private javax.swing.JComboBox<String> CustomWindowComboBox;
    private javax.swing.JTextField CustomWindowPriceField;
    private javax.swing.JCheckBox EconomicCheckBox;
    private javax.swing.JComboBox<String> EngineComboBox;
    private javax.swing.JTextField EnginePriceField;
    private javax.swing.JComboBox<String> GPSComboBox;
    private javax.swing.JTextField GPSPriceField;
    private javax.swing.JComboBox<String> HeadComboBox;
    private javax.swing.JTextField HeadLightsPriceField;
    private javax.swing.JComboBox<String> MatsComboBox;
    private javax.swing.JTextField MatsPriceField;
    private javax.swing.JComboBox<String> ModelComboBox;
    private javax.swing.JComboBox<String> PaintComboBox;
    private javax.swing.JTextField PaintPriceField;
    private javax.swing.JComboBox<String> ParkingComboBox;
    private javax.swing.JTextField ParkingPriceField;
    private javax.swing.JComboBox<String> RadioComboBox;
    private javax.swing.JTextField RadioPriceField;
    private javax.swing.JButton RemovePackB;
    private javax.swing.JComboBox<String> RimsComboBox7;
    private javax.swing.JTextField RimsPriceField;
    private javax.swing.JComboBox<String> SeatsComboBox;
    private javax.swing.JTextField SeatsTextField;
    private javax.swing.JTextField SlidingPriceField;
    private javax.swing.JComboBox<String> SlidingRoofBox;
    private javax.swing.JComboBox<String> SoundSystemComboBox;
    private javax.swing.JTextField SoundSystemPriceField;
    private javax.swing.JCheckBox SportCheckBox;
    private javax.swing.JComboBox<String> SteeringWheelComboBox;
    private javax.swing.JTextField SteeringWheelPriceField;
    private javax.swing.JComboBox<String> SuspensionComboBox;
    private javax.swing.JTextField SuspensionPriceField;
    private javax.swing.JTextField TotalPriceField;
    private javax.swing.JButton addPackB;
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable packTable;
    // End of variables declaration//GEN-END:variables
}
