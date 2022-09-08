/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Shaon
 */
public class AdEmpData extends javax.swing.JFrame {
       Connection con;
    /**
     * Creates new form AdEmpData
     */
    public AdEmpData() {
        try {
            initComponents();
            javaconnect.connectdb();
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/logindb", "login", "12345");
            System.out.println("database connected");
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
        showAll();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    private void showAll() {
        try {
            String sql = "SELECT * FROM EMPLOYEES";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            EmpTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);

        }

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
        jScrollPane1 = new javax.swing.JScrollPane();
        EmpTable = new javax.swing.JTable();
        EmpID = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        EmpIDField = new javax.swing.JTextField();
        EmpName = new javax.swing.JTextField();
        EmpDesig = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        addMember = new javax.swing.JButton();
        updateMember = new javax.swing.JButton();
        deleteMember = new javax.swing.JButton();
        searchMember = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        EmpEmail = new javax.swing.JTextField();
        SidePannel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        LogOutButton = new javax.swing.JButton();
        adminSectionButton = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        empAddress = new javax.swing.JTextField();
        sa = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EmpTable.setAutoCreateRowSorter(true);
        EmpTable.setBackground(new java.awt.Color(153, 153, 153));
        EmpTable.setForeground(new java.awt.Color(255, 255, 255));
        EmpTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "Name", "Designation", "Birth Date", "Phone", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(EmpTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 0, 1050, 350));

        EmpID.setBackground(new java.awt.Color(153, 153, 153));
        EmpID.setForeground(new java.awt.Color(51, 51, 51));
        EmpID.setText("Employee ID");
        EmpID.setActionCommand("memberid");
        EmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpIDActionPerformed(evt);
            }
        });
        jPanel1.add(EmpID, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 125, -1));

        jButton2.setText("Employee Name");
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 130, -1));

        jButton3.setText("Designation");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 470, 125, -1));

        jButton6.setText("Phone Number");
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, 125, -1));

        EmpIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpIDFieldActionPerformed(evt);
            }
        });
        jPanel1.add(EmpIDField, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 370, 225, -1));
        jPanel1.add(EmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 420, 225, -1));

        EmpDesig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpDesigActionPerformed(evt);
            }
        });
        jPanel1.add(EmpDesig, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 225, -1));
        jPanel1.add(phoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 520, 225, -1));

        addMember.setText("Add Member");
        addMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMemberActionPerformed(evt);
            }
        });
        jPanel1.add(addMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 500, 166, -1));

        updateMember.setText("Update Member Info");
        updateMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMemberActionPerformed(evt);
            }
        });
        jPanel1.add(updateMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 550, 166, -1));

        deleteMember.setText("Delete Member");
        deleteMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMemberActionPerformed(evt);
            }
        });
        jPanel1.add(deleteMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 450, 166, -1));

        searchMember.setText("Search ");
        searchMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchMemberActionPerformed(evt);
            }
        });
        jPanel1.add(searchMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 590, 166, -1));

        jButton4.setText("Back to Dashboard");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 640, 166, -1));
        jPanel1.add(EmpEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 570, 225, -1));

        SidePannel.setBackground(new java.awt.Color(52, 59, 61));
        SidePannel.setToolTipText("");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/dash.png"))); // NOI18N
        jLabel2.setText("jLabel1");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/dash2.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/dash3.png"))); // NOI18N
        jLabel5.setText("jLabel5");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/dash4.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        jButton1.setBackground(new java.awt.Color(52, 59, 61));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Dashboard");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(52, 59, 61));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Employee Section");
        jButton5.setActionCommand("");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(52, 59, 61));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Attendance");
        jButton7.setToolTipText("");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(52, 59, 61));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText(" leave type");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/salarybut.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");

        jButton9.setBackground(new java.awt.Color(52, 59, 61));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Salary");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        LogOutButton.setBackground(new java.awt.Color(52, 59, 61));
        LogOutButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LogOutButton.setForeground(new java.awt.Color(255, 255, 255));
        LogOutButton.setText("Log Out");
        LogOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogOutButtonActionPerformed(evt);
            }
        });

        adminSectionButton.setBackground(new java.awt.Color(52, 59, 61));
        adminSectionButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        adminSectionButton.setForeground(new java.awt.Color(255, 255, 255));
        adminSectionButton.setText("Admin Section");
        adminSectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminSectionButtonActionPerformed(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/logout.png"))); // NOI18N
        jLabel19.setText("jLabel19");

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Home/dash2.jpg"))); // NOI18N
        jLabel20.setText("jLabel20");

        javax.swing.GroupLayout SidePannelLayout = new javax.swing.GroupLayout(SidePannel);
        SidePannel.setLayout(SidePannelLayout);
        SidePannelLayout.setHorizontalGroup(
            SidePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidePannelLayout.createSequentialGroup()
                .addGroup(SidePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SidePannelLayout.createSequentialGroup()
                        .addGroup(SidePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(SidePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(SidePannelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(SidePannelLayout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addGroup(SidePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SidePannelLayout.createSequentialGroup()
                        .addGroup(SidePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(SidePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SidePannelLayout.createSequentialGroup()
                        .addGroup(SidePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(adminSectionButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                            .addComponent(LogOutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SidePannelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        SidePannelLayout.setVerticalGroup(
            SidePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidePannelLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(SidePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2))
                .addGap(44, 44, 44)
                .addGroup(SidePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(SidePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jLabel5))
                .addGap(62, 62, 62)
                .addGroup(SidePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(SidePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(SidePannelLayout.createSequentialGroup()
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)))
                .addGroup(SidePannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SidePannelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(adminSectionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LogOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(SidePannelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90))
        );

        jPanel1.add(SidePannel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 830));

        jButton10.setText("   Email");
        jButton10.setActionCommand("         Email");
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 570, 120, -1));
        jPanel1.add(empAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 620, 230, -1));
        jPanel1.add(sa, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 670, 230, 30));

        jButton11.setText("Address");
        jButton11.setActionCommand("Address");
        jPanel1.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 620, 120, -1));

        jButton12.setText("Salary");
        jPanel1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 670, 120, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1383, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 831, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpIDActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void EmpIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpIDFieldActionPerformed

    private void addMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMemberActionPerformed
        // TODO add your handling code here:
        new EmployeeRecord().setVisible(true);
        int row = -1;
        String id = toUpperCase(EmpID.getText());
        String name = EmpName.getText();
        String desig = EmpDesig.getText();
        String phn = phoneField.getText();
        String email = EmpEmail.getText();
        //int quantityint = Integer.parseInt(quantity);
        //String unitPrice = unitPriceField.getText();
        EmpID.setText("");
        EmpName.setText("");
        EmpDesig.setText("");
        phoneField.setText("");
        EmpEmail.setText("");
        try {
            String sql = "INSERT INTO EMPLOYEES(ID, NAME, ROLE, PHN, EMAIL) VALUES( ?,  ?,  ?,  ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ps.setString(2, name);
            ps.setString(3, "Employee");
            ps.setString(4, phn);
            ps.setString(4, email);

            row = ps.executeUpdate();

            System.out.println("Inserted successfully");
            //  JOptionPane.showMessageDialog(null, "Data insertionsuccessful.Row:" + row, "Information", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "Error", JOptionPane.INFORMATION_MESSAGE);

        }
        showAll();
    }//GEN-LAST:event_addMemberActionPerformed

    private void updateMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateMemberActionPerformed
        // TODO add your handling code here:
        int row = -1;
        String id = EmpIDField.getText();
        String name = EmpName.getText();
        String address = empAddress.getText();

        String mail = EmpEmail.getText();
        int phn = Integer.parseInt(phoneField.getText());
        /*EmpIDField.setText("");
        EmpName.setText("");
        empAddress.setText("");
        EmpDesig.setText("");
        EmpEmail.setText("");
        phoneField.setText("");
        sa.setText("");*/

        try {
            String sql = "UPDATE EMPLOYEES SET NAME = '" + name + "', ADDRESS = '" + address + "', EMAIL = '" + mail + "', PHN = " + phn + " WHERE ID = '" + id+ "'";
            Statement st = con.createStatement();
            row = st.executeUpdate(sql);

            System.out.println( "Data update successful. Row:" + row+ " Information");
            //    JOptionPane.showMessageDialog(null, "Data update successful. Row:" + row, "Information", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);

        }
        showAll();
    }//GEN-LAST:event_updateMemberActionPerformed

    private void deleteMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMemberActionPerformed
        // TODO add your handling code here:
        int row = -1;
        try {
            String id = toUpperCase(EmpIDField.getText());
            String sql = "DELETE FROM EMPLOYEES WHERE ID = '" + id+ "'";

            Statement st = con.createStatement();

            row = st.executeUpdate(sql);

            System.out.println("Deletion successful. Row:" + row + " Information");
            EmpIDField.setText("");
            EmpName.setText("");
            EmpDesig.setText("");
            phoneField.setText("");
            EmpEmail.setText("");
            empAddress.setText("");
            sa.setText("");
            //  JOptionPane.showMessageDialog(null, "Deletion successful. Row:" + row, "Information", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        showAll();
    }//GEN-LAST:event_deleteMemberActionPerformed

    private void searchMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchMemberActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            String id = EmpIDField.getText();
            String sql = "SELECT * FROM EMPLOYEES WHERE ID = '" +id+ "'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            System.out.println(id);
            
            while(rs.next())
            {
                empAddress.setText(rs.getString("ADDRESS"));
                EmpName.setText(rs.getString("NAME"));
                EmpDesig.setText(rs.getString("ROLE"));
                phoneField.setText(rs.getString("PHN"));
                EmpEmail.setText(rs.getString("EMAIL"));
                sa.setText(rs.getString("SALARY"));
            }
            
        } catch (SQLException ex) {
            //Logger.getLogger(ItemListFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchMemberActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new Dashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void EmpDesigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpDesigActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpDesigActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new AdEmpData().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void LogOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogOutButtonActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_LogOutButtonActionPerformed

    private void adminSectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminSectionButtonActionPerformed
        // TODO add your handling code here:
        new adminSection().setVisible(true);
        dispose();
    }//GEN-LAST:event_adminSectionButtonActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
         new SalaryList().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        new AdminLeave().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        new Dashboard().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        new AdAttendance().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(AdEmpData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdEmpData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdEmpData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdEmpData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdEmpData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmpDesig;
    private javax.swing.JTextField EmpEmail;
    private javax.swing.JButton EmpID;
    private javax.swing.JTextField EmpIDField;
    private javax.swing.JTextField EmpName;
    private javax.swing.JTable EmpTable;
    private javax.swing.JButton LogOutButton;
    private javax.swing.JPanel SidePannel;
    private javax.swing.JButton addMember;
    private javax.swing.JButton adminSectionButton;
    private javax.swing.JButton deleteMember;
    private javax.swing.JTextField empAddress;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField phoneField;
    private javax.swing.JTextField sa;
    private javax.swing.JButton searchMember;
    private javax.swing.JButton updateMember;
    // End of variables declaration//GEN-END:variables
}
