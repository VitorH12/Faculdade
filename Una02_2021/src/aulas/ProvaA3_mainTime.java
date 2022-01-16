
package aulas;

public class ProvaA3_mainTime {

	public static void main(String[] args) {
		ProvaA3_Time tm = new ProvaA3_Time();
		ProvaA3_Time tm2 = new ProvaA3_Time(11);
		ProvaA3_Time tm3 = new ProvaA3_Time(12,30);
		ProvaA3_Time tm4 = new ProvaA3_Time(23,59,59);
		
		
		System.out.println("Hora sem atributo: "+tm.exibe());
		System.out.println("Hora com um atributo: "+tm2.exibe());
		System.out.println("Hora com dois atributos: "+tm3.exibe());
		System.out.println("Hora com três atributos: "+tm4.exibe());
		
	}

}