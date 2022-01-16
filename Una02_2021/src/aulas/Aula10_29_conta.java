package aulas;

public class Aula10_29_conta {
	
	int numero;
	double saldo;
	
	double retornarSaldo() {
		return saldo;
	}

	void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	void saque(double valor) {
		saldo = saldo - valor;
	}

	
}