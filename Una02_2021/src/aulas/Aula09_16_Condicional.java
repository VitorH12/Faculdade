package aulas;
import java.util.Scanner;
public class Aula09_16_Condicional {
	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
/*Fazer um programa para receber 4 notas, o programa deverá calcular e mostrar:
a soma das notas, a média e a situação:

Se media < 6.0 => imprimir: "* REPROVADO *"
Se media >= 6.0  e  media < 7.0 => imprimir "* RECUPERAÇÃO *";
se media  >= 7.0 => situacao = "* APROVADO * " */
/*double nota1,nota2,nota3,nota4,media;

System.out.print("Digite sua 1° nota: ");
nota1 = sc.nextDouble();
System.out.print("Digite sua 2° nota: ");
nota2 = sc.nextDouble();
System.out.print("Digite sua 3° nota: ");
nota3 = sc.nextDouble();
System.out.print("Digite sua 4° nota: ");
nota4 = sc.nextDouble();

media = (nota1+nota2+nota3+nota4)/4;

if (media < 6.0) {
	System.out.print("REPROVADO");
}
else if (media >= 6.0 && media < 7.0) {
	System.out.print("RECUPERAÇÃO");
}
else if (media >= 7.0) {
	System.out.print("APROVADO");
}*/
//--------------------------------------------------------------------------------------
double num1 = 0,num2 = 0,result = 0;
int escolha = 0;

System.out.print("Digite um número: ");
num1 = sc.nextDouble();
System.out.print("Digite mais um número: ");
num2 = sc.nextDouble();

System.out.print("O que você deseja?\n1)Soma;\n2)Subtração;\n3)Multiplicação;\n4)Divisão;\n\n");

System.out.print("Informe uma opção: \n");
escolha = sc.nextInt();
switch (escolha) {
	case 1:
	result = num1 + num2;
	System.out.printf("O resultado é: %.2f\n", result);
break;
	case 2:
	result = num1 - num2;
	System.out.printf("O resultado é: %.2f\n", result);
break;
	case 3:
	result = num1 * num2;
	System.out.printf("O resultado é: %.2f\n", result);
break;
	case 4:
		if (num2 == 0) {
			System.out.printf("IMPOSSÍVEL DIVIDIR POR 0");
		}
		else {
	result = num1 / num2;
	System.out.printf("O resultado é: %.2f\n", result);}
break;
default:
	System.out.printf("!!Opção inválida!!  ");
}
 System.out.print("\n--==--==----==--==--\nFim do Programa\n--==--==----==--==--");

 
 sc.close();
}

}