
import java.net.URL;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;


/**
 *
 * @author ANDRES
 */
public class carrera extends javax.swing.JFrame {

    
    public carrera() {
        initComponents();
        //this.getContentPane().setBackground(Color.RED);
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
        lblnplayers = new javax.swing.JLabel();
        cmbplayer = new javax.swing.JComboBox<>();
        lbllevel = new javax.swing.JLabel();
        cmblevel = new javax.swing.JComboBox<>();
        btnstar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblturno = new javax.swing.JLabel();
        lblposicion = new javax.swing.JLabel();
        lblmiss = new javax.swing.JLabel();
        lblret = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbldado1 = new javax.swing.JLabel();
        lbldado2 = new javax.swing.JLabel();
        btnplay = new javax.swing.JButton();
        lblnump = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblpares = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblwin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnconfi = new javax.swing.JButton();
        btntry = new javax.swing.JButton();
        btnabout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Number Rice");
        setBackground(new java.awt.Color(204, 0, 0));
        setForeground(new java.awt.Color(255, 51, 51));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Config zone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblnplayers.setForeground(new java.awt.Color(255, 255, 255));
        lblnplayers.setText("Number of players");

        cmbplayer.setForeground(new java.awt.Color(255, 255, 255));
        cmbplayer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        cmbplayer.setEnabled(false);

        lbllevel.setForeground(new java.awt.Color(255, 255, 255));
        lbllevel.setText("Level");

        cmblevel.setForeground(new java.awt.Color(255, 255, 255));
        cmblevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basic: 50", "Intermediate: 100", "Advanced: 200" }));
        cmblevel.setEnabled(false);

        btnstar.setText("Star Game");
        btnstar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbplayer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblnplayers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmblevel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbllevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnstar, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblnplayers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbplayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lbllevel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmblevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnstar)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Scorces Zone"));

        jLabel7.setText("Turn player");

        jLabel8.setText("Advanced positions");

        jLabel9.setText("Missing positions");

        jLabel10.setText("Returns");

        lblturno.setText("#");

        lblposicion.setText("#");

        lblmiss.setText("#");

