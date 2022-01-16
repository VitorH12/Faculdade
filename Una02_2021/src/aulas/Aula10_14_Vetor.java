package aulas;

import java.util.Scanner;

public class Aula10_14_Vetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		*  Criar um vetor de inteiros com 5 posições
		*  atribuir a cada elemento do vetor com os números:
		*  10, 15, 5, 8 e 9
		*  Mostrar os dados do vetor em um laço "for"
		*
		*/
		/*int vetorQuantidade[];
		vetorQuantidade = new int [5]; //Vetor de 5 quantidades
		
		// carregamos o vetor usando atribuição
		// dentro do próprio programa
		vetorQuantidade[0] = 10;
		vetorQuantidade[1] = 15;
		vetorQuantidade[2] = 5;
		vetorQuantidade[3] = 8;
		vetorQuantidade[4] = 9;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Na posição ["+i+"] -> "+vetorQuantidade[i]);
		}*/
//--------------------------------------------------------------------------------------		
		/*
		 * Criar um vetor de inteiros de três posições
		 * Criar um vetor de Strings com os 3 primeiros meses do ano
		 * Percorrer os vetores e mostrar os dados: do mês de janeiro a março
		 * Percorrer os vetores e mostrar os dados: de março a janeiro
		 */

			/*int vetorTri[] = {1,2,3};
			String vetorNome[] = {"Janeiro","Fevereiro","Março"};
			
			//Mostrar os dados de janeiro a março
			for (int i = 0; i<3; i++) {
				System.out.println("Na posição ("+vetorTri[i]+") -> "+vetorNome[i]);
			}
			
			System.out.println("");
			
			for (int i = 2; i>=0; i--) {
				System.out.println("Na posição ("+vetorTri[i]+") -> "+vetorNome[i]);
			}*/
//--------------------------------------------------------------------------------------		
		/*
		 * Receber o nome e a nota para um conjunto de 5 alunos
		 * ao final da entrada de dados imprimir: o nome e a nota 
		 * de todos os alunos. A soma das notas
		 */
		
		//Criando vetores
		/*String nomes[] = new String [5];
		
		double notas[]; // <- Outra forma de criar
		notas = new double [5];
		
		//Entrada de dados
		for (int i = 0; i < 5; i++) {
			System.out.println("Informe o nome do aluno "+(i+1)+": ");
			nomes[i] = sc.next();
			
			System.out.println("Informe a nota do aluno "+(i+1)+": ");
			notas[i] = sc.nextDouble();
		}
		
		//Mostrar e calcular a soma
		double soma = 0;
		for(int i = 0; i < 5; i++) {
			System.out.printf("\nNome> %s -> Notas: %.2f.",nomes[i], notas[i] );
			
			soma = soma + notas [i];
		}
			System.out.println("\n\nA soma das notas é: "+soma);*/
			
//--------------------------------------------------------------------------------------		
			/*Faça um programa para corrigir uma prova com 10 questões de multiplas
			 * escolhas fornecidas pelo usuário. As questões devem possuir respostas de
			 * "A" a "D". Criar um vetor gabarito que deverá ser carregado internamente
			 * ao programa. Ao final da entrada de dados o programa deverá mostrar a
			 * nota do usuário/aluno.
			 */
		/*char gabarito[] = {'A','B','A','C','B','C','D','D','B','A'};
		char resposta[] = new char [10];
		int contadorAcertos = 0;
		
		for (int i = 0; i < 10; i ++) {
			System.out.println("Digite a resposta da questão "+(1+i)+") do aluno: ");
			resposta[i] = sc.next().toUpperCase().charAt(0);
			
			if (resposta[i] == gabarito[i]) {
				contadorAcertos++;
			}
	}
		System.out.println("O número de acertos do aluno é de: "+contadorAcertos+"\nLogo sua nota é de: "+contadorAcertos+" pontos.");*/
		
		
		
		
	sc.close();
	}
}

