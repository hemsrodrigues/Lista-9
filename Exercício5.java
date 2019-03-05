//Escreva um programa que recebe duas palavras e diga se são iguais.
package ldp12String;

import javax.swing.JOptionPane;

public class Exercício5 {
    public static void main(String[] args) {
        String dado;
        String dado1;
        
       dado = JOptionPane.showInputDialog("Digite uma palavra:");
       dado1 = JOptionPane.showInputDialog("Digite uma palavra:");
       
        if(dado.compareToIgnoreCase(dado1) == 0);{
            System.out.println("Palavras iguais");
        }else{
            System.out.println("Palavras diferentes");    
                }
    }
}
