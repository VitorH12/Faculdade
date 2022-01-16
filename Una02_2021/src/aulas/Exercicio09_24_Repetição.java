package aulas;

import java.util.Scanner;

public class Exercicio09_24_Repetição {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
//EX1
		/*
		 * 1. Faça um programa que solicite ao usuário que informe a matrícula e as três notas de um conjunto de alunos. O 
		 * programa deverá exibir a mensagem informando se o aluno foi aprovado (média maior ou igual a 70), exame (nota maior
		 *  ou igual a 60 e menor que 70) ou reprovado (nota inferior a 60). O programa irá terminar quando o usuário informar uma matrícula 
		 * negativa. 
		 */
		/*double matricula = 0,nota1 = 0,nota2 = 0,nota3 = 0;
		do{
			System.out.println("Digite sua matrícula ou digite um número negativo para sair: ");
		matricula = sc.nextDouble();
		
		System.out.println("Digite suas 3 notas: ");
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		nota3 = sc.nextDouble();
		
		double media = (nota1+nota2+nota3)/3;
				
		if (media >= 7) {
			System.out.printf("O aluno de matrícula %.2f teve a média de %.2f\nSTATUS: APROVADO.",matricula,media);
		}
		else if (media >= 6 && media < 7) {
			System.out.printf("O aluno de matrícula %.2f teve a média de %.2f\nSTATUS: EXAME",matricula,media);
		}
		else 
			System.out.printf("O aluno de matrícula %.2f teve a média de %.2f\nSTATUS: REPROVADO.",matricula,media);
	}while (matricula < 0);
		System.out.println("\n\nFIM DO PROGRAMA");*/
//--------------------------------------------------------------------------------------
//EX2
		/*2. Leia a idade de um número indeterminado de pessoas. Imprima:
		 *Quantas pessoas possuem idade acima de 50 anos
		 *A média de idade das pessoas
		 */
		/*double idade = 0, somaIdade = 0, media = 0, contadorMedia = 0;
		System.out.println("Digite uma idade ou digite um número negativo para sair: ");
		idade = sc.nextDouble();
		
		while (idade > 0) {
		somaIdade = somaIdade + idade;
		System.out.println("Digite outra idade ou um número negativo para sair: ");
		idade = sc.nextDouble();
		contadorMedia ++;
		}
		media = somaIdade/contadorMedia;
		System.out.println("A média de peso das(a) "+String.format("%.0f", contadorMedia)+
				" pessoas(a) é de: "+String.format("%.2f", media)+" anos.");
		System.out.println("FIM DO PROGRAMA");*/
//--------------------------------------------------------------------------------------
//EX4 
		/*3. 4. A prefeitura de uma cidade fez uma pesquisa entre os seus 
		 * habitantes, coletando dados sobre o salário e o número de 
		 * filhos. A prefeitura deseja saber: 
		 *a) A média do salário da população; 
		 *b) A média do número de filhos. 
		 *O final da leitura de dados dar-se-á com a entrada de salários 
		 *negativos. 
		 */
		/*double mediaSalario = 0, mediaFilhos = 0, salario = 0, filhos = 0, filhosTotais = 0, salarioTotais = 0, contadorPopulacao = 0;
		
		System.out.print("Digite o seu salário ou digite um número negativo para finalizar: R$");
		salario = sc.nextDouble();
		do {
			System.out.print("Digite quantos filhos você possui: ");
		filhos = sc.nextDouble();
			if (filhos < 0 ) {
				System.out.println("\nDADOS INCORRETOS, DIGITE NOVAMENTE\n");
			}
		}while (filhos < 0);
		
		while (salario > 0) {
			filhosTotais = filhosTotais + filhos;
			salarioTotais = salarioTotais + salario;
			
			System.out.print("\nDigite mais um salário ou digite um número negativo para finalizar: R$");
			salario = sc.nextDouble();
			
			do {
				System.out.print("Digite quantos filhos você possui: ");
			filhos = sc.nextDouble();
				if (filhos < 0 ) {
				System.out.println("\nDADOS INCORRETOS, DIGITE NOVAMENTE\n");
				}
			}while (filhos < 0);
			
			contadorPopulacao++;
		}
		mediaSalario = salarioTotais/contadorPopulacao;
		mediaFilhos = filhosTotais/contadorPopulacao;
		
		System.out.println("A média de salario da população é de: R$"+String.format("%.2f", mediaSalario));
		System.out.println("A média de filhos da população é de : "+String.format("%.2f", mediaFilhos));
		System.out.println("\nFIM DO PROGRAMA");*/
//--------------------------------------------------------------------------------------		
//EX4
		/*5. Faça um programa que solicite ao usuário que informe dois números e que exiba o seguinte menu:
		*1 – Somar
		*2 – Subtrair 
		*3 – Multiplicar
		*4 – Dividir
		*5 – Sair
		*Em seguida, leia a opção escolhida e exiba o resultado de acordo com a opção.
		*O programa irá executar até que  o usuário escolha a opção 5.*/
		/*double num1 = 0, num2 = 0;
		int opcao = 0;
		
		do {
			System.out.print("Digite um número: ");
			num1 = sc.nextDouble();
			System.out.print("Digite outro número: ");
			num2 = sc.nextDouble();
			
			System.out.print("------------------\nEscolha uma opção:\n1)Somar\n2)Subtrair\n3)Multiplicar\n4)Dividir\n5)Sair\n------------------\nOpção: ");
			opcao = sc.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.printf("\nResultado: %.2f\n\n", num1+num2);
				break;
				
			case 2:
				System.out.printf("\nResultado: %.2f\n\n", num1-num2);
				break;
				
			case 3:
				System.out.printf("\nResultado: %.2f\n\n", num1*num2);
				break;
				
			case 4:
				if (num2 <= 0) {
					System.out.println("\nDIVISÃO IMPOSSÍVEL\n");
				}
				else
				System.out.printf("\nResultado: %.2f\n\n", num1/num2);
				break;
				
			case 5:
				System.out.println("\nO PROGRAMA SERÁ FINALIZADO");
				break;
				
			default:
				System.out.println("\nOpção inválida!!!\n");
				}
			
		}while (opcao != 5);
		System.out.println("\nFIM DO PROGRAMA");*/
			
		sc.close();
		}
	}
	

