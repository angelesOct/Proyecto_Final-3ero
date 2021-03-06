/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;
import conectar_almacen.Database; //llamamos la conexion a la BD para almacen
import static conectar_almacen.Database.getConexion;
import java.sql.Connection;
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
public class pedidos extends javax.swing.JFrame {
    DefaultTableModel model;
    private Connection conexion;     
    private Statement st;     
    private ResultSet rs;
    PreparedStatement ps;
    /**
     * Creates new form pedidos
     */
    public pedidos() {
        initComponents();
        Conectar();
        limpiar();
        mostrar();
    } 
    
    public void Conectar(){
             try{ 
                conexion=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/fazuca","root","");                     
                st=conexion.createStatement(); 
                rs=st.executeQuery("Select * from pedidos");
                        
                rs.first();
                
            }catch(SQLException err){ 
                JOptionPane.showMessageDialog(null,"Error "+err.getMessage()); 
            } 

    } 
    
    
    private void mostrar() {
        DefaultTableModel modelo = new DefaultTableModel();
        ResultSet rs = Database.getTabla("select nombre_cliente,apellido_paterno_c,telefono_c,correo_c,municipio_c,calle_c,colonia_c,fecha_venta,productos,cantidad_productos from pedidos");
        modelo.setColumnIdentifiers(new Object[]{"nombre", "apellido","telefono", "correo", "municipio", "calle", "colonia","fecha","nombre producto","cantidad"});
        try {
            while (rs.next()) {
                // añade los resultado a al modelo de tabla
                modelo.addRow(new Object[]{ 
                    rs.getString("nombre_cliente"),
                    rs.getString("apellido_paterno_c"), 
                    rs.getString("telefono_c"), 
                    rs.getString("correo_c"),
                    rs.getString("municipio_c"),
                    rs.getString("calle_c"),
                    rs.getString("colonia_c"),
                    rs.getDate("fecha_venta"),
                    rs.getString("productos"),
                    rs.getString("cantidad_productos")
                });                                    
            }
            // asigna el modelo a la tabla
            jt_pedidos.setModel(modelo);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    
    public void limpiar(){
        String nombres="";
        String apellP="";
        String apellM="";
        String telefono="";
        String correo="";
        String municipio="";
        String calle="";
        String colonia="";
        String producto="";
        int cantidad=0;
        this.jtf_nombres.setText(String.valueOf(nombres));
        this.jtf_apellP.setText(String.valueOf(apellP));
        this.jtf_telefono.setText(String.valueOf(telefono));
        this.jtf_correo.setText(String.valueOf(correo));
        this.jtf_municipio.setText(String.valueOf(municipio));
        this.jtf_calle.setText(String.valueOf(calle));
        this.jtf_colonia.setText(String.valueOf(colonia));
        this.jtf_nombre_producto.setText(String.valueOf(producto));
        this.jtf_nombre_producto.setText(String.valueOf(colonia));        
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
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jtf_buscartodo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_pedidos = new javax.swing.JTable();
        jb_salir = new javax.swing.JToggleButton();
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
        jtf_nombre_producto = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jb_modificar = new javax.swing.JButton();
        jb_limpiar = new javax.swing.JButton();
        jb_guardar = new javax.swing.JButton();
        jb_borrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pedidos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_buscartodo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_buscartodo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jt_pedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "nombre", "apellido", "Telefono", "Correo", "Municipio", "Nombre del producto", "Cantidad", "Fecha"
            }
        ));
        jt_pedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_pedidosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_pedidos);

        jb_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/160_F_42459916_Yt7cH133dIcZbaIVMtkEanlXnOG149ZT.png"))); // NOI18N
        jb_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_salirMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Nombres:");

        jtf_calle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_calleActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Apellido:");

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
        jLabel12.setText("Nombre del producto: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)))
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_colonia)
                            .addComponent(jtf_calle)
                            .addComponent(jtf_nombre_producto, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(jtf_municipio)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_correo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_apellP, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtf_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtf_apellP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtf_calle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_colonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_nombre_producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jb_modificar.setBackground(new java.awt.Color(0, 102, 255));
        jb_modificar.setForeground(new java.awt.Color(255, 255, 255));
        jb_modificar.setText("Modificar");
        jb_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_modificarMouseClicked(evt);
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

        jb_guardar.setBackground(new java.awt.Color(0, 102, 204));
        jb_guardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jb_guardar.setForeground(new java.awt.Color(255, 255, 255));
        jb_guardar.setText("Guardar");
        jb_guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_guardarMouseClicked(evt);
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jb_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(jb_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jb_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(73, 73, 73)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtf_buscartodoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_buscartodoKeyPressed

        String[] titulos = {"RFC", "nombre", "apellido paterno", "apellido materno","telefono", "correo", "municipio", "calle", "colonia"};
        String[] registros = new String[50];

        String sql = "select nombre_cliente,apellido_paterno_c,telefono_c,correo_c,municipio_c,nombre_producto,fecha_venta from pedidos WHERE RFC LIKE '%" + jtf_buscartodo.getText() + "%' "
        + "OR nombre_cliente LIKE '%" + jtf_buscartodo.getText() + "%'"
        + "OR apellido_paterno_c LIKE '%" + jtf_buscartodo.getText() + "%'"
        + "OR telefono_c LIKE '%" + jtf_buscartodo.getText() + "%'"
        + "OR correo_c LIKE '%" + jtf_buscartodo.getText() + "%'"
        + "OR municipio_c LIKE '%" + jtf_buscartodo.getText() + "%'"
        + "OR calle_c LIKE '%" + jtf_buscartodo.getText() + "%'"
        + "OR colonia_c LIKE '%" + jtf_buscartodo.getText() + "%'"
        + "OR nombre_producto LIKE '%" + jtf_buscartodo.getText() + "%'"
        + "OR cantidad LIKE '%" + jtf_buscartodo.getText() + "%'";
        model = new DefaultTableModel(null, titulos);
        Database cc = new Database();
        Connection cn = getConexion();
        try {
            Statement st = (Statement) cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("nombre_cliente");
                registros[1] = rs.getString("apellido_paterno_c");
                registros[2] = rs.getString("telefono_c");
                registros[3] = rs.getString("correo_c");
                registros[4] = rs.getString("municipio_c");
                registros[5] = rs.getString("calle_c");
                registros[6] = rs.getString("colonia_c");
                model.addRow(registros);
            }
            jt_pedidos.setModel(model);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error00"+ ex);
        }
    }//GEN-LAST:event_jtf_buscartodoKeyPressed

    private void jb_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_salirMouseClicked
        menu menu = new menu();
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jb_salirMouseClicked

    private void jtf_calleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_calleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_calleActionPerformed

    private void jb_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_modificarMouseClicked
