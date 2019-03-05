//Escreva um programa que recebe uma palavra, gere um array com todos os caracteres da palavra. Mostre o array.
package ldp12String;

import javax.swing.JOptionPane;

public class Exercício11 {
    public static void main(String[] args) {
        String dado;
        
        dado = JOptionPane.showInputDialog("Digite uma palavra:");
        
        for(char d : dado.toCharArray()){
        System.out.println(+d);
            }
        
    }
}
