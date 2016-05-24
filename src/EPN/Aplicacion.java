/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EPN;

import javax.swing.JOptionPane;

/**
 *
 * @author Danni Brito
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        int dimension = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la simension del arreglo"));
     
        Arreglo arreglo = new Arreglo(dimension);
        
        int metodoHash = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 Modulo 2 Cuadrado 3 plegamiento 4 truncamiento"));
        int solucionColisiones = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 prueba lineal 2 rueba cuadratica 3 doble direccion hash"));
        
        switch(metodoHash){
            case 1:
                
        }
        
    }
    
}
