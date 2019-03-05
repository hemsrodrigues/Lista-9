//Escreva um programa que recebe uma frase com 10 caracteres, mostre os caracteres da posição 4 até 8.
package ldp12String;

import javax.swing.JOptionPane;

public class Exercício12 {
    public static void main(String[] args) {
        
        String dado;
        
        dado = JOptionPane.showInputDialog("Digite uma palavra:");
        
        System.out.println(dado.subSequence(4,8));
    }
}
