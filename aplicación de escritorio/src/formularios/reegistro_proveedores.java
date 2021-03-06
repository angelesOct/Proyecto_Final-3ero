/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;
import conectar_almacen.Database; //llamamos la conexion a la BD para almacen
import static conectar_almacen.Database.getConexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author fanny
 */
public class reegistro_proveedores extends javax.swing.JFrame {
    DefaultTableModel model;
    private Connection conexion;     
    private Statement st;     
    private ResultSet rs;
    PreparedStatement ps;
    /**
     * Creates new form reegistro_proveedores
     */
    public reegistro_proveedores() {
        initComponents();
        mostrar();
        Conectar();
        limpiar();
        
        int id=0; // igualamos el TextField ID a cero para poder ingregar datos y modificarlos
        this.jtf_id.setText(String.valueOf(id)); // el TextField ID no se ra visible para el usuario
        jl_id.setVisible(false);
        jtf_id.setVisible(false);
        
        
    }
    public void Conectar(){
             try{ 
                conexion=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/fazuca","root","");                     
                st=conexion.createStatement(); 
                rs=st.executeQuery("Select * from proveedores");
                        
                rs.first();
                
               
            }catch(SQLException err){ 
                JOptionPane.showMessageDialog(null,"Error "+err.getMessage()); 
            } 

    }
    
