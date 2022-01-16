package aulas;
import java.util.Scanner;
public class Exercicio09_03_IniciandoJava {
	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);

/*int nascimento, anoAtual, idadeAtual, idade2050;
 
System.out.print("Digite o ano de seu nascimento: ");
nascimento = sc.nextInt();

System.out.print("Digite o ano atual: ");
anoAtual = sc.nextInt();

idadeAtual = anoAtual - nascimento;
idade2050 = 2050 - nascimento;

System.out.printf("Hoje você tem %d e em 2050 você terá %d", idadeAtual, idade2050);*/
//--------------------------------------------------------------------------------------
/*double dolarHoje, carteira, dolarPessoa;

System.out.print("Digite quanto o dólar está valendo hoje: R$");
dolarHoje = sc.nextDouble();

System.out.print("Digite quanto em reais você tem hoje: R$");
carteira = sc.nextDouble();

dolarPessoa = carteira/dolarHoje;

System.out.printf("Com essa valor que você possui, é possível comprar aproximadamente U$%.2f", dolarPessoa);*/
//--------------------------------------------------------------------------------------
/*double diagMaior, diagMenor, area;

System.out.println("Esse é um calculador de Área de losango.");

System.out.print("Digite o valor da diagonal maior do seu losango, em cm: ");
diagMaior = sc.nextDouble();

System.out.print("Agora digite o valor da diagonal menor do seu losango, em cm: ");
diagMenor = sc.nextDouble();

area = (diagMaior * diagMenor)/2;
System.out.printf("O valor da Área do seu losango é de: %.2fcm", area);*/
//--------------------------------------------------------------------------------------
/*double celsius, fahrenheit;

System.out.print("Digite uma temperatura em °C: ");
celsius = sc.nextDouble();

fahrenheit = (celsius*1.8)+32;
System.out.printf("A temperatura de %.2f°C em °F é de %.2f", celsius,fahrenheit);*/
//--------------------------------------------------------------------------------------
/*double a,b,c,delta,raiz1,raiz2;

System.out.print("Digite o valor do coeficiente 'a' de sua equação: ");
a = sc.nextDouble();
System.out.print("Digite o valor do coeficiente 'b' de sua equação: ");
b = sc.nextDouble();
System.out.print("Digite o valor do coeficiente 'c' de sua equação: ");
c = sc.nextDouble();

delta = (Math.pow(b, 2))-4.0*a*c;
raiz1 = (-b + Math.sqrt(delta))/2.0*a;
raiz2 = (-b - Math.sqrt(delta))/2.0*a;
System.out.printf("O valor da raiz1 de sua equação é aproximadamente %.2f e da raiz2 é de aproximademente %.2f", raiz1,raiz2);*/
//--------------------------------------------------------------------------------------
/*double salarioMin, salarioFunc, salarioFuncMin;

System.out.print("Digite o valor do salário mínimo atual:R$");
salarioMin = sc.nextDouble();

System.out.print("Digite o valor do seu salário atual:R$");
salarioFunc = sc.nextDouble();

salarioFuncMin = salarioFunc/salarioMin;

System.out.printf("O seu salário corresponde a aproximadamente %.1fx salário mínimos.", salarioFuncMin);*/
//--------------------------------------------------------------------------------------
/*int num,x1,x2,x3,x4,x5;

System.out.print("Digite um número: ");
num = sc.nextInt();

x1 = num*1;
x2 = num*2;
x3 = num*3;
x4 = num*4;
x5 = num*5;

System.out.printf("A tabuada do 1 ao 5 do número '%d' é:\n %dx1 = %d\n %dx2 = %d\n %dx3 = %d\n %dx4 = %d\n %dx5 = %d",
num,num,x1,num,x2,num,x3,num,x4,num,x5);*/
//--------------------------------------------------------------------------------------
/*double raiz, raizcubica, cubo;
int num;

System.out.print("Digite um número inteiro: ");
num = sc.nextInt();

raiz = Math.sqrt(num);
cubo = Math.pow(num, 2);
raizcubica = Math.cbrt(num);

System.out.printf("Raiz = %.2f\nRaiz Cubica = %.2f\nCubo = %.2f", raiz,raizcubica,cubo);*/
//--------------------------------------------------------------------------------------
/*double conta,gorjeta;

System.out.print("Digite o valor da conta: ");
conta = sc.nextDouble();

gorjeta = conta*1.1;

System.out.printf("O valor da conta incluindo os 10%% de gorjeta é de: R$%.2f", gorjeta );*/
//--------------------------------------------------------------------------------------
/*int num, ant, suc, dob;
double met;

System.out.print("Digite um número:");
num = sc.nextInt();

ant = num-1;
suc = num+1;
dob = num*2;
met = num/2.0;

System.out.printf("Antecessor:%d\nSucessor:%d\nDobro:%d\nMetade:%.1f", ant,suc,dob,met);*/
//--------------------------------------------------------------------------------------
/*double altura, peso;
System.out.print("Digite o seu altura em metros: ");
altura = sc.nextDouble();

peso = (72.7*altura)-58.0;

System.out.printf("O seu peso ideal é de %.2fKg", peso);*/
//--------------------------------------------------------------------------------------
/*double altura, peso;
System.out.print("Digite o seu altura em metros: ");
altura = sc.nextDouble();

peso = (62.1*altura)-44,7;

System.out.printf("O seu peso ideal é de %.2fKg", peso);*/
//--------------------------------------------------------------------------------------
/*int A, B, a, b;
System.out.print("Digite um valor: ");
A = sc.nextInt();

System.out.print("Digite outro valor: ");
B = sc.nextInt();

b = A;
a = B;

System.out.printf("O primeiro valor é %d e o segundo é %d", a,b);*/
//--------------------------------------------------------------------------------------
	double candidato1 = 0, candidato2 = 0, nulo = 0, porc1 = 0, porc2 = 0, porc3 = 0, total = 0;
	System.out.print("Digite o número de votos do primeiro candidato:");
	candidato1 = sc.nextDouble();
	
	System.out.print("Digite o número de votos do segundo candidato: ");
	candidato2 = sc.nextDouble();
	
	System.out.print("Digite a quantidade de votos nulos: ");
	nulo = sc.nextDouble();
	
	total = candidato1 + candidato2 + nulo;
	porc1 = (candidato1*100)/total;
	porc2 = (candidato2*100)/total;
	porc3 = (nulo*100)/total;
	
	System.out.printf("A porcentagem que votou em:\n Candidato1: %.2f%%\n Candidato2: %.2f%%\n Nulo: %.2f%%", porc1,porc2,porc3);
	
	
	sc.close();
	}
	

}