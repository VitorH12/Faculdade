package aulas;

public class Aula11_05_Data {
	private int dia;
	private int mes;
	private int ano;
	
	public Aula11_05_Data() { //m�todo construtor
		//System.out.println("Executando o construtor...");
		this.ano = 1900;
		this.dia = 1;
		this.mes = 1;
		//ou this(1, 1, 1900); que vai fazer a chamada pro dia, mes e ano do da linha de baixo
	}
	
	public Aula11_05_Data(int dia, int mes, int ano) { //m�todo construtor
		//System.out.println("Executando o construtor...");
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}
	
	public void setDia(int di) { //fez na m�o
		if (di >= 1 && di <= 31)
			dia = di;
		else 
			dia = 1;
	}
	
	public int getDia() { //fez na m�o
		return dia;
	}

	public void setMes(int mes) { //this � para diferenciar o par�metro (clica no this.dia para ver ao que ele se refere)
		if (mes >= 1 && mes <= 12)
			this.mes = mes;
		else
			this.mes = 1;
	}
	
	public int getMes() {
		return mes;
	}

	public void setAno(int ano) {
		if (ano >= 0)
			this.ano = ano;
		else
			this.ano = 1900;
	}

	public int getAno() {
		return ano;
	}

	public String exibe() {
		return dia + "/" + mes + "/" + ano;
	}
}
