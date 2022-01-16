package aulas;

public class Aula11_18_MedicoPediatra extends Aula11_18_Medico {
	private String especialidade;
	
	public Aula11_18_MedicoPediatra() {
		
	}

	public Aula11_18_MedicoPediatra(int crm, String nome) {
		super(crm, nome);
	}

	
	
	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	@Override
	public String toString() {
		return 	"\nDADOS DO PEDIATRA"+
				"\nCRM..........: "+crm+
				"\nNOME.........: "+nome+
				"\nESPECIALIDADE: "+especialidade;

	}
	
	
}
