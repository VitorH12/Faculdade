package aulas;
import java.util.Scanner;
public class Aula09_03_IniciandoJava {
	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	/*int num1, num2, num3;
	double media;
	
	System.out.print("Digite o primeiro n�mero: ");
	num1 = sc.nextInt();
			
			System.out.print("Digite o segundo n�mero: ");
	num2 = sc.nextInt();
			
			System.out.print("Digite o terceiro n�mero: ");
			num3 = sc.nextInt();
			
			media = (num1+num2+num3)/3.0; //3.0 para for�ar virar um n�mero real, OU coloca (double) antes do (num1...)
			
			System.out.printf("A m�dia de %d, %d, %d � %.1f", num1,num2,num3,media);*/
//--------------------------------------------------------------------------------------
	/*int numero, dobro;
	
	System.out.print("Informe um n�mero: ");
	numero = sc.nextInt();
	
	dobro = numero * 2;
			System.out.println("O dobro do n�mero " + numero + " � " +dobro);
			System.out.printf("O dobro do n�mero %d � %d", numero, dobro);
			//Alterei o arquivo para o git
			//Haha bot�o*/
//--------------------------------------------------------------------------------------
	/*double teste = 0; //Iniciar a vari�vel -> n precisa, mas � pra caso voc� queira ter certeza que vai funcionar certinho
	double salario;
	double novoSalario;
	System.out.println("Sal�rio: ");
	salario = sc.nextDouble(); //sc = entrada de dados -> programa fica esperando vc digitar algo
	novoSalario = salario*1.25;
	System.out.printf("O seu novo sal�rio �: %.3f",novoSalario); //printf serve pra poder formatar na mesma linha.*/
//--------------------------------------------------------------------------------------
	//Scanner sc = new Scanner(System.in); //verificador de entrada de dados ----- System.in -> os dados v�o vir do teclado
	//cria as vari�veis
	/*double celsius, fahrenhite, kelvin;
	//entrada de dados
	System.out.print("Temperatura em C�: "); //"syso" + crtrl + barra de espa�o
	celsius = sc.nextDouble();
	//C�lculos
	fahrenhite = 9*celsius/5+32;
	kelvin = celsius + 273.15;
	//Imprimir
	System.out.println("A temperatura em Fahrenhite �: "+
	String.format("%.2f", fahrenhite));
	
	System.out.println("A temperatura em Kelvin �: "+
	String.format("%.2f", kelvin));*/

	
	sc.close();

	}
}