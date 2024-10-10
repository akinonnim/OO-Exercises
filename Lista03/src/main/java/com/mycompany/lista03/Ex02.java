/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista03;

import javax.swing.JOptionPane;

/**
 *
 * @author akin
 */
public class Ex02 {

    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o termo inicial: "));

        int termo1 = 0;
        int termo2 = 1;

        StringBuilder resultado = new StringBuilder("Sequencia at" + n + "termos:\n");
        resultado.append(termo1).append(" ");
        
        if (n>1){
    }
    
    for(int i = 3; i <= n; i++){
    
        int nextTerm = termo1 + termo2;

        resultado.append (nextTerm).append(" ");
        termo1  = termo2;
        termo2  = nextTerm;
}
JOptionPane.showMessageDialog(null, resultado.toString()); 
}
}