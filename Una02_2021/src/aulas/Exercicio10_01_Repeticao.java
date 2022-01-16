package aulas;

import java.util.Scanner;

public class Exercicio10_01_Repeticao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//EX 01
		//1. Faça um programa que faça a leitura de 5 valores, e para cada valor, mostre o seu dobro na tela. 
		/*double valor;
		for (int i = 1; i <= 5; i++) {
			System.out.print("Digite um valor: ");
			valor = sc.nextDouble();
			System.out.println("O dobro é: "+valor*2+"\n");
		}
		System.out.println("----------------------\nFIM DO PROGRAMA\n----------------------");*/
//--------------------------------------------------------------------------------------
//EX 02
		/*int num = 0;
		System.out.print("Digite um número: ");
		 num = sc.nextInt();
		 System.out.println("\nIMPARES: ");
		for (int i = num; i >= 1; i--) {
			if (i%2==1) 
				System.out.println(i);
		}
		System.out.println("----------------------\nFIM DO PROGRAMA\n----------------------");*/
//--------------------------------------------------------------------------------------
//EX 03	
		/*double temp = 0, media = 0, t1 = 0, t2 = 0, t3 = 0 , t4 = 0, t5 = 0;
		
		System.out.println("Digite a temperatura em BH nos primeiros 5 dias de Janeiro de 2021 em °C: ");
		
		for (int i = 1; i <= 5; i++) {
			
		temp = sc.nextDouble();
			if (i == 1) {
				t1 = temp;
			}
			else if (i == 2) {
				t2 = temp;
			}
			else if (i == 3) {
				t3 = temp;
			}
			else if (i == 4) {
				t4 = temp;
			}
			else 
				t5 = temp;
		}
		media = (t1+t2+t3+t4+t5)/5;
		System.out.println("A média de temperatura foi: "+media+"°C");
		System.out.println("----------------------\nFIM DO PROGRAMA\n----------------------");*/
//--------------------------------------------------------------------------------------
//EX 04		
		/*4. Faça um programa que leia o sexo e o peso de 10 pessoas, e mostre 
		 * quantas pessoas do sexo masculino possuem peso entre 60 e 80 kg, bem 
		 * como a quantidade de mulheres que possuem peso entre 50 e 70 kg.
		 */
		/*char sexo;
		double peso = 0;
		int pesoH = 0, pesoM = 0;
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("\nDigite o seu sexo ['H'omem/'M'ulher]: ");
			do {
			sexo = Character.toLowerCase(sc.next().charAt(0));
				if ( (sexo != 'm') && (sexo != 'h') )
					System.out.println("\n!! SEXO INVÁLIDO !!\nDigite novamente:");
			}while ( (sexo != 'm') && (sexo != 'h') );
			System.out.print("Digite o seu peso: ");
			peso = sc.nextDouble();
			
		if (sexo == 'h') {
			if ( (peso >= 60) && (peso <= 80) ) {
				pesoH ++;
												}	
			}
		else 
			if ( (peso >= 50) && (peso <= 70) ) {
				pesoM ++;
												}
		}
		System.out.println("\nQuantidade de homens entre 60Kg e 80Kg: "+pesoH);
		System.out.println("Quantidade de mulheres entre 50Kg e 70Kg: "+pesoM);*/
			
//--------------------------------------------------------------------------------------
//EX 05
	/*5. Faça um programa que leia as notas de 5 alunos, e que exiba a maior e
		menor notas entre elas.*/
	/*double nota = 0, maior = 0, menor = 0, nomeM = 0, nomeMenor = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite a nota do "+i+"° aluno: ");
			nota = sc.nextDouble();
			
			if (maior < nota) {
			maior = nota;
			nomeM = i;
			}
			else
			menor = nota;
			nomeMenor = i;
		}
		System.out.printf("A maior nota é: %.2f e é do %.0f° aluno\n",maior,nomeM);
		System.out.printf("A menor nota é: %.2f e é do %.0f° aluno\n",menor,nomeMenor);*/
//--------------------------------------------------------------------------------------
//EX 06
		/*6. Faça um programa que leia a idade e peso de sete pessoas. 
		 * Calcule e mostre:
		 * - a quantidade de pessoas com mais de 90 kg
		 * - a média das idades das sete pessoas
		 */
		/*double peso = 0, media = 0, somaPeso = 0;
		int contadorPeso = 0;
		for (int i = 1; i <= 7; i++) {
			System.out.print("Digite o peso do "+i+"° pessoa: ");
			peso = sc.nextDouble();
			
			if (peso >= 90) {
				contadorPeso ++;
			}
			somaPeso = peso + somaPeso;
			media = somaPeso/7;
		}
		System.out.printf("A quantidade de pessoas acima de 90kg é: %d.\nA média"
				+ " do peso das 7 pessoas é de %.2fKg.",contadorPeso,media);*/
		
		
		
sc.close();
		}
	}

