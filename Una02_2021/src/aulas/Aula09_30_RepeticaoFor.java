package aulas;

import java.util.Scanner;

public class Aula09_30_RepeticaoFor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//Imprima n�meros pares de 1 a 10
		//e um que imprima s� os numeros pares
		/*for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("----------\nPAR\n----------");
		for(int i=1; i<=10; i++) {	
			if(i%2==0)
				System.out.println(i);
		}*/
//--------------------------------------------------------------------------------------			
	// cria��o e inicializa��o da vari�vel "i" (int i=1)
	// condi��o (i<=10)
	// contador (i++ => i = i + 1)
	/*for(int i=1; i<=10; i++) {
	//if (i==4)
	// break;
	if (i==4) {
	i=1;
	continue;
	}
	// % (mod) => resulta o resto da divis�o
	if(i%2==0)
	System.out.println(i);
	// Na estrutura do/while, while, for � poss�vel usar os comandos:
	// "continue" => volta ao in�cio do loop
	// "break"	=> sai do loop
	}
	System.out.println("PROGRAMA FINALIZADO");*/
//--------------------------------------------------------------------------------------		
		/*
		 * SLIDE 9 - MOD5 - REPETICAO FOR
		 * Fa�a um programa para mostrar os n�meros de 1 a 10
		 * em ordem invertida. Use a estrutura de repeti��o: for
		 */
	/*for(int i=10; i>0; i--) {
		System.out.println(i);
	}
	System.out.println("PROGRAMA FINALIZADO!");*/
//--------------------------------------------------------------------------------------
		/*
		 * SLIDE 13 - MOD5 REPETICAO FOR
		 * Fa�a um programa que leia 2 n�meros e imprima todos 
		 * os n�meros inteiros existentes entre esses dois n�meros
		 */
		/*int limiteInicial = 0, limiteFinal = 0;
		System.out.println("Digite um n�mero inteiro: ");
		limiteInicial = sc.nextInt();
		System.out.println("Digite um outro n�mero inteiro: ");
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
