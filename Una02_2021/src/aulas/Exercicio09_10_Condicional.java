package aulas;
//import javax.swing.JOptionPane;
import java.util.Scanner;
public class Exercicio09_10_Condicional {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		/*double num1,num2;
num1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro n�mero: ","0"));
num2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo n�mero: ","0"));

	if (num1 > num2) {
		JOptionPane.showMessageDialog(null, "O maior n�mero � o "+num1,"MENSAGEM DO PROGARAMA", 
				JOptionPane.INFORMATION_MESSAGE);
	}
	else if (num2 > num1) {
		JOptionPane.showMessageDialog(null, "O maior n�mero � o "+num2,"MENSAGEM DO PROGRAMA",
				JOptionPane.INFORMATION_MESSAGE);
	}
	else 
		JOptionPane.showMessageDialog(null, "Os n�meros s�o iguais","MENSAGEM DO PROGRAMA",
				JOptionPane.INFORMATION_MESSAGE);*/
//--------------------------------------------------------------------------------------
		/*double nota1, nota2, media;
nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua primeira nota: ","0"));
nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua segunda nota: ","0"));
media = (nota1+nota2)/2;

	if (media >= 7) {
	JOptionPane.showMessageDialog(null, "APROVADO, sua m�dia foi "+media,"MENSAGEM DO PROGRAMA",
			JOptionPane.WARNING_MESSAGE);
}
	else
	JOptionPane.showMessageDialog(null, "REPROVADO, sua m�dia foi "+media,"MENSAGEM DO PROGRAMA",
			JOptionPane.YES_NO_OPTION);*/
//--------------------------------------------------------------------------------------
		/*double nota1, nota2, nota3, media;
nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua primeira nota: ","0"));
nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua segunda nota: ","0"));
nota3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua terceira nota: ","0"));
media = (nota1+nota2+nota3)/3;

	if ((media >= 0) && (media < 3)) {
		JOptionPane.showMessageDialog(null, "REPROVADO","MENSAGEM DO PROGRAMA",JOptionPane.YES_NO_CANCEL_OPTION);
	}
	else if ((media >= 3) && (media < 7)) {
		JOptionPane.showMessageDialog(null, "EXAME","MENSAGEM DO PROGRAMA",JOptionPane.WARNING_MESSAGE);
	}
	else 
		JOptionPane.showMessageDialog(null, "APROVADO","MENSAGEM DO PROGRAMA",JOptionPane.DEFAULT_OPTION);
	JOptionPane.showMessageDialog(null, "SUA M�DIA FOI DE "+media,"MENSAGEM DO PROGRAMA",JOptionPane.CANCEL_OPTION);*/
//--------------------------------------------------------------------------------------
		/*double x,y,z;
x = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento x da reta: ","0"));
y = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento y da reta: ","0"));
z = Double.parseDouble(JOptionPane.showInputDialog("Digite o comprimento z da reta: ","0"));

	if ( x+y > z && x+z > y && y+z > x) {
		JOptionPane.showMessageDialog(null, "FORMA UM TRI�NGULO.");
		}
	else 
		JOptionPane.showMessageDialog(null, "N�O FORMA UM TRI�NGULO.");*/

