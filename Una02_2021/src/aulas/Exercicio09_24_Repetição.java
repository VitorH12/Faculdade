package aulas;

import java.util.Scanner;

public class Exercicio09_24_Repeti��o {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
//EX1
		/*
		 * 1. Fa�a um programa que solicite ao usu�rio que informe a matr�cula e as tr�s notas de um conjunto de alunos. O 
		 * programa dever� exibir a mensagem informando se o aluno foi aprovado (m�dia maior ou igual a 70), exame (nota maior
		 *  ou igual a 60 e menor que 70) ou reprovado (nota inferior a 60). O programa ir� terminar quando o usu�rio informar uma matr�cula 
		 * negativa. 
		 */
		/*double matricula = 0,nota1 = 0,nota2 = 0,nota3 = 0;
		do{
			System.out.println("Digite sua matr�cula ou digite um n�mero negativo para sair: ");
		matricula = sc.nextDouble();
		
		System.out.println("Digite suas 3 notas: ");
		nota1 = sc.nextDouble();
		nota2 = sc.nextDouble();
		nota3 = sc.nextDouble();
		
		double media = (nota1+nota2+nota3)/3;
				
		if (media >= 7) {
			System.out.printf("O aluno de matr�cula %.2f teve a m�dia de %.2f\nSTATUS: APROVADO.",matricula,media);
		}
		else if (media >= 6 && media < 7) {
			System.out.printf("O aluno de matr�cula %.2f teve a m�dia de %.2f\nSTATUS: EXAME",matricula,media);
		}
		else 
			System.out.printf("O aluno de matr�cula %.2f teve a m�dia de %.2f\nSTATUS: REPROVADO.",matricula,media);
	}while (matricula < 0);
		System.out.println("\n\nFIM DO PROGRAMA");*/
//--------------------------------------------------------------------------------------
//EX2
		/*2. Leia a idade de um n�mero indeterminado de pessoas. Imprima:
		 *Quantas pessoas possuem idade acima de 50 anos
		 *A m�dia de idade das pessoas
		 */
		/*double idade = 0, somaIdade = 0, media = 0, contadorMedia = 0;
		System.out.println("Digite uma idade ou digite um n�mero negativo para sair: ");
		idade = sc.nextDouble();
		
		while (idade > 0) {
		somaIdade = somaIdade + idade;
		System.out.println("Digite outra idade ou um n�mero negativo para sair: ");
		idade = sc.nextDouble();
		contadorMedia ++;
		}
		media = somaIdade/contadorMedia;
		System.out.println("A m�dia de peso das(a) "+String.format("%.0f", contadorMedia)+
				" pessoas(a) � de: "+String.format("%.2f", media)+" anos.");
		System.out.println("FIM DO PROGRAMA");*/
//--------------------------------------------------------------------------------------
//EX4 
		/*3. 4. A prefeitura de uma cidade fez uma pesquisa entre os seus 
		 * habitantes, coletando dados sobre o sal�rio e o n�mero de 
		 * filhos. A prefeitura deseja saber: 
		 *a) A m�dia do sal�rio da popula��o; 
		 *b) A m�dia do n�mero de filhos. 
		 *O final da leitura de dados dar-se-� com a entrada de sal�rios 
		 *negativos. 
		 */
		/*double mediaSalario = 0, mediaFilhos = 0, salario = 0, filhos = 0, filhosTotais = 0, salarioTotais = 0, contadorPopulacao = 0;
		
		System.out.print("Digite o seu sal�rio ou digite um n�mero negativo para finalizar: R$");
		salario = sc.nextDouble();
		do {
			System.out.print("Digite quantos filhos voc� possui: ");
		filhos = sc.nextDouble();
			if (filhos < 0 ) {
				System.out.println("\nDADOS INCORRETOS, DIGITE NOVAMENTE\n");
			}
		}while (filhos < 0);
		
		while (salario > 0) {
			filhosTotais = filhosTotais + filhos;
			salarioTotais = salarioTotais + salario;
			
			System.out.print("\nDigite mais um sal�rio ou digite um n�mero negativo para finalizar: R$");
			salario = sc.nextDouble();
			
			do {
				System.out.print("Digite quantos filhos voc� possui: ");
			filhos = sc.nextDouble();
				if (filhos < 0 ) {
				System.out.println("\nDADOS INCORRETOS, DIGITE NOVAMENTE\n");
				}
			}while (filhos < 0);
			
			contadorPopulacao++;
		}
		mediaSalario = salarioTotais/contadorPopulacao;
		mediaFilhos = filhosTotais/contadorPopulacao;
		
		System.out.println("A m�dia de salario da popula��o � de: R$"+String.format("%.2f", mediaSalario));
		System.out.println("A m�dia de filhos da popula��o � de : "+String.format("%.2f", mediaFilhos));
		System.out.println("\nFIM DO PROGRAMA");*/
//--------------------------------------------------------------------------------------		
//EX4
		/*5. Fa�a um programa que solicite ao usu�rio que informe dois n�meros e que exiba o seguinte menu:
		*1 � Somar
		*2 � Subtrair 
		*3 � Multiplicar
		*4 � Dividir
		*5 � Sair
		*Em seguida, leia a op��o escolhida e exiba o resultado de acordo com a op��o.
		*O programa ir� executar at� que  o usu�rio escolha a op��o 5.*/
		/*double num1 = 0, num2 = 0;
		int opcao = 0;
		
		do {
			System.out.print("Digite um n�mero: ");
			num1 = sc.nextDouble();
			System.out.print("Digite outro n�mero: ");
			num2 = sc.nextDouble();
			
			System.out.print("------------------\nEscolha uma op��o:\n1)Somar\n2)Subtrair\n3)Multiplicar\n4)Dividir\n5)Sair\n------------------\nOp��o: ");
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
					System.out.println("\nDIVIS�O IMPOSS�VEL\n");
				}
				else
				System.out.printf("\nResultado: %.2f\n\n", num1/num2);
				break;
				
			case 5:
				System.out.println("\nO PROGRAMA SER� FINALIZADO");
				break;
				
			default:
				System.out.println("\nOp��o inv�lida!!!\n");
				}
			
		}while (opcao != 5);
		System.out.println("\nFIM DO PROGRAMA");*/
			
		sc.close();
		}
	}
	

