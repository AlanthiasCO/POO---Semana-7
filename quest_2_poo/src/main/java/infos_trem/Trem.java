package infos_trem;

public class Trem {

	private String tipo;
	private Horario horario;
	private Rota rota;
	
	public Trem(String tipo) {
		this.tipo = tipo;
	}
	
	
	public String getTrem() {
		return getTrem();
	}
	
	public void addRota(Rota rota) {
		this.rota = rota;
	}
	
	public Rota rota() {
		return rota;
	}
	
	public void addHorario(Horario horario) {
		this.horario = horario;
	}
	
	public Horario horario() {
		return horario;
	}
	
	@Override
	public String toString() {
		String str = "";
		//str += "Nome do trem:" + this.getTrem();
		str += "Rota do trem." + this.rota;
		str += "\nTipo: " + this.tipo;
		str += "\n";
		str += "\nHorario do trem: " + this.horario;
		str += "\n--------------------------------------------------";
		return str;
	}
	
}
