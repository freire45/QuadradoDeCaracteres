package br.com.erickfreire.quadradodecaracteres;

import java.util.Scanner;

/**
 * Programa em Java que exibe o desenho de um quadrado com caracteres
 * @author Erick Freire
 * @version 1 - Criado em 01-05-2021 as 15:04
 */

public class QuadradoDeCaracteres {
	public static void main(String[] args) {
		int numero;
		String caractere;
		Scanner entrada = new Scanner(System.in);
		Scanner entrada2 = new Scanner(System.in);
		
		System.out.println("Programa que desenha um quadrado com asteriscos: ");
		
		System.out.print("Informe o tamanho do quadrado: ");
		numero = entrada.nextInt();
		System.out.print("Informe o caractere para desenho: ");
		caractere = entrada2.nextLine();
		
		System.out.println();
		
		desenhaQuadradoDeAsteriscos(numero, caractere);

	}
	
	public static void desenhaQuadradoDeAsteriscos(int n, String c) {
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print(c);
				
				if(j == n) {
					System.out.println();
				}
			}
		}
		
	}
	

}
