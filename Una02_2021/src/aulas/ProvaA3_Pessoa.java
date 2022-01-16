package aulas;

public class ProvaA3_Pessoa {
	
	protected String nome;
	protected int idade;
	protected double altura;
	protected double peso;
	

	public ProvaA3_Pessoa () { 
		setNome("Vitor");
		setIdade(19);
		setAltura(1.7);
		setPeso(75.5);
	}
	

	
	//--------------------------------------------------------------------------------------- get / set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String exibe1() {
		return "PESSOA\nNome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura + "\nPeso: "+peso;
	}
}