    private void mostrar() {
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet rs = Database.getTabla("select* from proveedores");
        modelo.setColumnIdentifiers(new Object[]{"codigo proveedor","nombre", "apellido paterno", "apellido materno","telefono", "correo", "municipio", "calle", "colonia"});
        try {
            while (rs.next()) {
                // añade los resultado a al modelo de tabla
                modelo.addRow(new Object[]{
                    rs.getString("codigo_p"),
                    rs.getString("nombre_proveedores"),
                    rs.getString("apellido_paterno_p"), 
                    rs.getString("apellido_materno_p"), 
                    rs.getString("telefono_p"), 
                    rs.getString("correo_p"),
                    rs.getString("municipio_p"),
                    rs.getString("calle_p"),
                    rs.getString("colonia_p")});                                    
            }
            // asigna el modelo a la tabla
            jt_proveedores.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    public void limpiar(){
        int id=0;
        String nombres="";
        String apellP="";
        String apellM="";
        String telefono="";
        String correo="";
        String municipio="";
        String calle="";
        String colonia="";
        this.jtf_id.setText(String.valueOf(id));
        this.jtf_nombres.setText(String.valueOf(nombres));
        this.jtf_apellP.setText(String.valueOf(apellP));
        this.jtf_apellM.setText(String.valueOf(apellM));
        this.jtf_telefono.setText(String.valueOf(telefono));
        this.jtf_correo.setText(String.valueOf(correo));
        this.jtf_municipio.setText(String.valueOf(municipio));
        this.jtf_calle.setText(String.valueOf(calle));
        this.jtf_colonia.setText(String.valueOf(colonia));
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
        jLabel4 = new javax.swing.JLabel();
        jtf_correo = new javax.swing.JTextField();
        jtf_municipio = new javax.swing.JTextField();
        jtf_calle = new javax.swing.JTextField();
        jtf_colonia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jtf_nombres = new javax.swing.JTextField();
        jtf_apellP = new javax.swing.JTextField();
        jtf_telefono = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtf_apellM = new javax.swing.JTextField();
        jl_id = new javax.swing.JLabel();
        jtf_id = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtf_buscartodo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jb_modificar = new javax.swing.JButton();
        jb_guardar = new javax.swing.JButton();
        jb_limpiar = new javax.swing.JButton();
        jb_borrar = new javax.swing.JButton();
        jb_salir = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_proveedores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de Proveedores");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addContainerGap(797, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nombre(s):");

        jtf_calle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_calleActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Apellido paterno:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Telefono:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Correo:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Calle:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Colonia:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Municipio:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Apellido materno:");

        jl_id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jl_id.setText("ID");

        jtf_id.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtf_calle, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jl_id)
                                .addGap(21, 21, 21)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_apellP)
                            .addComponent(jtf_apellM, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtf_telefono, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtf_correo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtf_municipio)
                            .addComponent(jtf_nombres)
                            .addComponent(jtf_colonia)
                            .addComponent(jtf_id, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jl_id, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtf_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtf_apellP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtf_apellM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtf_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtf_municipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtf_calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtf_colonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 102, 255));
        jLabel11.setText("BUSCAR");

        jtf_buscartodo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf_buscartodoKeyPressed(evt);
            }
        });

        jb_modificar.setBackground(new java.awt.Color(0, 102, 255));
        jb_modificar.setForeground(new java.awt.Color(255, 255, 255));
        jb_modificar.setText("Modificar");
        jb_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_modificarMouseClicked(evt);
            }
        });

        jb_guardar.setBackground(new java.awt.Color(0, 102, 204));
        jb_guardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jb_guardar.setForeground(new java.awt.Color(255, 255, 255));
        jb_guardar.setText("Guardar");
        jb_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardarMouseClicked(evt);
            }
        });

        jb_limpiar.setBackground(new java.awt.Color(0, 102, 255));
        jb_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        jb_limpiar.setText("limpiar");
        jb_limpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_limpiarMouseClicked(evt);
            }
        });
        jb_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_limpiarActionPerformed(evt);
            }
        });

        jb_borrar.setBackground(new java.awt.Color(0, 102, 255));
        jb_borrar.setForeground(new java.awt.Color(255, 255, 255));
        jb_borrar.setText("Borrar");
        jb_borrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_borrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jb_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jb_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jb_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jb_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/160_F_42459916_Yt7cH133dIcZbaIVMtkEanlXnOG149ZT.png"))); // NOI18N
        jb_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirMouseClicked(evt);
            }
        });

        jt_proveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "codigo proveedor", "Nombre", "Apellido paterno", "Apellido materno", "Telefono", "Correo", "Municipio", "calle", "colonia"
            }
        ));
        jt_proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_proveedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_proveedores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(86, 86, 86)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtf_buscartodo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(78, 78, 78)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jb_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 785, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_buscartodo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jb_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_calleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_calleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_calleActionPerformed

    private void jtf_buscartodoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_buscartodoKeyPressed

        String[] titulos = {"codigo proveedor","nombre", "apellido paterno", "apellido materno","telefono", "correo", "municipio", "calle", "colonia"};
        String[] registros = new String[50];

        String sql = "select*from proveedores WHERE codigo_P LIKE '%" + jtf_buscartodo.getText() + "%' "
        + "OR nombre_proveedores LIKE '%" + jtf_buscartodo.getText() + "%'"
        + "OR apellido_paterno_p LIKE '%" + jtf_buscartodo.getText() + "%'"
        + "OR apellido_materno_p LIKE '%" + jtf_buscartodo.getText() + "%'"
        + "OR telefono_p LIKE '%" + jtf_buscartodo.getText() + "%'"
        + "OR correo_p LIKE '%" + jtf_buscartodo.getText() + "%'"
        + "OR municipio_p LIKE '%" + jtf_buscartodo.getText() + "%'"
        + "OR calle_p LIKE '%" + jtf_buscartodo.getText() + "%'"
        + "OR colonia_p LIKE '%" + jtf_buscartodo.getText() + "%'";
        model = new DefaultTableModel(null, titulos);
        Database cc = new Database();
        Connection cn = getConexion();
        try {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("codigo_P");
                registros[1] = rs.getString("nombre_proveedores");
                registros[2] = rs.getString("apellido_paterno_p");
                registros[3] = rs.getString("apellido_materno_p");
                registros[4] = rs.getString("telefono_p");
                registros[5] = rs.getString("correo_p");
                registros[6] = rs.getString("municipio_p");
                registros[7] = rs.getString("calle_p");
                registros[8] = rs.getString("colonia_p");
                model.addRow(registros);
            }
            jt_proveedores.setModel(model);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error00"+ ex);
        }
    }//GEN-LAST:event_jtf_buscartodoKeyPressed

    private void jb_borrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_borrarMouseClicked
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar el registro?");
        if(JOptionPane.OK_OPTION==confirmar) {
            try{ 
               int id=Integer.parseInt(this.jtf_id.getText()); 
               st.executeUpdate("delete from proveedores where codigo_P="+id+";");

               JOptionPane.showMessageDialog(null,"Registro Borrado");

               st.executeQuery("select * from proveedores");


           } catch(Exception err){ 
                JOptionPane.showMessageDialog(null,"Error "+err.getMessage()); 
            }
            mostrar();
            Conectar();
            limpiar();
       }
    }//GEN-LAST:event_jb_borrarMouseClicked

    private void jb_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirMouseClicked
        menu menu = new menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_salirMouseClicked

    private void jt_proveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_proveedoresMouseClicked
        int rec = this.jt_proveedores.getSelectedRow();
        this.jtf_id.setText(jt_proveedores.getValueAt(rec, 0).toString());
        this.jtf_nombres.setText(jt_proveedores.getValueAt(rec, 1).toString());
        this.jtf_apellP.setText(jt_proveedores.getValueAt(rec, 2).toString());
        this.jtf_apellM.setText(jt_proveedores.getValueAt(rec, 3).toString());
        this.jtf_telefono.setText(jt_proveedores.getValueAt(rec, 4).toString());
        this.jtf_correo.setText(jt_proveedores.getValueAt(rec, 5).toString());
        this.jtf_municipio.setText(jt_proveedores.getValueAt(rec, 6).toString());
        this.jtf_calle.setText(jt_proveedores.getValueAt(rec, 7).toString());
        this.jtf_colonia.setText(jt_proveedores.getValueAt(rec, 8).toString());
    }//GEN-LAST:event_jt_proveedoresMouseClicked

    private void jb_limpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_limpiarMouseClicked
       limpiar();
    }//GEN-LAST:event_jb_limpiarMouseClicked

    private void jb_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_limpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_limpiarActionPerformed

    private void jb_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardarMouseClicked
        try{ 
            int id=Integer.parseInt(this.jtf_id.getText());
            if (id == 0){
                String nombre=this.jtf_nombres.getText(); 
                String apellP=this.jtf_apellP.getText(); 
                String apellM=this.jtf_apellM.getText();
                String telefono=this.jtf_telefono.getText();
                String correo=this.jtf_correo.getText();
                String municipio=this.jtf_municipio.getText();
                String calle=this.jtf_calle.getText();
                String colonia=this.jtf_colonia.getText();
                
                st.executeUpdate("Insert into proveedores (nombre_proveedores,apellido_paterno_p,apellido_materno_p,telefono_p,correo_p,municipio_p,calle_p,colonia_p) values ('"+ nombre +"','"+apellP+"','"+apellM+"','"+telefono+"','"+correo+"','"+municipio+"','"+calle+"','"+colonia+"');"); 
                JOptionPane.showMessageDialog(null,"Guardado con exito "); 
            }
            mostrar();
            Conectar();
            limpiar();
        } catch(Exception err) 
        { 
            JOptionPane.showMessageDialog(null,"Error "+err.getMessage()); 
        } 

    }//GEN-LAST:event_jb_guardarMouseClicked

    private void jb_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_modificarMouseClicked
        int confirmar = JOptionPane.showConfirmDialog(null, "¿Esta seguro de modificar el registro?");
        if(JOptionPane.OK_OPTION==confirmar) {
            try{ 
               int id=Integer.parseInt(this.jtf_id.getText());
               if (id > 0){
                   String nombre=this.jtf_nombres.getText(); 
                   String apellP=this.jtf_apellP.getText(); 
                   String apellM=this.jtf_apellM.getText();
                   String telefono=this.jtf_telefono.getText();
                   String correo=this.jtf_correo.getText();
                   String municipio=this.jtf_municipio.getText();
                   String calle=this.jtf_calle.getText();
                   String colonia=this.jtf_colonia.getText();

                   st.executeUpdate("UPDATE proveedores SET nombre_proveedores='"+nombre+"',apellido_paterno_p='"+apellP+"',apellido_materno_P='"+apellM+"',telefono_p='"+telefono+"',correo_p='"+correo+"',municipio_p='"+municipio+"',calle_p='"+calle+"',colonia_p='"+colonia+"' WHERE codigo_p='"+id+"';");
                   JOptionPane.showMessageDialog(this,"El registro se modifico correctamente");

                   

               }
               mostrar();
               Conectar();
               limpiar();
           } catch(Exception err) 
           { 
               JOptionPane.showMessageDialog(null,"Error "+err.getMessage()); 
           } 
        }
         
    }//GEN-LAST:event_jb_modificarMouseClicked

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
            java.util.logging.Logger.getLogger(reegistro_proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reegistro_proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reegistro_proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reegistro_proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reegistro_proveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_borrar;
    private javax.swing.JButton jb_guardar;
    private javax.swing.JButton jb_limpiar;
    private javax.swing.JButton jb_modificar;
    private javax.swing.JToggleButton jb_salir;
    private javax.swing.JLabel jl_id;
    private javax.swing.JTable jt_proveedores;
    private javax.swing.JTextField jtf_apellM;
    private javax.swing.JTextField jtf_apellP;
    private javax.swing.JTextField jtf_buscartodo;
    private javax.swing.JTextField jtf_calle;
    private javax.swing.JTextField jtf_colonia;
    private javax.swing.JTextField jtf_correo;
    private javax.swing.JTextField jtf_id;
    private javax.swing.JTextField jtf_municipio;
    private javax.swing.JTextField jtf_nombres;
    private javax.swing.JTextField jtf_telefono;
    // End of variables declaration//GEN-END:variables
}
