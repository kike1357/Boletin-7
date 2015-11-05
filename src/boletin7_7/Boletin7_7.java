package boletin7_7;

import javax.swing.JOptionPane;

/**
 *
 * @author epastorizalorenzo
 */
public class Boletin7_7 {

    
    public static void main(String[] args) {
        double lado,base,altura,radio,PI;
        JOptionPane.showMessageDialog(null,"La opcion 1 es cuadrado,la opcion 2 es triangulo, la opcion 3 es circulo");
        String op=JOptionPane.showInputDialog("Escoger opción");
        int opcion=Integer.parseInt(op);
        
        switch(opcion){
            case 1: 
                Cadrado c=new Cadrado();
                lado= c.getLado();
                JOptionPane.showMessageDialog(null,"Area de cuadrado = "+ c.areaCadrado(lado));
                break;
            case 2: 
                Triangulo t=new Triangulo();
                base=t.getBase();
                altura=t.getAltura();
                
                JOptionPane.showMessageDialog(null,"Area de tríangulo = "+t.areaTriangulo(base,altura));
            case 3: 
                Circulo r=new Circulo();
                radio=r.getRadio();
                PI=3.14;
                JOptionPane.showMessageDialog(null,"Area de circulo = "+r.areaCirculo(radio, PI));
    }
    }
    }