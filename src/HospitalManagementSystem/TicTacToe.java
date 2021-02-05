package HospitalManagementSystem;


import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nabee
 */
public class TicTacToe extends javax.swing.JFrame {
    private String StartGame = "X";
    private int xCount= 0;
    private int oCount = 0;
    private int count = 0; //RydeR's addition*********************
 

    /**
     * Creates new form TicTacToe
     */
    public TicTacToe() {
        initComponents();
        setSize(1200,600);
        setLocationRelativeTo(null);
    }
    private void gameScore()
    {
        jbPlayerX.setText(String.valueOf(xCount));
        jbPlayerO.setText(String.valueOf(oCount));
    }
    
    private void choose_a_Player()
    {
        if(StartGame.equalsIgnoreCase("X"))
        {
            StartGame = "O";
        }
        else
        {
            StartGame = "X";
        }
    }
    private void winningGame()
    {
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        
        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();
        
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        String b9 = jButton9.getText();
        if( b1.equals("X") && b2.equals("X") && b3.equals("X"))
                {
                    JOptionPane.showMessageDialog(this, "Player x wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                    xCount++;
                    gameScore();
                    jButton1.setBackground(Color.YELLOW);
                    jButton2.setBackground(Color.YELLOW);
                    jButton3.setBackground(Color.YELLOW);
                    count = 0; //RydeR's addition***************
                    reset();
                    
                }
         if( b4.equals("X") && b5.equals("X") && b6.equals("X"))
                {
                    JOptionPane.showMessageDialog(this, "Player x wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                    xCount++;
                    gameScore();
                    jButton4.setBackground(Color.CYAN);
                    jButton5.setBackground(Color.CYAN);
                    jButton6.setBackground(Color.CYAN);
                    count = 0; //RydeR's addition***************
                    reset();
                }
         if( b7.equals("X") && b8.equals("X") && b9.equals("X"))
                {
                    JOptionPane.showMessageDialog(this, "Player x wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                    xCount++;
                    gameScore();
                    jButton7.setBackground(Color.MAGENTA);
                    jButton8.setBackground(Color.MAGENTA);
                    jButton9.setBackground(Color.MAGENTA);
                    count = 0; //RydeR's addition***************
                    reset();
                }
         if( b1.equals("X") && b4.equals("X") && b7.equals("X"))
                {
                    JOptionPane.showMessageDialog(this, "Player x wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                    xCount++;
                    gameScore();
                    jButton1.setBackground(Color.PINK);
                    jButton4.setBackground(Color.PINK);
                    jButton7.setBackground(Color.PINK);
                    count = 0; //RydeR's addition***************
                    reset();
                }
         if( b2.equals("X") && b5.equals("X") && b8.equals("X"))
                {
                    JOptionPane.showMessageDialog(this, "Player x wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                    xCount++;
                    gameScore();
                    jButton2.setBackground(Color.darkGray);
                    jButton5.setBackground(Color.darkGray);
                    jButton8.setBackground(Color.darkGray);
                    count = 0; //RydeR's addition***************
                    reset();
                }
         if( b3.equals("X") && b6.equals("X") && b9.equals("X"))
                {
                    JOptionPane.showMessageDialog(this, "Player x wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                    xCount++;
                    gameScore();
                    jButton3.setBackground(Color.GRAY);
                    jButton6.setBackground(Color.GRAY);
                    jButton9.setBackground(Color.GRAY);
                    count = 0; //RydeR's addition***************
                    reset();
                }
              if( b1.equals("X") && b5.equals("X") && b9.equals("X"))
                {
                    JOptionPane.showMessageDialog(this, "Player x wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                    xCount++;
                    gameScore();
                    jButton1.setBackground(Color.GREEN);
                    jButton5.setBackground(Color.GREEN);
                    jButton9.setBackground(Color.GREEN);
                    count = 0; //RydeR's addition***************
                    reset();
                }
              if( b3.equals("X") && b5.equals("X") && b7.equals("X"))
                {
                    JOptionPane.showMessageDialog(this, "Player x wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                    xCount++;
                    gameScore();
                    jButton3.setBackground(Color.ORANGE);
                    jButton5.setBackground(Color.ORANGE);
                    jButton7.setBackground(Color.ORANGE);
                    count = 0; //RydeR's addition***************
                    reset();
                }
              
              //*************//
              //THE CODE THAT STARTS FROM HERE WAS ADDED BY Knight_RydeR* . Writing this in case something goes wrong.
              //*************//
              //*************//
              //*************//
              if( b1.equals("O") && b2.equals("O") && b3.equals("O"))
                {
                    JOptionPane.showMessageDialog(this, "Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                    oCount++;
                    gameScore();
                    jButton1.setBackground(Color.YELLOW);
                    jButton2.setBackground(Color.YELLOW);
                    jButton3.setBackground(Color.YELLOW);
                    count = 0; //RydeR's addition***************
                    reset();
                    
                }
         if( b4.equals("O") && b5.equals("O") && b6.equals("O"))
                {
                    JOptionPane.showMessageDialog(this, "Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                    oCount++;
                    gameScore();
                    jButton4.setBackground(Color.CYAN);
                    jButton5.setBackground(Color.CYAN);
                    jButton6.setBackground(Color.CYAN);
                    count = 0; //RydeR's addition***************
                    reset();
                }
         if( b7.equals("O") && b8.equals("O") && b9.equals("O"))
                {
                    JOptionPane.showMessageDialog(this, "Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                    oCount++;
                    gameScore();
                    jButton7.setBackground(Color.MAGENTA);
                    jButton8.setBackground(Color.MAGENTA);
                    jButton9.setBackground(Color.MAGENTA);
                    count = 0; //RydeR's addition***************
                    reset();
                }
         if( b1.equals("O") && b4.equals("O") && b7.equals("O"))
                {
                    JOptionPane.showMessageDialog(this, "Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                    oCount++;
                    gameScore();
                    jButton1.setBackground(Color.PINK);
                    jButton4.setBackground(Color.PINK);
                    jButton7.setBackground(Color.PINK);
                    count = 0; //RydeR's addition***************
                    reset();
                }
         if( b2.equals("O") && b5.equals("O") && b8.equals("O"))
                {
                    JOptionPane.showMessageDialog(this, "Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                    oCount++;
                    gameScore();
                    jButton2.setBackground(Color.darkGray);
                    jButton5.setBackground(Color.darkGray);
                    jButton8.setBackground(Color.darkGray);
                    count = 0; //RydeR's addition***************
                    reset();
                }
         if( b3.equals("O") && b6.equals("O") && b9.equals("O"))
                {
                    JOptionPane.showMessageDialog(this, "Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                    oCount++;
                    gameScore();
                    jButton3.setBackground(Color.GRAY);
                    jButton6.setBackground(Color.GRAY);
                    jButton9.setBackground(Color.GRAY);
                    count = 0; //RydeR's addition***************
                    reset();
                }
              if( b1.equals("O") && b5.equals("O") && b9.equals("O"))
                {
                    JOptionPane.showMessageDialog(this, "Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                    oCount++;
                    gameScore();
                    jButton1.setBackground(Color.GREEN);
                    jButton5.setBackground(Color.GREEN);
                    jButton9.setBackground(Color.GREEN);
                    count = 0; //RydeR's addition***************
                    reset();
                }
              if( b3.equals("O") && b5.equals("O") && b7.equals("O"))
                {
                    JOptionPane.showMessageDialog(this, "Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
                    oCount++;
                    gameScore();
                    jButton3.setBackground(Color.ORANGE);
                    jButton5.setBackground(Color.ORANGE);
                    jButton7.setBackground(Color.ORANGE);
                    count = 0; //RydeR's addition***************
                    reset();
                }
              if (count == 9)
              {
                  JOptionPane.showMessageDialog(rootPane, "It's a tie!");
                  count = 0;
                  reset();
              }
              //*************//
              //*************//
              //*************//
              //THE CODE THAT ENDS HERE WAS ADDED BY Knight_RydeR* . Writing this in case something goes wrong.
              //*************//

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jbPlayerX = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jbPlayerO = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jbtnReset = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Player X:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(164, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(50, 50, 50))
        );

        jPanel2.add(jPanel6);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jbPlayerX.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbPlayerX)
                .addContainerGap(329, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(225, Short.MAX_VALUE)
                .addComponent(jbPlayerX)
                .addGap(47, 47, 47))
        );

        jPanel2.add(jPanel11);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Player O:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addContainerGap(184, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel10);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jbPlayerO.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbPlayerO)
                .addContainerGap(329, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jbPlayerO)
                .addContainerGap(245, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel12);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel17);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jbtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jbtnReset)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jbtnExit)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel15);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        frame = new JFrame("Exit");
        int p = JOptionPane.showConfirmDialog(frame, "Are you sure you want to exit?","Tic Tac Toe",
                JOptionPane.YES_NO_OPTION);
        if(p==0)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jButton1.setText("");
        choose_a_Player();
        jButton2.setText("");
        jButton3.setText("");

        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");

        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);

        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);

        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        count = 0;


    }//GEN-LAST:event_jbtnResetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        jButton1.setText(StartGame);
        if(StartGame.equalsIgnoreCase("X"))
        {
           jButton1.setForeground(Color.GREEN);
        }
        else
        {
           jButton1.setForeground(Color.BLUE);
        }
        count++; //RydeR's addition***************
         choose_a_Player();
         winningGame();
         //choose_a_Player();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          jButton2.setText(StartGame);
        if(StartGame.equalsIgnoreCase("X"))
        {
           jButton2.setForeground(Color.GREEN);
        }
        else
        {
           jButton2.setForeground(Color.BLUE);
        }
        count++; //RydeR's addition***************
         choose_a_Player();
         winningGame();
         //choose_a_Player();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         jButton3.setText(StartGame);
                 System.out.println(StartGame);

        if(StartGame.equalsIgnoreCase("X"))
        {
           jButton3.setForeground(Color.GREEN);
        }
        else
        {
           jButton3.setForeground(Color.BLUE);
        }
        count++; //RydeR's addition***************
         choose_a_Player();
         winningGame();
         //choose_a_Player();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          jButton4.setText(StartGame);
        if(StartGame.equalsIgnoreCase("X"))
        {
           jButton4.setForeground(Color.GREEN);
        }
        else
        {
           jButton4.setForeground(Color.BLUE);
        }
        count++; //RydeR's addition***************
         choose_a_Player();
         winningGame();
         //choose_a_Player();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(StartGame);
        System.out.println(StartGame);
        if(StartGame.equalsIgnoreCase("X"))
        {
           jButton5.setForeground(Color.GREEN);
        }
        else
        {
           jButton5.setForeground(Color.BLUE);
        }
        count++; //RydeR's addition***************
         choose_a_Player();
         winningGame();
         //choose_a_Player();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         jButton6.setText(StartGame);
        if(StartGame.equalsIgnoreCase("X"))
        {
           jButton6.setForeground(Color.GREEN);
        }
        else
        {
           jButton6.setForeground(Color.BLUE);
        }
        count++; //RydeR's addition***************
         choose_a_Player();
         winningGame();
         //choose_a_Player();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         jButton7.setText(StartGame);
        if(StartGame.equalsIgnoreCase("X"))
        {
           jButton7.setForeground(Color.GREEN);
        }
        else
        {
           jButton7.setForeground(Color.BLUE);
        }
        count++; //RydeR's addition***************
         choose_a_Player();
         winningGame();
         //choose_a_Player();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         jButton8.setText(StartGame);
        if(StartGame.equalsIgnoreCase("X"))
        {
           jButton8.setForeground(Color.GREEN);
        }
        else
        {
           jButton8.setForeground(Color.BLUE);
        }
        count++; //RydeR's addition***************
         choose_a_Player();
         winningGame();
         //choose_a_Player();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
          jButton9.setText(StartGame);
        if(StartGame.equalsIgnoreCase("X"))
        {
           jButton9.setForeground(Color.GREEN);
        }
        else
        {
           jButton9.setForeground(Color.BLUE);
        }
        count++; //RydeR's addition***************
         choose_a_Player();
         winningGame();
         //choose_a_Player();
    }//GEN-LAST:event_jButton9ActionPerformed
public void reset()
{
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
choose_a_Player();
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");

        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);

        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);

        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jbPlayerO;
    private javax.swing.JLabel jbPlayerX;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnReset;
    // End of variables declaration//GEN-END:variables
}
