package aulas;

import java.util.Scanner;

public class Aula09_30_RepeticaoFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//Imprima números pares de 1 a 10
		//e um que imprima só os numeros pares
		/*for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("----------\nPAR\n----------");
		for(int i=1; i<=10; i++) {	
			if(i%2==0)
				System.out.println(i);
		}*/
//--------------------------------------------------------------------------------------			
	// criação e inicialização da variável "i" (int i=1)
	// condição (i<=10)
	// contador (i++ => i = i + 1)
	/*for(int i=1; i<=10; i++) {
	//if (i==4)
	// break;
	if (i==4) {
	i=1;
	continue;
	}
	// % (mod) => resulta o resto da divisão
	if(i%2==0)
	System.out.println(i);
	// Na estrutura do/while, while, for é possível usar os comandos:
	// "continue" => volta ao início do loop
	// "break"	=> sai do loop
	}
	System.out.println("PROGRAMA FINALIZADO");*/
//--------------------------------------------------------------------------------------		
		/*
		 * SLIDE 9 - MOD5 - REPETICAO FOR
		 * Faça um programa para mostrar os números de 1 a 10
		 * em ordem invertida. Use a estrutura de repetição: for
		 */
	/*for(int i=10; i>0; i--) {
		System.out.println(i);
	}
	System.out.println("PROGRAMA FINALIZADO!");*/
//--------------------------------------------------------------------------------------
		/*
		 * SLIDE 13 - MOD5 REPETICAO FOR
		 * Faça um programa que leia 2 números e imprima todos 
		 * os números inteiros existentes entre esses dois números
		 */
		/*int limiteInicial = 0, limiteFinal = 0;
		System.out.println("Digite um número inteiro: ");
		limiteInicial = sc.nextInt();
		System.out.println("Digite um outro número inteiro: ");
		limiteFinal = sc.nextInt();
		
		for (int i = limiteInicial; i <= limiteFinal; i++) {
			System.out.println(i);
		}
		System.out.println("FIM DO PROGRAMA");
		sc.close();*/
//--------------------------------------------------------------------------------------
		sc.close();
	}
}
