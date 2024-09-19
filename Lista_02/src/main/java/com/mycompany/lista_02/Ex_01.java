/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_02;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;
 
/**
 *
 * @author akin
 */

public class Ex_01 {
 
    public static void main(String[] args) {
        String resp = JOptionPane.showInputDialog(null, "\nDigite um valor inteiro:", "Múltiplos de 3", PLAIN_MESSAGE);
        int verificador = Integer.parseInt(resp);
        if(verificador % 3 == 0){
            JOptionPane.showMessageDialog(null, "O número " + verificador + " é múltiplo de 3.");
        }else{
            JOptionPane.showMessageDialog(null, "O número " + verificador + " não é múltiplo de 3.");
        }
    }
}