        lblret.setText("#");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblmiss, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblturno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblposicion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblret, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblturno))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblposicion))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblmiss))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblret))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Play Zone"));
        jPanel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        lbldado1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbldado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldado1.setText("?");

        lbldado2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lbldado2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbldado2.setText("?");

        btnplay.setText("Play - Player # ");
        btnplay.setEnabled(false);
        btnplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplayActionPerformed(evt);
            }
        });

        lblnump.setText(".");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(lbldado1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbldado2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnplay, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(lblnump, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbldado1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldado2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblnump, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pairs", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        lblpares.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblpares.setForeground(new java.awt.Color(255, 255, 255));
        lblpares.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblpares.setText("0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(lblpares, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblpares, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Winer"));

        lblwin.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblwin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblwin.setText("?");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblwin, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblwin, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(255, 51, 51));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NUMBER RACE");
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));

        btnconfi.setBackground(new java.awt.Color(204, 0, 51));
        btnconfi.setText("Config params");
        btnconfi.setEnabled(false);
        btnconfi.setFocusable(false);

        btntry.setBackground(new java.awt.Color(0, 153, 204));
        btntry.setText("Try again");
        btntry.setEnabled(false);
        btntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntryActionPerformed(evt);
            }
        });

        btnabout.setBackground(new java.awt.Color(255, 153, 0));
        btnabout.setText("About of");
        btnabout.setEnabled(false);
        btnabout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnconfi, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntry, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnabout, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnconfi)
                        .addGap(33, 33, 33)
                        .addComponent(btntry)
                        .addGap(29, 29, 29)
                        .addComponent(btnabout)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnstarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstarActionPerformed
        // TODO add your handling code here:
        btnstar.setEnabled(true);
        cmblevel.setEnabled(true);
        cmbplayer.setEnabled(true);
        btnplay.setEnabled(true);
        btnconfi.setEnabled(true);
        btntry.setEnabled(true);
        btnabout.setEnabled(true);
    }//GEN-LAST:event_btnstarActionPerformed

    private void btnplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplayActionPerformed
         Scanner par = new Scanner(System.in);
        Scanner par2 = new Scanner(System.in);
        Random D = new Random();
          int d1 = 0, d2 = 0, sumadados=0, cont=0, acum=0;
          String player;
          String level;
          String missi;
            d1 = (int)(D.nextDouble()* 6 + 1);
            d2 = (int)(D.nextDouble()* 6 + 1);
        
            lbldado1.setText(Integer.toString(d1));
            lbldado2.setText(Integer.toString(d2));
            sumadados = d1 + d2;
            
            
            
            lblposicion.setText(" " + sumadados);
            
            player = cmbplayer.getSelectedItem().toString();
            lblturno.setText(player);
            
            level = cmblevel.getSelectedItem().toString();
            
            lblposicion.getText();
            missi = lblposicion.getText();
            
            
            
         
            
            
            
            
            
        /*switch(d1){
            case 1:
                lbldado1.setIcon(new ImageIcon(getClass().getResource("imagenes/dado1.png")));
                break;
            case 2:
                lbldado1.setIcon(new ImageIcon(getClass().getResource("imagenes/dado2.png")));
                break;
            case 3:
                lbldado1.setIcon(new ImageIcon(getClass().getResource("imagenes/dado3.png")));
                break;    
            case 4:
                lbldado1.setIcon(new ImageIcon(getClass().getResource("imagenes/dado4.png")));
                break;
            case 5:
                lbldado1.setIcon(new ImageIcon(getClass().getResource("imagenes/dado5.png")));
                break;
            case 6:
                lbldado1.setIcon(new ImageIcon(getClass().getResource("imagenes/dado6.png")));
                break;    
        
        
        } 
        
        switch(d2){
            case 1:
                lbldado2.setIcon(new ImageIcon(getClass().getResource("imagenes/dado1.png")));
                break;
            case 2:
                lbldado2.setIcon(new ImageIcon(getClass().getResource("imagenes/dado2.png")));
                break;
            case 3:
                lbldado2.setIcon(new ImageIcon(getClass().getResource("imagenes/dado3.png")));
                break;    
            case 4:
                lbldado2.setIcon(new ImageIcon(getClass().getResource("imagenes/dado4.png")));
                break;
            case 5:
                lbldado2.setIcon(new ImageIcon(getClass().getResource("imagenes/dado5.png")));
                break;
            case 6:
                lbldado2.setIcon(new ImageIcon(getClass().getResource("imagenes/dado6.png")));
                break;
         
    }                                       
    }
     */

            
            
         
            
            
            
            
            
        /*switch(d1){
            case 1:
                lbldado1.setIcon(new ImageIcon(getClass().getResource("imagenes/dado1.png")));
                break;
            case 2:
                lbldado1.setIcon(new ImageIcon(getClass().getResource("imagenes/dado2.png")));
                break;
            case 3:
                lbldado1.setIcon(new ImageIcon(getClass().getResource("imagenes/dado3.png")));
                break;    
            case 4:
                lbldado1.setIcon(new ImageIcon(getClass().getResource("imagenes/dado4.png")));
                break;
            case 5:
                lbldado1.setIcon(new ImageIcon(getClass().getResource("imagenes/dado5.png")));
                break;
            case 6:
                lbldado1.setIcon(new ImageIcon(getClass().getResource("imagenes/dado6.png")));
                break;    
        
        
        } 
        
        switch(d2){
            case 1:
                lbldado2.setIcon(new ImageIcon(getClass().getResource("imagenes/dado1.png")));
                break;
            case 2:
                lbldado2.setIcon(new ImageIcon(getClass().getResource("imagenes/dado2.png")));
                break;
            case 3:
                lbldado2.setIcon(new ImageIcon(getClass().getResource("imagenes/dado3.png")));
                break;    
            case 4:
                lbldado2.setIcon(new ImageIcon(getClass().getResource("imagenes/dado4.png")));
                break;
            case 5:
                lbldado2.setIcon(new ImageIcon(getClass().getResource("imagenes/dado5.png")));
                break;
            case 6:
                lbldado2.setIcon(new ImageIcon(getClass().getResource("imagenes/dado6.png")));
                break;
         
    }//GEN-LAST:event_btnplayActionPerformed
    }
     */
    }
    private void btntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntryActionPerformed
        // TODO add your handling code here:
        lbldado1.setText("?");
        lbldado2.setText("?");
        lblposicion.setText("#");
        lblpares.setText("0");
        lblmiss.setText("#");
        lblturno.setText("#");
        lblret.setText("#");
        lblwin.setText("?");
    }//GEN-LAST:event_btntryActionPerformed

    private void btnaboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaboutActionPerformed
        
        About  Abo = new About();
        Abo.setVisible(true);
    }//GEN-LAST:event_btnaboutActionPerformed

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
            java.util.logging.Logger.getLogger(carrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(carrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(carrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(carrera.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new carrera().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnabout;
    private javax.swing.JButton btnconfi;
    private javax.swing.JButton btnplay;
    private javax.swing.JButton btnstar;
    private javax.swing.JButton btntry;
    private javax.swing.JComboBox<String> cmblevel;
    private javax.swing.JComboBox<String> cmbplayer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbldado1;
    private javax.swing.JLabel lbldado2;
    private javax.swing.JLabel lbllevel;
    private javax.swing.JLabel lblmiss;
    private javax.swing.JLabel lblnplayers;
    private javax.swing.JLabel lblnump;
    private javax.swing.JLabel lblpares;
    private javax.swing.JLabel lblposicion;
    private javax.swing.JLabel lblret;
    private javax.swing.JLabel lblturno;
    private javax.swing.JLabel lblwin;
    // End of variables declaration//GEN-END:variables

    private boolean cmblevel(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getText(JLabel lbldado1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String toString(JComboBox<String> cmbplayer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class ImagenIcon {

        ImagenIcon(URL resource) {
        }
    }
    private static final Logger LOG = Logger.getLogger(carrera.class.getName());

    

    
       
    
}
