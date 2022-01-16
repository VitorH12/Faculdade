package aulas;

public class Aula11_18_mainMedico {

	public static void main(String[] args) {
		int crm = 100;
		String nome = "Vítor";
	Aula11_18_MedicoPediatra pediatra = new Aula11_18_MedicoPediatra(crm, nome);
	pediatra.setEspecialidade("Emergência Pediatrica");
	
	System.out.println(pediatra.toString());

	}

}