//        int confirmar = JOptionPane.showConfirmDialog(null, "¿Esta seguro de modificar el registro?");
//        if(JOptionPane.OK_OPTION==confirmar) {
//            try{
//                String RFC=this.jtf_RFC.getText();
//                if (RFC == RFC ){
//                    String nombre=this.jtf_nombres.getText();
//                    String apellP=this.jtf_apellP.getText();
//                    String apellM=this.jtf_apellM.getText();
//                    String telefono=this.jtf_telefono.getText();
//                    String correo=this.jtf_correo.getText();
//                    String municipio=this.jtf_municipio.getText();
//                    String calle=this.jtf_calle.getText();
//                    String colonia=this.jtf_colonia.getText();
//
//                    st.executeUpdate("UPDATE pedidos SET nombre_cliente='"+nombre+"',apellido_paterno_c='"+apellP+"',apellido_materno_c='"+apellM+"',telefono_c='"+telefono+"',correo_c='"+correo+"',municipio_c='"+municipio+"',calle_c='"+calle+"',colonia_c='"+colonia+"' WHERE RFC='"+RFC+"';");
//                    JOptionPane.showMessageDialog(this,"El registro se modifico correctamente");
//
//                }
//                mostrar();
//                Conectar();
//                limpiar();
//            } catch(Exception err)
//            {
//                JOptionPane.showMessageDialog(null,"Error "+err.getMessage());
//            }
//        }

    }//GEN-LAST:event_jb_modificarMouseClicked

    private void jb_limpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_limpiarMouseClicked
        limpiar();
    }//GEN-LAST:event_jb_limpiarMouseClicked

    private void jb_guardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_guardarMouseClicked
