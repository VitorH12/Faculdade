package aulas;
import java.util.Scanner;
public class Aula09_10_Condicional {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        int idade;

        System.out.print("Digite a idade da pessoa: ");
        
        idade = sc.nextInt();
        
        if (idade < 16) 
          System.out.println("Não pode votar");
        else 
          System.out.println("Pode votar");
//--------------------------------------------------------------------------------------
		/*System.out.println("Digite os número: ");
		
		int n1, n2;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		//Agora vai abrir várias chaves por conta de ter vários comando no meio, na dúvida, coloca chaves em tudo.
if (n1 > n2) //NUNCA coloca, se não o n1 e n2 vão ser analizados, mas as linhas abaixo sempre vão ser executadas.
		{
			System.out.println("Maior: " + n1);   //As chaves estão mostrando que se essa afirmação for verdadeira, tem dois comandos pra serem executados.
			System.out.println("Menor: " + n2);
		}
		else if (n2 > n1) 
		{
			System.out.println("Maior: " + n2);
			System.out.println("Menor: " + n1);
		}
		else 
		//{
			System.out.println("Os números são iguais"); //Aqui não precisa de chave pq só tem um comando dentro
		//}
			System.out.println("FIM DO PROGRAMA"); //Caso queira que isso apareça apenas se o else for verdadeiro, tem que abrir chaves */
		
		
		sc.close();
	}
}
	