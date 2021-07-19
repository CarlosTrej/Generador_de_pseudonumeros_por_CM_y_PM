//El_Charles_Trejo
package pkg666;

import javax.swing.DefaultListModel;
import java.lang.Math;
import javax.swing.JOptionPane;

public class ClassCM extends javax.swing.JFrame {
    
DefaultListModel LCM= new DefaultListModel();

    
    public ClassCM() {
        
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("\t\tGENERADOR DE PSEUDONUMEROS POR CUADROS MEDIOS.");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Cmlist = new javax.swing.JList<>();
        Calcular = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        Semilla = new javax.swing.JTextField();
        Iteraciones = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 102, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel1.setText("Generador de Pseudonumeros por C.M.");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153)));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Ingresa la semilla inicial  X(0):");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("( X(0) > 1000 )");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Ingresa el numero de iteraciones:");

        Cmlist.setBackground(new java.awt.Color(0, 0, 0));
        Cmlist.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(204, 0, 0), new java.awt.Color(204, 0, 0)));
        Cmlist.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Cmlist.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(Cmlist);

        Calcular.setBackground(new java.awt.Color(153, 153, 153));
        Calcular.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Calcular.setText("Calcular");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        Limpiar.setBackground(new java.awt.Color(204, 204, 204));
        Limpiar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Limpiar.setText("Depurar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        Semilla.setBackground(new java.awt.Color(0, 0, 0));
        Semilla.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Semilla.setForeground(new java.awt.Color(255, 255, 255));
        Semilla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0)));
        Semilla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SemillaKeyTyped(evt);
            }
        });

        Iteraciones.setBackground(new java.awt.Color(0, 0, 0));
        Iteraciones.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Iteraciones.setForeground(new java.awt.Color(255, 255, 255));
        Iteraciones.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0)));
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Semilla, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Iteraciones)
                                .addGap(205, 205, 205)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Limpiar)
                            .addComponent(Calcular))
                        .addGap(148, 148, 148)))
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Semilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Calcular))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Iteraciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Limpiar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        int sm1,ite,inicio,finial;
        String sm,it,aux;
        long square;
        sm=Semilla.getText();
        it=Iteraciones.getText();
        //Valida si hay algo escrito en el Textfile
        if(sm.length()==0&&it.length()==0){
           
            
            Semilla.setText("");
            Iteraciones.setText("");  
        }
        try{
           sm1=Integer.parseInt(sm);
           ite=Integer.parseInt(it);
        //Valida si la semilla es mayor a 4 digitos.
        if(sm1<=1000){
           getToolkit().beep();
           JOptionPane.showMessageDialog(this,"La semilla tiene que ser mayor a 1000."); 
           Semilla.setText("");
           Iteraciones.setText("");
        } 
        //Calcula la semilla
        else{
            for(int i=0;i<=ite;i++){
                try{
                square = (long)Math.pow(sm1,2);
                aux=" "+square;
                int total=aux.length()-1;//8
                int media=total/2;//4
                inicio=(total-media)-1;
                finial=(total-(media/2)+1);
                aux= aux.substring(inicio,finial);
                if(square%2==0){
                    LCM.addElement("\n\t X("+i+"): "+sm1+"\t\t\t   X("+i+")^2: "+square+"\t\t\t   Digitos: "+total+"\n\n\n\t Digitos del centro: "+aux+"\t\t\t Conjunto: 0."+aux);
                    Cmlist.setModel(LCM);
                }else{
                    total=total*0;
                    LCM.addElement("\n\t X("+i+"): "+sm1+"\t\t\t   X("+i+")^2: "+square+"\t\t\t   Digitos: "+total+"\n\n\n\t Digitos del centro: "+aux+"\t\t\t Conjunto: 0."+aux);
                    Cmlist.setModel(LCM);
                }
                sm1 = Integer.parseInt(aux);
                }catch(java.lang.NumberFormatException e){
                    JOptionPane.showMessageDialog(this,"El algoritmo se degenera en la semilla X("+i+"): "+sm1); 
                    break;
                }
                  
            }
        }
        }catch(java.lang.NumberFormatException e){
         getToolkit().beep(); 
         JOptionPane.showMessageDialog(this,"Escribe algo");
         Semilla.setText("");
         Iteraciones.setText("");
        }
        
    }//GEN-LAST:event_CalcularActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
       Semilla.setText("");
       Iteraciones.setText("");
       int eliminar=Cmlist.getSelectedIndex();
       LCM.removeAllElements();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void SemillaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SemillaKeyTyped
        char alfa=evt.getKeyChar();
        if(Character.isLetter(alfa)){
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(this,"Ingresa un numero.");
        }
        
    }//GEN-LAST:event_SemillaKeyTyped

    private void IteracionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IteracionesKeyTyped
          char beta=evt.getKeyChar();
        if(Character.isLetter(beta)){
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
            java.util.logging.Logger.getLogger(ClassCM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClassCM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClassCM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClassCM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ClassCM().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JList<String> Cmlist;
    private javax.swing.JTextField Iteraciones;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField Semilla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
