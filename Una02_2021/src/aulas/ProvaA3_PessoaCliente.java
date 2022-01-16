package aulas;

public class ProvaA3_PessoaCliente extends ProvaA3_Pessoa {

	protected double CreditoMax;
	protected double ValorEmDivida;	

	public ProvaA3_PessoaCliente () { 
		setCreditoMax (1100);
		setValorEmDivida (100);
	}
	
	public double obterSaldo () {
		return CreditoMax - ValorEmDivida;
	}
	
	
	//--------------------------------------------------------------------------------------- get / set
	public double getCreditoMax() {
		return CreditoMax;
	}
	public void setCreditoMax(double creditoMax) {
		CreditoMax = creditoMax;
	}
	
	
	public double getValorEmDivida() {
		return ValorEmDivida;
	}
	public void setValorEmDivida(double valorEmDivida) {
		ValorEmDivida = valorEmDivida;
	}
	
	public String exibe2() {
		return "\nNome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura + "\nPeso: "+peso+"\nSaldo: " + obterSaldo();
	}
	
}
