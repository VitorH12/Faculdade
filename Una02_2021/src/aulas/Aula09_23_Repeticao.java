package aulas;

import java.util.Scanner;

public class Aula09_23_Repeticao {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
/*Fazer um programa para imprimir todos os n�meros
compreendidos entre 1 e 10. Ao final da impress�o
dos n�meros, imprimir a soma destes.
- Estrutura de repeti��o do/while
- Repeti��o
- Contador
- Acumulador */

		
//DO WHILE
		
		/*int soma = 0, contador = 1, num = 0;
		
		do {
			//acumulador
			soma = soma + contador;
			//contador
			contador = contador + 1;
		} while (contador <= 10);
	System.out.println("A soma �: "+soma);*/
//--------------------------------------------------------------------------------------
	/*int contador = 1;
	double soma = 0, num = 0;
		
		do {
			System.out.print("Digite um n�mero: ");
			num = sc.nextDouble();
			
			soma = soma + num;
			contador = contador + 1;
			
		} while (contador <= 5);
	System.out.println("A soma �: "+soma);*/
//--------------------------------------------------------------------------------------	
	//Imprimir apenas a soma dos n�meros �mpares.
		/*int contador = 1;
	double soma = 0, num = 0;
		
		do {
			System.out.print("Digite um n�mero: ");
			num = sc.nextDouble();
			
				if (num % 2 == 1) {
					soma = soma + num;
				}
				
			contador = contador + 1;
		} while (contador <= 5);
	System.out.println("A soma �: "+soma);*/
//--------------------------------------------------------------------------------------
		//M�DULO 5 -> EX 1
		/*double base = 0, altura = 0;
		
		do {
			System.out.print("Digite a base de seu tri�ngulo: ");
			base = sc.nextDouble();
			
				if(base < 0) {
					System.out.println("BASE INV�LIDA");
				}
		}while (base < 0);
		
		do {
			System.out.print("Digite a altura de seu tri�ngulo: ");
			altura = sc.nextDouble();
			
				if(altura < 0) {
					System.out.println("ALTURA INV�LIDA");
				}
		}while (altura < 0);
		System.out.printf("A base de seu tri�ngulo � de: "+(base*altura)/2);*/
//--------------------------------------------------------------------------------------
		//M�DULO 5 -> EX 2
		/*double num = 0;
		String resposta = "S";
		
		do {
			System.out.print("Digite um n�mero: ");
			num = sc.nextDouble();
			
			System.out.printf("Vezes 2 = %.2f\n", num*2);
			
			System.out.println("QUER CONTINUAR [S/N]? ");
			resposta = sc.next();
			
		} while (resposta.equalsIgnoreCase("S"));
		System.out.println("FIM DO PROGRAMA");*/
//--------------------------------------------------------------------------------------
		//M�DULO 5 -> EX 3
		/*String user, senha;
		
		do {
			System.out.println("A senha n�o pode ser igual o usu�rio");
			
			System.out.print("Digite o seu usu�rio: ");
			user = sc.next();
		
			System.out.print("Digite a sua senha: ");
			senha = sc.next();
				
				if (user.equalsIgnoreCase(senha)){
					System.out.println("\nLOGIN INV�LIDO\n");
				}
		} while (user.equalsIgnoreCase(senha));
		System.out.println("\nLOGADO");*/
//--------------------------------------------------------------------------------------
		//EX 4
		/*double num1 = 0, num2 = 0, resultado = 0;
		int escolha = 0;
		
		do {
			System.out.print("Digite um n�mero: ");
			num1 = sc.nextDouble();
			System.out.print("Digite mais um n�mero: ");
			num2 = sc.nextDouble();
			
			System.out.print("\nEscolha uma op��o:\n1)Somar\n2)Subtrair\n3)Multiplicar\n4)Dividir\n5)Sair\n\nEscolha: ");
			escolha = sc.nextInt();
				switch (escolha) {
					case 1:
					resultado = num1 + num2;
				break;
					case 2:
						resultado = num1 - num2;
				break;
					case 3:
						resultado = num1 * num2;
				break;
					case 4:  
						if (num2 == 0){
							System.out.println("\nIMPOSSIVEL DIVIS�O POR 0\n");
							System.out.println("Escolha outro n�mero para dividir ["+num1+"] ou digite "
									+ "[0] para finalizar o programa\nEscolha:");
							num2 = sc.nextDouble();
								if (num2 == 0) {
									resultado = 0;
									System.out.println("-----------------\nFIM DO PROGRAMA\n-----------------");	
									System.exit(0);
								}
								else
									resultado = num1 / num2;
						}
						else
							resultado = num1 / num2; 
				break;
				} 
			System.out.printf("\nO valor �: %.2f\n\n", resultado);
		} while (escolha == 1 || escolha == 2 || escolha == 3 || escolha == 4);
		//escolha != 5

		System.out.println("-----------------\nFIM DO PROGRAMA\n-----------------"); */
		
		
	
