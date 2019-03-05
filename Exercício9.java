//Escreva um programa que recebe uma palavra com mais de 5 caracteres e diga se ela termina com a letra 's'  
package ldp12String;

import javax.swing.JOptionPane;

public class Exercício9 {
    public static void main(String[] args) {
        String dado;
        
        dado = JOptionPane.showInputDialog("Digite uma palavra:");
        System.out.println(dado.startsWith("s"));
    }
}
