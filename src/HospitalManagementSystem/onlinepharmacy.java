package HospitalManagementSystem;


import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abdullah
 */
public class onlinepharmacy extends javax.swing.JFrame {

    public static String name[]=new String[22];
    public static int[] rate=new int[22];
    

   public onlinepharmacy() {
      initComponents();
        
      //setting rate field disable
        r1.setEnabled(false);
        r2.setEnabled(false);
        r3.setEnabled(false);
        r4.setEnabled(false);
        r5.setEnabled(false);
        r6.setEnabled(false);
        r7.setEnabled(false);
        
      //setting amount field disable  
        s1.setEnabled(false);
        s2.setEnabled(false);
        s3.setEnabled(false);
        s4.setEnabled(false);
        s5.setEnabled(false);
        s6.setEnabled(false);
        s7.setEnabled(false);
        
       //setting total textarea and buy button to disable 
        Total.setEnabled(false);
        BUY.setEnabled(false);
        
        name[0]="panadol";
        name[1]="panadol extra";
        name[2]="adol";
        name[3]="brufen";
        name[4]="aspirin";
        name[5]="codeine";
        name[6]="morphine";
        name[7]="quinestar";
        name[8]="doxylin";
        name[9]="axomax";
        name[10]="febrol";
        name[11]="neubrol";
        name[12]="doxy";
        name[13]="iodex";
        name[14]="hydrogen peroxide solution";
        name[15]="piodine";
        name[16]="prozac";
        name[17]="zyprexa";
        name[18]="cypralex";
        name[19]="centrum";
        name[20]="alive";
        name[21]="blackmore";        
        
        rate[0]=100;
        rate[1]=120;
        rate[2]=150;
        rate[3]=160;
        rate[4]=90;
        rate[5]=130;
        rate[6]=180;
        rate[7]=250;
        rate[8]=80;
        rate[9]=85;
        rate[10]=110;
        rate[11]=70;
        rate[12]=300;
        rate[13]=50;
        rate[14]=60;
        rate[15]=70;
        rate[16]=220;
        rate[17]=270;
        rate[18]=140;
        rate[19]=145;
        rate[20]=400;
        rate[21]=900;
    }


   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        heading = new javax.swing.JLabel();
        Antipyretics = new javax.swing.JLabel();
        c1 = new javax.swing.JComboBox<>();
        q1 = new javax.swing.JTextField();
        s1 = new javax.swing.JTextField();
        q2 = new javax.swing.JTextField();
        s2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        c2 = new javax.swing.JComboBox<>();
        Total = new javax.swing.JTextField();
        addtocart = new javax.swing.JButton();
        r1 = new javax.swing.JTextField();
        r2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        c3 = new javax.swing.JComboBox<>();
        c4 = new javax.swing.JComboBox<>();
        c5 = new javax.swing.JComboBox<>();
        c6 = new javax.swing.JComboBox<>();
        c7 = new javax.swing.JComboBox<>();
        r3 = new javax.swing.JTextField();
        q3 = new javax.swing.JTextField();
        s3 = new javax.swing.JTextField();
        r4 = new javax.swing.JTextField();
        q4 = new javax.swing.JTextField();
        s4 = new javax.swing.JTextField();
        r5 = new javax.swing.JTextField();
        q5 = new javax.swing.JTextField();
        s5 = new javax.swing.JTextField();
        r6 = new javax.swing.JTextField();
        q6 = new javax.swing.JTextField();
        s6 = new javax.swing.JTextField();
        r7 = new javax.swing.JTextField();
        q7 = new javax.swing.JTextField();
        s7 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        BUY = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        heading.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        heading.setText("ONLINE PHARMACY");

