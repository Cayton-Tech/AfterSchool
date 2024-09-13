package Question1Package;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Question1_Memo extends javax.swing.JFrame {

    DecimalFormat df = new DecimalFormat("R 0.00");
    char renovationType = ' ';
    double elecBill;

    public Question1_Memo() {

        initComponents();
        this.setLocationRelativeTo(this);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        tbpQuestion1 = new javax.swing.JTabbedPane();
        pnlQ1_1 = new javax.swing.JPanel();
        pnlAdvertisement = new javax.swing.JPanel();
        txfMarket = new javax.swing.JTextField();
        lblNumberBathrooms = new javax.swing.JLabel();
        chkPool = new javax.swing.JCheckBox();
        lblSellingPrice = new javax.swing.JLabel();
        btnSalesAdd = new javax.swing.JButton();
        txfSellingPrice = new javax.swing.JTextField();
        lblNumberBedrooms = new javax.swing.JLabel();
        txfBaths = new javax.swing.JTextField();
        txfBeds = new javax.swing.JTextField();
        lblMarketValue = new javax.swing.JLabel();
        pnlAdOutput = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaOutput = new javax.swing.JTextArea();
        pnlQ1_2 = new javax.swing.JPanel();
        pnlMethodRenovation = new javax.swing.JPanel();
        rbtPaint = new javax.swing.JRadioButton();
        rbtTile = new javax.swing.JRadioButton();
        btnCalcRenovation = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaOutputRenovation = new javax.swing.JTextArea();
        pnlAreaInput = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        lblAreaRenovated = new javax.swing.JLabel();
        txfArea = new javax.swing.JTextField();
        pnlQ1_3 = new javax.swing.JPanel();
        pnlCalcElectricity = new javax.swing.JPanel();
        lblElectricity = new javax.swing.JLabel();
        lblPrevReading = new javax.swing.JLabel();
        lblCurrReading = new javax.swing.JLabel();
        txfCurrent = new javax.swing.JTextField();
        txfPrevious = new javax.swing.JTextField();
        lblHeadingKiloW = new javax.swing.JLabel();
        lblAmountDue = new javax.swing.JLabel();
        btnCalcAmount = new javax.swing.JButton();
        pnlGeyserOptions = new javax.swing.JPanel();
        txfGeyserSize = new javax.swing.JTextField();
        lblGeyserSizes = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txaOutputGeysers = new javax.swing.JTextArea();
        btnFindGeysers = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Question 1 - General problem solving");

        tbpQuestion1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tbpQuestion1.setName("Question1"); // NOI18N

        txfMarket.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfMarket.setText("0");

        lblNumberBathrooms.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNumberBathrooms.setText("Number of bathrooms:");

        chkPool.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        chkPool.setText("Pool");

        lblSellingPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSellingPrice.setText("Selling price:");

        btnSalesAdd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnSalesAdd.setText("Generate advertisement");
        btnSalesAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesAddActionPerformed(evt);
            }
        });

        txfSellingPrice.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfSellingPrice.setText("0");

        lblNumberBedrooms.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNumberBedrooms.setText("Number of bedrooms:");

        txfBaths.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfBaths.setText("0");

        txfBeds.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfBeds.setText("0");

        lblMarketValue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblMarketValue.setText("Market value:");

        javax.swing.GroupLayout pnlAdvertisementLayout = new javax.swing.GroupLayout(pnlAdvertisement);
        pnlAdvertisement.setLayout(pnlAdvertisementLayout);
        pnlAdvertisementLayout.setHorizontalGroup(
            pnlAdvertisementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdvertisementLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(btnSalesAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 120, Short.MAX_VALUE))
            .addGroup(pnlAdvertisementLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(pnlAdvertisementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMarketValue, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumberBedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumberBathrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(pnlAdvertisementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkPool)
                    .addComponent(txfSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfMarket, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfBeds, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfBaths, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAdvertisementLayout.setVerticalGroup(
            pnlAdvertisementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdvertisementLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAdvertisementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarketValue, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfMarket, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAdvertisementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAdvertisementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfBeds, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumberBedrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAdvertisementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumberBathrooms, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfBaths, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(chkPool)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btnSalesAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlAdOutput.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Advertisement", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        txaOutput.setColumns(20);
        txaOutput.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txaOutput.setRows(5);
        jScrollPane1.setViewportView(txaOutput);

        javax.swing.GroupLayout pnlAdOutputLayout = new javax.swing.GroupLayout(pnlAdOutput);
        pnlAdOutput.setLayout(pnlAdOutputLayout);
        pnlAdOutputLayout.setHorizontalGroup(
            pnlAdOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdOutputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnlAdOutputLayout.setVerticalGroup(
            pnlAdOutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdOutputLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlQ1_1Layout = new javax.swing.GroupLayout(pnlQ1_1);
        pnlQ1_1.setLayout(pnlQ1_1Layout);
        pnlQ1_1Layout.setHorizontalGroup(
            pnlQ1_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQ1_1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQ1_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlAdvertisement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAdOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlQ1_1Layout.setVerticalGroup(
            pnlQ1_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQ1_1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(pnlAdvertisement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(pnlAdOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tbpQuestion1.addTab("Advertisement", pnlQ1_1);

        pnlMethodRenovation.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "Choose the type of renovation:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        buttonGroup1.add(rbtPaint);
        rbtPaint.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbtPaint.setText("Painting");
        rbtPaint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtPaintActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtTile);
        rbtTile.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        rbtTile.setText("Tiling");
        rbtTile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtTileActionPerformed(evt);
            }
        });

        btnCalcRenovation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCalcRenovation.setText("Calculate and display renovation cost");
        btnCalcRenovation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcRenovationActionPerformed(evt);
            }
        });

        txaOutputRenovation.setColumns(20);
        txaOutputRenovation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txaOutputRenovation.setRows(5);
        jScrollPane2.setViewportView(txaOutputRenovation);

        javax.swing.GroupLayout pnlMethodRenovationLayout = new javax.swing.GroupLayout(pnlMethodRenovation);
        pnlMethodRenovation.setLayout(pnlMethodRenovationLayout);
        pnlMethodRenovationLayout.setHorizontalGroup(
            pnlMethodRenovationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMethodRenovationLayout.createSequentialGroup()
                .addGroup(pnlMethodRenovationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMethodRenovationLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(rbtPaint)
                        .addGap(67, 67, 67)
                        .addComponent(rbtTile))
                    .addGroup(pnlMethodRenovationLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnCalcRenovation, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMethodRenovationLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        pnlMethodRenovationLayout.setVerticalGroup(
            pnlMethodRenovationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMethodRenovationLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlMethodRenovationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtTile)
                    .addComponent(rbtPaint))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCalcRenovation, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addGap(47, 47, 47))
        );

        pnlAreaInput.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "Area to be renovated in square metres", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Question1Package/metre1.png"))); // NOI18N

        lblAreaRenovated.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAreaRenovated.setText("Enter the area to be renovated:");

        txfArea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout pnlAreaInputLayout = new javax.swing.GroupLayout(pnlAreaInput);
        pnlAreaInput.setLayout(pnlAreaInputLayout);
        pnlAreaInputLayout.setHorizontalGroup(
            pnlAreaInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAreaInputLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblAreaRenovated, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txfArea, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        pnlAreaInputLayout.setVerticalGroup(
            pnlAreaInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAreaInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAreaInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfArea, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAreaRenovated, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(pnlAreaInputLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlQ1_2Layout = new javax.swing.GroupLayout(pnlQ1_2);
        pnlQ1_2.setLayout(pnlQ1_2Layout);
        pnlQ1_2Layout.setHorizontalGroup(
            pnlQ1_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQ1_2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnlQ1_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlMethodRenovation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAreaInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        pnlQ1_2Layout.setVerticalGroup(
            pnlQ1_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQ1_2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlAreaInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlMethodRenovation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        tbpQuestion1.addTab("Living room renovation", pnlQ1_2);

        pnlCalcElectricity.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "Calculate electricity used", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        lblElectricity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblElectricity.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblElectricity.setText("0.00");

        lblPrevReading.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPrevReading.setText("Previous reading");

        lblCurrReading.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCurrReading.setText("Current reading");

        txfCurrent.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txfPrevious.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfPrevious.setText("2100");

        lblHeadingKiloW.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblHeadingKiloW.setText("Electricity usage in kilowatts:");

        lblAmountDue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAmountDue.setText("Amount due");

        btnCalcAmount.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnCalcAmount.setText("Calculate amount due");
        btnCalcAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcAmountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCalcElectricityLayout = new javax.swing.GroupLayout(pnlCalcElectricity);
        pnlCalcElectricity.setLayout(pnlCalcElectricityLayout);
        pnlCalcElectricityLayout.setHorizontalGroup(
            pnlCalcElectricityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCalcElectricityLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCalcElectricityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCalcElectricityLayout.createSequentialGroup()
                        .addComponent(lblHeadingKiloW, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlCalcElectricityLayout.createSequentialGroup()
                        .addGroup(pnlCalcElectricityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPrevReading, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlCalcElectricityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCalcElectricityLayout.createSequentialGroup()
                                .addComponent(txfCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnCalcAmount)
                                .addGap(100, 100, 100)
                                .addComponent(lblElectricity, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                            .addGroup(pnlCalcElectricityLayout.createSequentialGroup()
                                .addComponent(lblCurrReading, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblAmountDue)))))
                .addContainerGap())
        );
        pnlCalcElectricityLayout.setVerticalGroup(
            pnlCalcElectricityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCalcElectricityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeadingKiloW, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(pnlCalcElectricityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrevReading, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCurrReading, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAmountDue))
                .addGap(11, 11, 11)
                .addGroup(pnlCalcElectricityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txfCurrent, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblElectricity, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        pnlGeyserOptions.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "Solar geyser options", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        txfGeyserSize.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txfGeyserSize.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txfGeyserSize.setText(" ");

        lblGeyserSizes.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblGeyserSizes.setText("Enter geyser size (50, 100, 150)");

        javax.swing.GroupLayout pnlGeyserOptionsLayout = new javax.swing.GroupLayout(pnlGeyserOptions);
        pnlGeyserOptions.setLayout(pnlGeyserOptionsLayout);
        pnlGeyserOptionsLayout.setHorizontalGroup(
            pnlGeyserOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeyserOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGeyserSizes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfGeyserSize, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlGeyserOptionsLayout.setVerticalGroup(
            pnlGeyserOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeyserOptionsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGeyserOptionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGeyserSizes)
                    .addComponent(txfGeyserSize, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        txaOutputGeysers.setColumns(20);
        txaOutputGeysers.setRows(5);
        jScrollPane3.setViewportView(txaOutputGeysers);

        btnFindGeysers.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnFindGeysers.setText("List geysers");
        btnFindGeysers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindGeysersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlQ1_3Layout = new javax.swing.GroupLayout(pnlQ1_3);
        pnlQ1_3.setLayout(pnlQ1_3Layout);
        pnlQ1_3Layout.setHorizontalGroup(
            pnlQ1_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQ1_3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlQ1_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlGeyserOptions, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCalcElectricity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQ1_3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlQ1_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnFindGeysers, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addGap(155, 155, 155))
        );
        pnlQ1_3Layout.setVerticalGroup(
            pnlQ1_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQ1_3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(pnlCalcElectricity, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlGeyserOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFindGeysers, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbpQuestion1.addTab("Water and electricity", pnlQ1_3);

        btnClose.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnClose))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tbpQuestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tbpQuestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnClose))
        );

        getAccessibleContext().setAccessibleName("aa");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalesAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesAddActionPerformed
        double market = Double.parseDouble(txfMarket.getText());
        double sell = Double.parseDouble(txfSellingPrice.getText());
        String bed = txfBeds.getText();
        String bath = txfBaths.getText();
        String advert = "R" + Math.round(sell) + "#" + bed + "Bed#" + bath + "Bath#";
        if (chkPool.isSelected()) {
            advert += "Pool#";
        }
        if (sell < market) {
            advert += "Bargain";
        }
        txaOutput.setText("House for sale:\n");
        txaOutput.append(advert);
    }//GEN-LAST:event_btnSalesAddActionPerformed

    private void btnFindGeysersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindGeysersActionPerformed
        String geyserSize = txfGeyserSize.getText().trim();
        txaOutputGeysers.setText("");
        for (int i = 0; i < arrGeysers.length; i++) {
            int psnDash = arrGeysers[i].indexOf("-");
            String size = arrGeysers[i].substring(0, psnDash);
            if (size.equals(geyserSize)) {
                txaOutputGeysers.append(arrGeysers[i].substring(psnDash + 1) + "\n");
            }
        }
    }//GEN-LAST:event_btnFindGeysersActionPerformed

    private void rbtPaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtPaintActionPerformed
        renovationType = 'P';
    }//GEN-LAST:event_rbtPaintActionPerformed

    private void rbtTileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtTileActionPerformed
        renovationType = 'T';
    }//GEN-LAST:event_rbtTileActionPerformed

    private void btnCalcRenovationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcRenovationActionPerformed
        int numOneLitreDrum = 0;
        int numTwoLitreDrum = 0;
        int numFiveLitreDrum = 0;
        double cost = 0.0;
        double area = Double.parseDouble(txfArea.getText());
        if (renovationType == 'P') {
            double numLitresOfPaint = area / 8;
            int volumeLitres = (int) (Math.round(numLitresOfPaint + 0.4));
            if (volumeLitres / 5 > 0) {
                numFiveLitreDrum += (int) (volumeLitres / 5);
                volumeLitres -= numFiveLitreDrum * 5;
                cost += numFiveLitreDrum * 199;
            }
            if (volumeLitres / 2 > 0) {
                numTwoLitreDrum += (int) (volumeLitres / 2);
                volumeLitres -= numTwoLitreDrum * 2;
                cost += numTwoLitreDrum * 92.30;
            }
            numOneLitreDrum = volumeLitres;
            cost += numOneLitreDrum * 55.50;
            txaOutputRenovation.setText("Area: " + (int)area + " square metres");
            txaOutputRenovation.append("\nVolume of paint required: " + numLitresOfPaint + " litres\n");
            txaOutputRenovation.append("\n1-litre drums:   " + numOneLitreDrum);
            txaOutputRenovation.append("\n2-litre drums:   " + numTwoLitreDrum);
            txaOutputRenovation.append("\n5-litre drums:   " + numFiveLitreDrum);
            txaOutputRenovation.append("\n\nTotal cost: " + df.format(cost));
        }
        if (renovationType == 'T') {
            double tileCost = Double.parseDouble(JOptionPane.showInputDialog("Enter the cost per square metre"));
            cost = (area + 5) * tileCost;
            txaOutputRenovation.setText("Area: " + (int)area + " square metres\nTotal cost: " + df.format(cost));
        }
    }//GEN-LAST:event_btnCalcRenovationActionPerformed

    private void btnCalcAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcAmountActionPerformed
        int prevReading = 0;
        int currReading = 0;
        double elecBill = 0;
        prevReading = Integer.parseInt(txfPrevious.getText());
        currReading = Integer.parseInt(txfCurrent.getText());
        if (prevReading > currReading) {
            JOptionPane.showMessageDialog(null, "Previous reading more than current reading, please re-type");
            txfCurrent.setText("0");
        } else {
            int elecUsage = currReading - prevReading;
            if (elecUsage <= 600) {
                elecBill = elecUsage;
            } else {
                elecBill = 600 + ((elecUsage - 600) * 1.5);
            }
        }
        lblElectricity.setText(df.format(elecBill));
    }//GEN-LAST:event_btnCalcAmountActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Question1_Memo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Question1_Memo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Question1_Memo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Question1_Memo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question1_Memo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcAmount;
    private javax.swing.JButton btnCalcRenovation;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnFindGeysers;
    private javax.swing.JButton btnSalesAdd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox chkPool;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAmountDue;
    private javax.swing.JLabel lblAreaRenovated;
    private javax.swing.JLabel lblCurrReading;
    private javax.swing.JLabel lblElectricity;
    private javax.swing.JLabel lblGeyserSizes;
    private javax.swing.JLabel lblHeadingKiloW;
    private javax.swing.JLabel lblMarketValue;
    private javax.swing.JLabel lblNumberBathrooms;
    private javax.swing.JLabel lblNumberBedrooms;
    private javax.swing.JLabel lblPrevReading;
    private javax.swing.JLabel lblSellingPrice;
    private javax.swing.JPanel pnlAdOutput;
    private javax.swing.JPanel pnlAdvertisement;
    private javax.swing.JPanel pnlAreaInput;
    private javax.swing.JPanel pnlCalcElectricity;
    private javax.swing.JPanel pnlGeyserOptions;
    private javax.swing.JPanel pnlMethodRenovation;
    private javax.swing.JPanel pnlQ1_1;
    private javax.swing.JPanel pnlQ1_2;
    private javax.swing.JPanel pnlQ1_3;
    private javax.swing.JRadioButton rbtPaint;
    private javax.swing.JRadioButton rbtTile;
    private javax.swing.JTabbedPane tbpQuestion1;
    private javax.swing.JTextArea txaOutput;
    private javax.swing.JTextArea txaOutputGeysers;
    private javax.swing.JTextArea txaOutputRenovation;
    private javax.swing.JTextField txfArea;
    private javax.swing.JTextField txfBaths;
    private javax.swing.JTextField txfBeds;
    private javax.swing.JTextField txfCurrent;
    private javax.swing.JTextField txfGeyserSize;
    private javax.swing.JTextField txfMarket;
    private javax.swing.JTextField txfPrevious;
    private javax.swing.JTextField txfSellingPrice;
    // End of variables declaration//GEN-END:variables
    String[] arrGeysers = {"50-QuickSun50", "100-QuickSun100", "150-QuickSun150", "50-Solar Magic", "50-InHotWater",
        "100-SunnyBath 100", "150-SunnyBath 150", "50-WaterJoy 50", "100-WaterJoy 100",
        "150-BigTub 150", "50-Small Wonder", "100-Medium Wonder", "150-Large Wonder",
        "100-SolarWarmth 100", "150-SolarWarmth 150", "50-Sun Magic", "50-Eco Wonder 50",
        "100-Eco Wonder 100", "150-Eco Wonder 150", "150-Big Earth Saver"};
}
