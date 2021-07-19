//El_Charles_Trejo
package pkg666;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
public class ClassPM extends javax.swing.JFrame {

DefaultListModel LPM= new DefaultListModel();   
    public ClassPM() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("\t\tGENERADOR DE PSEUDONUMEROS POR PRODUCTOS MEDIOS.");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        X0 = new javax.swing.JTextField();
        Y0 = new javax.swing.JTextField();
        Calcular = new javax.swing.JButton();
        Depurar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Pmlist = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Iteraciones = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 153));
        jLabel1.setText("Generador de Pseudonumeros por P.M");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(255, 255, 51)));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Ingresa la Semilla X(0):");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingresa la Semilla Y(0):");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("( Y(0) > 1000 )");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("( X(0) > 1000 )");

        X0.setBackground(new java.awt.Color(0, 0, 0));
        X0.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        X0.setForeground(new java.awt.Color(255, 255, 255));
        X0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                X0KeyTyped(evt);
            }
        });

        Y0.setBackground(new java.awt.Color(0, 0, 0));
        Y0.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Y0.setForeground(new java.awt.Color(255, 255, 255));
        Y0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Y0KeyTyped(evt);
            }
        });

        Calcular.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        Depurar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Depurar.setText("Depurar");
        Depurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepurarActionPerformed(evt);
            }
        });

        Pmlist.setBackground(new java.awt.Color(0, 0, 0));
        Pmlist.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Pmlist.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(Pmlist);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ingresa el numero de Iteraciones:");

        Iteraciones.setBackground(new java.awt.Color(0, 0, 0));
        Iteraciones.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Iteraciones.setForeground(new java.awt.Color(255, 255, 255));
        Iteraciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IteracionesKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(135, 135, 135))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Y0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(X0, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Iteraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Calcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Depurar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(63, 63, 63))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(X0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(Calcular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Y0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(Iteraciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(Depurar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
    long psm1sm2 = 0;
    int ite,inicio,finial,sm1,sm2;
    String aux,zm1,zm2,it;
    zm1=X0.getText();
    zm2=Y0.getText();
    it=Iteraciones.getText();
    if(zm1.length()==0&&zm2.length()==0&&it.length()==0){
            X0.setText("");
            Y0.setText("");
            Iteraciones.setText("");  
        }
    try{
        sm1=Integer.parseInt(zm1);
        sm2=Integer.parseInt(zm2);
        ite=Integer.parseInt(it);
        
        if(sm1<=1000||sm2<=1000){
          getToolkit().beep();
           JOptionPane.showMessageDialog(this,"Las semillas tienen que ser mayor a 1000."); 
           X0.setText("");
           Y0.setText("");
           Iteraciones.setText("");  
        }else{
            for(int i=0;i<=ite;i++){
             try{
                psm1sm2=sm1*sm2;
                aux=""+psm1sm2;
                int total=aux.length();//8
                int media=total/2;//4
                inicio=(total-media)-2;
                finial=(total-(media/2));
                aux= aux.substring(inicio,finial);  
                LPM.addElement("\n\n("+i+"): X("+i+"): "+sm1+" Y("+i+"): "+sm2+" X * Y: "+psm1sm2+" Digitos: "+total+" Digitos Centro: "+aux+" Conjunto: 0."+aux);
                Pmlist.setModel(LPM);
                sm1=sm2;
                sm2=Integer.parseInt(aux);
                 
             }catch(java.lang.StringIndexOutOfBoundsException e){
                    JOptionPane.showMessageDialog(this,"El algoritmo se degenera en la semilla ("+i+"): "+psm1sm2); 
                    break;
                }  
            }
        }
        
        
        
    }catch(java.lang.NumberFormatException e){
         getToolkit().beep(); 
         JOptionPane.showMessageDialog(this,"Escribe algo");
         X0.setText("");
         Y0.setText("");
         Iteraciones.setText("");
        }
        
    }//GEN-LAST:event_CalcularActionPerformed

    private void DepurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepurarActionPerformed
       X0.setText("");
       Y0.setText("");
       Iteraciones.setText("");
       int eliminar=Pmlist.getSelectedIndex();
       LPM.removeAllElements();
    }//GEN-LAST:event_DepurarActionPerformed

    private void X0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_X0KeyTyped
         char alfa=evt.getKeyChar();
        if(Character.isLetter(alfa)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Ingresa un numero.");
        }
    }//GEN-LAST:event_X0KeyTyped

    private void Y0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Y0KeyTyped
         char beta=evt.getKeyChar();
        if(Character.isLetter(beta)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Ingresa un numero.");
        }
    }//GEN-LAST:event_Y0KeyTyped

    private void IteracionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IteracionesKeyTyped
         char gamma=evt.getKeyChar();
        if(Character.isLetter(gamma)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Ingresa un numero.");
        }
    }//GEN-LAST:event_IteracionesKeyTyped

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
            java.util.logging.Logger.getLogger(ClassPM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassPM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassPM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassPM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ClassPM().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JButton Depurar;
    private javax.swing.JTextField Iteraciones;
    private javax.swing.JList<String> Pmlist;
    private javax.swing.JTextField X0;
    private javax.swing.JTextField Y0;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
