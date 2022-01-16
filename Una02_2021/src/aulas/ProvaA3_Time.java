package aulas;

public class ProvaA3_Time {
	private int hora;
	private int minuto;
	private int segundo;
	
	public ProvaA3_Time() { 
		this(0,0,0);
	}
	
	public ProvaA3_Time(int hora) { 
		this(hora,0,0);
	}
	
	public ProvaA3_Time(int hora, int minuto) { 
		this(hora,minuto,0);
	}
	
	public ProvaA3_Time(int hora, int minuto, int segundo) { 
		setHora(hora);
		setMinuto(minuto);
		setSegundo(segundo);
	}
	
	
	
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		if (hora < 0 || hora > 23)
			this.hora = 0;
		else
			this.hora = hora;
	}
	
	
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		if (minuto < 0 || minuto > 59)
			this.minuto = 0;
		else
			this.minuto = minuto;
		
	}
	
	
	public int getSegundo() {
		return segundo;
	}
	public void setSegundo(int segundo) {
		if (segundo < 0 || segundo > 59)
			this.segundo= 0;
		else
			this.segundo = segundo;
	}
	
	
	public String exibe() {
		return hora + ":" + minuto + ":" + segundo;
	}
	
}
