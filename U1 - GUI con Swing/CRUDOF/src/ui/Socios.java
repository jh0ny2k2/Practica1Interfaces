/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import datos.Socio;
import gui.tablemodels.ModeloTableSocios;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Jh0ny2k2
 */
public class Socios extends javax.swing.JFrame {
    private LogicaApp logicaApp;
    
    private ArrayList<Socio> socios = new ArrayList<>();
    
    /**
     * Creates new form Socios
     */
    public Socios(LogicaApp logica) {
        initComponents();
        setModeloTabla();
        addVariosSocios();
        this.logicaApp = logica;
        jComboBoxOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Edad", "Cuota" }));
    }

    public void addVariosSocios () {
        Socio socio1 = new Socio(1, "jhony", 22, 1200);
        Socio socio2 = new Socio(2, "pepe", 22, 1500);
        Socio socio3 = new Socio(3, "juan", 22, 2100);
        Socio socio4 = new Socio(4, "eva", 22, 1221);
        
        socios.add(socio4);
        socios.add(socio2);
        socios.add(socio1);
        socios.add(socio3);    
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonModificarSocio = new javax.swing.JButton();
        jButtonDeleteSocio = new javax.swing.JButton();
        jTextFieldFiltro = new javax.swing.JTextField();
        jButtonOrdenar = new javax.swing.JButton();
        jButtonFiltrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButtonDeportes = new javax.swing.JButton();
        jComboBoxOrden = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSocios = new javax.swing.JTable();
        jButtonAddSocio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonModificarSocio.setText("Modificar");
        jButtonModificarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarSocioActionPerformed(evt);
            }
        });

        jButtonDeleteSocio.setText("Borrar");
        jButtonDeleteSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteSocioActionPerformed(evt);
            }
        });

        jButtonOrdenar.setText("Ordenar");
        jButtonOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarActionPerformed(evt);
            }
        });

        jButtonFiltrar.setText("Filtrar");
        jButtonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarActionPerformed(evt);
            }
        });

        jLabel4.setText("Orden");

        jButtonDeportes.setText("Gestionar Deportes");
        jButtonDeportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeportesActionPerformed(evt);
            }
        });

        jComboBoxOrden.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 48)); // NOI18N
        jLabel1.setText("Socios");

        jTableSocios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.", "Nombre", "Edad", "Cuota", "Nº Deportes"
            }
        ));
        jScrollPane1.setViewportView(jTableSocios);

        jButtonAddSocio.setText("Añadir");
        jButtonAddSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddSocioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(341, 341, 341)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonAddSocio)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonModificarSocio)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonDeleteSocio)
                                .addGap(444, 444, 444)
                                .addComponent(jButtonDeportes))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonFiltrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(33, 33, 33))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonOrdenar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12))))
                            .addComponent(jSeparator1))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAddSocio)
                    .addComponent(jButtonModificarSocio)
                    .addComponent(jButtonDeleteSocio)
                    .addComponent(jButtonDeportes))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOrdenar)
                    .addComponent(jButtonFiltrar)
                    .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public ArrayList<Socio> obtenerSocios() {
        return socios;
    }
    
    public void addSocio(Socio s) {
        socios.add(s);
        setModeloTabla();
    }
    
    private void setModeloTabla() {
        ModeloTableSocios tablaSocios = new ModeloTableSocios(obtenerSocios());
        jTableSocios.setModel(tablaSocios);
        tablaSocios.fireTableDataChanged();
    }
        

    
    private void jButtonAddSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddSocioActionPerformed
        AddSocio socio = new AddSocio(this, true);
        socio.setModificar(false);
        socio.setVisible(true);
    }//GEN-LAST:event_jButtonAddSocioActionPerformed

    private void jButtonDeportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeportesActionPerformed
        Deportes deportes = new Deportes(logicaApp);
        deportes.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jButtonDeportesActionPerformed

    private void jButtonModificarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarSocioActionPerformed
        int selectedRow = jTableSocios.getSelectedRow();
    
        if (selectedRow != -1) { 
            Socio socio = socios.get(selectedRow); 

            AddSocio addSocioDialog = new AddSocio(this, true);
            addSocioDialog.setModificar(true);
            addSocioDialog.setSocioModificar(socio); 
            addSocioDialog.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un socio para modificar.");
        }
    }//GEN-LAST:event_jButtonModificarSocioActionPerformed

    private void jButtonDeleteSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteSocioActionPerformed
        int selectedRow = jTableSocios.getSelectedRow();
        
        Socio socio = obtenerSocios().get(selectedRow);
        obtenerSocios().remove(socio);
        
        setModeloTabla();
    }//GEN-LAST:event_jButtonDeleteSocioActionPerformed

    private void jButtonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarActionPerformed
        String texto = jTextFieldFiltro.getText();
        
        ArrayList<Socio> sociosFiltrados = new ArrayList<>();

        for (Socio socio : socios) {
            if (socio.getNombre().toLowerCase().contains(texto)) {
                sociosFiltrados.add(socio);
            }
        }

        ModeloTableSocios tablaSocios = new ModeloTableSocios(sociosFiltrados);
        jTableSocios.setModel(tablaSocios);
        tablaSocios.fireTableDataChanged();
    }//GEN-LAST:event_jButtonFiltrarActionPerformed

    private void jButtonOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarActionPerformed
        String criterio = (String) jComboBoxOrden.getSelectedItem();
        ArrayList<Socio> sociosOrdenados = new ArrayList<>(socios);

        switch (criterio) {
            case "Nombre":
                sociosOrdenados.sort(Comparator.comparing(Socio::getNombre));
                break;
            case "Edad":
                sociosOrdenados.sort(Comparator.comparingInt(Socio::getEdad));
                break;
            case "Cuota":
                sociosOrdenados.sort(Comparator.comparingInt(Socio::getCuota));
                break;
            default:
                break;
        }

        ModeloTableSocios tablaSocios = new ModeloTableSocios(sociosOrdenados);
        jTableSocios.setModel(tablaSocios);
        tablaSocios.fireTableDataChanged();
    }//GEN-LAST:event_jButtonOrdenarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddSocio;
    private javax.swing.JButton jButtonDeleteSocio;
    private javax.swing.JButton jButtonDeportes;
    private javax.swing.JButton jButtonFiltrar;
    private javax.swing.JButton jButtonModificarSocio;
    private javax.swing.JButton jButtonOrdenar;
    private javax.swing.JComboBox<String> jComboBoxOrden;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableSocios;
    private javax.swing.JTextField jTextFieldFiltro;
    // End of variables declaration//GEN-END:variables
}
