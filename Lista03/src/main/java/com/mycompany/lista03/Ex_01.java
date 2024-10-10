 /*

* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license

* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template

*/

package com.mycompany.lista03;
 
import javax.swing.JOptionPane;

import java.util.ArrayList;
 
/**

*

* @author akin

*

* imprimir todos os numeros pares informados pelo usuario

*

*/

public class Ex_01 {
 
    public static void main(String[] args) {
 
        int valor01 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o primeiro valor: "));

        int valor02 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o segundo valor: "));
 
        ArrayList<Integer> pares = new ArrayList<>();
 
        for (int i = valor01; i <= valor02; i++) {

           if (i % 2 == 0) {

               pares.add(i);

           }

        }

        JOptionPane.showMessageDialog(null, "Os valores pares do intervalo digitado sao: " + pares);

    }

}

 