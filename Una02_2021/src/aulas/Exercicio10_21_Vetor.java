package aulas;

import java.util.Scanner;

public class Exercicio10_21_Vetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int resultado[] = {2,4,6,8,10,32};
		int jogo[] = new int [6];
		int acertos = 0;
		
		for (int i=0; i<6; i++) {
			System.out.println("Digite o "+(i+1)+"° número de sua aposta: ");
			jogo[i] = sc.nextInt();
				if (jogo[i] == resultado[i])
				acertos++;		
		}
		System.out.println("A quantidade de acertos foi de: "+acertos);
		sc.close();
		}
	}