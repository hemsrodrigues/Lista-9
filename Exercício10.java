//Escreva um programa que recebe uma palavra com mais de 5 caracteres e diga se ela termina com a letra 'r' ou letra com a letra 'e'.
package ldp12String;

import javax.swing.JOptionPane;

public class Exercício10 {
     public static void main(String[] args) {
         
         String dado;
        
        dado = JOptionPane.showInputDialog("Digite uma palavra:");
        
        if(dado.startsWith("a")){
            System.out.println(dado.startsWith("a"));
        }else{
            System.out.println("Não começa nem com 'a'");
        }
        if(dado.startsWith("c")){
            System.out.println(dado.startsWith("c"));
        }else{
            System.out.println("Não começa com 'c'");
        }
     }    
}
