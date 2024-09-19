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
public class Ex_04 {
 
 
public class PlanoSaude {
 
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
 
        // Solicitar ao usuário o nome e a idade
        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a idade da pessoa: ");
        int idade = scanner.nextInt();
        // Variável para armazenar o valor da mensalidade
        double valorMensalidade = 0.0;
        // Determinar o valor da mensalidade com base na idade
        if (idade <= 10) {
            valorMensalidade = 30.00;
        } else if (idade <= 29) {
            valorMensalidade = 60.00;
        } else if (idade <= 45) {
            valorMensalidade = 120.00;
        } else if (idade <= 59) {
            valorMensalidade = 150.00;
        } else if (idade <= 65) {
            valorMensalidade = 250.00;
        } else {
            valorMensalidade = 400.00;
        }
 
     
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.printf("Valor da mensalidade: R$ %.2f%n", valorMensalidade);
        // Fechar o scanner
        scanner.close();
    }
}
}
