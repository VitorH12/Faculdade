package aulas;

import java.util.Scanner;

public class ProvaA3_mainProduto {

	public static void main(String[] args) {
		ProvaA3_Produto pd = new ProvaA3_Produto();
		ProvaA3_Produto pd2 = new ProvaA3_Produto();
		Scanner sc = new Scanner (System.in);
	
			System.out.print("Digite o nome do produto: ");
			String nome = sc.nextLine();
			pd.setNome(nome);
		
			System.out.print("Digite o valor do produto: R$");
			double preco = sc.nextDouble();
			pd.setPreco(preco);
		
			System.out.print("Você quer reajustar o preço? \n"
					+ "Digita um valor negativo caso a resposta seja  [NÃO] ou o valor em porcentagem para reajuste: ");
			double porcentagem = sc.nextDouble();
			pd.setReajuste(porcentagem);
		
		
		System.out.println("\nCom Scanner ->\n"+pd.exibe());
		System.out.println("\nSem Scanner ->\n"+pd2.exibe());
		
		sc.close();
	}

}

