//Escreva um programa que recebe uma palavra com mais de 6 caracteres e diga se ela começa com a letra 'a'  
package ldp12String;

import javax.swing.JOptionPane;

public class Exercício7 {
    public static void main(String[] args) {
        String dado;
        
        dado = JOptionPane.showInputDialog("Digite uma palavra:");
        System.out.println(dado.startsWith("a"));
    }
}