		/*int opcao;

        do{
            System.out.println("Digite a op��o: ");
            System.out.println("1: SOMA ");
            System.out.println("2: SUBTRA��O");
            System.out.println("3: MULTIPLICA��O ");
            System.out.println("4: DIVIS�O");
            System.out.println("5: SAIR");

            opcao = sc.nextInt();

            switch (opcao){
                case 1: System.out.println("SOMA!!"); break;
                case 2: System.out.println("SUBTRA��O!!"); break;
                case 3: System.out.println("MULTIPLICA��O!!"); break;
                case 4: System.out.println("DIVIS�O!!"); break;
                case 5: System.out.println("FIM DO PROGRAMA!!"); break;
                default: System.out.println("OP��O INV�LIDA!!"); 
            }
        } while (opcao != 5);*/
//--------------------------------------------------------------------------------------
		//EX 5
		/*double nota = 0, salario = 0;
		int idade = 0;
		char sexo;
		
		do {
			System.out.print("Digite uma nota de 0 a 10: ");
			nota = sc.nextDouble();
			System.out.print("\nDigite seu sal�rio: R$");
			salario = sc.nextDouble();
			System.out.print("\nDigite a sua idade: ");
			idade = sc.nextInt();
			System.out.print("\nDigite o seu sexo [M/F]: ");
			sexo = Character.toLowerCase(sc.next().charAt(0));
			
		} while (( nota < 0 || nota > 10 ) || ( salario < 0 ) || ( idade < 0 || idade > 150 ) || ( sexo != 'm' && sexo != 'f'));
			System.out.println("---FIM DO PROGRAMA---"); */
//--------------------------------------------------------------------------------------
		//WHILE 
/*Fazer um programa para receber um n�mero indeterminado
notas de alunos. Ao final da entrada de dados imprimir a soma e a 
m�dia das notas. O programa dever� ser finalizado para uma nota
igual a -1.
- Estrutura de repeti��o while
- flag */

		/*double nota = 0, soma = 0, media = 0;
		int quantidade = 0;
		
		System.out.println("Digite a sua nota: ");
		nota = sc.nextDouble();
		
		//so entra aqui se o numero for diferente de 1, se for falso, pula pro bloco do if
		while (nota != -1) {
			quantidade = quantidade + 1;
			soma = soma + nota;
			System.out.println("Digite a sua nota: ");
			nota = sc.nextDouble();
		}
		
			if (quantidade > 0) { //caso a pessoa digite -1 de cara, iria ferrar tudo
				media = soma/quantidade;
				System.out.println("Soma: "+String.format("%.2f", soma));
				System.out.println("M�dia: "+String.format("%.2f", media));
		}
		
		System.out.println("---------------\nFIM DO PROGRAMA\n---------------");
		sc.close();*/
//--------------------------------------------------------------------------------------
	//temperatura
		//char recebe apenas 1 caracter com 1 aspas 'a' 's'
		//continuar = Character.toLowerCase(sc.next().charAt(0)); --> charAt pega apenas a primeira letra
		
