package aulas;

public class Aula11_11_Estudante {
	private int ra;
	private String nome;
	private boolean bolsista;
	private double mensalidade;
	//----------------------------------------
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		if (ra > 0)
		this.ra = ra;
		else 
			System.out.println("RA Inv�lido");
	}
	//----------------------------------------
	public String getNome() {
		
		return nome;
	}
	public void setNome(String nome) {
		if (!nome.isEmpty()) //nome n�o esta vazio 
			this.nome = nome.toUpperCase();
		else {
			System.out.println(">> O nome n�o pode ser nulo!");
			this.nome = "Nome padr�o";
		}
			}
	//----------------------------------------
	public boolean isBolsista() {
		return bolsista;
	}
	public void setBolsista(boolean bolsista) {
		this.bolsista = bolsista;
	}
	//----------------------------------------
	public double getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(double mensalidade) {
		if (mensalidade >= 0)
		this.mensalidade = mensalidade;
		else 
			System.out.println("MENSALIDADE INV�LIDA!");
	}
	//----------------------------------------
	public String exibe() {
		return  "RA: " + ra + "\n" + "Nome: " + nome + "\n" + "Bolsista: " + bolsista + "\n" + "Mensalidade: R$" + mensalidade;
	}
	
}
