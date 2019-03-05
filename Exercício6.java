//Escreva um programa que recebe duas palavras e diga se são iguais, diferenciando letras maiúsculas.
package ldp12String;

import javax.swing.JOptionPane;

public class Exercício6 {
    public static void main(String[] args) {
        String dado;
        String dado1;
        
       dado = JOptionPane.showInputDialog("Digite uma palavra:");
       dado1 = JOptionPane.showInputDialog("Digite uma palavra:");
       
        if(dado.compareTo(dado1) == 0);{
        System.out.println("Palavras iguais");
        
         }else{
            System.out.println("Palavras diferentes");    
           }
          
    }
}
