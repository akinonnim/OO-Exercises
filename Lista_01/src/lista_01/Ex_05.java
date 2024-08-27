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
public class Ex_05 {
    
    static final double  PI = 3.14159;
    
    public static void main(String[] args){
        String alturaString = JOptionPane.showInputDialog(null,"Digite a altura da lata: ");
        double altura = Double.parseDouble(alturaString);
        
        String raioString = JOptionPane.showInputDialog(null, "Digite o volume: ");
        double raio = Double.parseDouble(raioString);
        
        double volume = PI * Math.pow(raio, 2) * altura;
        
        JOptionPane.showMessageDialog(null, "O volume é " + volume);
    }
}
