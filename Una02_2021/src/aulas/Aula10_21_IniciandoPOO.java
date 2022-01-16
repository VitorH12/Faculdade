package aulas;

import java.util.Scanner;

public class Aula10_21_IniciandoPOO {
	
	// Atributos membro da classe
	// Está fora do método main
	static int idade;
	static String nome;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o nome: ");
		nome = sc.next();
		System.out.println("Informe a idade: ");
		idade = sc.nextInt();
		imprimirResultados();
		sc.close();
	}		
	static public int calcularDiasVividos(int idade) {
		return (idade * 365);
	}	
	static public void imprimirResultados() {
		System.out.println("RESULTADOS");
		System.out.println("Nome: "+nome.toUpperCase());
		System.out.println("Idade: "+idade);
		System.out.println("Dias vividos: "+calcularDiasVividos(idade)+" dias");
	}
}

