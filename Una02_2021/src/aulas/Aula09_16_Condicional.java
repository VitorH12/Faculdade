package aulas;
import java.util.Scanner;
public class Aula09_16_Condicional {
	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
/*Fazer um programa para receber 4 notas, o programa dever� calcular e mostrar:
a soma das notas, a m�dia e a situa��o:

Se media < 6.0 => imprimir: "* REPROVADO *"
Se media >= 6.0  e  media < 7.0 => imprimir "* RECUPERA��O *";
se media  >= 7.0 => situacao = "* APROVADO * " */
/*double nota1,nota2,nota3,nota4,media;

System.out.print("Digite sua 1� nota: ");
nota1 = sc.nextDouble();
System.out.print("Digite sua 2� nota: ");
nota2 = sc.nextDouble();
System.out.print("Digite sua 3� nota: ");
nota3 = sc.nextDouble();
System.out.print("Digite sua 4� nota: ");
nota4 = sc.nextDouble();

media = (nota1+nota2+nota3+nota4)/4;

if (media < 6.0) {
	System.out.print("REPROVADO");
}
else if (media >= 6.0 && media < 7.0) {
	System.out.print("RECUPERA��O");
}
else if (media >= 7.0) {
	System.out.print("APROVADO");
}*/
//--------------------------------------------------------------------------------------
double num1 = 0,num2 = 0,result = 0;
int escolha = 0;

System.out.print("Digite um n�mero: ");
num1 = sc.nextDouble();
System.out.print("Digite mais um n�mero: ");
num2 = sc.nextDouble();

System.out.print("O que voc� deseja?\n1)Soma;\n2)Subtra��o;\n3)Multiplica��o;\n4)Divis�o;\n\n");

System.out.print("Informe uma op��o: \n");
escolha = sc.nextInt();
switch (escolha) {
	case 1:
	result = num1 + num2;
	System.out.printf("O resultado �: %.2f\n", result);
break;
	case 2:
	result = num1 - num2;
	System.out.printf("O resultado �: %.2f\n", result);
break;
	case 3:
	result = num1 * num2;
	System.out.printf("O resultado �: %.2f\n", result);
break;
	case 4:
		if (num2 == 0) {
			System.out.printf("IMPOSS�VEL DIVIDIR POR 0");
		}
		else {
	result = num1 / num2;
	System.out.printf("O resultado �: %.2f\n", result);}
break;
default:
	System.out.printf("!!Op��o inv�lida!!  ");
}
 System.out.print("\n--==--==----==--==--\nFim do Programa\n--==--==----==--==--");

 
 sc.close();
}

}