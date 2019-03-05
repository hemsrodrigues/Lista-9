//Escreva um programa que recebe uma palavra com mais de 6 caracteres e retorna os elementos da posição 1, 3 e 5.
package ldp12String;

import javax.swing.JOptionPane;

public class Exercício2 {
    public static void main(String[] args) {
        String dado;
        
        dado = JOptionPane.showInputDialog("Digite uma palavra:");
        
        System.out.println(dado.charAt(1));
        System.out.println(dado.charAt(3));
        System.out.println(dado.charAt(5));
    }
}
