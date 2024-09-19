/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_02;
    import java.util.Scanner;

/**
 *
 * @author akin
 */
public class Ex_02 { 
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        long[] valor = new long[4];

        System.out.println("Digite um número: ");
        valor[0] = teclado.nextLong();
        System.out.println("Digite um número: ");
        valor[1] = teclado.nextLong();
        System.out.println("Digite um número: ");
        valor[2] = teclado.nextLong();
        System.out.println("Digite um número: ");
        valor[3] = teclado.nextLong();

        teclado.close();
        
        boolean flag;
        
        do {
            flag = false;
            for (int i = 0; i < valor.length - 1; i++) {
                if (valor[i] > valor[i + 1]) {
                    long aux = valor[i];
                    valor[i] = valor[i + 1];
                    valor[i + 1] = aux;
                    flag = true;
                }
            }
        } while (flag);
        System.out.println("Os números em ordem crescente: ");

    }

}
 
