package edu.cecar.Vista;

/** Clase: VSesion
 * 
 * @version: 0.1
 *  
 * @sincelejo: 20/09/2019
 * 
 * Fecha de Modificación: 
 * 
 * @author: Osnayder Conde Rodriguez
 * 
 * Copyrigth: CECAR
 */



import edu.cecar.Controlador.CargarJSONarchivo;
import edu.cecar.Controlador.Cliente;
import edu.cecar.Modelo.Album;
import edu.cecar.Modelo.Comentario;
import edu.cecar.Modelo.Foto;
import edu.cecar.Modelo.JSONarchivo;
import edu.cecar.Modelo.Publicacion;
import edu.cecar.Modelo.Usuario;
import java.awt.Image;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VSesion extends javax.swing.JFrame {

        JSONarchivo archivo;
        
        Object[][] datos = {};
       
        String[] cPublicacaiones = {" ID publicacion","ID Usuario", " Titulo ", " Cuerpo"};
        String[] cUsuarios = {"Id","Estado","Primer Nombre","Apellido","Género","Telefono"," Fecha ","Dirrección","Email","Sitio Web"};
        String[] cComentarios = {"  ID Comentario ","ID post" ,"  Nombre ", "  Email ", "  Cuerpo "};
        String[] cAlbumes = {" ID Album ","Id Usuario"," Titulo "};
        String[] cFotos = {"  ID  "," ID Album "," Titulo "," URl Imagen "," Miniatura "};
         
        DefaultTableModel modeloPublicaciones = new DefaultTableModel(datos,cPublicacaiones);
        DefaultTableModel modeloComentarios = new DefaultTableModel(datos,cComentarios);
        DefaultTableModel modeloUsuarios = new DefaultTableModel(datos,cUsuarios);
        DefaultTableModel modeloAlbums = new DefaultTableModel(datos,cAlbumes);
        DefaultTableModel modeloFotos = new DefaultTableModel(datos,cFotos);
    
    public VSesion() {
        initComponents();
        new Cliente("0.0.0.0", 17000);
        archivo = (new CargarJSONarchivo("ArchivoPrueba/ArchivosJSON.dat").getJSONarchivo());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        campoID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        imagenLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        valorOrdenar = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("ID de Usuario");

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Foto de Usuario");

        jTable1.setModel(modeloComentarios);
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(modeloAlbums);
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(modeloPublicaciones);
        jScrollPane3.setViewportView(jTable3);

        jTable4.setModel(modeloFotos);
        jScrollPane4.setViewportView(jTable4);

        jLabel6.setText("Lista de Comentarios");

        jLabel7.setText("Lista de Publicaciones de Usuario");

        jLabel8.setText("Lista de Albumes del Usuario");

        jLabel9.setText("Lista de Fotos del Usuario");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(imagenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(849, 849, 849))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(imagenLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Buscar", jPanel1);

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Ordenar Por");

        valorOrdenar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        valorOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Nombre", "Apellido", "Genero", "Estado", "Telefono", "Dirrección", "Correo", "Sitio Web", "Fecha" }));

        jTable5.setModel(modeloUsuarios);
        jScrollPane5.setViewportView(jTable5);

        jButton2.setText("Ordenar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(valorOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1205, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valorOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );

        jTabbedPane1.addTab("Listar", jPanel2);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("Sistemas de Información Para La Consulta de Usuarios, Donde se Detallan Los Comentarios, Publicaciones, Foto y Album de Usuarios  ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addContainerGap(287, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1246, 512));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ArrayList<Usuario> lisUsuario = new ArrayList<Usuario>();
        ArrayList<Publicacion> lisPublicacion = new ArrayList<Publicacion>();
        ArrayList<Comentario>   lisComentario = new ArrayList<Comentario>();
        ArrayList<Album> lisAlbum = new ArrayList<Album>();
        ArrayList<Foto>   lisFoto = new ArrayList<Foto>();
        
        String[] lista = new String[4];
        int IdBusqueda = 0;
        lisUsuario = archivo.getListaUsuarios();
        lisPublicacion = archivo.getListaPublicaciones();
        lisComentario = archivo.getListaComentarios();
        lisAlbum = archivo.getListaAlbums();
        lisFoto = archivo.getListaFotos();
        IdBusqueda = Integer.parseInt(campoID.getText());
        boolean Bandera = true, B2 = false;
        
        System.out.println(IdBusqueda);
        for(int i=0; i<lisUsuario.size(); i++){
              if(IdBusqueda==lisUsuario.get(i).getId()){
                  B2 = true;
              }
        }
        
        if(this.esNumero(campoID.getText())){
            
           
            modeloPublicaciones.setRowCount(0);
            modeloComentarios.setRowCount(0);
            modeloAlbums.setRowCount(0);
            modeloFotos.setRowCount(0);
           
           for(int i=0; i<lisUsuario.size(); i++){
               
               if(B2){
                   if(IdBusqueda==lisPublicacion.get(i).getId()){
                    modeloPublicaciones.addRow(lisPublicacion.get(i).getExtraerTodo());
                     Bandera = false;
                }
                if(IdBusqueda==lisComentario.get(i).getId()){
                  modeloComentarios.addRow(lisComentario.get(i).getExtraerTodo());
                  Bandera = false;
                }
              
                if(IdBusqueda==lisAlbum.get(i).getId()){
                  modeloAlbums.addRow(lisAlbum.get(i).getExtraerTodo());
                  Bandera = false;
                }
              
                if(IdBusqueda==lisFoto.get(i).getId()){
                   modeloFotos.addRow(lisFoto.get(i).getExtraerTodo());
                   Bandera = false;
                   Image imagen = null;
                    try {
                        URL url = new URL(lisFoto.get(i).getThumbnail());

                        try {
                            imagen = ImageIO.read(url);
                        } catch (IOException ex) {
                            Logger.getLogger(VSesion.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        imagenLabel.setIcon(new ImageIcon(imagen));
                    } catch (MalformedURLException ex) {
                        Logger.getLogger(VSesion.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    }
               }
           
           }
           if(Bandera){
               JOptionPane.showMessageDialog(this," No se Encontraron Resultados Para el Criterio de Busqueda Especificado",
                                                               "Busqueda",JOptionPane.ERROR_MESSAGE);
            }
                
       }else{
          JOptionPane.showMessageDialog(this," Caracteres no validos para la Busqueda, Solo puede Digitar Digitos",
                                                               "Error de Datos de Campo",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       ArrayList<Usuario> lisUsuario = new ArrayList<Usuario>();
       lisUsuario = archivo.getListaUsuarios();
       int opcionOrdenar = valorOrdenar.getSelectedIndex();
       int contador;
       
       ArrayList ordenado = new ArrayList();
       
       switch(opcionOrdenar){
           case 0:  modeloUsuarios.setRowCount(0);
                    for(int i = 0; i<lisUsuario.size(); i++){
                        modeloUsuarios.addRow(lisUsuario.get(i).getExtraerTodo());
                    }
                    break;
           case 1:  ordenado.clear();
                    modeloUsuarios.setRowCount(0);
                    for(int i = 0; i<lisUsuario.size(); i++){
                        ordenado.add(lisUsuario.get(i).getFirt_name());
                    }
                    
                    Collections.sort(ordenado);
                    contador = 0;
                    
                    while(contador<lisUsuario.size()-1){
                        for(int i=0; i<lisUsuario.size(); i++){
                            if(ordenado.get(contador).equals(lisUsuario.get(i).getFirt_name())){
                                modeloUsuarios.addRow(lisUsuario.get(i).getExtraerTodo());
                                contador++;
                            }
                        }
                    }
                    break;
           case 2:   ordenado.clear();
                    modeloUsuarios.setRowCount(0);
                    for(int i = 0; i<lisUsuario.size(); i++){
                        ordenado.add(lisUsuario.get(i).getLast_name());
                    }
                    
                    Collections.sort(ordenado);
                    contador = 0;
                    
                    while(contador<lisUsuario.size()){
                        for(int i=0; i<lisUsuario.size(); i++){
                            if(contador<lisUsuario.size()){
                              if(ordenado.get(contador).equals(lisUsuario.get(i).getLast_name())){
                                modeloUsuarios.addRow(lisUsuario.get(i).getExtraerTodo());
                                contador++;
                             }   
                            }
                        }
                    }
                    break;
           case 3:  ordenado.clear();  
                    modeloUsuarios.setRowCount(0);
                    for(int i = 0; i<lisUsuario.size(); i++){
                        ordenado.add(lisUsuario.get(i).getGender());
                    }
                    
                    Collections.sort(ordenado);
                    contador = 0;
                    
                    while(contador<lisUsuario.size()){
                        for(int i=0; i<lisUsuario.size(); i++){
                            if(contador<lisUsuario.size()){
                              if(ordenado.get(contador).equals(lisUsuario.get(i).getGender())){
                                modeloUsuarios.addRow(lisUsuario.get(i).getExtraerTodo());
                                contador++;
                             }   
                            }
                        }
                    }
                    break;
                    //Id, Nombre, Apellido, Genero, Estado, Telefono, Dirrección, Correo, Sitio Web, Dob
           case 4: ordenado.clear();  
                    modeloUsuarios.setRowCount(0);
                    for(int i = 0; i<lisUsuario.size(); i++){
                        ordenado.add(lisUsuario.get(i).getStatus());
                    }
                    
                    Collections.sort(ordenado);
                    contador = 0;
                    
                    while(contador<lisUsuario.size()){
                        for(int i=0; i<lisUsuario.size(); i++){
                            if(contador<lisUsuario.size()){
                              if(ordenado.get(contador).equals(lisUsuario.get(i).getStatus())){
                                modeloUsuarios.addRow(lisUsuario.get(i).getExtraerTodo());
                                contador++;
                             }   
                            }
                        }
                    }
                    break;
           case 5: ordenado.clear();  
                    modeloUsuarios.setRowCount(0);
                    for(int i = 0; i<lisUsuario.size(); i++){
                        ordenado.add(lisUsuario.get(i).getPhone());
                    }
                    
                    Collections.sort(ordenado);
                    contador = 0;
                    
                    while(contador<lisUsuario.size()){
                        for(int i=0; i<lisUsuario.size(); i++){
                            if(contador<lisUsuario.size()){
                              if(ordenado.get(contador).equals(lisUsuario.get(i).getPhone())){
                                modeloUsuarios.addRow(lisUsuario.get(i).getExtraerTodo());
                                contador++;
                             }   
                            }
                        }
                    }
                    break;
           case 6: ordenado.clear();  
                    modeloUsuarios.setRowCount(0);
                    for(int i = 0; i<lisUsuario.size(); i++){
                        ordenado.add(lisUsuario.get(i).getAddress());
                    }
                    
                    Collections.sort(ordenado);
                    contador = 0;
                    
                    while(contador<lisUsuario.size()){
                        for(int i=0; i<lisUsuario.size(); i++){
                            if(contador<lisUsuario.size()){
                              if(ordenado.get(contador).equals(lisUsuario.get(i).getAddress())){
                                modeloUsuarios.addRow(lisUsuario.get(i).getExtraerTodo());
                                contador++;
                             }   
                            }
                        }
                    }
                    break;
           case 7: ordenado.clear();  
                    modeloUsuarios.setRowCount(0);
                    for(int i = 0; i<lisUsuario.size(); i++){
                        ordenado.add(lisUsuario.get(i).getEmail());
                    }
                    
                    Collections.sort(ordenado);
                    contador = 0;
                    
                    while(contador<lisUsuario.size()){
                        for(int i=0; i<lisUsuario.size(); i++){
                            if(contador<lisUsuario.size()){
                              if(ordenado.get(contador).equals(lisUsuario.get(i).getEmail())){
                                modeloUsuarios.addRow(lisUsuario.get(i).getExtraerTodo());
                                contador++;
                             }   
                            }
                        }
                    }
                    break;
           case 8:  ordenado.clear();  
                    modeloUsuarios.setRowCount(0);
                    for(int i = 0; i<lisUsuario.size(); i++){
                        ordenado.add(lisUsuario.get(i).getWebsite());
                    }
                    
                    Collections.sort(ordenado);
                    contador = 0;
                    
                    while(contador<lisUsuario.size()){
                        for(int i=0; i<lisUsuario.size(); i++){
                            if(contador<lisUsuario.size()){
                              if(ordenado.get(contador).equals(lisUsuario.get(i).getWebsite())){
                                modeloUsuarios.addRow(lisUsuario.get(i).getExtraerTodo());
                                contador++;
                             }   
                            }
                        }
                    }
                    break;
               
           case 9: ordenado.clear();  
                    modeloUsuarios.setRowCount(0);
                    for(int i = 0; i<lisUsuario.size(); i++){
                        ordenado.add(lisUsuario.get(i).getDob());
                    }
                    
                    Collections.sort(ordenado);
                    contador = 0;
                    
                    while(contador<lisUsuario.size()){
                        for(int i=0; i<lisUsuario.size(); i++){
                            if(contador<lisUsuario.size()){
                              if(ordenado.get(contador).equals(lisUsuario.get(i).getDob())){
                                modeloUsuarios.addRow(lisUsuario.get(i).getExtraerTodo());
                                contador++;
                             }   
                            }
                        }
                    }
                    break;
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(VSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VSesion().setVisible(true);
            }
        });
        
        
    }
    
    public boolean esNumero(String cadena){
        boolean resultado;
        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoID;
    private javax.swing.JLabel imagenLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JComboBox<String> valorOrdenar;
    // End of variables declaration//GEN-END:variables
}
