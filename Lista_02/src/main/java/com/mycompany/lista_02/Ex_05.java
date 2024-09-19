/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_02;
import javax.swing.JOptionPane;


/**
 *
 * @author akin
 */
public class Ex_05 {
 
 
 
    public static void main(String[] args) {

        String idade = JOptionPane.showInputDialog("Digite a sua idade: ");

        int idd = Integer.parseInt(idade);

        if (idd > 16 && idd < 65) {
            JOptionPane.showMessageDialog(null, "Voce PRECISA votar");
        } else if (idd < 16) {
            JOptionPane.showMessageDialog(null, "Voce nem deveria estar aqui");
        } else if (idd >16 && idd <18 && idd >65){
            JOptionPane.showMessageDialog(null, "Talvez voce possa, se quiser");
        }
    }
}
 
