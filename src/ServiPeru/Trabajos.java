/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ServiPeru;

import static ServiPeru.InicioEmpleados.codigo;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marti
 */
public class Trabajos extends javax.swing.JPanel {

    /**
     * Creates new form Trabajos
     */
    public void tipos() throws SQLException{ 
        MetodoConexion pb=new MetodoConexion();
        
        java.sql.Statement st=pb.getConexion().createStatement();
        String Consulta = "select Tipo from TipoDeServicio";
        ResultSet res = st.executeQuery(Consulta);
        while(res.next()){
            String Tip = res.getString("Tipo");
            Tipo.addItem(Tip);
        }
        st.close();
    }
    public void nombreE() throws SQLException{ 
        MetodoConexion pb=new MetodoConexion();
        
        java.sql.Statement st=pb.getConexion().createStatement();
        String Consulta = "select Nombre from Empresas";
        ResultSet res = st.executeQuery(Consulta);
        while(res.next()){
            String emp = res.getString("Nombre");
            Empresa.addItem(emp);
        }
        st.close();
    }
    public void servi() throws SQLException{ 
        MetodoConexion pb=new MetodoConexion();
        
        java.sql.Statement st=pb.getConexion().createStatement();
        DefaultTableModel Traba=new DefaultTableModel();
        Traba.addColumn("Codigo");
        Traba.addColumn("Nombre de la empresa");
        Traba.addColumn("Tipo de servicio");
        Traba.addColumn("Fecha de realizacion");
        Traba.addColumn("Lugar de realizacion");
        TrabaRe.setModel(Traba);
        String [] datos = new String [5];
        String Consulta = "select Servicio.Codigo,Nombre,[Tipo de servicio],[Fecha de realizacion],[Lugar de realizacion] from Servicio \n" +
                        "inner join Empresas on Servicio.CodigoEmpresa=Empresas.Codigo";
        ResultSet res = st.executeQuery(Consulta);
        while(res.next()){
            datos [0]= String.valueOf(res.getInt(1));
            datos [1]= res.getString(2);
            datos [2]= res.getString(3);
            datos [3]= res.getString(4);
            datos [4]= res.getString(5);
            Traba.addRow(datos);
        }
        st.close();
    }
    public void serviaRea() throws SQLException{ 
        MetodoConexion pb=new MetodoConexion();
        
        java.sql.Statement st=pb.getConexion().createStatement();
        DefaultTableModel Traba=new DefaultTableModel();
        Traba.addColumn("Codigo");
        Traba.addColumn("Nombre de la empresa");
        Traba.addColumn("Tipo de trabajo");
        Traba.addColumn("Fecha de realizacion");
        Traba.addColumn("Lugar de realizacion");
        Trabapor.setModel(Traba);
        String [] datos = new String [5];
        String Consulta = "select e.Codigo,[Nombre],[Tipo de servicio],[Fecha de realizacion],[Lugar de realizacion] from ServiciosARealizar e\n" +
                        "inner join Empresas on e.[Codigo de empresa] = Empresas.Codigo\n" +
                          "order by [Fecha de realizacion]";
        ResultSet res = st.executeQuery(Consulta);
        while(res.next()){
            datos [0]= String.valueOf(res.getInt(1));
            datos [1]= res.getString(2);
            datos [2]= res.getString(3);
            datos [3]= res.getString(4);
            datos [4]= res.getString(5);
            Traba.addRow(datos);
        }
        st.close();
    }
    public void serviaRea2() throws SQLException{ 
        MetodoConexion pb=new MetodoConexion();
        
        java.sql.Statement st=pb.getConexion().createStatement();
        DefaultTableModel Traba=new DefaultTableModel();
        Traba.addColumn("Codigo");
        Traba.addColumn("Nombre de la empresa");
        Traba.addColumn("Tipo de trabajo");
        Traba.addColumn("Fecha de realizacion");
        Traba.addColumn("Lugar de realizacion");
        Nuevotrabajo.setModel(Traba);
        String [] datos = new String [5];
        String Consulta = "select e.Codigo,[Nombre],[Tipo de servicio],[Fecha de realizacion],[Lugar de realizacion] from ServiciosARealizar e\n" +
                        "inner join Empresas on e.[Codigo de empresa] = Empresas.Codigo\n" +
                          "order by [Fecha de realizacion]";
        ResultSet res = st.executeQuery(Consulta);
        while(res.next()){
            datos [0]= String.valueOf(res.getInt(1));
            datos [1]= res.getString(2);
            datos [2]= res.getString(3);
            datos [3]= res.getString(4);
            datos [4]= res.getString(5);
            Traba.addRow(datos);
        }
        st.close();
    }
    public Trabajos() throws SQLException {
        initComponents();
        tipos();
        nombreE();
        servi();
        serviaRea();
        serviaRea2();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Trabapor = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TrabaRe = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Nuevotrabajo = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        Empresa = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Tipo = new javax.swing.JComboBox<>();
        Lugar = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jLabel24 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Thin", 1, 20)); // NOI18N
        jLabel1.setText("Trabajos por realizar");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 33, -1, -1));

        Trabapor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Trabapor);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 950, 260));

        jLabel2.setFont(new java.awt.Font("Roboto Thin", 1, 20)); // NOI18N
        jLabel2.setText("Trabajos realizados");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        TrabaRe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(TrabaRe);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 950, 300));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Trabajos", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Roboto Thin", 1, 20)); // NOI18N
        jLabel3.setText("Ingresar un nuevo trabajo ");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 28, -1, -1));

        Nuevotrabajo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(Nuevotrabajo);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 930, 330));

        jLabel4.setFont(new java.awt.Font("Roboto Thin", 1, 15)); // NOI18N
        jLabel4.setText("Fecha (YYYY MM DD)");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 580, -1, -1));

        Empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpresaActionPerformed(evt);
            }
        });
        jPanel3.add(Empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 180, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Thin", 1, 15)); // NOI18N
        jLabel5.setText("Nombre de la empresa");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, -1, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Thin", 1, 15)); // NOI18N
        jLabel6.setText("Tipo de servicio");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, -1, -1));

        jPanel3.add(Tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 180, -1));

        Lugar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        Lugar.setForeground(new java.awt.Color(204, 204, 204));
        Lugar.setText("Lugar de realizacion");
        Lugar.setBorder(null);
        Lugar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                LugarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                LugarFocusLost(evt);
            }
        });
        jPanel3.add(Lugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 540, 180, 20));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 600, 180, 20));

        jLabel7.setFont(new java.awt.Font("Roboto Thin", 1, 15)); // NOI18N
        jLabel7.setText("Lugar de realizacion");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, 180, 20));

        jPanel5.setBackground(new java.awt.Color(255, 153, 0));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Agregar a trabajos por realizar");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 660, 310, 40));

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 580, 180, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Nuevo trabajo", jPanel2);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Roboto Thin", 1, 20)); // NOI18N
        jLabel9.setText("Trabajos por realizar");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jPanel7.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 1210, 290));

        jLabel10.setFont(new java.awt.Font("Roboto Thin", 1, 15)); // NOI18N
        jLabel10.setText("Hora de finalizacion");
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 760, -1, -1));

        jLabel12.setFont(new java.awt.Font("Roboto Thin", 1, 15)); // NOI18N
        jLabel12.setText("Medida");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 660, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel7.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 510, 190, -1));

        jTextField3.setText("jTextField3");
        jPanel7.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 190, -1));

        jTextField4.setFont(new java.awt.Font("Roboto Thin", 1, 15)); // NOI18N
        jTextField4.setText("Codigo");
        jTextField4.setBorder(null);
        jPanel7.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 390, 120, -1));

        jLabel13.setFont(new java.awt.Font("Roboto Thin", 1, 15)); // NOI18N
        jLabel13.setText("Datos del servicio de codigo ");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel7.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 490, -1));

        jLabel11.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel11.setText("Casos especiales");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 630, -1, -1));

        jLabel14.setFont(new java.awt.Font("Roboto Thin", 1, 15)); // NOI18N
        jLabel14.setText("Nombre del supersisor");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 510, -1, -1));

        jTextField5.setText("jTextField5");
        jPanel7.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 550, 190, -1));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel15.setText("Horario de realizacion");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 700, -1, -1));

        jLabel16.setFont(new java.awt.Font("Roboto Thin", 1, 15)); // NOI18N
        jLabel16.setText("Tarifa");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 730, -1, -1));

        jTextField6.setText("jTextField6");
        jPanel7.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 620, 190, -1));

        jLabel17.setFont(new java.awt.Font("Roboto Thin", 1, 15)); // NOI18N
        jLabel17.setText("Material");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 620, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel7.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 660, 80, -1));

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel18.setText("Datos del material");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, -1, -1));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel7.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 720, 490, 20));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel7.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 610, 490, 20));

        jLabel19.setFont(new java.awt.Font("Roboto Thin", 1, 15)); // NOI18N
        jLabel19.setText("Numero del supersisor");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, -1, -1));

        jTextField7.setText("jTextField7");
        jPanel7.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 730, 140, -1));

        jLabel20.setFont(new java.awt.Font("Roboto Thin", 1, 15)); // NOI18N
        jLabel20.setText("Hora de inicio");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 730, -1, -1));

        jTextField8.setText("jTextField8");
        jPanel7.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 760, 140, -1));

        jLabel21.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel21.setText("Datos de la empresa");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, -1, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel7.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 650, 490, 10));

        jLabel22.setFont(new java.awt.Font("Roboto Thin", 1, 15)); // NOI18N
        jLabel22.setText("Nombre de la empresa");
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, -1, -1));

        jTextField9.setText("jTextField9");
        jPanel7.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 470, -1, -1));

        jLabel23.setFont(new java.awt.Font("Roboto Thin", 1, 15)); // NOI18N
        jLabel23.setText("Numero de operarios");
        jPanel7.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 470, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("jRadioButton2");
        jPanel7.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 510, -1, -1));

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("jRadioButton3");
        jPanel7.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 530, -1, -1));

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("jRadioButton4");
        jPanel7.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 550, -1, -1));

        jRadioButton5.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setText("jRadioButton5");
        jPanel7.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 570, -1, -1));

        jRadioButton6.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setText("jRadioButton6");
        jPanel7.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 590, -1, -1));

        jRadioButton7.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton7.setText("jRadioButton7");
        jPanel7.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 510, -1, -1));

        jRadioButton8.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton8.setText("jRadioButton8");
        jPanel7.add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 530, -1, -1));

        jRadioButton9.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton9.setText("jRadioButton9");
        jPanel7.add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 550, -1, -1));

        jRadioButton10.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton10.setText("jRadioButton10");
        jPanel7.add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 570, -1, -1));

        jRadioButton11.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton11.setText("jRadioButton11");
        jPanel7.add(jRadioButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 590, -1, -1));

        jLabel24.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel24.setText("Datos de operarios");
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 430, -1, -1));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel7.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, 490, 10));

        jLabel25.setFont(new java.awt.Font("Roboto Thin", 1, 15)); // NOI18N
        jLabel25.setText("Operarios");
        jPanel7.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 510, -1, -1));

        jLabel26.setFont(new java.awt.Font("Roboto Thin", 1, 15)); // NOI18N
        jLabel26.setText("Dsitancia recorrida");
        jPanel7.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 670, -1, -1));

        jTextField10.setText("jTextField10");
        jPanel7.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 670, 90, -1));

        jTextField11.setText("jTextField11");
        jPanel7.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 700, -1, -1));

        jLabel27.setFont(new java.awt.Font("Roboto Thin", 1, 15)); // NOI18N
        jLabel27.setText("Accidentes recorridos");
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 700, -1, -1));

        jTextField12.setText("jTextField12");
        jPanel7.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 730, -1, -1));

        jPanel8.setBackground(new java.awt.Color(255, 153, 0));

        jLabel28.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Cambiar trabajo a  ya realizado");
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 770, 320, 30));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cambiar a trabajos ya realizados", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpresaActionPerformed
    public int codigo1() throws SQLException{ 
        MetodoConexion pb=new MetodoConexion();
        
        java.sql.Statement st=pb.getConexion().createStatement();
        int U=0;
        int P=0;
        int Codigo = 0;
        String Consulta = "select Codigo from ServiciosARealizar";
        while (U==0){
        Double Codigo2 = (Math.random()*(60000-10000)+10000);
        Codigo = (int) Math.floor(Codigo2);
        ResultSet res = st.executeQuery(Consulta);
            while(res.next()){
            int cod = res.getInt("Codigo");
            if (Codigo == cod){ 
            break;
            }
        P=1;
        }
        if(P==1){
        U=1;
            }  
        }
    st.close();
    return Codigo;
    }
    public int codigo2() throws SQLException{ 
        MetodoConexion pb=new MetodoConexion();
        
        java.sql.Statement st=pb.getConexion().createStatement();
        int Codigo3 =0;
        String NombreEm = Empresa.getSelectedItem().toString();
        String Consulta = "select Nombre,Codigo from Empresas";;
        ResultSet res = st.executeQuery(Consulta);
        while(res.next()){
        int CodigoEmpresa = res.getInt("Codigo");
        String Nombre = res.getString("Nombre");
        if(Nombre.equals(NombreEm)){
            Codigo3=CodigoEmpresa;
        }
        }
        st.close();
        return Codigo3;
    }
    public void nuevotrabajo(int c, int b) throws SQLException{ 
        MetodoConexion pb=new MetodoConexion();
        
        java.sql.Statement st=pb.getConexion().createStatement();
        String Fecha = jFormattedTextField1.getText();
        String Lugar = this.Lugar.getText();
        String tipo = Tipo.getSelectedItem().toString();
        String Consulta = "insert into ServiciosARealizar values("+c+","+b+",'"+tipo+"','"+Fecha+"','"+Lugar+"')";
        ResultSet res = st.executeQuery(Consulta);
        while(res.next()){
        JOptionPane.showMessageDialog(null, "Nuevo trabajo agregado");
        }
        st.close();
    }
    public void actualizar() throws SQLException{ 
        MetodoConexion pb=new MetodoConexion();
        
        java.sql.Statement st=pb.getConexion().createStatement();
        DefaultTableModel Traba=new DefaultTableModel();
        Traba.addColumn("Codigo");
        Traba.addColumn("Nombre de la empresa");
        Traba.addColumn("Tipo de trabajo");
        Traba.addColumn("Fecha de realizacion");
        Traba.addColumn("Lugar de realizacion");
        Nuevotrabajo.setModel(Traba);
        String [] datos = new String [5];
        String Consulta = "select e.Codigo,[Nombre],[Tipo de servicio],[Fecha de realizacion],[Lugar de realizacion] from ServiciosARealizar e\n" +
                        "inner join Empresas on e.[Codigo de empresa] = Empresas.Codigo\n" +
                          "order by [Fecha de realizacion]";
        ResultSet res = st.executeQuery(Consulta);
        while(res.next()){
            datos [0]= String.valueOf(res.getInt(1));
            datos [1]= res.getString(2);
            datos [2]= res.getString(3);
            datos [3]= res.getString(4);
            datos [4]= res.getString(5);
            Traba.addRow(datos);
        }
    st.close();
    }
    
    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        int codigo = 0;
        try {
            codigo = codigo1();
        } catch (SQLException ex) {
            Logger.getLogger(Trabajos.class.getName()).log(Level.SEVERE, null, ex);
        }
        int codigo3 = 0;
        try {
            codigo3 = codigo2();
        } catch (SQLException ex) {
            Logger.getLogger(Trabajos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            nuevotrabajo(codigo, codigo3);
        } catch (SQLException ex) {
            Logger.getLogger(Trabajos.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            actualizar();
        } catch (SQLException ex) {
            Logger.getLogger(Trabajos.class.getName()).log(Level.SEVERE, null, ex);
        }
    
       
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    private void LugarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LugarFocusGained
        // TODO add your handling code here:
        if(Lugar.getText().equals("Lugar de realizacion")){
        Lugar.setText("");
        Lugar.setForeground(Color.black);
        }
    }//GEN-LAST:event_LugarFocusGained

    private void LugarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_LugarFocusLost
        // TODO add your handling code here:
        if(Lugar.getText().isEmpty()){
        Lugar.setText("Lugar de realizacion");
        Lugar.setForeground(Color.gray);
        }
    }//GEN-LAST:event_LugarFocusLost
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Empresa;
    private javax.swing.JTextField Lugar;
    private javax.swing.JTable Nuevotrabajo;
    private javax.swing.JComboBox<String> Tipo;
    private javax.swing.JTable TrabaRe;
    private javax.swing.JTable Trabapor;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
