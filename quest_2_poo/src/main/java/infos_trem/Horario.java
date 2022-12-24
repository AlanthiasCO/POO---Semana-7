package infos_trem;

public class Horario {
	
	private int dia;
	private int horas;
	private int minutos;
	
	
	public Horario(int dia, int horas, int minutos) {
		this.dia = dia;
		this.horas = horas;
		this.minutos = minutos;
	}
	
	
	
	
	
	@Override
	public String toString() {
		String str = "";
	
		str += + this.horas + "h:" + this.minutos +"min";
		str += "\nDia: " + this.dia;
		return str;
	}
	
}


