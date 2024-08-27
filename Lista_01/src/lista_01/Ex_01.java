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
public class Ex_01 {
    
    public static void main(String[] args){
        
      String valorString = JOptionPane.showInputDialog(null,"Insira o valor: ");
      
      double valor = Double.parseDouble(valorString);
      
      JOptionPane.showMessageDialog(null, "O valor digitado é" + valor);
      

      String descontoString = JOptionPane.showInputDialog(null,"Insita o valor do desconto: ");
      
      double desconto = Double.parseDouble(descontoString);

      
      double resultado = valor * (desconto / 100);
      
     JOptionPane.showMessageDialog(null,"O valor do seu desconto é: " + resultado);
      
    }
    
}
