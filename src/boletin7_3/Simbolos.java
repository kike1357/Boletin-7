
package boletin7_3;

import javax.swing.JOptionPane;


/**
 *
 * @author epastorizalorenzo
 */
public class Simbolos {
    public int setNumero(){
        int numero;
        return(Integer.parseInt(JOptionPane.showInputDialog("Teclea numero")));
    } 
    
    public void comprobacion (int numero){
        if(numero>0){
            JOptionPane.showMessageDialog(null, "+");
        }
    
        else if (numero<0){    
            JOptionPane.showMessageDialog(null, "-");
        }
   
       else if (numero==0){
            JOptionPane.showMessageDialog(null, "0");
        }
   }
    
}
     
    
      
        
       
        
        
     
   

