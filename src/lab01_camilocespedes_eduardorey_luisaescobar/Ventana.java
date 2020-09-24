/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01_camilocespedes_eduardorey_luisaescobar;

import Arbol.Arbol.*;
import Arbol.ArbolNA;
import Inter.InterJSON;
import java.awt.CardLayout;
import javax.swing.*;

/**
 *
 * @author Camilo Cespedes
 */
public class Ventana extends javax.swing.JFrame {

    private InterJSON master;
    private ArbolNA As;
    private CardLayout cl;

    public Ventana() {
        initComponents();
        setSize(1285, 750);
        setLocationRelativeTo(null);
        setResizable(false);
        master = new InterJSON();
        cl = (CardLayout) panelDeVisualizacion.getLayout();
        As = new ArbolNA(master.Transformar());//Se crea el arreglo de usuarios con todos sus atributos, incluyendo posts y comentarios, y se envia este al Árbol que se creará
        showAreaPosts(posts, As.getNR());
    }
    public void showAreaPosts(JTextArea TXA, NodoRaiz NR){
        NodoUser u = NR.getLinkU();
        while (u != null) {
            NodoPost p = u.getLinkP();
            while (p != null) {
                TXA.append("UserID:    "+p.getUserID()+"\n");
                TXA.append("ID:    "+p.getId()+"\n");
                showArea(TXA, p);
                TXA.append("\n");
                p = p.getLinkP();
            }
            u = u.getLinkU();
        }
    }
    public void showArea(JTextArea TXA, NodoUser NU) {
        StringBuffer sb = NU.show();
        TXA.append("" + sb);
    }

    public void showArea(JTextArea TXA, NodoPost NP) {
        StringBuffer sb = NP.showPost(As);
        TXA.append("" + sb);
    }

