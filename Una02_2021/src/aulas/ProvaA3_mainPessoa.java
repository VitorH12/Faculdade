package aulas;

import java.util.Scanner;

public class ProvaA3_mainPessoa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ProvaA3_PessoaCliente cliente = new ProvaA3_PessoaCliente();
		ProvaA3_PessoaEmpregadoAdm adm = new ProvaA3_PessoaEmpregadoAdm();
		
		int opcao;
		
		do {
		System.out.print("Voc� �:\n1)Empregado\n2)Cliente\nOp��o: ");
		opcao = sc.nextInt();
		
		switch (opcao) {
			case 1:
				System.out.print("\nVoc� � admin?\n1)Sim\n2)N�o\nOp��o: ");
				int opcao2 = sc.nextInt();
				if (opcao2 == 1)
					System.out.println(adm.exibe4());
				else
					System.out.println(adm.exibe3());
		break;
			case 2:
				System.out.println(cliente.exibe2());
		break;
			default:
				System.out.println("\n!!Op��o inv�lida!!\n");
		}
		}while (opcao != 1 && opcao != 2);	
		
		sc.close();
	}
}