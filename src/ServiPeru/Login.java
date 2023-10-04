/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ServiPeru;


import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;

/**
 *
 * @author marti
 */
public class Login extends javax.swing.JFrame {

    int xMouse,ymouse; 
    String Cargo;
    public int Usuario2;
    public Login() {
        
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Img/Logo.png")).getImage());
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botoncerrar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Credenciales = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        Contraseña = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Botoniniciar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Operaciones y logistica Servi Peru");
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botoncerrar.setBackground(new java.awt.Color(255, 153, 0));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("X");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });

        javax.swing.GroupLayout botoncerrarLayout = new javax.swing.GroupLayout(botoncerrar);
        botoncerrar.setLayout(botoncerrarLayout);
        botoncerrarLayout.setHorizontalGroup(
            botoncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botoncerrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        botoncerrarLayout.setVerticalGroup(
            botoncerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botoncerrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(botoncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, 40, 40));

        Credenciales.setFont(new java.awt.Font("Roboto Thin", 0, 13)); // NOI18N
        Credenciales.setForeground(new java.awt.Color(255, 255, 255));
        Credenciales.setText("Crenciales Invalidad");
        jPanel1.add(Credenciales, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 260, 20));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Logo.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 280, 280));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Haettenschweiler", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Servi Peru");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 40));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setText("Iniciar Secion");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        Usuario.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        Usuario.setForeground(new java.awt.Color(204, 204, 204));
        Usuario.setText("Ingrese su nombre de usuario");
        Usuario.setBorder(null);
        Usuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                UsuarioFocusGained(evt);
            }
        });
        Usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                UsuarioMousePressed(evt);
            }
        });
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 260, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 260, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 260, 10));

        Contraseña.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        Contraseña.setForeground(new java.awt.Color(204, 204, 204));
        Contraseña.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Contraseña.setText("**********");
        Contraseña.setBorder(null);
        Contraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ContraseñaMousePressed(evt);
            }
        });
        Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 260, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 110, 30));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        jLabel3.setText("Usuario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 106, 110, 30));

        Botoniniciar.setBackground(new java.awt.Color(255, 153, 0));
        Botoniniciar.setToolTipText("");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Ingresar");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });

        javax.swing.GroupLayout BotoniniciarLayout = new javax.swing.GroupLayout(Botoniniciar);
        Botoniniciar.setLayout(BotoniniciarLayout);
        BotoniniciarLayout.setHorizontalGroup(
            BotoniniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        BotoniniciarLayout.setVerticalGroup(
            BotoniniciarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(Botoniniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_UsuarioFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioFocusGained

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioActionPerformed

    private void ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñaActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed

        xMouse= evt.getX();
        ymouse= evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - ymouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseEntered
        
        botoncerrar.setBackground(Color.red);
    }//GEN-LAST:event_jLabel8MouseEntered

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        botoncerrar.setBackground(new Color(255, 153, 0));
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        Botoniniciar.setBackground(new Color(255,204,0));
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        // TODO add your handling code here:
        Botoniniciar.setBackground(new Color(255, 153, 0));
    }//GEN-LAST:event_jLabel7MouseExited

    private void UsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsuarioMousePressed
        // TODO add your handling code here:
        Credenciales.setForeground(Color.white);
        if(Usuario.getText().equals("Ingrese su nombre de usuario")){
        Usuario.setText("");
        Usuario.setForeground(Color.black);
        }
        if(String.valueOf(Contraseña.getPassword()).isEmpty()){
        Contraseña.setText("**********");
        Contraseña.setForeground(Color.gray);
        }
    }//GEN-LAST:event_UsuarioMousePressed

    private void ContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContraseñaMousePressed
        // TODO add your handling code here:
        Credenciales.setForeground(Color.white);
        if(String.valueOf(Contraseña.getPassword()).equals("**********")){
        Contraseña.setText("");
        Contraseña.setForeground(Color.black);
        }
        if(Usuario.getText().isEmpty()){
        Usuario.setText("Ingrese su nombre de usuario");
        Usuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_ContraseñaMousePressed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
    try {
    //Cargar driver
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    //Conectar con la base de datos
    String url="jdbc:sqlserver://localhost:1433;databaseName=ServiPeru";
    Connection con=DriverManager.getConnection(url, "Martin", "8326");
    //
    Statement st=con.createStatement();
    //Ejecutar consulta
    String Consulta = "select Codigo,Usuario,Contraseña,Cargo from Usuarios";
    ResultSet res = st.executeQuery(Consulta);
    // prueba de inicio de secion
    String usu = Usuario.getText();
    String Contra = String.valueOf(Contraseña.getPassword());
    int u = 1;
    while(res.next()){
        String DatoU= res.getString("Usuario");
        String DatoC= res.getString("Contraseña");
        String DatoE = res.getString("Cargo"); 
        int cod = res.getInt("Codigo"); 
        if(DatoU.equals(usu) && DatoC.contains(Contra)){
            Usuario2=cod;
            Cargo = DatoE;
            u=0;
            if(Cargo.equals("Administracion")){
              Administracion ad=new Administracion();
              ad.setVisible(true);
              this.dispose();
            }else if(Cargo.equals("Dueño")){
              Dueño due=new Dueño();
              due.setVisible(true);
              this.dispose();
            }else if(Cargo.equals("Empleados")){
              Empleado emp=new Empleado();
              InicioEmpleados inc=new InicioEmpleados();
              inc.Codigo2(Usuario2);
              emp.Codigo (Usuario2);
              emp.setVisible(true);
              this.dispose();
            }else if(Cargo.equals("Desarrollador")){
              Dueño due=new Dueño();
              due.setVisible(true);
              this.dispose();
            }
            break;
        }
    }
    if(u ==1){
        Contraseña.setText("**********");
        Contraseña.setForeground(Color.gray);
        Usuario.setText("Ingrese su nombre de usuario");
        Usuario.setForeground(Color.gray);
        Credenciales.setForeground(Color.red);
    }
    //Cerrar conexion
    st.close();
    con.close();
    }catch (ClassNotFoundException e){
    e.printStackTrace();
    }catch (SQLException e){
        e.printStackTrace();
    }
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1MousePressed

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Botoniniciar;
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JLabel Credenciales;
    private javax.swing.JTextField Usuario;
    private javax.swing.JPanel botoncerrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