		/*double altura,pesoidealH,pesoidealM,sexo;
altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura em metros: ","0"));
sexo = Double.parseDouble(JOptionPane.showInputDialog("Digite 1 se for Homem e 2 se for Mulher: ","0"));

pesoidealH = (72.7*altura) - 58;
pesoidealM = (62.1*altura) - 44.7;

	if (sexo == 1) {
		JOptionPane.showMessageDialog(null, "O peso ideal para Homens da sua altura � de: "+pesoidealH+"Kg","MENSAGEM DO SISTEMA",JOptionPane.WARNING_MESSAGE);
	}
	else if (sexo == 2) {
		JOptionPane.showMessageDialog(null, "O peso ideal para Mulheres da sua altura � de: "+pesoidealM+"Kg","MENSAGEM DO SISTEMA",JOptionPane.WARNING_MESSAGE);
	}
	else
		JOptionPane.showMessageDialog(null, "Voc� n�o digitou o seu sexo");*/
//--------------------------------------------------------------------------------------
		/*double altura,peso,imc;
altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura em metros: ","0"));
peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso em Kg: ","0"));

imc = peso/(Math.pow(altura, 2));

	if (imc < 20) {
		JOptionPane.showMessageDialog(null, "ABAIXO DO PESO");
	}
	else if (20 <= imc && imc < 25) {
		JOptionPane.showMessageDialog(null, "PESO NORMAL");
	}
	else if (25 <= imc && imc < 30) {
		JOptionPane.showMessageDialog(null, "SOBRE PESO");
	}
	else if (30 <= imc && imc < 40) {
		JOptionPane.showMessageDialog(null, "OBESO");
	}
	else if (imc >= 40) {
		JOptionPane.showMessageDialog(null, "OBESO M�RBITO");
	}*/
//--------------------------------------------------------------------------------------
		/*double salario,novosalario;
salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu sal�rio: R$","0"));

if (salario<1000) {
	novosalario = salario*1.3;
	JOptionPane.showMessageDialog(null, "Seu novo sal�rio � de R$"+novosalario);
}
else 
	JOptionPane.showMessageDialog(null, "Que belo sal�rio");*/
//--------------------------------------------------------------------------------------
	/*int idade;
idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: ","0"));

if (idade <= 7) {
	JOptionPane.showMessageDialog(null, "Categoria: INFANTIL");
}
else if ((idade >= 8) && (idade <= 10)) {
	JOptionPane.showMessageDialog(null, "Categoria: JUVENIL");
}
else if ((idade >= 11) && (idade <= 15)) {
	JOptionPane.showMessageDialog(null, "Categoria: ADOLESCENTE");
}
else if ((idade >= 16) && (idade <= 30)) {
	JOptionPane.showMessageDialog(null, "Categoria: ADULTO");
}
else if (idade > 30) {
	JOptionPane.showMessageDialog(null, "Categoria: SENIOR");
} */
//--------------------------------------------------------------------------------------
		/*int idade;
idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: ","0"));

if (idade < 16) {
	JOptionPane.showMessageDialog(null, "N�O ELEITOR");
}
else if (idade >= 16 && idade < 18 || idade > 65) {
	JOptionPane.showMessageDialog(null, "ELEITOR FACULTATIVO");
}
else if (idade >= 18 && idade <= 65) {
	JOptionPane.showMessageDialog(null, "ELEITOR OBRIGAT�RIO");
}*/
//--------------------------------------------------------------------------------------
		/*int dia;
dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero de 1 a 7 e te direi que dia esse n�mero corresponde: ","0"));

if (dia == 1) {
	JOptionPane.showMessageDialog(null, "DOMINGO");
}
else if (dia == 2) {
	JOptionPane.showMessageDialog(null, "SEGUNDA");
}
else if (dia == 3) {
	JOptionPane.showMessageDialog(null, "TER�A");
}
else if (dia == 4) {
	JOptionPane.showMessageDialog(null, "QUARTA");
}
else if (dia == 5) {
	JOptionPane.showMessageDialog(null, "QUINTA");
}
else if (dia == 6) {
	JOptionPane.showMessageDialog(null, "SEXTA");
}
else if (dia == 7) {
	JOptionPane.showMessageDialog(null, "S�BADO");
}
else
	JOptionPane.showMessageDialog(null, "VOC� N�O DIGITOU UM N�MERO CORRESPONDENTE");*/
//--------------------------------------------------------------------------------------
	/*int mes;
mes = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero de 1 a 12 e te direi que m�s esse n�mero corresponde: ","0"));

if (mes == 1) {
	JOptionPane.showMessageDialog(null, "JANEIRO");
}
else if (mes == 2) {
	JOptionPane.showMessageDialog(null, "FEVEREIRO");
}
else if (mes == 3) {
	JOptionPane.showMessageDialog(null, "MAR�O");
}
else if (mes == 4) {
	JOptionPane.showMessageDialog(null, "ABRIL");
}
else if (mes == 5) {
	JOptionPane.showMessageDialog(null, "MAIO");
}
else if (mes == 6) {
	JOptionPane.showMessageDialog(null, "JUNHO");
}
else if (mes == 7) {
	JOptionPane.showMessageDialog(null, "JULHO");
}
else if (mes == 8) {
	JOptionPane.showMessageDialog(null, "AGOSTO");
}
else if (mes == 9) {
	JOptionPane.showMessageDialog(null, "SETEMBRO");
}
else if (mes == 10) {
	JOptionPane.showMessageDialog(null, "OUTUBRO");
}
else if (mes == 11) {
	JOptionPane.showMessageDialog(null, "NOVEMBRO");
}
else if (mes == 12) {
	JOptionPane.showMessageDialog(null, "DEZEMBRO");
}
else 
	JOptionPane.showMessageDialog(null, "Voc� n�o digitou um n�mero correspondente");*/
//--------------------------------------------------------------------------------------
		/*double num1,num2,resultado;
		int opcao;
num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero: ","0"));
num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro n�mero: ","0"));
opcao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma op��o:\n1-Somar\n2-Subtrair\n3-Multiplicar\n4-Dividir\n5-Sair","0"));

if (opcao == 1) {
	resultado = num1 + num2;
			JOptionPane.showMessageDialog(null, resultado);
}
else if (opcao == 2) {
	resultado = num1 - num2;
		JOptionPane.showMessageDialog(null, resultado);
}
else if (opcao == 3) {
	resultado = num1 * num2;
	JOptionPane.showMessageDialog(null, resultado);
}
else if (opcao == 4) {
	resultado = num1 / num2;
	JOptionPane.showMessageDialog(null, resultado);
}
JOptionPane.showMessageDialog(null, "-===-===-===-===-===-\nFIM DO PROGRAMA\n-===-===-===-===-===-");*/
//--------------------------------------------------------------------------------------
		/*double a,b,c,delta,raiz1,raiz2;
a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a: ","0"));
b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b: ","0"));
c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de c: ","0"));

delta = (Math.pow(b, 2))-4.0*a*c;
raiz1 = (-b + Math.sqrt(delta))/2.0*a;
raiz2 = (-b - Math.sqrt(delta))/2.0*a;

if (delta < 0) {
	JOptionPane.showMessageDialog(null, "Delta vale "+delta+" logo n�o existe raiz real");
}
else if (delta == 0) {
	JOptionPane.showMessageDialog(null, "Delva vale "+delta+" logo existe uma raiz real:\nRaiz1: "+String.format("%.2f", raiz1));
}
else if (delta > 0) {
	JOptionPane.showMessageDialog(null, "Delta vale "+delta+" logo existem duas ra�zes reais:\nRaiz1: "+String.format("%.2f", raiz1)+
"\nRaiz2: "+String.format("%.2f", raiz2));
}*/
//--------------------------------------------------------------------------------------
/* Suponha que uma bola de massa qualquer seja arremessada para cima 
numa velocidade v0. Qual � a velocidade v(t) e sua altura acima do 
lan�amento h(t) no instante t? A resposta, se desprezamos a resist�ncia 
do ar e um conjunto de outras pequenas influ�ncias, �:
			 v(t)=vo - gt
			 h(t)=vo*t-gt�/2
Escreva um algoritmo que permita que o usu�rio escolha um 
planeta em que quer jogar a bola e solicite v0 e t e, ent�o informa as 
particularidades da bola (velocidade e altura) */
/*double escolha=0,g=0,vo=0,t=0,v=0,h=0;

System.out.println("Escolha um planeta:\n1)Terra\n2)Marte\n3)J�piter\n4)Saturno\n5)Sair");
System.out.print("Escolha: ");
escolha = sc.nextDouble();
if (escolha >= 5 || escolha <=0) {
	System.out.println("Saindo...");
	System.out.println("FIM DO PROGRAMA");
System.exit(0);
}

System.out.print("Escolha a velocidade inicial da bola arremessada nesse planeta em m/s: ");
vo = sc.nextDouble();

System.out.print("Escolha por quanto tempo essa bola ir� percorrer em segundos: ");
t = sc.nextDouble();

if (escolha == 1) {
	g = 9.8;
}
else if (escolha == 2) {
	g = 3.7;
}
else if (escolha == 3) {
	g = 34.7;
}
else if (escolha == 4) {
	g = 24.7;
}
v= vo - g*t;
h= vo*t - g * Math.pow(t, 2)/2;
System.out.printf("Velocidade Final: %.2f\nAltura: %.2f\n",v,h);
System.out.print("FIM DO PROGRAMA");*/
//--------------------------------------------------------------------------------------
	/*double x = 0,resultado = 0;
	System.out.print("Digite um n�mero: ");
	x = sc.nextDouble();
	
	if (x < -2) {
		resultado = 2*x + 2;
		System.out.print("Resultado: "+resultado);
	}
	else if (-2 <= x && x < 3) {
		System.out.print("Resultado: 3");
	}
	else
		System.out.print("Resultado: -"+x);*/
//--------------------------------------------------------------------------------------
/*Dados tr�s valores X,Y,Z, verificar se eles podem ser os comprimentos dos lados de um 
tri�ngulo. Se eles n�o formarem um tri�ngulo escrever uma mensagem. Considerar que o 
comprimento de cada lado de um tri�ngulo � menor que a soma dos outros dois lados.*/
/*double x = 0, y = 0, z = 0;
System.out.print("Digite uma reta x,y e z e direi se forma ou n�o um tri�ngulo: ");
x = sc.nextDouble();
y = sc.nextDouble();
z = sc.nextDouble();

if (x+y > z && x+z > y && z+y > x) {
	System.out.print("FORMA UM TRI�NGULO");
}
else 
	System.out.print("N�O FORMA UM TRI�NGULO");*/
//--------------------------------------------------------------------------------------
/*8. Fa�a um programa que receba 2 n�meros e mostre o seguinte menu:
1 - Somar os dois n�meros
2 - Multiplicar os dois n�meros
3 - Subtrair o n�mero maior pelo n�mero menor (se os dois forem iguais, retorne zero)
4 - Dividir o primeiro n�mero pelo segundo (lembre-se de que n�o existe divis�o por zero)*/
	/*double num1 = 0,num2 = 0;
	int escolha = 0;
	System.out.println("Digite dois n�mero de cada vez: ");
	num1 = sc.nextDouble();
	num2 = sc.nextDouble();
	System.out.println("Escolha uma op��o:\n1)Soma\n2)Multiplica��o\n3)Subtra��o\n4)Divis�o");
	System.out.print("\nESCOLHA: ");
	escolha = sc.nextInt();
	
switch (escolha) {
	case 1: 
		System.out.printf("O resultado �: %.2f\n", num1+num2);
break;
	case 2:
		System.out.printf("O resultado �: %.2f\n", num1*num2);
break;
	case 3:
		if (num1 > num2) {
		System.out.printf("O resultado �: %.2f\n", num1-num2);
		}
		else
			System.out.printf("O resultado �: %.2f\n", num2-num1);
break;
	case 4:
		if(num2 == 0) {
			System.out.println("DIVIS�O IMPOSS�VEL");
		}
		else
		System.out.printf("O resultado �: %.2f\n", num1/num2);
break;
	default:
		System.out.println("OP��O INV�LIDA");
	}
System.out.print("FIM DO PROGRAMA");*/
//--------------------------------------------------------------------------------------
	/*	double dias;
System.out.print("Digite a quantidade de dias que voc� ficou no nosso hotel: ");
dias = sc.nextDouble();

if (dias < 15 && dias >= 0) {
	System.out.printf("O total a ser pago �: R$%.2f", dias*15);
}
else if (dias == 15) {
	System.out.printf("O total a ser pago �: R$%.2f", dias*10);
}
else if (dias > 15) {
	System.out.printf("O total a ser pago �: R$%.2f", dias*5);
}
else 
	System.out.print("Op��o inv�lida");*/
//--------------------------------------------------------------------------------------
	/*	int sexo, idade;
System.out.print("Op��es Sexo:\n1)Homem\n2)Mulher\nEscolha: ");
sexo = sc.nextInt();

switch (sexo) {
case 1:
System.out.print("Selecione sua idade:\n1)at� 15 anos\n2)16 a 18 anos\n3)19 a 30 anos\n4)31 a 40 anos\n5)Acima de 40 anos\nEscolha: ");
idade = sc.nextInt();
	if (idade == 1){
		System.out.println("Mensalidade = R$60,00");
	}
	else if (idade == 2) {
		System.out.println("Mensalidade = R$75,00");
	}
	else if (idade == 3) {
		System.out.println("Mensalidade = R$90,00");
	}
	else if (idade == 4) {
		System.out.println("Mensalidade = R$85,00");
	}
	else if (idade == 5) {
		System.out.println("Mensalidade = R$80,00");
	}
	else 
		System.out.println("Op��o inv�lida");
break;
	case 2:
System.out.print("Selecione sua idade:\n1)at� 18 anos\n2)19 a 25 anos\n3)26 a 40 anos\n4)Acima de 40 anos\nEscolha: ");
idade = sc.nextInt();
if (idade == 1){
	System.out.println("Mensalidade = R$60,00");
}
else if (idade == 2) {
	System.out.println("Mensalidade = R$90,00");
}
else if (idade == 3) {
	System.out.println("Mensalidade = R$85,00");
}
else if (idade == 4) {
	System.out.println("Mensalidade = R$80,00");
}
else 
	System.out.println("Op��o inv�lida");
break;
	default:
		System.out.println("Op��o inv�lida");
}
System.out.print("\nFIM DO PROGRAMA");*/
//--------------------------------------------------------------------------------------
	/*int apartamento = 0;
	double dias = 0, diaria = 0;
	System.out.print("Escolha uma op��o:\n1)Apartamento Simples\n2)Apartamento Duplo\nEscolha: ");
	apartamento = sc.nextInt();
	
switch(apartamento) {

	case 1:
		System.out.print("Qual a quantidade de dias que voc� esteve no hotel?\nResposta: ");
		dias = sc.nextDouble();
if (dias < 10) {
		diaria = dias * 100.0;
	}
else if (dias >= 10 && dias < 15) {
		diaria = dias * 90.0;
	}
else if (dias > 15) {
		diaria = dias * 80.0;
	}
break;

	case 2:
		System.out.print("Qual a quantidade de dias que voc� esteve no hotel?\nResposta: ");
		dias = sc.nextDouble();
if (dias < 10) {
		diaria = dias * 140.0;
	}
else if (dias >= 10 && dias < 15) {
		diaria = dias * 120.0;
	}
else if (dias > 15) {
		diaria = dias * 100.0;
	}
break;

	default:
		System.out.println("OP��O INV�LIDA");
}

System.out.printf("Valor a ser pago: R$%.2f",diaria);*/
		
		
	sc.close();
	}
}
	
		
