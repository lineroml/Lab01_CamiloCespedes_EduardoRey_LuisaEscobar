/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01_camilocespedes_eduardorey_luisaescobar;

import Arbol.ArbolBinario;
import Arbol.ArbolNA;
import Inter.InterJSON;
import java.awt.CardLayout;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Camilo Cespedes
 */
public class Ventana extends javax.swing.JFrame {

    private InterJSON master;
    private ArrayList<ArbolBinario> ABBs;
    private ArrayList<ArbolNA> As;
    private CardLayout cl;
    public Ventana() {
        initComponents();
        setSize(1285,750);
        setLocationRelativeTo(null);
        setResizable(false);
        master = new InterJSON();
        cl = (CardLayout) panelDeVisualizacion.getLayout();
        ArrayList<User> users = master.Transformar();  //Se crea el arreglo de usuarios con todos sus atributos, incluyendo posts y comentarios
        users.get(4).show();
        //System.out.println(users.get(6).getUserName());
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
        scrollPosts = new javax.swing.JScrollPane();
        ListaPosts = new javax.swing.JList<>();
        verPost = new javax.swing.JButton();
        PostIndividual = new javax.swing.JPanel();
        splitPostIndividual = new javax.swing.JSplitPane();
        scrollPost = new javax.swing.JScrollPane();
        Post = new javax.swing.JTextArea();
        scrollComments = new javax.swing.JScrollPane();
        Comments = new javax.swing.JList<>();
        UsuarioIndividual = new javax.swing.JPanel();
        IconoUsuario = new javax.swing.JLabel();
        NombreDeUsuario = new javax.swing.JLabel();
        titleID = new javax.swing.JLabel();
        titleNombre = new javax.swing.JLabel();
        titleEmail = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        InfoAdicional = new javax.swing.JLabel();
        scrollListaInfoUser = new javax.swing.JScrollPane();
        ListaInfoUser = new javax.swing.JList<>();
        panelDeBusqueda1 = new javax.swing.JPanel();
        BuscarUsuario = new javax.swing.JLabel();
        BuscarID = new javax.swing.JLabel();
        buscarUserName = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        userName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        buscarUser = new javax.swing.JButton();
        separador1 = new javax.swing.JSeparator();
        panelDeBusqueda3 = new javax.swing.JPanel();
        BuscarPost = new javax.swing.JLabel();
        BuscarIdPost = new javax.swing.JLabel();
        idPost = new javax.swing.JTextField();
        buscarPost = new javax.swing.JButton();
        separador2 = new javax.swing.JSeparator();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDeVisualizacion.setLayout(new java.awt.CardLayout());

        ListaPosts.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrollPosts.setViewportView(ListaPosts);

        verPost.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        verPost.setText("Ver publicación");
        verPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verPostActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PostsLayout = new javax.swing.GroupLayout(Posts);
        Posts.setLayout(PostsLayout);
        PostsLayout.setHorizontalGroup(
            PostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PostsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPosts)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PostsLayout.createSequentialGroup()
                .addContainerGap(260, Short.MAX_VALUE)
                .addComponent(verPost, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
        );
        PostsLayout.setVerticalGroup(
            PostsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PostsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPosts, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(verPost, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        panelDeVisualizacion.add(Posts, "Ps");

        PostIndividual.setMaximumSize(new java.awt.Dimension(734, 640));
        PostIndividual.setMinimumSize(new java.awt.Dimension(734, 640));

        splitPostIndividual.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);
        splitPostIndividual.setPreferredSize(new java.awt.Dimension(719, 625));

        Post.setColumns(20);
        Post.setRows(5);
        Post.setPreferredSize(new java.awt.Dimension(719, 94));
        scrollPost.setViewportView(Post);

        splitPostIndividual.setTopComponent(scrollPost);

        Comments.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        Comments.setPreferredSize(new java.awt.Dimension(719, 90));
        scrollComments.setViewportView(Comments);

        splitPostIndividual.setRightComponent(scrollComments);

        javax.swing.GroupLayout PostIndividualLayout = new javax.swing.GroupLayout(PostIndividual);
        PostIndividual.setLayout(PostIndividualLayout);
        PostIndividualLayout.setHorizontalGroup(
            PostIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PostIndividualLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPostIndividual, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                .addContainerGap())
        );
        PostIndividualLayout.setVerticalGroup(
            PostIndividualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PostIndividualLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPostIndividual, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelDeVisualizacion.add(PostIndividual, "Pi");

        UsuarioIndividual.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/UserIcon.png"))); // NOI18N
        UsuarioIndividual.add(IconoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 28, -1, -1));

        NombreDeUsuario.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        UsuarioIndividual.add(NombreDeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 13, 504, 72));

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

