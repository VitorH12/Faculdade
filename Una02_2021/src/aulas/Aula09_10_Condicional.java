package aulas;
import java.util.Scanner;
public class Aula09_10_Condicional {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        int idade;

        System.out.print("Digite a idade da pessoa: ");
        
        idade = sc.nextInt();
        
        if (idade < 16) 
          System.out.println("N�o pode votar");
        else 
          System.out.println("Pode votar");
//--------------------------------------------------------------------------------------
		/*System.out.println("Digite os n�mero: ");
		
		int n1, n2;
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		
		//Agora vai abrir v�rias chaves por conta de ter v�rios comando no meio, na d�vida, coloca chaves em tudo.
if (n1 > n2) //NUNCA coloca, se n�o o n1 e n2 v�o ser analizados, mas as linhas abaixo sempre v�o ser executadas.
		{
			System.out.println("Maior: " + n1);   //As chaves est�o mostrando que se essa afirma��o for verdadeira, tem dois comandos pra serem executados.
			System.out.println("Menor: " + n2);
		}
		else if (n2 > n1) 
		{
			System.out.println("Maior: " + n2);
			System.out.println("Menor: " + n1);
		}
		else 
		//{
			System.out.println("Os n�meros s�o iguais"); //Aqui n�o precisa de chave pq s� tem um comando dentro
		//}
			System.out.println("FIM DO PROGRAMA"); //Caso queira que isso apare�a apenas se o else for verdadeiro, tem que abrir chaves */
		
		
		sc.close();
	}
}
	