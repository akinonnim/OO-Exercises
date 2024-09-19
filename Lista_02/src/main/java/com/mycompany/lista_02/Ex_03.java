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
 
 
public class Ex_03 {
 
    public static void main(String[] args) {
        String resp = JOptionPane.showInputDialog(null, "\nDigite o valor de compra do produto:", "Calculadora de lucros", PLAIN_MESSAGE);
        float valor = Float.parseFloat(resp);
        if (valor < 20){
            double lucro1 = valor + (valor * 0.45);
            JOptionPane.showMessageDialog(null, "O produto de valor R$" + valor + " deverá ser vendido pelo valor de R$" + lucro1 + " para se obter um lucro de 45%");
        }else{
            double lucro2 = valor + (valor * 0.3);
            JOptionPane.showMessageDialog(null, "O produto de valor R$" + valor + " deverá ser vendido pelo valor de R$" + lucro2 + " para se obter um lucro de 30%");
        }
    }
}
 
