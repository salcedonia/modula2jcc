/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Marco.java
 *
 * Created on 12-ene-2009, 22:54:01
 */

package Interfaz;

import GestorDeErrores.GestorErrores;
import Parser.SlkAction;
import Parser.SlkError;
import Parser.SlkLog;
import Parser.SlkParser;
import Parser.SlkToken;
import Parser.SlkTree;
import Scanner.Scanner;
import TablaDeSimbolos.TablaDeSimbolos;
import Interfaz.TablaSimbolos.MarcoTabla;
import TablaSimbolos.TablaSimbolos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.StringReader;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

/**
 *
 * @author Administrador
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private PanelPrincipal _principal;
    TablaSimbolos _tablaDeSimbolos;
    /** Creates new form Marco */
    public VentanaPrincipal() {
        initComponents();
        
        _tablaDeSimbolos = new TablaSimbolos();
        this.setSize(1000,600);
        _principal = new PanelPrincipal(this);
        _principal.setSize(1000,600);
        this.setContentPane(_principal);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Compile = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JSeparator();
        view = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Compilador Modula-2 Macrogrupo 1");

        jMenu1.setText("File");

        jMenuItem1.setText("Open");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setText("Save as");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Tools");

        Compile.setText("Compile");
        Compile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompileActionPerformed(evt);
            }
        });
        jMenu2.add(Compile);
        jMenu2.add(jSeparator2);

        view.setText("View Symbol Table");
        view.setEnabled(false);
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });
        jMenu2.add(view);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);
        
        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 479, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 341, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        JFileChooser abrir = new JFileChooser();
        abrir.setCurrentDirectory(new java.io.File(".\\"));
        abrir.setSize(400, 300);
        abrir.setMultiSelectionEnabled(false);
        int seleccion=abrir.showOpenDialog(this);
        
        if (seleccion==JFileChooser.APPROVE_OPTION){
            
            File file=abrir.getSelectedFile();
            this.abrir(file);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed



    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        JFileChooser guardar = new JFileChooser();
        guardar.setCurrentDirectory(new java.io.File(".\\"));
        guardar.setSize(400,300);
        guardar.setMultiSelectionEnabled(false);
        int seleccion=guardar.showOpenDialog(this);
        
        if(seleccion == JFileChooser.APPROVE_OPTION){
        
            File file = guardar.getSelectedFile();
            this.guardarPrograma(file);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void CompileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompileActionPerformed
      GestorErrores gestorDeErrores = new GestorErrores();
		TablaDeSimbolos tablaSimbolos = new TablaDeSimbolos();
		String programa = _principal.getPrograma();
        
        System.out.println(programa);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
		if (!programa.equals("")) {

			try {
                StringReader strin = new StringReader(programa);

				Scanner scanner = new Scanner(strin, gestorDeErrores, tablaSimbolos);

				long inicio = System.currentTimeMillis();
				//System.out.println("Analizando fichero: " + System.getProperty("user.dir") + "/" + fichero + "\n");

				SlkToken tokens = new SlkToken(scanner);
				SlkLog log = new SlkLog();
				SlkError error = new SlkError(tokens, log, gestorDeErrores);
                                SlkTree     tree = new SlkTree ( log );
                                tree.show_parse_derivation ();
                                System.out.println ("=====================" );
                                System.out.println ("show_tree" );
                                System.out.println ("=====================" );
                                tree.show_tree ();
				System.out.println(" Lista de TOKENS recibidos: ");
				System.out.println("---------------------------- ");

				// Analiza la entrada a nivel sint�ctico
                //TablaSimbolos tabla = new TablaSimbolos();
                SlkParser slk = new SlkParser();
				//_tablaDeSimbolos = slk.parse(0, new SlkAction(), tokens, error, log , (short) 0, _tablaDeSimbolos);
                slk.parse(0, new SlkAction(_tablaDeSimbolos), tokens, error, log , tree, (short) 0);

				// Muestra la lista de errores (Si los hay)
				StringBuffer salida = gestorDeErrores.dameListaErrores();

				salida.append("\n--> Tiempo de ejecuci�n: " + (System.currentTimeMillis() - inicio) + " milisegundos");
                _principal.escribirCompilacion(salida.toString());
                view.setEnabled(true);
			}
			catch (Exception e) {

				if (programa.length() > 0)
					System.err.println(e.getMessage());
				else
					System.err.println("Error en proceso E/S con el fichero: no hay par�metro");
			}
		}
        else{
        _principal.escribirCompilacion("Inserta texto en el campo");}


}//GEN-LAST:event_CompileActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        
        MarcoTabla marco = new MarcoTabla(_tablaDeSimbolos);
        marco.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        marco.setVisible(true);
}//GEN-LAST:event_viewActionPerformed
    private void guardarPrograma(File file){
        try{
                FileWriter  Guardx=new FileWriter(file);
                Guardx.write(_principal.getPrograma());
                Guardx.close();
            }
            catch(Exception e){
                _principal.escribirCompilacion("No se pudo guardar el fichero");
            }
    }
    private void abrir(File file){
        try{
            //FileInputStream fil = new FileInputStream(file);
            FileReader fr = new FileReader(file);
            BufferedReader bf = new BufferedReader(fr);
            String salida = "";
            while(bf.ready()){
                salida = salida + bf.readLine() + "\n";
            }
            _principal.escribirPrograma(salida);
        }
        catch(Exception e){
            _principal.escribirPrograma("No se pudo abrir el fichero");
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Compile;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenuItem view;
    // End of variables declaration//GEN-END:variables

}
