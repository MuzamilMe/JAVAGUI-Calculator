/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.Timer;

/**
 *
 * @author Muzamil-M
 */
public class CalculatorGUI extends javax.swing.JFrame {
     Double num1,num2;
     String op = null;
     Double result;

    /**
     * Creates new form CalculatorGUI
     */
    public CalculatorGUI() {
        initComponents();   
            on.setSelected(true);
            on.setEnabled(false);

            String oldText = text1.getText();
            text1.setText("Welcome");
            Timer timer = new Timer(1000, event -> {
                text1.setText(oldText);
            });
            timer.setRepeats(false);
            timer.start();
            

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        history = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonDiv = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        jButtonMult = new javax.swing.JButton();
        jButtonMin = new javax.swing.JButton();
        jButtonPlus = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButtonDot = new javax.swing.JButton();
        jButtoneq = new javax.swing.JButton();
        jButtonDel = new javax.swing.JButton();
        jButtonPercent = new javax.swing.JButton();
        text1 = new javax.swing.JTextField();
        on = new javax.swing.JRadioButton();
        off = new javax.swing.JRadioButton();

        jLabel1.setText("jLabel1");

        jButton12.setFont(new java.awt.Font("Sitka Subheading", 0, 18)); // NOI18N
        jButton12.setText(".");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator1, java.awt.BorderLayout.CENTER);
        getContentPane().add(jSeparator2, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        history.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        history.setForeground(java.awt.Color.white);
        history.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        history.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 255, 255)));
        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });
        jPanel2.add(history, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 24, 117, -1));

        jLabel3.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jLabel3.setText("Standard");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 90, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton7.setBackground(java.awt.Color.gray);
        jButton7.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(104, 90, 45));
        jButton7.setText("7");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton6.setBackground(java.awt.Color.gray);
        jButton6.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(104, 90, 45));
        jButton6.setText("6");
        jButton6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton4.setBackground(java.awt.Color.gray);
        jButton4.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(104, 90, 45));
        jButton4.setText("4");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButtonClear.setBackground(java.awt.Color.darkGray);
        jButtonClear.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jButtonClear.setForeground(new java.awt.Color(255, 255, 255));
        jButtonClear.setText("C");
        jButtonClear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

        jButtonDiv.setBackground(java.awt.Color.darkGray);
        jButtonDiv.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jButtonDiv.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDiv.setText("/");
        jButtonDiv.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButtonDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDivActionPerformed(evt);
            }
        });

        jButton1.setBackground(java.awt.Color.gray);
        jButton1.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(104, 90, 45));
        jButton1.setText("1");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(java.awt.Color.gray);
        jButton3.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(104, 90, 45));
        jButton3.setText("3");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton9.setBackground(java.awt.Color.gray);
        jButton9.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(104, 90, 45));
        jButton9.setText("9");
        jButton9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton0.setBackground(java.awt.Color.gray);
        jButton0.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jButton0.setForeground(new java.awt.Color(104, 90, 45));
        jButton0.setText("0");
        jButton0.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        jButtonMult.setBackground(java.awt.Color.darkGray);
        jButtonMult.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jButtonMult.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMult.setText("X");
        jButtonMult.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButtonMult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMultActionPerformed(evt);
            }
        });

        jButtonMin.setBackground(java.awt.Color.darkGray);
        jButtonMin.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jButtonMin.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMin.setText("-");
        jButtonMin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButtonMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinActionPerformed(evt);
            }
        });

        jButtonPlus.setBackground(java.awt.Color.darkGray);
        jButtonPlus.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jButtonPlus.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPlus.setText("+");
        jButtonPlus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButtonPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPlusActionPerformed(evt);
            }
        });

        jButton8.setBackground(java.awt.Color.gray);
        jButton8.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(104, 90, 45));
        jButton8.setText("8");
        jButton8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton5.setBackground(java.awt.Color.gray);
        jButton5.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(104, 90, 45));
        jButton5.setText("5");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton2.setBackground(java.awt.Color.gray);
        jButton2.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(104, 90, 45));
        jButton2.setText("2");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButtonDot.setBackground(java.awt.Color.darkGray);
        jButtonDot.setFont(new java.awt.Font("Sitka Subheading", 1, 18)); // NOI18N
        jButtonDot.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDot.setText(".");
        jButtonDot.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButtonDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDotActionPerformed(evt);
            }
        });

        jButtoneq.setBackground(new java.awt.Color(255, 112, 29));
        jButtoneq.setFont(new java.awt.Font("Trebuchet MS", 0, 36)); // NOI18N
        jButtoneq.setText("=");
        jButtoneq.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        jButtoneq.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtoneq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoneqActionPerformed(evt);
            }
        });

        jButtonDel.setBackground(java.awt.Color.darkGray);
        jButtonDel.setFont(new java.awt.Font("Sitka Subheading", 1, 14)); // NOI18N
        jButtonDel.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDel.setText("<-");
        jButtonDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDelActionPerformed(evt);
            }
        });

        jButtonPercent.setBackground(java.awt.Color.darkGray);
        jButtonPercent.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jButtonPercent.setForeground(new java.awt.Color(255, 255, 255));
        jButtonPercent.setText("%");
        jButtonPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPercentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonDel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonMult, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonMin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonDot, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtoneq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonDel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addComponent(jButtonPercent, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDiv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonMult, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jButtonMin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jButtonPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonDot, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtoneq, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 119, -1, -1));

        text1.setBackground(new java.awt.Color(218, 200, 170));
        text1.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        text1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        text1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 8));
        text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text1ActionPerformed(evt);
            }
        });
        jPanel2.add(text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 238, 63));

        on.setText("ON");
        on.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onActionPerformed(evt);
            }
        });
        jPanel2.add(on, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        off.setText("OFF");
        off.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                offActionPerformed(evt);
            }
        });
        jPanel2.add(off, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 50, -1));

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
                text1.setText(text1.getText()+"8");

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButtoneqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoneqActionPerformed
        // TODO add your handling code here:
        num2 = Double.parseDouble(text1.getText());
        if(op.equals("/")){
            result = num1/num2;
        }  
         if(op.equals("*")){
            result = num1*num2;
        }  
          if(op.equals("+")){
            result = num1+num2;
        }  
           if(op.equals("-")){
            result = num1-num2;
        }  
            if(op.equals("%")){
            result = num1%num2;
        }  
            if(result!=null){
                DecimalFormat decimalFormat = new DecimalFormat("#.#####");
                         text1.setText(result % 1 == 0 ? String.valueOf(result.intValue()) : decimalFormat.format(result));
                         history.setVisible(true);
                         history.setBackground(Color.BLUE);
            String no1 = num1 % 1 == 0 ? String.valueOf(num1.intValue()) : decimalFormat.format(num1);
            String no2 = num2 % 1 == 0 ? String.valueOf(num2.intValue()) : decimalFormat.format(num2);
            history.setText(no1+op+no2);                        

            }



    }//GEN-LAST:event_jButtoneqActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
                text1.setText(text1.getText()+"7");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text1ActionPerformed
        // TODO add your handling code here:
            
    }//GEN-LAST:event_text1ActionPerformed

    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        // TODO add your handling code here:
        text1.setText("");
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDelActionPerformed
        // TODO add your handling code here:
        String s = text1.getText();
        int len = s.length();
        String subStr = s.substring(0, len-1);
        text1.setText(subStr);
    }//GEN-LAST:event_jButtonDelActionPerformed

    private void jButtonMultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMultActionPerformed
        // TODO add your handling code here:
                num1 = Double.parseDouble(text1.getText());
        text1.setText("");
        op="*";
    }//GEN-LAST:event_jButtonMultActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        // TODO add your handling code here:
        text1.setText(text1.getText()+"0");
    }//GEN-LAST:event_jButton0ActionPerformed

    private void jButtonDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDotActionPerformed
        // TODO add your handling code here:
        if(text1.getText().contains(".")){
            
        }else{
                text1.setText(text1.getText()+".");
        }

    }//GEN-LAST:event_jButtonDotActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
                text1.setText(text1.getText()+"4");

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
                text1.setText(text1.getText()+"5");

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
                text1.setText(text1.getText()+"6");

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButtonMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinActionPerformed
        // TODO add your handling code here:
        num1 = Double.parseDouble(text1.getText());
        text1.setText("");
        op="-";
    }//GEN-LAST:event_jButtonMinActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
                text1.setText(text1.getText()+"9");

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                text1.setText(text1.getText()+"1");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                        text1.setText(text1.getText()+"3");

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                        text1.setText(text1.getText()+"2");

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDivActionPerformed
        // TODO add your handling code here:
        num1 = Double.parseDouble(text1.getText());
        text1.setText("");
        op="/";
    }//GEN-LAST:event_jButtonDivActionPerformed

    private void jButtonPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPlusActionPerformed
        // TODO add your handling code here:
        num1 = Double.parseDouble(text1.getText());
        text1.setText("");
        op="+";
    }//GEN-LAST:event_jButtonPlusActionPerformed

    private void jButtonPercentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPercentActionPerformed
        // TODO add your handling code here:
        num1 = Double.parseDouble(text1.getText());
        text1.setText("");
        op="%";
    }//GEN-LAST:event_jButtonPercentActionPerformed

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_historyActionPerformed

    private void onActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onActionPerformed
        // TODO add your handling code here:
                on.setEnabled(false);
                off.setEnabled(true);
                off.setSelected(false);
                text1.setEnabled(true);
                text1.setEditable(true);
                jButtonClear.setEnabled(true);
                jButton1.setEnabled(true);
                jButton2.setEnabled(true);
                jButton3.setEnabled(true);
                jButton4.setEnabled(true);
                jButton5.setEnabled(true);
                jButton6.setEnabled(true);
                jButton7.setEnabled(true);
                jButton8.setEnabled(true);
                jButton9.setEnabled(true);
                jButton0.setEnabled(true);
                jButtonPlus.setEnabled(true);
                jButtonMin.setEnabled(true);
                jButtonDiv.setEnabled(true);
                jButtonMult.setEnabled(true);
                jButtonDel.setEnabled(true);
                jButtonPercent.setEnabled(true);
                jButtonDot.setEnabled(true);
                jButtoneq.setEnabled(true);




    }//GEN-LAST:event_onActionPerformed

    private void offActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_offActionPerformed
        // TODO add your handling code here:
                off.setEnabled(false);
                on.setEnabled(true);
                on.setSelected(false);
                text1.setEnabled(false);
                text1.setEditable(false);
                jButtonClear.setEnabled(false);
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
                jButton3.setEnabled(false);
                jButton4.setEnabled(false);
                jButton5.setEnabled(false);
                jButton6.setEnabled(false);
                jButton7.setEnabled(false);
                jButton8.setEnabled(false);
                jButton9.setEnabled(false);
                jButton0.setEnabled(false);
                jButtonPlus.setEnabled(false);
                jButtonMin.setEnabled(false);
                jButtonDiv.setEnabled(false);
                jButtonMult.setEnabled(false);
                jButtonDel.setEnabled(false);
                jButtonPercent.setEnabled(false);
                jButtonDot.setEnabled(false);
                jButtoneq.setEnabled(false);
                history.setText("");
                history.setBackground(Color.WHITE);
                text1.setText("");



                

    }//GEN-LAST:event_offActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JTextField history;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonDel;
    private javax.swing.JButton jButtonDiv;
    private javax.swing.JButton jButtonDot;
    private javax.swing.JButton jButtonMin;
    private javax.swing.JButton jButtonMult;
    private javax.swing.JButton jButtonPercent;
    private javax.swing.JButton jButtonPlus;
    private javax.swing.JButton jButtoneq;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton off;
    private javax.swing.JRadioButton on;
    private javax.swing.JTextField text1;
    // End of variables declaration//GEN-END:variables
}
