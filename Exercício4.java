//Escreva um programa que recebe uma palavra com mais de 8 caracteres e mostra valor em UNICODE dos caracteres nas posições 1, 3 e 5.
package ldp12String;

import javax.swing.JOptionPane;

public class Exercício4 {
    public static void main(String[] args) {
        String dado;
        
        dado = JOptionPane.showInputDialog("Digite uma palavra:");
        
        System.out.println(dado.codePointAt(1)+" "+dado.codePointAt(3)+" "+dado.codePointAt(5));
    }
}