//////        try{
//////
//////            String RFC=this.jtf_RFC.getText();
//////            String nombre=this.jtf_nombres.getText();
//////            String apellP=this.jtf_apellP.getText();
//////            String apellM=this.jtf_apellM.getText();
//////            String telefono=this.jtf_telefono.getText();
//////            String correo=this.jtf_correo.getText();
//////            String municipio=this.jtf_municipio.getText();
//////            String calle=this.jtf_calle.getText();
//////            String colonia=this.jtf_colonia.getText();
//////
//////            st.executeUpdate("Insert into pedidos (RFC,nombre_cliente,apellido_paterno_c,apellido_materno_c,telefono_c,correo_c,municipio_c,calle_c,colonia_c) values ('"+RFC+"','"+ nombre +"','"+apellP+"','"+apellM+"','"+telefono+"','"+correo+"','"+municipio+"','"+calle+"','"+colonia+"');");
//////            JOptionPane.showMessageDialog(null,"Guardado con exito ");
//////
//////        } catch(Exception err)
//////        {
//////            JOptionPane.showMessageDialog(null,"Error "+err.getMessage());
//////        }
//////        mostrar();
//////        Conectar();
//////        limpiar();
    }//GEN-LAST:event_jb_guardarMouseClicked

    private void jb_borrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_borrarMouseClicked
       /* int confirmar = JOptionPane.showConfirmDialog(this, "¿Esta seguro que desea eliminar el registro?");
        if(JOptionPane.OK_OPTION==confirmar) {
            try{

                String RFC=this.jtf_RFC.getText();
                st.executeUpdate("delete from pedidos where RFC='"+RFC+"';");

                JOptionPane.showMessageDialog(this,"Registro Borrado");

                st.executeQuery("select * from pedidos");

            } catch(Exception err){
                JOptionPane.showMessageDialog(null,"Error "+err.getMessage());
                //JOptionPane.showMessageDialog(this,"no puede borrar a este proveedor");
            }
            mostrar();
            Conectar();
            limpiar();
        }*/
    }//GEN-LAST:event_jb_borrarMouseClicked

    private void jt_pedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_pedidosMouseClicked
        int rec = this.jt_pedidos.getSelectedRow();
        this.jtf_nombres.setText(jt_pedidos.getValueAt(rec, 0).toString());
        this.jtf_apellP.setText(jt_pedidos.getValueAt(rec, 1).toString());
        this.jtf_telefono.setText(jt_pedidos.getValueAt(rec, 2).toString());
        this.jtf_correo.setText(jt_pedidos.getValueAt(rec, 3).toString());
        this.jtf_municipio.setText(jt_pedidos.getValueAt(rec, 4).toString());
        this.jtf_calle.setText(jt_pedidos.getValueAt(rec, 5).toString());
        this.jtf_colonia.setText(jt_pedidos.getValueAt(rec, 6).toString());
        this.jtf_nombre_producto.setText(jt_pedidos.getValueAt(rec, 8).toString());
    }//GEN-LAST:event_jt_pedidosMouseClicked

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
            java.util.logging.Logger.getLogger(pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pedidos().setVisible(true);
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_borrar;
    private javax.swing.JButton jb_guardar;
    private javax.swing.JButton jb_limpiar;
    private javax.swing.JButton jb_modificar;
    private javax.swing.JToggleButton jb_salir;
    private javax.swing.JTable jt_pedidos;
    private javax.swing.JTextField jtf_apellP;
    private javax.swing.JTextField jtf_buscartodo;
    private javax.swing.JTextField jtf_calle;
    private javax.swing.JTextField jtf_colonia;
    private javax.swing.JTextField jtf_correo;
    private javax.swing.JTextField jtf_municipio;
    private javax.swing.JTextField jtf_nombre_producto;
    private javax.swing.JTextField jtf_nombres;
    private javax.swing.JTextField jtf_telefono;
    // End of variables declaration//GEN-END:variables
}
