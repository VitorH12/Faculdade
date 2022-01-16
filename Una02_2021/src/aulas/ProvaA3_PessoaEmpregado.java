package aulas;

public class ProvaA3_PessoaEmpregado extends ProvaA3_Pessoa{
	
	protected int numeroSecao;
	protected double INSS;
	protected double salarioBase;
	
	public ProvaA3_PessoaEmpregado () { 
		setNumeroSecao (12345);
		setINSS (25);
		setSalarioBase (1200.50);
	}
	
	
	public double calcSalario() {
		return salarioBase - (INSS/100)*salarioBase;
	}
	
	//--------------------------------------------------------------------------------------- get / set
	public int getNumeroSecao() {
		return numeroSecao;
	}
	public void setNumeroSecao(int numeroSecao) {
		this.numeroSecao = numeroSecao;
	}
	
	
	public double getINSS() {
		return INSS;
	}
	public void setINSS(double iNSS) {
		INSS = iNSS;
	}
	
	
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public String exibe3() {
		return "\nNome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura + "\nPeso: "+peso+"\nN° Seção: " + numeroSecao + "\nINSS: " + INSS + "%\nSalário Base: R$" + calcSalario();
	}
}
