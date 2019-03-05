//Escreva um programa com três variáveis: nome; sobreMome; nomeCompleto. 
//Leia o valor de nome e sobreMome gere o nome nomeCompleto e mostre na tela.
package ldp12String;

import javax.swing.JOptionPane;

public class Exercício16 {
    public static void main(String[] args) {
        String nome;
        String sobrenome;
        String nomecomp;
        
        nome = JOptionPane.showInputDialog("Digite seu nome:");
        sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome:");
        
        nomecomp = nome+""+sobrenome;
        System.out.println(nomecomp);
    }
}
