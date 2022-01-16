package aulas;
import java.util.Scanner;
public class Aula09_03_IniciandoJava {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	/*int num1, num2, num3;
	double media;
	
	System.out.print("Digite o primeiro número: ");
	num1 = sc.nextInt();
			
			System.out.print("Digite o segundo número: ");
	num2 = sc.nextInt();
			
			System.out.print("Digite o terceiro número: ");
			num3 = sc.nextInt();
			
			media = (num1+num2+num3)/3.0; //3.0 para forçar virar um número real, OU coloca (double) antes do (num1...)
			
			System.out.printf("A média de %d, %d, %d é %.1f", num1,num2,num3,media);*/
//--------------------------------------------------------------------------------------
	/*int numero, dobro;
	
	System.out.print("Informe um número: ");
	numero = sc.nextInt();
	
	dobro = numero * 2;
			System.out.println("O dobro do número " + numero + " é " +dobro);
			System.out.printf("O dobro do número %d é %d", numero, dobro);
			//Alterei o arquivo para o git
			//Haha botão*/
//--------------------------------------------------------------------------------------
	/*double teste = 0; //Iniciar a variável -> n precisa, mas é pra caso você queira ter certeza que vai funcionar certinho
	double salario;
	double novoSalario;
	System.out.println("Salário: ");
	salario = sc.nextDouble(); //sc = entrada de dados -> programa fica esperando vc digitar algo
	novoSalario = salario*1.25;
	System.out.printf("O seu novo salário é: %.3f",novoSalario); //printf serve pra poder formatar na mesma linha.*/
//--------------------------------------------------------------------------------------
	//Scanner sc = new Scanner(System.in); //verificador de entrada de dados ----- System.in -> os dados vão vir do teclado
	//cria as variáveis
	/*double celsius, fahrenhite, kelvin;
	//entrada de dados
	System.out.print("Temperatura em C°: "); //"syso" + crtrl + barra de espaço
	celsius = sc.nextDouble();
	//Cálculos
	fahrenhite = 9*celsius/5+32;
	kelvin = celsius + 273.15;
	//Imprimir
	System.out.println("A temperatura em Fahrenhite é: "+
	String.format("%.2f", fahrenhite));
	
	System.out.println("A temperatura em Kelvin é: "+
	String.format("%.2f", kelvin));*/

	
	sc.close();

	}
}