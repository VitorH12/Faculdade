package aulas;

public class Aula11_12_mainEscola {

	public static void main(String[] args) {
		/*Aula11_12_EscolaPessoa p = new Aula11_12_EscolaPessoa();
		p.anoNascimento = 1989;
		System.out.println(p.calcularIdade(2021));
		
		Aula11_12_EscolaAluno a = new Aula11_12_EscolaAluno();
		a.anoNascimento = 1995;
		System.out.println(a.calcularIdade(2021));
		
		Aula11_12_EscolaProfessor prf = new Aula11_12_EscolaProfessor();
		prf.anoNascimento = 1982;
		System.out.println(prf.calcularIdade(2021));*/
		
		//PRIVADO AGORA
		Aula11_12_EscolaPessoa p = new Aula11_12_EscolaPessoa();
	p.setAnoNascimento(1989);
	System.out.println(p.calcularIdade(2021));
	
	Aula11_12_EscolaAluno a = new Aula11_12_EscolaAluno();
	a.setAnoNascimento(1995);
	System.out.println(a.calcularIdade(2021));
	
	Aula11_12_EscolaProfessor prf = new Aula11_12_EscolaProfessor();
	prf.setAnoNascimento(1982);
	System.out.println(prf.calcularIdade(2021));
	}

}