    public void showArea(JTextArea TXA, NodoPost NP, NodoComment NC) {
        StringBuffer sb = NP.showComments(As, NC);
        TXA.append("" + sb);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelDeVisualizacion = new javax.swing.JPanel();
        Posts = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        posts = new javax.swing.JTextArea();
        PostIndividual = new javax.swing.JPanel();
        splitPostIndividual = new javax.swing.JSplitPane();
        scrollPost = new javax.swing.JScrollPane();
        post = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        comments = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        UsuarioIndividual = new javax.swing.JPanel();
        IconoUsuario = new javax.swing.JLabel();
        nombreDeUsuario = new javax.swing.JLabel();
        titleID = new javax.swing.JLabel();
        titleNombre = new javax.swing.JLabel();
        titleEmail = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        InfoAdicional = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        infoUsuario = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        panelDeBusqueda1 = new javax.swing.JPanel();
        BuscarUsuario = new javax.swing.JLabel();
        BuscarID = new javax.swing.JLabel();
        buscarUserName = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        userName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        buscarUser = new javax.swing.JButton();
        separador1 = new javax.swing.JSeparator();
        panelDeBusqueda2 = new javax.swing.JPanel();
        BuscarPost = new javax.swing.JLabel();
        BuscarIdPost = new javax.swing.JLabel();
        idPost = new javax.swing.JTextField();
        buscarPost = new javax.swing.JButton();
        separador2 = new javax.swing.JSeparator();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDeVisualizacion.setLayout(new java.awt.CardLayout());

        posts.setEditable(false);
        posts.setColumns(20);
        posts.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        posts.setRows(5);
        jScrollPane3.setViewportView(posts);

        javax.swing.GroupLayout PostsLayout = new javax.swing.GroupLayout(Posts);
        Posts.setLayout(PostsLayout);
        PostsLayout.setHorizontalGroup(
            PostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PostsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        PostsLayout.setVerticalGroup(
            PostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PostsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelDeVisualizacion.add(Posts, "Ps");

        PostIndividual.setMaximumSize(new java.awt.Dimension(734, 640));
        PostIndividual.setMinimumSize(new java.awt.Dimension(734, 640));

        splitPostIndividual.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        splitPostIndividual.setPreferredSize(new java.awt.Dimension(719, 625));

        post.setEditable(false);
        post.setColumns(20);
        post.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        post.setRows(5);
        scrollPost.setViewportView(post);

        splitPostIndividual.setTopComponent(scrollPost);

        comments.setEditable(false);
        comments.setColumns(20);
        comments.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        comments.setRows(5);
        jScrollPane2.setViewportView(comments);

        splitPostIndividual.setRightComponent(jScrollPane2);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PostIndividualLayout = new javax.swing.GroupLayout(PostIndividual);
        PostIndividual.setLayout(PostIndividualLayout);
        PostIndividualLayout.setHorizontalGroup(
            PostIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PostIndividualLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPostIndividual, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(PostIndividualLayout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PostIndividualLayout.setVerticalGroup(
            PostIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PostIndividualLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPostIndividual, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        panelDeVisualizacion.add(PostIndividual, "Pi");

        UsuarioIndividual.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/UserIcon.png"))); // NOI18N
        UsuarioIndividual.add(IconoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        nombreDeUsuario.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        nombreDeUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsuarioIndividual.add(nombreDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 13, 504, 72));

        titleID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleID.setText("ID de Usuario:");
        UsuarioIndividual.add(titleID, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 98, 120, 40));

        titleNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleNombre.setText("Nombre:");
        UsuarioIndividual.add(titleNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 153, 80, 30));

        titleEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        titleEmail.setText("E-mail:");
        UsuarioIndividual.add(titleEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 70, 20));

        email.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        UsuarioIndividual.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 400, 40));

        nombre.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        UsuarioIndividual.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 350, 40));

        ID.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        UsuarioIndividual.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 90, 40));

        InfoAdicional.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        InfoAdicional.setText("Información Adicional:");
        UsuarioIndividual.add(InfoAdicional, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 240, 30));

        infoUsuario.setEditable(false);
        infoUsuario.setColumns(20);
        infoUsuario.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        infoUsuario.setRows(5);
        jScrollPane1.setViewportView(infoUsuario);

        UsuarioIndividual.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 670, 220));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        UsuarioIndividual.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 540, 240, 40));

        panelDeVisualizacion.add(UsuarioIndividual, "Ui");

        getContentPane().add(panelDeVisualizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 780, 640));

        panelDeBusqueda1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BuscarUsuario.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BuscarUsuario.setText("Buscar Usuario:");
        panelDeBusqueda1.add(BuscarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 346, 30));

        BuscarID.setText("ID de Usuario:");
        panelDeBusqueda1.add(BuscarID, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 53, -1, -1));

        buscarUserName.setText("Nombre de Usuario:");
        panelDeBusqueda1.add(buscarUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 105, -1, -1));
        panelDeBusqueda1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 50, 129, -1));
        panelDeBusqueda1.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 102, 180, -1));

        jLabel5.setText("ó");
        panelDeBusqueda1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 79, -1, -1));

        buscarUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buscarUser.setText("Buscar Usuario");
        buscarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarUserActionPerformed(evt);
            }
        });
        panelDeBusqueda1.add(buscarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 137, 159, -1));
        panelDeBusqueda1.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 370, 140));

        getContentPane().add(panelDeBusqueda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 370, 180));

        panelDeBusqueda2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BuscarPost.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BuscarPost.setText("Buscar Publicación:");
        panelDeBusqueda2.add(BuscarPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 346, 30));

        BuscarIdPost.setText("ID de Publicación:");
        panelDeBusqueda2.add(BuscarIdPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 76, -1, 20));
        panelDeBusqueda2.add(idPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 129, 30));

        buscarPost.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buscarPost.setText("Buscar Publicación");
        buscarPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPostActionPerformed(evt);
            }
        });
        panelDeBusqueda2.add(buscarPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 190, -1));
        panelDeBusqueda2.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 370, 140));

        getContentPane().add(panelDeBusqueda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, 180));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/bg.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPostActionPerformed
        if (!idPost.getText().isEmpty()) {
            int IdPost = Integer.parseInt(idPost.getText());
            if (As.BuscarPost(IdPost) != null) {
                showArea(post, As.BuscarPost(IdPost));
                showArea(comments, As.BuscarPost(IdPost), As.BuscarPost(IdPost).getLinkC());
                cl.show(panelDeVisualizacion, "Pi");
            }else{
                JOptionPane.showMessageDialog(null, "No se encontró el post", "ERROR", 0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe llenar el campo de identificación", "ERROR", 0);
        }
        idPost.setText("");
        
    }//GEN-LAST:event_buscarPostActionPerformed

    private void buscarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarUserActionPerformed
        if (!id.getText().isEmpty() || !userName.getText().isEmpty()) {
            if (!id.getText().isEmpty()) {
                int iD = Integer.parseInt(id.getText());
                if (As.BuscarUsuario(iD) != null) {
                    nombreDeUsuario.setText(As.BuscarUsuario(iD).getUserName());
                    ID.setText("" + As.BuscarUsuario(iD).getId());
                    nombre.setText(As.BuscarUsuario(iD).getName());
                    email.setText(As.BuscarUsuario(iD).getEmail());
                    showArea(infoUsuario, As.BuscarUsuario(iD));
                    cl.show(panelDeVisualizacion, "Ui");

                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el usuario", "ERROR", 0);
                }
            } else {
                String UN = userName.getText();
                if (As.BuscarUsuario(UN) != null) {
                    nombreDeUsuario.setText(As.BuscarUsuario(UN).getUserName());
                    ID.setText("" + As.BuscarUsuario(UN).getId());
                    nombre.setText(As.BuscarUsuario(UN).getName());
                    email.setText(As.BuscarUsuario(UN).getEmail());
                    showArea(infoUsuario, As.BuscarUsuario(UN));
                    cl.show(panelDeVisualizacion, "Ui");

                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el usuario", "ERROR", 0);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Se debe llenar uno de los dos campos", "ERROR", 0);
        }
        id.setText("");
        userName.setText("");
    }//GEN-LAST:event_buscarUserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cl.show(panelDeVisualizacion, "Ps");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cl.show(panelDeVisualizacion, "Ps");
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel BuscarID;
    private javax.swing.JLabel BuscarIdPost;
    private javax.swing.JLabel BuscarPost;
    private javax.swing.JLabel BuscarUsuario;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel IconoUsuario;
    private javax.swing.JLabel InfoAdicional;
    private javax.swing.JPanel PostIndividual;
    private javax.swing.JPanel Posts;
    private javax.swing.JPanel UsuarioIndividual;
    private javax.swing.JButton buscarPost;
    private javax.swing.JButton buscarUser;
    private javax.swing.JLabel buscarUserName;
    private javax.swing.JTextArea comments;
    private javax.swing.JLabel email;
    private javax.swing.JTextField id;
    private javax.swing.JTextField idPost;
    private javax.swing.JTextArea infoUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombreDeUsuario;
    private javax.swing.JPanel panelDeBusqueda1;
    private javax.swing.JPanel panelDeBusqueda2;
    private javax.swing.JPanel panelDeVisualizacion;
    private javax.swing.JTextArea post;
    private javax.swing.JTextArea posts;
    private javax.swing.JScrollPane scrollPost;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JSplitPane splitPostIndividual;
    private javax.swing.JLabel titleEmail;
    private javax.swing.JLabel titleID;
    private javax.swing.JLabel titleNombre;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}
