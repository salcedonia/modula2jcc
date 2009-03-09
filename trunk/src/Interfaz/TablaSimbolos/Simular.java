/*
 * Simular.java
 *
 * Created on 26 de noviembre de 2008, 13:26
 */

package Interfaz.TablaSimbolos;

import TablaSimbolos.TablaSimbolos;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 *
 * @author  Administrador
 */
public class Simular extends javax.swing.JPanel {
    
    /** Creates new form Simular 
     * 
     * @param marco
     */
    private MarcoTabla marco;
    private TablaSimbolos tabla;
    private static final Logger logger = Logger.getLogger(Simular.class);

    public Simular(MarcoTabla marco) {
        initComponents();
        this.marco = marco;
        tabla = marco.getTabla();
        ambitoAct.setText(tabla.contenidoTabla());
        setSize(1100,600);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ambitoAct = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        variablesVisibles = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        ambitoSup = new javax.swing.JButton();
        ambitoInf = new javax.swing.JButton();

        ambitoAct.setColumns(20);
        ambitoAct.setRows(5);
        jScrollPane1.setViewportView(ambitoAct);

        jLabel1.setText("Ambito actual");

        variablesVisibles.setColumns(20);
        variablesVisibles.setRows(5);
        jScrollPane2.setViewportView(variablesVisibles);

        jLabel2.setText("Variables visibles en ambitos superiores");

        ambitoSup.setText("Ambito superior");
        ambitoSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ambitoSupActionPerformed(evt);
            }
        });

        ambitoInf.setText("Ambito Inferior");
        ambitoInf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ambitoInfActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(90, 90, 90)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(ambitoSup)
                    .add(ambitoInf))
                .add(103, 103, 103))
            .add(layout.createSequentialGroup()
                .add(133, 133, 133)
                .add(jLabel2)
                .addContainerGap(264, Short.MAX_VALUE))
            .add(layout.createSequentialGroup()
                .add(204, 204, 204)
                .add(jLabel1)
                .addContainerGap(316, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(93, 93, 93)
                .add(jLabel1)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(ambitoSup)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 153, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(32, 32, 32)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 50, Short.MAX_VALUE)
                        .add(ambitoInf)
                        .add(111, 111, 111))
                    .add(layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jLabel2)
                        .add(34, 34, 34)
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ambitoInfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ambitoInfActionPerformed
        
        String ambito = JOptionPane.showInputDialog(null, 
                    "Inserte el nombre del ámbito al que quiere acceder",  "Nombre del ámbito",  JOptionPane.QUESTION_MESSAGE);
        if(ambito != null)
        {
            TablaSimbolos tablaAux = tabla.accederAmbitoInf(ambito);
            if (tablaAux != null)
            {
                if(tablaAux.getContinente()!=null && tablaAux.getModPadre()== null)
                {
                    variablesVisibles.setText(tabla.dameVariablesVisibles(tablaAux.getNombre()));
                }
                else{
                    variablesVisibles.setText("No tiene variables visibles en modulos superiores");
                }
                tabla = tablaAux;
                JOptionPane.showMessageDialog(marco,"Has entrado a la tabla del procedimiento/modulo  "+ tabla.getNombre() ,"Info", JOptionPane.INFORMATION_MESSAGE);
                ambitoAct.setText(tabla.contenidoTabla());
            }
            else{
                JOptionPane.showMessageDialog(marco,"Error", "Tabla no encontrada", JOptionPane.ERROR_MESSAGE);
            }
        }
        logger.debug("Ambito nulo");
            
}//GEN-LAST:event_ambitoInfActionPerformed

    private void ambitoSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ambitoSupActionPerformed
       TablaSimbolos modPadre = tabla.getModPadre();
       TablaSimbolos continente = tabla.getContinente();
        if(continente==null && modPadre == null)
        {
            JOptionPane.showMessageDialog(marco,"Error", "Estas en la raiz", JOptionPane.ERROR_MESSAGE);
        }
        else if(continente != null){
            tabla = tabla.getContinente();
            ambitoAct.setText(tabla.contenidoTabla());
            if(tabla.getContinente()!= null || tabla.getModPadre()!= null)
            {
                if(tabla.getContinente()!= null)
                {
                    variablesVisibles.setText(tabla.getContinente().dameVariablesVisibles(tabla.getNombre()));
                }
                else {
                    variablesVisibles.setText("No tiene variables accesibles encima");
                }
            }
            else{
                variablesVisibles.setText("Estamos en la tabla raiz");
            }
            JOptionPane.showMessageDialog(marco,"Has entrado a la tabla del procedimiento/modulo  "+ tabla.getNombre() ,"Info", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
           tabla = tabla.getModPadre();
            ambitoAct.setText(tabla.contenidoTabla());
            variablesVisibles.setText("No tiene variables visibles por encima");
            }
       
}//GEN-LAST:event_ambitoSupActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ambitoAct;
    private javax.swing.JButton ambitoInf;
    private javax.swing.JButton ambitoSup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea variablesVisibles;
    // End of variables declaration//GEN-END:variables
    
}
