/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import interfaces.interfaz;
import javax.swing.JFrame;

/**
 *
 * @author LAB02
 */
public class Conexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
     interfaz w = new interfaz();
     w.setVisible(true);
     w.setBounds(0, 0, 400, 400);
     w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}