        ListaInfoUser.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrollListaInfoUser.setViewportView(ListaInfoUser);

        UsuarioIndividual.add(scrollListaInfoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 690, 280));

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

        panelDeBusqueda3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BuscarPost.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BuscarPost.setText("Buscar Publicación:");
        panelDeBusqueda3.add(BuscarPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 346, 30));

        BuscarIdPost.setText("ID de Publicación:");
        panelDeBusqueda3.add(BuscarIdPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 76, -1, 20));
        panelDeBusqueda3.add(idPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 129, 30));

        buscarPost.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buscarPost.setText("Buscar Publicación");
        buscarPost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPostActionPerformed(evt);
            }
        });
        panelDeBusqueda3.add(buscarPost, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 190, -1));
        panelDeBusqueda3.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 42, 370, 140));

        getContentPane().add(panelDeBusqueda3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, 180));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/bg.png"))); // NOI18N
        Background.setMaximumSize(new java.awt.Dimension(1280, 720));
        Background.setMinimumSize(new java.awt.Dimension(1280, 720));
        Background.setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verPostActionPerformed
        cl.show(panelDeVisualizacion, "Pi");
    }//GEN-LAST:event_verPostActionPerformed

    private void buscarPostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPostActionPerformed
        cl.show(panelDeVisualizacion, "Pi");
    }//GEN-LAST:event_buscarPostActionPerformed

    private void buscarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarUserActionPerformed
        cl.show(panelDeVisualizacion, "Ui");
    }//GEN-LAST:event_buscarUserActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel BuscarID;
    private javax.swing.JLabel BuscarIdPost;
    private javax.swing.JLabel BuscarPost;
    private javax.swing.JLabel BuscarUsuario;
    private javax.swing.JList<String> Comments;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel IconoUsuario;
    private javax.swing.JLabel InfoAdicional;
    private javax.swing.JList<String> ListaInfoUser;
    private javax.swing.JList<String> ListaPosts;
    private javax.swing.JLabel NombreDeUsuario;
    private javax.swing.JTextArea Post;
    private javax.swing.JPanel PostIndividual;
    private javax.swing.JPanel Posts;
    private javax.swing.JPanel UsuarioIndividual;
    private javax.swing.JButton buscarPost;
    private javax.swing.JButton buscarUser;
    private javax.swing.JLabel buscarUserName;
    private javax.swing.JLabel email;
    private javax.swing.JTextField id;
    private javax.swing.JTextField idPost;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel nombre;
    private javax.swing.JPanel panelDeBusqueda1;
    private javax.swing.JPanel panelDeBusqueda3;
    private javax.swing.JPanel panelDeVisualizacion;
    private javax.swing.JScrollPane scrollComments;
    private javax.swing.JScrollPane scrollListaInfoUser;
    private javax.swing.JScrollPane scrollPost;
    private javax.swing.JScrollPane scrollPosts;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JSplitPane splitPostIndividual;
    private javax.swing.JLabel titleEmail;
    private javax.swing.JLabel titleID;
    private javax.swing.JLabel titleNombre;
    private javax.swing.JTextField userName;
    private javax.swing.JButton verPost;
    // End of variables declaration//GEN-END:variables
}
