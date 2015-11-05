package boletin7_5;

import javax.swing.JOptionPane;

/**
 *
 * @author epastorizalorenzo
 */
public class Numeros {
    public int setNum1(){
        int num1;
        return(Integer.parseInt(JOptionPane.showInputDialog("Introducir primer número")));
    }
    public int setNum2(){
        int num2;
        return(Integer.parseInt(JOptionPane.showInputDialog("Introducir segundo número")));
    }
    public int setNum3(){
        int num3;
        return(Integer.parseInt(JOptionPane.showInputDialog("Introducir tercer número")));
    }
    public void comprobar(int num1,int num2,int num3){
        if(num1==num2 && num2 == num3){
            JOptionPane.showMessageDialog(null,"Los tres numeros son iguales");
            
        }
        else if (num1 > num2 && num1 > num3){
            JOptionPane.showMessageDialog(null,"El primer número es mayor a los demás");
        }
        else if(num2>num1 && num2>num3){
            JOptionPane.showMessageDialog(null, "El segundo número es mayor a los demás");
        }
        else if(num3>num1 && num3>num2){
            JOptionPane.showMessageDialog(null,"El tercer número es mayor a los demás");
        }
        }
        }
    

