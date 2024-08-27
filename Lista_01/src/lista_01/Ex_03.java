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
public class Ex_03 {
    public static void main(String[] args){
    String numero1 = JOptionPane.showInputDialog(null, "Digite o primeiro numero: ");
    float num1 = Float.parseFloat(numero1);
    
    String numero2 = JOptionPane.showInputDialog(null, "Digite o segundo numero: ");
    float num2 = Float.parseFloat(numero2);
    
    float resultado = (num1 + num2) /2 ;
    
    JOptionPane.showMessageDialog(null, "A média dos numeros é: " + resultado);
    
    }
}
