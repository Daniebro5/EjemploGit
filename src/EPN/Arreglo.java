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
public class Arreglo {
    
    int arreglo[];

    Arreglo(int dimension) {
        
        arreglo = this.arreglo;
        arreglo = new int[dimension];
    }
    
    public void hashModulo(int solucionColision){
        int a = JOptionPane.YES_OPTION;
        while(a==JOptionPane.YES_OPTION){
            int clave = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un clave numerica"));
            int modulo = clave % arreglo.length;
            if(arreglo[modulo]==0){
                arreglo[modulo]=clave;
            }else{
                JOptionPane.showMessageDialog(null, "Ha existido colision, resolviendo...");
                
            }
        }
    }
    
    public void pruebaLineal(int clave){
     int x=2; 
     x=34;
     
    }
    
    
    
    
}