		/*char continuar;
		double cel = 0, far = 0, kel = 0;
		
		do {
			System.out.println("Temperatura em Celcius: ");
			cel = sc.nextDouble();
					
			far = 9.0*cel/5.0+32;
			kel = cel + 273.15;
			
			System.out.printf("O valor em C� em F� � %.2f e em K � %.2f",far,kel);
			
			System.out.println("\nDeseja continuar? Sim ou N�o?");
			continuar = Character.toLowerCase(sc.next().charAt(0));
			
		} while (continuar != 'n');
		System.out.println("FIM DO PROGRAMA");
		sc.close();*/
//--------------------------------------------------------------------------------------
		//EX 1
		/* double num = 0, multiplicador = 0;
		 System.out.print("Digite um n�mero ou digite -1 para sair do programa: ");
		num = sc.nextDouble();
		
		while (num != -1) {
			multiplicador = num * 2;
			System.out.println("\nO dobro vale: "+ multiplicador); 
			
			System.out.print("Digite um n�mero: ");
			num = sc.nextDouble();
		}
		System.out.println("\n------------------\nFIM DO PROGRAMA\n------------------");*/
//--------------------------------------------------------------------------------------
		//EX 2
		/*double num = 0;
		System.out.print("Digite um n�mero ou digite um n�mero igual ou menor que 0 para finalizar o programa: ");
		num = sc.nextDouble();
		
		while ( (num > 0) && (num != 0) ) {
			System.out.printf("\nValor lido: "+num+"\nO quadrado: "+Math.pow(num, 2)+"\nO cubo: "+Math.pow(num, 3)+"\nA raiz quadrada: %.2f",Math.sqrt(num));
				if (num % 2 == 0 ) {
					System.out.println("\nValor lido �: PAR");
				}
				else
					System.out.println("\nValor lido �: �MPAR");
			System.out.println("\nDigite um n�mero ou digite um n�mero igual ou menor que 0 para finalizar o programa: ");
			num = sc.nextDouble();
		}
		System.out.println("\n------------------\nFIM DO PROGRAMA\n------------------");*/
//--------------------------------------------------------------------------------------
		//EX 3
		/* Fa�a um programa que receba a nota final e o total de faltas de um
		 * conjunto intdeterminado de alunos. Imprima
		 * a) a quantidade de alunos que obtiveram nota maior ou igual a 90
		 * b) a quantidade de alunos que foram reprovador (nota menor que 70) ou
		 * por falta (faltas maior ou igual a 20)
		 * c) a maior e a menor nota
		 * d) a m�dia das notas da turma
		 * O PROGRAMA FINALIZA QUANDO INFORMA UMA NOTA NEGATIVA
		 */
		/*double nota = 0, notasTotais = 0, media = 0, maior = 0, menor = 0;
		int faltas = 0, contadorMaior = 0, contadorReprovado = 0, contadorAlunos = 0;
		
		System.out.print("\nDigite a nota final de um aluno: ");
		nota = sc.nextDouble();
		System.out.print("Digite a quantidade de faltas desse aluno: ");
		faltas = sc.nextInt();
		
		while ( (nota >= 0)) {
	
			notasTotais = notasTotais + nota;
			contadorAlunos ++;
			
			if (nota > maior){
				maior = nota;
			}
			else if (nota < menor) {
				menor = nota;
			}
				
			
			if (nota >= 90) {
				contadorMaior ++;
				
				if (faltas >= 20) {
					contadorReprovado ++;
				}
			}
			
			else if ( (nota < 70) || (faltas >= 20) ) {
				contadorReprovado ++;
			}
			
			System.out.print("\nDigite a nota final de um aluno: ");
			nota = sc.nextDouble();
			System.out.print("Digite a quantidade de faltas desse aluno: ");
			faltas = sc.nextInt();
		}
		media = notasTotais/contadorAlunos;
				
		System.out.println("\nA) a quantidade de alunos que obtiveram nota maior ou igual a 90: "+contadorMaior);
		System.out.println("B) a quantidade de alunos que foram reprovador (nota menor que 70) ou"
				+ " por falta (faltas maior ou igual a 20): "+contadorReprovado);
		System.out.printf("C) a maior e a menor nota s�o respectivamente: %.1f e %.1f\n",maior,menor);
		System.out.printf("D) a m�dia das notas da turma: %.2f\n",media);*/
//--------------------------------------------------------------------------------------
//EX 04 e EX 06 foram feitos j� no "Exercicio09_24"
		
//--------------------------------------------------------------------------------------	
//EX 05
		/*int canal = 1, audiencia = 0, canal4 = 0, canal5 = 0, canal7 = 0, canal12 = 0, total = 0;
		double perc4 = 0, perc5= 0, perc7= 0, perc12 = 0;
	
		System.out.print("Digite o n�mero do canal de TV: ");
		canal = sc.nextInt();
		System.out.println("Digite quantas pessoas est�o assistindo esse canal: ");
		audiencia = sc.nextInt();
		
		while (canal != 0 ) {
			
		switch (canal) {
			case 4:
				canal4 = canal4 + audiencia;
		break;
			case 5:
				canal5 = canal5 + audiencia;
		break;
			case 7: 
				canal7 = canal7 + audiencia;
		break;
			case 12:
				canal12 = canal12 + audiencia;
		break;		
		}
		
		System.out.print("Digite o n�mero do canal de TV: ");
		canal = sc.nextInt();
		System.out.println("Digite quantas pessoas est�o assistindo esse canal: ");
		audiencia = sc.nextInt();
		
		}
		total = canal4+canal5+canal7+canal12;
		perc4 = (canal4*100)/total;
		perc5 = (canal5*100)/total;
		perc7 = (canal7*100)/total;
		perc12 = (canal12*100)/total;
		
		
		System.out.printf("O percentual de audi�ncia de cada canal:\nCANAL 4: "
				+ "%.2f%%\nCANAL 5: %.2f%%\nCANAL 7: %.2f%%\nCANAL 12: %.2ff%%",perc4,perc5,perc7,perc12);*/
		
		sc.close();
	}
}
	