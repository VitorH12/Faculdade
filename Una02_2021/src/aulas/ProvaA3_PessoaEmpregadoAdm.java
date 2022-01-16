package aulas;

public class ProvaA3_PessoaEmpregadoAdm extends ProvaA3_PessoaEmpregado {
	
	protected double AjudaDeCusto;
	
	public ProvaA3_PessoaEmpregadoAdm () { 
		setAjudaDeCusto(2500);
	}
	
	public double calcSalarioADM () {
		return AjudaDeCusto + calcSalario();
	}
	
	//--------------------------------------------------------------------------------------- get / set
	public double getAjudaDeCusto() {
		return AjudaDeCusto;
	}
	public void setAjudaDeCusto(double ajudaDeCusto) {
		AjudaDeCusto = ajudaDeCusto;
	}
	
	public String exibe4() {
		return "\nNome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura + "\nPeso: "+peso+"\nSalário + Ajuda de Custo: R$" + calcSalarioADM(); 
	}
	
}
