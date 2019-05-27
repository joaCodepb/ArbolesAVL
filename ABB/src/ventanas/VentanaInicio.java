package ventanas;
//Importaciones
import java.awt.BorderLayout;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import simulador.SimuladorArbolBinario;

/**
 * Ventana de inicio para la aplicacion
 * @author Joaquin
 */
public class VentanaInicio extends javax.swing.JFrame {
    private final SimuladorArbolBinario s1=new SimuladorArbolBinario();
    private final JFrame dibujoEmergente = new JFrame("Representación gráfica");

    /**
     * Contructor
     */
    public VentanaInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.inicializar(false);
        this.dibujoEmergente.setVisible(false);
    }
    
    /**
     * Bloquear los botones
     * @param enable 
     */
    private void inicializar(boolean enable) {
        this.ok.setEnabled(enable);
        this.opciones.setEnabled(enable);
        this.botonBuscar.setEnabled(enable);
        this.botonBorrar.setEnabled(enable);
        this.botonAltura.setEnabled(enable);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botonInsertar = new javax.swing.JButton();
        opciones = new javax.swing.JComboBox();
        ok = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        botonAltura = new javax.swing.JButton();
        resultados = new javax.swing.JScrollPane();
        impresion = new javax.swing.JTextArea();
        escritorio = new javax.swing.JDesktopPane();
        internalVentana = new javax.swing.JInternalFrame();
        botonBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ABB");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonInsertar.setBackground(new java.awt.Color(255, 255, 255));
        botonInsertar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonInsertar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mas.png"))); // NOI18N
        botonInsertar.setText("Insertar Nodo");
        botonInsertar.setToolTipText("Insertar Nodo");
        botonInsertar.setBorder(null);
        botonInsertar.setBorderPainted(false);
        botonInsertar.setContentAreaFilled(false);
        botonInsertar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonInsertar.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anadir-boton-circular-delineado.png"))); // NOI18N
        botonInsertar.setFocusPainted(false);
        botonInsertar.setFocusable(false);
        botonInsertar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anadir-boton-circular-delineado.png"))); // NOI18N
        botonInsertar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/anadir-boton-circular-delineado.png"))); // NOI18N
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });
        jPanel1.add(botonInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, -1));

        opciones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        opciones.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "PreOrden", "InOrden", "PosOrden" }));
        jPanel1.add(opciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 144, -1));

        ok.setBackground(new java.awt.Color(255, 255, 255));
        ok.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ok.setText("OK.");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        jPanel1.add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, -1));

        botonBuscar.setBackground(new java.awt.Color(255, 255, 255));
        botonBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar-en-boton-circular.png"))); // NOI18N
        botonBuscar.setText("Buscar Nodo");
        botonBuscar.setToolTipText("Buscar Nodo");
        botonBuscar.setBorder(null);
        botonBuscar.setBorderPainted(false);
        botonBuscar.setContentAreaFilled(false);
        botonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBuscar.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar-en-boton-circular (1).png"))); // NOI18N
        botonBuscar.setFocusPainted(false);
        botonBuscar.setFocusable(false);
        botonBuscar.setMaximumSize(new java.awt.Dimension(105, 16));
        botonBuscar.setMinimumSize(new java.awt.Dimension(105, 16));
        botonBuscar.setPreferredSize(new java.awt.Dimension(105, 16));
        botonBuscar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar-en-boton-circular (1).png"))); // NOI18N
        botonBuscar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar-en-boton-circular (1).png"))); // NOI18N
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 110, -1));

        botonAltura.setBackground(new java.awt.Color(255, 255, 255));
        botonAltura.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonAltura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-de-borrar.png"))); // NOI18N
        botonAltura.setText("Altura del Arbol");
        botonAltura.setToolTipText("Borrar Nodo");
        botonAltura.setBorder(null);
        botonAltura.setBorderPainted(false);
        botonAltura.setContentAreaFilled(false);
        botonAltura.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAltura.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-de-borrar (1).png"))); // NOI18N
        botonAltura.setFocusPainted(false);
        botonAltura.setFocusable(false);
        botonAltura.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-de-borrar (1).png"))); // NOI18N
        botonAltura.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-de-borrar (1).png"))); // NOI18N
        botonAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAlturaActionPerformed(evt);
            }
        });
        jPanel1.add(botonAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 130, -1));

        impresion.setEditable(false);
        impresion.setColumns(20);
        impresion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        impresion.setRows(5);
        resultados.setViewportView(impresion);

        jPanel1.add(resultados, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 210, 350));

        internalVentana.setMaximizable(true);
        internalVentana.setResizable(true);
        internalVentana.setEnabled(false);
        internalVentana.setFocusCycleRoot(false);
        internalVentana.setVisible(true);

        javax.swing.GroupLayout internalVentanaLayout = new javax.swing.GroupLayout(internalVentana.getContentPane());
        internalVentana.getContentPane().setLayout(internalVentanaLayout);
        internalVentanaLayout.setHorizontalGroup(
            internalVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
        );
        internalVentanaLayout.setVerticalGroup(
            internalVentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        escritorio.add(internalVentana);
        internalVentana.setBounds(0, 0, 570, 470);

        jPanel1.add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 570, 470));

        botonBorrar.setBackground(new java.awt.Color(255, 255, 255));
        botonBorrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-de-borrar.png"))); // NOI18N
        botonBorrar.setText("Borrar Nodo");
        botonBorrar.setToolTipText("Borrar Nodo");
        botonBorrar.setBorder(null);
        botonBorrar.setBorderPainted(false);
        botonBorrar.setContentAreaFilled(false);
        botonBorrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonBorrar.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-de-borrar (1).png"))); // NOI18N
        botonBorrar.setFocusPainted(false);
        botonBorrar.setFocusable(false);
        botonBorrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-de-borrar (1).png"))); // NOI18N
        botonBorrar.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-de-borrar (1).png"))); // NOI18N
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(botonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 110, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    /**
     * Boton ok para que se ejecute la accion que ul usuario eligio en el comboBox
     * @param evt 
     */
    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        String vacio = "Vacio";
        if(s1.vacio().equals(vacio)){
            JOptionPane.showMessageDialog(rootPane, "El Arbol Esta Vacio");
        }else{
            Object opcion=this.opciones.getSelectedItem();
            String recorrido=null;
            if(opcion.equals("InOrden")){
                recorrido=this.s1.inOrden();
            }
            if(opcion.equals("PreOrden")){
                recorrido=this.s1.preOrden();
            }
            if(opcion.equals("PosOrden")){
                recorrido=this.s1.posOrden();          
            }
            this.impresion.setText("");
            this.impresion.setText(recorrido);
        }
    }//GEN-LAST:event_okActionPerformed

    /**
     * Boton bucar para realizar la busqueda del nodo deseado
     * @param evt 
     */
    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        String vacio = "Vacio";
        try{
            if(s1.vacio().equals(vacio)){
                JOptionPane.showMessageDialog(rootPane, "El Arbol Esta Vacio");
            }else{
                this.impresion.setText("");
                String recorrido;
                String si = "Si";
                try{
                    int dato_a_buscar= Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valor para Buscar"));
                    String salida=this.s1.esta(dato_a_buscar);
                    if(salida.equals(si)){
                        JOptionPane.showMessageDialog(rootPane, "Si esta el Nodo: "+dato_a_buscar);
                        recorrido=this.s1.recBuscar(dato_a_buscar);
                        this.impresion.setText(recorrido);
                    }
                    else{
                        JOptionPane.showMessageDialog(rootPane, "No esta el Nodo: "+dato_a_buscar);
                    }
                }catch(java.lang.NumberFormatException e){

                }
            }
        }catch(java.lang.IllegalArgumentException e){
            
        }
    }//GEN-LAST:event_botonBuscarActionPerformed
    
    /**
     * Boton para insertar los nodos en el arbol
     * @param evt 
     */
    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        this.dibujoEmergente.hide();
        try{
            int noNodos= Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos datos tendra el arbol:")); 
            for (int i = 0; i < noNodos; i++) {
                int dato= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor entero:")); 
                if(this.s1.insertar(dato))
                {            
                    this.inicializar(true);
                    this.repintarArbol();                   
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Ya existe el valor");
                    i--;
                }
            }
        }catch(java.lang.NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, "Ingrese un valor Entero");
        }
        botonInsertar.setText("Agregar Nodos");
        botonInsertar.setToolTipText("Agregar Nodos");
        this.impresion.setText("");
    }//GEN-LAST:event_botonInsertarActionPerformed

    /**
     * Boton que muestra la altura en el jtextArea
     * @param evt 
     */
    private void botonAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAlturaActionPerformed
        String vacio = "Vacio";
        if(s1.vacio().equals(vacio)){
            JOptionPane.showMessageDialog(rootPane, "El Arbol Esta Vacio");
        }else{
            this.impresion.setText("Altura: " + s1.altura());
        }
    }//GEN-LAST:event_botonAlturaActionPerformed

    /**
     * Boton que elimina un nodo que se encuentra en el arbol
     * @param evt 
     */
    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        String vacio = "Vacio";
        if(s1.vacio().equals(vacio)){
            JOptionPane.showMessageDialog(rootPane, "El Arbol Esta Vacio");
        }else{
            String si = "Borrado el dato: ";
            try{
                int dato= Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valor a Borar"));
                si= si + dato;
                String borrado = this.s1.borrar(dato);
                if (borrado.equals(si)){
                    JOptionPane.showMessageDialog(rootPane, "Valor Eliminado " + dato);
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Valor No existe " + dato);
                }
                this.repintarArbol();
            }catch(java.lang.NumberFormatException e){

            }
            this.impresion.setText("");
        }
    }//GEN-LAST:event_botonBorrarActionPerformed

    /*
    *Void para repintar el arbol cada vez que tiene modificacion
    */
    private void repintarArbol() {      
                Rectangle tamaño = this.internalVentana.getBounds();
                this.internalVentana = new JInternalFrame("Representación gráfica", true);
                this.escritorio.add(this.internalVentana, JLayeredPane.DEFAULT_LAYER);
                this.internalVentana.setVisible(true);
                this.internalVentana.setBounds(tamaño);
                this.internalVentana.setEnabled(false);                                           
                this.internalVentana.add(this.s1.getDibujo(), BorderLayout.CENTER);
                this.dibujoEmergente.getContentPane().add(this.s1.getDibujo());    
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaInicio().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAltura;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JTextArea impresion;
    private javax.swing.JInternalFrame internalVentana;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton ok;
    private javax.swing.JComboBox opciones;
    private javax.swing.JScrollPane resultados;
    // End of variables declaration//GEN-END:variables
}
