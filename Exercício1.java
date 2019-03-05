//Escreva um programa que recebe uma palavra e retorna o caractere da posição 0.
package ldp12String;

import javax.swing.JOptionPane;

public class Exercício1 {
    
    public static void main(String[] args) {
        String dado;
        
        dado = JOptionPane.showInputDialog("Digite uma palavra:");
        
        System.out.println(dado.charAt(0));
    }
}
