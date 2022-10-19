/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fatec;

import java.io.File;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero = -1, outroNumero;
        boolean erro = true;
        
        while (erro) {
            try {
                System.out.println("Digite um Numero: ");
                numero = teclado.nextInt();
                
                System.out.println("Digite outro Numero: ");
                outroNumero = teclado.nextInt();

                erro = false;
                
                //mostra a divisão
                System.out.println("Divisão: " + (numero / outroNumero));
                
                //tenta acessar um arquivo
                FileReader f = new FileReader("c:\\teste.zip"); //este arquivo nao existe
            } 
            catch(InputMismatchException ex) {
                System.out.println("Digite somente numero...");
                System.out.println("Erro: " + ex.getMessage());
                //limpa o buffer
                teclado.nextLine();
            }
            catch (ArithmeticException ex) {
                System.out.println("Erro: Você digitou o numero 0 para"
                        + " o outro numero!!!" );
                System.out.println("Erro: " + ex.getMessage());
            }
            catch (Exception ex) { //captura todos os outros erros
                System.out.println("Erro Geral: " + ex.getMessage());
            }
        }
        System.out.println("Numero Digitado: " + numero);
    }
}
