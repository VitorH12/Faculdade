package aulas;

public class Aula11_18_mainMamifero {

	public static void main(String[] args) {
		//Criar os objetos
		{Aula11_18_Mamifero bichano = new Aula11_18_MamiferoGato();
		Aula11_18_Mamifero rover = new Aula11_18_MamiferoCachorro();
		Aula11_18_Mamifero bob = new Aula11_18_MamiferoHumano();

		//Cria um vetor de mamiferos
		Aula11_18_Mamifero vetor[];
		vetor = new Aula11_18_Mamifero[3];
		//Carrega os vetores
		vetor[0] = bob;
		vetor[1] = rover;
		vetor[2] = bichano;
		//Percorrer o vetor e invocar o método.
		// Poliformismo: Capacidade de objetos distintos mas relacionados
		//de receber um estínulo e reagir de forma diferente a esse estímulo
		for(int i = 0; i < 3; i++) {
			vetor[i].comunicar();
		}	
	}

	}
}