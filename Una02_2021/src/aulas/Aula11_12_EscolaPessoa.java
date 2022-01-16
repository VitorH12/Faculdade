package aulas;

public class Aula11_12_EscolaPessoa {
	/*String nome;
	char sexo;
	int anoNascimento;
	
	public int calcularIdade(int anoBase) {
		return anoBase - anoNascimento;
}*/
		//PRIVADO AGORA
	private String nome;
	private char sexo;
	private int anoNascimento;
	
	public int calcularIdade(int anoBase) {
		return anoBase - anoNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	} 
	}

