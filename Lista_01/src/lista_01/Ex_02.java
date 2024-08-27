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
public class Ex_02 {
    public static final double min_salario = 1412.00;
   public static void main(String[] args){
       String valorS = JOptionPane.showInputDialog(null, "Digite o Salário: ");
       double valor = Double.parseDouble(valorS);
       double qtd = valor / min_salario;
       
       JOptionPane.showMessageDialog(null, "Voce recebe " + qtd);
             
   
   }
}
