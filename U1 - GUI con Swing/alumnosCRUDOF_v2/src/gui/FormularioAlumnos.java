
package gui;

import datos.Alumno;
import gui.tablemodels.AlumnosTableModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.RowSorter.SortKey;
import javax.swing.SortOrder;
import javax.swing.table.TableRowSorter;
import logicaNegocio.LogicaNegocioAlumnos;


/**
 *
 * @author aguilera
 * 
 * alumnosCRUDOF v2.0
 * @version 2.0
 * @date 13-11-2024
 * 
 * En esta versión he tratado de usar logicaNegocioAlumnos y hay que actualizar
 * tanto su ArrayList como el del TableModel en operaciones de añadir y borrar
 * 
 */
public class FormularioAlumnos extends javax.swing.JFrame {
//public static final boolean DEBUG=true;

    private LogicaNegocioAlumnos logicaNegocio=new LogicaNegocioAlumnos();
    private AlumnosTableModel modeloTablaAlumnos;
    private TableRowSorter<AlumnosTableModel> ordencolumnas;
    
    /**
     * Creates new form FormularioAlumnos
     */
    public FormularioAlumnos() {
        initComponents();
        setModeloTabla();
        ordencolumnas=new TableRowSorter<>(modeloTablaAlumnos);
        jTableAlumnos.setRowSorter(ordencolumnas);
//        jTableAlumnos.setModel(new AlumnosTableModel(logicaNegocio.getListaAlumnos()));
    }

/*    private ArrayList<Alumno>  obtenerAlumnos(){
        ArrayList<Alumno> listaAlumnos=new ArrayList<>();
        listaAlumnos.add(new Alumno("C01","Pedro",23,3400.25));
        listaAlumnos.add(new Alumno("C02","Ana",42,3200));
        listaAlumnos.add(new Alumno("C03","Greta",26,890));
        return listaAlumnos;
    }*/
    
    private void setModeloTabla() {
        //logicaNegocio.setListaAlumnos(obtenerAlumnos());
        modeloTablaAlumnos=new AlumnosTableModel(logicaNegocio.getListaAlumnos());
        
        //modeloTablaAlumnos.setAlumnos(obtenerAlumnos());
        jTableAlumnos.setModel(modeloTablaAlumnos);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAlumnos = new javax.swing.JTable();
        jButtonAniadir = new javax.swing.JButton();
        jButtonDatos = new javax.swing.JButton();
        jButtonBorrar = new javax.swing.JButton();
        jButtonOrdenar = new javax.swing.JButton();
        jButtonFiltrar = new javax.swing.JButton();
        jTextFieldFiltro = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableAlumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableAlumnos);

        jButtonAniadir.setText("AÑADIR");
        jButtonAniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAniadirActionPerformed(evt);
            }
        });

        jButtonDatos.setText("DATOS FILA");
        jButtonDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDatosActionPerformed(evt);
            }
        });

        jButtonBorrar.setText("BORRAR");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jButtonOrdenar.setText("ORDENAR");
        jButtonOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarActionPerformed(evt);
            }
        });

        jButtonFiltrar.setText("FILTRAR");
        jButtonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascendente", "Descendente", "Sin Orden" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Nombre", "Edad", "Beca" }));

        jLabel1.setText("Filtrar por: (Nombre)");

        jLabel2.setText("Orden:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAniadir)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonDatos)
                                .addGap(28, 28, 28)
                                .addComponent(jButtonBorrar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonOrdenar)
                            .addComponent(jButtonFiltrar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAniadir)
                    .addComponent(jButtonDatos)
                    .addComponent(jButtonBorrar)
                    .addComponent(jButtonOrdenar)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonFiltrar)
                        .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDatosActionPerformed
        int fila=jTableAlumnos.getSelectedRow();
        if (fila<0) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        int seleccionado=jTableAlumnos.convertRowIndexToModel(fila);
        Alumno alumno=modeloTablaAlumnos.getAlumnos().get(seleccionado);
        String mensaje = "Datos de la Persona Seleccionada\n"
                + "Indice tabla= " + jTableAlumnos.getSelectedRow() +"\n"
                + "Indice modelo= " + seleccionado +"\n"
                + "Código: " + alumno.getCodigo() + "\n"
                + "Nombre: " + alumno.getNombre() + "\n"
                + "Edad: " + alumno.getEdad() + "\n"
                + "Cuantía Beca: " + alumno.getCuantiaBeca();
        JOptionPane.showMessageDialog(this, mensaje, "Datos", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButtonDatosActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        int fila=jTableAlumnos.getSelectedRow();
        if (fila<0) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila","ERROR",JOptionPane.ERROR_MESSAGE);
            return;
        }
        int seleccionado=jTableAlumnos.convertRowIndexToModel(fila);
        // PEDIR CONFIRMACION DE BORRADO CON SHOWCONFIRMDIALOG
        List<Alumno> nuevaLista=new ArrayList<>();
        nuevaLista=(ArrayList<Alumno>) modeloTablaAlumnos.getAlumnos();
        nuevaLista.remove(seleccionado);
        logicaNegocio.setListaAlumnos(nuevaLista);
        modeloTablaAlumnos.setAlumnos(logicaNegocio.getListaAlumnos());
        //this.jTableAlumnos.setModel(modeloTablaAlumnos);
        modeloTablaAlumnos.fireTableDataChanged();
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jButtonOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarActionPerformed
        List<SortKey> claves=new ArrayList<>();
        claves.add(new SortKey(1, SortOrder.ASCENDING));
        ordencolumnas.setSortKeys(claves);
    }//GEN-LAST:event_jButtonOrdenarActionPerformed

    private void jButtonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarActionPerformed
        RowFilter<AlumnosTableModel,Integer>  rowfilter=RowFilter.regexFilter(jTextFieldFiltro.getText(),1);
        ordencolumnas.setRowFilter(rowfilter);
    }//GEN-LAST:event_jButtonFiltrarActionPerformed

    private void jButtonAniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAniadirActionPerformed
        AltaAlumno dialogoAlta=new AltaAlumno(this, true);
        dialogoAlta.setVisible(true);
    }//GEN-LAST:event_jButtonAniadirActionPerformed

    public void aniadirAlumno(Alumno a) {
        List<Alumno> alumnos=new ArrayList<>();
        alumnos=logicaNegocio.getListaAlumnos();
        //alumnos=(ArrayList < Alumno >)modeloTablaAlumnos.getAlumnos();
        alumnos.add(a);
        logicaNegocio.setListaAlumnos(alumnos);
        modeloTablaAlumnos.setAlumnos(logicaNegocio.getListaAlumnos());
        jTableAlumnos.setModel(modeloTablaAlumnos);
        modeloTablaAlumnos.fireTableDataChanged();
    }
    
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
            //javax.swing.UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            //javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                //if ("Metal".equals(info.getName())) {
                //if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioAlumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAniadir;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonDatos;
    private javax.swing.JButton jButtonFiltrar;
    private javax.swing.JButton jButtonOrdenar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAlumnos;
    private javax.swing.JTextField jTextFieldFiltro;
    // End of variables declaration//GEN-END:variables
}
