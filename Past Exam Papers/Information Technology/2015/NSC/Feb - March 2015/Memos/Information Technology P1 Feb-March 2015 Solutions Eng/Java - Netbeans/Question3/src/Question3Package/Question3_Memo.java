package Question3Package;

public class Question3_Memo extends javax.swing.JFrame {

    // Given code
    PopulateArrays objAssign = new PopulateArrays();
    String[] arrSales = objAssign.populateArrSales();
    String[] arrAgents = objAssign.populateArrAgents();
    // New code
    String agentCode = "";
    String agentName = "";
    String[] arrTypes = objAssign.populateArrTypes();
    String[] arrMonths = objAssign.populateArrMonths();

    public Question3_Memo() {
        initComponents();
        setLocationRelativeTo(this);      
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        pnlContent = new javax.swing.JPanel();
        pnlSalesDetail = new javax.swing.JPanel();
        lblAgentCode = new javax.swing.JLabel();
        btnAgentsName = new javax.swing.JButton();
        lblAgentName = new javax.swing.JLabel();
        btnAgentsSalesRecord = new javax.swing.JButton();
        txfAgentCode = new javax.swing.JTextField();
        pnlDisplay = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaOutput = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Question3 - Solution");

        pnlSalesDetail.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "Agent's sales details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        lblAgentCode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAgentCode.setText("Enter agent's code");

        btnAgentsName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAgentsName.setText("Find agent's name");
        btnAgentsName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgentsNameActionPerformed(evt);
            }
        });

        lblAgentName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btnAgentsSalesRecord.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAgentsSalesRecord.setText("Agent's sales");
        btnAgentsSalesRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgentsSalesRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSalesDetailLayout = new javax.swing.GroupLayout(pnlSalesDetail);
        pnlSalesDetail.setLayout(pnlSalesDetailLayout);
        pnlSalesDetailLayout.setHorizontalGroup(
            pnlSalesDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalesDetailLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSalesDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblAgentCode)
                    .addComponent(txfAgentCode, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addGroup(pnlSalesDetailLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblAgentName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(pnlSalesDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgentsName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgentsSalesRecord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );
        pnlSalesDetailLayout.setVerticalGroup(
            pnlSalesDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalesDetailLayout.createSequentialGroup()
                .addGroup(pnlSalesDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSalesDetailLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAgentCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txfAgentCode, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSalesDetailLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnAgentsName, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSalesDetailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgentsSalesRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAgentName, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pnlDisplay.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "Display area", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        txaOutput.setColumns(20);
        txaOutput.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txaOutput.setRows(5);
        jScrollPane2.setViewportView(txaOutput);

        javax.swing.GroupLayout pnlDisplayLayout = new javax.swing.GroupLayout(pnlDisplay);
        pnlDisplay.setLayout(pnlDisplayLayout);
        pnlDisplayLayout.setHorizontalGroup(
            pnlDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDisplayLayout.setVerticalGroup(
            pnlDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDisplayLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSalesDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDisplay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addComponent(pnlSalesDetail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnlContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgentsNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgentsNameActionPerformed
        txaOutput.setText("");
        agentCode = txfAgentCode.getText().toUpperCase();

        boolean found = false;
        int p = 0;

        while (!found && p < arrAgents.length) {
            if (arrAgents[p].substring(0, 4).equalsIgnoreCase(agentCode)) {
                agentName = arrAgents[p].substring(arrAgents[p].indexOf(":") + 1);
                lblAgentName.setText(agentName);
                found = true;
            }
            p++;
        }
        if (!found) {
            lblAgentName.setText("Invalid agent code");
            txfAgentCode.setText("");
        }
    }//GEN-LAST:event_btnAgentsNameActionPerformed

    private void btnAgentsSalesRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgentsSalesRecordActionPerformed
        btnAgentsName.doClick();
        if (agentName.length() > 0) {
            clearStats();
            int totalSales = 0;
            for (int i = 0; i < arrSales.length; i++) {
                if (arrSales[i].substring(5, 9).contentEquals(agentCode)) {

                    int month = Integer.parseInt(arrSales[i].substring(0, 2));

                    int col = month - 1;
                    char propType = arrSales[i].toUpperCase().charAt(3);
                    int row = 0;
                    switch (propType) {
                        case 'C':
                            row = 0;
                            break;
                        case 'R':
                            row = 1;
                            break;
                        case 'A':
                            row = 2;
                            break;
                    }

                    arrStats[row][col]++;
                    arrStats[row][12] += 1;
                    totalSales += Integer.parseInt(arrSales[i].substring(arrSales[i].indexOf(";") + 1));
                }
            }
            txaOutput.setText(String.format("%-13s", ""));
            for (int i = 0; i < 12; i++) {
                txaOutput.append(String.format("%-4s", arrMonths[i]));
            }
            txaOutput.append("\n\n");
            for (int r = 0; r < 3; r++) {
                txaOutput.append(String.format("%-13s", arrTypes[r]));
                for (int c = 0; c < 13; c++) {
                    txaOutput.append(String.format("%-4s", arrStats[r][c]));
                }
                txaOutput.append("\n\n");
            }
            txaOutput.append("\nTotal value of sales: R " + totalSales);
        } else {
            txaOutput.setText("Please enter a valid agent code");
        }
    }//GEN-LAST:event_btnAgentsSalesRecordActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Question3_Memo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgentsName;
    private javax.swing.JButton btnAgentsSalesRecord;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAgentCode;
    private javax.swing.JLabel lblAgentName;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlDisplay;
    private javax.swing.JPanel pnlSalesDetail;
    private javax.swing.JTextArea txaOutput;
    private javax.swing.JTextField txfAgentCode;
    // End of variables declaration//GEN-END:variables

    public void clearStats() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 13; c++) {
                arrStats[r][c] = 0;
            }
        }
    }
    int[][] arrStats = new int[3][13];
}
