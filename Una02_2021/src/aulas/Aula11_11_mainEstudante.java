package aulas;

import java.util.Scanner;

public class Aula11_11_mainEstudante {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		Aula11_11_Estudante es = new Aula11_11_Estudante();

		while (true) { // while(true) repetição infinita	
			System.out.print("Informe seu RA: ");
			es.setRa(sc.nextInt());
			if (es.getRa() > 0)
				break;
	}	
		System.out.print("Digite o seu nome: ");
		es.setNome(sc.next());
		
		System.out.print("Bolsista? [S]im ou [N]ão?\nResposta: ");
		char temBolsa = Character.toLowerCase(sc.next().charAt(0));
		if (temBolsa == 's')
			es.setBolsista(true);
		else
			es.setBolsista(false);
		
		System.out.print("Mensalidade: R$");
		es.setMensalidade(sc.nextDouble());
		
		System.out.println(es.exibe());
		
		sc.close();
	}

}
