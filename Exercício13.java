//Escreva um programa que recebe uma frase com 10 caracteres, mostre a frase em caixa alta.
package ldp12String;

import javax.swing.JOptionPane;

public class Exercício13 {
    public static void main(String[] args) {
        
        String dado;
        
        dado = JOptionPane.showInputDialog("Digite uma palavra:");
        
        System.out.println(dado.toUpperCase());
    }
}
