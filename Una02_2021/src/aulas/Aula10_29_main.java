	package aulas;

	import java.util.Scanner;

	public class Aula10_29_main {
		
			public static void main(String[] args) {
				Scanner sc = new Scanner (System.in);
				
				double x;
				
				Aula10_29_conta c = new Aula10_29_conta();
				
				System.out.println("Saldo da conta inicial: R$"+ c.saldo);
				
				System.out.print("Digite um valor para depositar: R$");
					x = sc.nextDouble();
					c.depositar(x);
				
				System.out.print("Digite um valor para sacar: R$");
					x = sc.nextDouble();
					c.saque(x);
				
				System.out.println("Saldo da conta final: R$"+ c.saldo);
//------------------------------------------------------------------------------------------
				 /* int opcao = 0;
			        do{
			            System.out.println("1: Depositar");
			            System.out.println("2: Sacar");
			            System.out.println("3: Sair");
			            
			            opcao = sc.nextInt();	
			            
			            switch (opcao){
		                case 1:
		                    System.out.print("Digite o valor para depósito: ");
		                    x = sc.nextDouble();
		                    c.depositar(x);
		                    System.out.println("Saldo da conta: R$ " + c.retornarSaldo());
		                    break;

		                case 2:
		                    System.out.print("Digite o valor para saque: ");
		                    x = sc.nextDouble();
		                    c.saque(x);
		                    System.out.println("Saldo da conta: R$ " + c.retornarSaldo());
		                    break;

		                case 3:
		                    System.out.println("Fim do programa!!");
		                    break;
		                    
		                default:
		                    System.out.println("Opção inválida!!");
			            } 
			        }	while (opcao!=3); */
			        
			        sc.close();
			}	
	}
			        
	
