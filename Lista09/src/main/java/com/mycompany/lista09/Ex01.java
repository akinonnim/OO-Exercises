/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author akin
 */

package com.mycompany.lista09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex01 {

    static void executar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private JFrame janela; //cria componente JFrame bonitinho e sagaz
    private JPanel painelPrincipal; //cria um componete de painel
    private JLabel label1, lblr, t3;//cria componente de label
    private JTextField t1 , t2;//cria componentes de Campo de Texto

    public static void main(String[] args) {
        new Ex01().montaTela();  
    }

    void montaTela() {//chama os métodos que vão formar a tela
        preparaJanela();
        preparaPainelPrincipal();
        preparaLabel();
        preparaText();
        preparaBotaoSoma();
        preparaBotaoSubtracao();
        preparaBotaoDivisao();
        preparaBotaoMultiplicacao(); 
        preparaBotaoSair();
        mostraJanela();
    }

    private void preparaJanela() {
        janela = new JFrame("Exemplo"); //JFrame como atributo
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fecha quando a gente fechar kkkkk
        janela.setSize(600,200);
        janela.setVisible(true);//booleano para visibilidade da janela
 
    }

    private void mostraJanela() {
        janela.pack();//organiza os componentes para ocupar o menor espaço possivel
    }

   
    private void preparaPainelPrincipal() {
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.PAGE_AXIS));
        janela.add(painelPrincipal);
        painelPrincipal.setLayout(new GridLayout(3, 2));//layout em tabela com três linhas e duas colunas
    }
    
    private void preparaLabel(){//insere o label1 e adiciona o label no painel
        label1 = new JLabel("Calculando Soma de 2 números");
        painelPrincipal.add(label1);
    }
    
    private void preparaText(){//insere texto no label, espaços aos text fields e adiciona os componetes ao painel
        
        t1 = new JTextField("");
        t2 = new JTextField("");
        lblr=new JLabel("Resltado = ");
        t3 = new JLabel("");
        painelPrincipal.add(t1);
        painelPrincipal.add(t2);
        painelPrincipal.add(lblr);
        painelPrincipal.add(t3);
        
    }
     
    private void preparaBotaoSoma(){
        JButton botaoCarregar = new JButton("soma");
        botaoCarregar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int soma = Integer.parseInt(t1.getText())
                        + Integer.parseInt(t2.getText());
                String r = Integer.toString(soma);
                t3.setText(r);
            }
        });
        
            painelPrincipal.setLocation (50,100);//posição do painel no frame
            painelPrincipal.add (botaoCarregar);//adiciona botão ao painel
        } //criar botão, usar a interface ActionListener para disparar o clique e acionar o método
 
    //subtração
     private void preparaBotaoSubtracao(){
        JButton botaoCarregar = new JButton("subtraçao");
        botaoCarregar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int subtrai = Integer.parseInt(t1.getText())
                        - Integer.parseInt(t2.getText());
                String r = Integer.toString(subtrai);
                t3.setText(r);
            }
        });
        
            painelPrincipal.setLocation (50,100);//posição do painel no frame
            painelPrincipal.add (botaoCarregar);//adiciona botão ao painel
        }
     
     private void preparaBotaoMultiplicacao(){
        JButton botaoCarregar = new JButton("Multiplicação");
        botaoCarregar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                int multiplica = Integer.parseInt(t1.getText())
                        * Integer.parseInt(t2.getText());
                String r = Integer.toString(multiplica);
                t3.setText(r);
            }
        });
        
            painelPrincipal.setLocation (50,100);//posição do painel no frame
            painelPrincipal.add (botaoCarregar);//adiciona botão ao painel
        }
    
      private void preparaBotaoDivisao(){
        JButton botaoCarregar = new JButton("Divisão");
        botaoCarregar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                float divide = Integer.parseInt(t1.getText())/
                         Integer.parseInt(t2.getText());
                String r = Float.toString(divide);
                t3.setText(r);
            }
        });
        
            painelPrincipal.setLocation (50,100);//posição do painel no frame
            painelPrincipal.add (botaoCarregar);//adiciona botão ao painel
        }
    
    private void preparaBotaoSair() {
        JButton botaoSair = new JButton("Sair");
        botaoSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        painelPrincipal.add(botaoSair);//adiciona botão Sair ao painel
    }
} 