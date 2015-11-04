
package boletin7_2;

import javax.swing.JOptionPane;

/**
 *
 * @author epastorizalorenzo
 */
public class Short {

    private static short parseShort(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public short setNumero(){
        short numero;
        return(Short.parseShort(JOptionPane.showInputDialog("Teclea el primer numero")));
    }
    public short setNumero2(){
        short numero2;
                return(Short.parseShort(JOptionPane.showInputDialog("Teclea el segundo numero")));
    }

    public void comprobacion(short numero,short numero2){
    if(numero>=numero2){
        JOptionPane.showMessageDialog(null,(numero-numero2));
    }
    else
        JOptionPane.showMessageDialog(null,(numero+numero2));
    }
}
 

   
        
    
}
