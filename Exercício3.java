//Escreva um programa que recebe uma palavra e mostra valor em UNICODE do caractere na posição 0. 
package ldp12String;

import javax.swing.JOptionPane;

public class Exercício3 {
    public static void main(String[] args) {
        String dado;
        
        dado = JOptionPane.showInputDialog("Digite uma palavra:");
        
        System.out.println(dado.codePointAt(0));
    }
}
