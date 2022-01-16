package aulas;

//import java.util.Scanner;

public class Aula11_05_mainData {

	public static void main(String[] args) {
		Aula11_05_Data d = new Aula11_05_Data(5,11,2021);
		Aula11_05_Data d2 = new Aula11_05_Data();
		
		System.out.println(d.exibe());
		System.out.println(d2.exibe());
		
		d.setDia(10);
		System.out.println(d.exibe());
		
/*		Scanner sc = new Scanner (System.in);
		
		int dia = 0, mes = 0, ano = 0;
		
		System.out.print("Digite o dia: ");
		dia = sc.nextInt();
		System.out.print("Digite o mes: ");
		mes = sc.nextInt();
		System.out.print("Digite o ano: ");
		ano = sc.nextInt();
		
		d.setDia(dia);
		d.setMes(mes);
		d.setAno(ano);
		
		System.out.println(d.exibe());

		sc.close();
*/
	}

}
