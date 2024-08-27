/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista_01;
import javax.swing.JOptionPane;
/**
 *
 * @author akin
 */
public class Ex_04 {
    public static void main (String[] args){
        
        String C = JOptionPane.showInputDialog(null," Digite o valor em centigrados: ");
        float celsius = Float.parseFloat(C);
        
        double temperatura =  (9 * celsius + 160)/5;
        
        JOptionPane.showMessageDialog(null, " deu " + temperatura); 
        
    }
}
