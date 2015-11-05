
package boletin7_1;

import javax.swing.JOptionPane;

/**
 *
 * @author epastorizalorenzo
 */
public class Metodos {
    public int setNumero(){
    int numero;
    return(Integer.parseInt(JOptionPane.showInputDialog("Teclea numero")));
}
    public void comprobarPositivo(int numero){
        if(numero>=0){
            JOptionPane.showMessageDialog(null, "Es positivo");
        }
         else{
                    JOptionPane.showMessageDialog(null, "No es positivo");
                    
        }
        }
        }  
    

