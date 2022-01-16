package aulas;

public class ProvaA3_Produto {

	private String nome;
	private double preco;
	private double reajuste;
	
	
	
	public ProvaA3_Produto() {
		this("Nome não informado", 0, -1);
	}
	
	public ProvaA3_Produto(String nome, double preco, double reajuste) {
		setNome(nome);
		setPreco(preco);
		setReajuste(reajuste);
	}
	
	
	public double getReajuste() {
		return reajuste;
	}
	public void setReajuste(double reajuste) {
		if (reajuste < 0)
			this.reajuste = 1;
		else
			this.reajuste = ((reajuste/100) * preco) + preco;
	}

	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) { 
		if (preco < 0)
			this.preco = 0;
		else
			this.preco = preco;
	}
	
	
	public String exibe() {
		if (reajuste == 1)
		return "Produto: "+nome+"\nPreço: R$"+preco;
		else
		return "Produto: "+nome+"\nPreço: R$"+preco+"\nPreço com reajuste: R$"+reajuste;
	}
	
	
	
	
}
