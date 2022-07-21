/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccion1;

import javax.swing.JOptionPane;
public class leccion {

    
    public static void main(String[] args) {
    //Entrada
      String kfc = "";
      int orden = 0; 
       int fecha= 0;
       int cliente = 0;
        int producto = 0; 
        int cantidad = 0;
         int precio= 0;
                                       
      //proceso
            kfc = JOptionPane.showInputDialog ("Ingrese numero de orden:");
            orden = kfc.charAt();
            do {
JOptionPane.showMessageDialog(null, kfc.charAt(orden));
orden++; 
      } while (orden< kfc);
    
    kfc = JOptionPane.showInputDialog ("solo debe aseptar letras:");
    
 kfc = JOptionPane.showInputDialog ("solo datos numericos:");
    
}
}