        Antipyretics.setText("Antipyretics:");

        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose..", "panadol", "panadol extra", "adol" }));
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q1ActionPerformed(evt);
            }
        });

        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Analgesics:");

        c2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose..", "brufen", "aspirin", "codeine", "morphine" }));
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });

        addtocart.setText("ADD TO CART");
        addtocart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtocartActionPerformed(evt);
            }
        });

        jLabel2.setText("Antimalarial:");

        jLabel3.setText("Antibiotic:");

        jLabel4.setText("Antiseptic:");

        jLabel5.setText("Anti-Depressant:");

        jLabel6.setText("Multi-Vitamins:");

        c3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose..", "quinestar", "doxylin" }));

        c4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose..", "axomax", "febrol", "neubrol", "doxy" }));

        c5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose..", "iodex", "hydrogen peroxide solution", "piodine" }));

        c6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose..", "prozac", "zyprexa", "cypralex" }));

        c7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "choose..", "centrum", "alive", "blackmore" }));

        s6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s6ActionPerformed(evt);
            }
        });

        s7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s7ActionPerformed(evt);
            }
        });

        jLabel7.setText("RATE");

        jLabel8.setText("QUANTITY");

        jLabel9.setText("AMOUNT");

        jLabel10.setText("TOTAL:");

        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        BUY.setText("BUY");
        BUY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUYActionPerformed(evt);
            }
        });

        exit.setText("EXIT");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(356, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(reset))
                            .addComponent(jLabel10))
                        .addGap(9, 9, 9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(Antipyretics))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(heading)
                                .addGap(0, 1, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(c1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(c2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(c3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(c4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(c5, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(c6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(c7, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addGap(9, 9, 9))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(r1))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(r2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(r3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(r4))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(r5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(q6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(r6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(q7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(r7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addtocart)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BUY))
                    .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(s5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                        .addComponent(s4, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(s6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel9)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel8))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Antipyretics)
                                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(c4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(c5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(s5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(r5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(c6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(q6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(s6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(r6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(c7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(q7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addtocart)
                    .addComponent(reset)
                    .addComponent(BUY)
                    .addComponent(exit))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s2ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

    private void addtocartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtocartActionPerformed
        
        //assigning initial values to total and amount field
        int total=0;
        int T_antireptic=0;
        int T_analgestic=0;
        int T_antimalarial=0;
        int T_antibiotic=0;
        int T_antidepressant=0;
        int T_antiseptic=0;
        int T_multivitamins=0;
       
        
        //calculating total cost of each type choose
         T_antireptic=Antireptic();
         T_analgestic=Analgestic();
         T_antimalarial=Antimalarial();
         T_antibiotic=Antibiotic();
         T_antiseptic=Antiseptic();
         T_antidepressant=Anti_depressant();
         T_multivitamins=multi_vitamin();
         
         //calculating total amount
        total=T_antireptic+T_analgestic+T_antimalarial+T_antibiotic+T_antiseptic+T_antidepressant+ T_multivitamins;
        Total.setText(total+"");
        Total.setEnabled(false);
        
        //disabling rate fields
        r1.setEnabled(false);
        r2.setEnabled(false);
        r3.setEnabled(false);
        r4.setEnabled(false);
        r5.setEnabled(false);
        r6.setEnabled(false);
        r7.setEnabled(false);
        
        //disabling amount fields
        s1.setEnabled(false);
        s2.setEnabled(false);
        s3.setEnabled(false);
        s4.setEnabled(false);
        s5.setEnabled(false);
        s6.setEnabled(false);
        s7.setEnabled(false);
       
        //enabling buy button
        if(total!=0){
        BUY.setEnabled(true);
        }
        
    }//GEN-LAST:event_addtocartActionPerformed

    private void q1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q1ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c2ActionPerformed

    private void s6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s6ActionPerformed

    private void s7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_s7ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        
        //setting combo Box to default value
        c1.setSelectedIndex(0);
        c2.setSelectedIndex(0);
        c3.setSelectedIndex(0);
        c4.setSelectedIndex(0);
        c5.setSelectedIndex(0);
        c6.setSelectedIndex(0);
        c7.setSelectedIndex(0);
        
        //setting quantity to default value
        q1.setText(null);
        q2.setText(null);
        q3.setText(null);
        q4.setText(null);
        q5.setText(null);
        q6.setText(null);
        q7.setText(null);
        
        //setting rate to default value
        r1.setText(null); r1.setEnabled(false);
        r2.setText(null); r2.setEnabled(false);
        r3.setText(null); r3.setEnabled(false);
        r4.setText(null); r4.setEnabled(false);
        r5.setText(null); r5.setEnabled(false);
        r6.setText(null); r6.setEnabled(false);
        r7.setText(null); r7.setEnabled(false);
        
        
        //setting amount to default value
        s1.setText(null); s1.setEnabled(false);
        s2.setText(null); s2.setEnabled(false);
        s3.setText(null); s3.setEnabled(false);
        s4.setText(null); s4.setEnabled(false);
        s5.setText(null); s5.setEnabled(false);
        s6.setText(null); s6.setEnabled(false);
        s7.setText(null); s7.setEnabled(false);
        
        //setting total to null
        Total.setText(null);
        BUY.setEnabled(false);
    }//GEN-LAST:event_resetActionPerformed

    private void BUYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUYActionPerformed
         JOptionPane.showMessageDialog(rootPane, "Purchase succesfull.");
         BUY.setEnabled(false);
         addtocart.setEnabled(false);
         reset.setEnabled(false);
        
        
        String x=Total.getText();
        finance.finances("medicine: ", x);
        
        
         //for stock count>
         String []name=new String[7];
        double[]number=new double[7];
         String [] q=new String[7];
        
        
        
        
        
        name[0]=(String)c1.getSelectedItem();
        name[1]=(String)c2.getSelectedItem();
        name[2]=(String)c3.getSelectedItem();
        name[3]=(String)c4.getSelectedItem();
        name[4]=(String)c5.getSelectedItem();
        name[5]=(String)c6.getSelectedItem();
        name[6]=(String)c7.getSelectedItem();
        
       q[0]=q1.getText();
       q[1]=q2.getText();
       q[2]=q3.getText();
       q[3]=q4.getText();
       q[4]=q5.getText();
       q[5]=q6.getText();
       q[6]=q7.getText();
       
        for(int i=0;i<name.length;i++){
        if(name[i]!="choose.."){number[i]=Double.parseDouble(q[i]);
        }else{number[i]=0;}
        }
        
      
        for(int i=0;i<name.length;i++){
               
        if(name[i]!="choose.."){
            Stockmanagement s=new Stockmanagement(name[i],number[i]);
        }
        }
    }//GEN-LAST:event_BUYActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new MenuPagePatient().setVisible(true);
        
    }//GEN-LAST:event_exitActionPerformed

    public int Antireptic(){
    
     String x= (String)c1.getSelectedItem();
     int cost=0; 
     
     for (int i=0;i<name.length;i++){
              if (x==name[i]){
                 int qty;
                 if("".equals(q1.getText())){
                   qty=1;
                   q1.setText(qty+"");
                 }else{
                   qty=Integer.parseInt(q1.getText());}
                  
                cost=rate[i]*qty;
                r1.setText(rate[i]+"");
                s1.setText(cost+"");}
     }
     return cost;
    }                  
        
    
    public int Analgestic(){
     String x= (String)c2.getSelectedItem();
     int cost=0;
     
     for (int i=0;i<name.length;i++){
              if (x==name[i]){
                   int qty;
                   if("".equals(q2.getText())){
                     qty=1;
                     q2.setText(qty+"");
                   }else{
                     qty=Integer.parseInt(q2.getText());
                   }
                   
                cost=rate[i]*qty;
                r2.setText(rate[i]+"");
                s2.setText(cost+"");}
     }      
    return cost;
    }
    
    
     public int Antimalarial(){
      String x= (String)c3.getSelectedItem();
      int cost=0;   
      for (int i=0;i<name.length;i++){
              if (x==name[i]){            
                   int qty;
                   if("".equals(q3.getText())){
                     qty=1;
                     q3.setText(qty+"");
                   }else{
                     qty=Integer.parseInt(q3.getText());
                   }
                  
                  cost=rate[i]*qty;
                  r3.setText(rate[i]+"");
                  s3.setText(cost+"");}
         }
    return cost;
    }
     
     
     public int Antibiotic(){
      String x= (String)c4.getSelectedItem();
      int cost=0;   
      for (int i=0;i<name.length;i++){
              if (x==name[i]){            
                   int qty;
                   if("".equals(q4.getText())){
                     qty=1;
                     q4.setText(qty+"");
                   }else{
                     qty=Integer.parseInt(q4.getText());
                   }
                   
                  cost=rate[i]*qty;
                  r4.setText(rate[i]+"");
                  s4.setText(cost+"");}
         }
    return cost;
    }
      
     
     public int Antiseptic(){
      String x= (String)c5.getSelectedItem();
      int cost=0;   
      for (int i=0;i<name.length;i++){
              if (x==name[i]){     
                   int qty;
                   if("".equals(q5.getText())){
                     qty=1;
                     q5.setText(qty+"");
                   }else{
                     qty=Integer.parseInt(q5.getText());
                   }
                  
                  cost=rate[i]*qty;
                  r5.setText(rate[i]+"");
                  s5.setText(cost+"");}
         }
    return cost;
    }
       
     
     public int Anti_depressant(){
      String x= (String)c6.getSelectedItem();
      int cost=0;   
      for (int i=0;i<name.length;i++){
              if (x==name[i]){          
                   int qty;
                   if("".equals(q6.getText())){
                     qty=1;
                     q6.setText(qty+"");
                   }else{
                     qty=Integer.parseInt(q6.getText());
                   }
                   
                  cost=rate[i]*qty;
                  r6.setText(rate[i]+"");
                  s6.setText(cost+"");}
         }
    return cost;
    }
        
     
     public int multi_vitamin(){
      String x= (String)c7.getSelectedItem();
      int cost=0;   
      for (int i=0;i<name.length;i++){
              if (x==name[i]){
                   int qty;
                   if("".equals(q7.getText())){
                     qty=1;
                     q7.setText(qty+"");
                   }else{
                     qty=Integer.parseInt(q7.getText());
                   }
                   
                  cost=rate[i]*qty;
                  r7.setText(rate[i]+"");
                  s7.setText(cost+"");}
         }
    return cost;
    }
    
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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(onlinepharmacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(onlinepharmacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(onlinepharmacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(onlinepharmacy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new onlinepharmacy().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Antipyretics;
    private javax.swing.JButton BUY;
    private javax.swing.JTextField Total;
    private javax.swing.JButton addtocart;
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JComboBox<String> c2;
    private javax.swing.JComboBox<String> c3;
    private javax.swing.JComboBox<String> c4;
    private javax.swing.JComboBox<String> c5;
    private javax.swing.JComboBox<String> c6;
    private javax.swing.JComboBox<String> c7;
    private javax.swing.JButton exit;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q2;
    private javax.swing.JTextField q3;
    private javax.swing.JTextField q4;
    private javax.swing.JTextField q5;
    private javax.swing.JTextField q6;
    private javax.swing.JTextField q7;
    private javax.swing.JTextField r1;
    private javax.swing.JTextField r2;
    private javax.swing.JTextField r3;
    private javax.swing.JTextField r4;
    private javax.swing.JTextField r5;
    private javax.swing.JTextField r6;
    private javax.swing.JTextField r7;
    private javax.swing.JButton reset;
    private javax.swing.JTextField s1;
    private javax.swing.JTextField s2;
    private javax.swing.JTextField s3;
    private javax.swing.JTextField s4;
    private javax.swing.JTextField s5;
    private javax.swing.JTextField s6;
    private javax.swing.JTextField s7;
    // End of variables declaration//GEN-END:variables
}
