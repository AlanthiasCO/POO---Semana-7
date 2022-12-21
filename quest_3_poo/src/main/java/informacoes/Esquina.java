package informacoes;

public class Esquina {
	
	private String esquina01;
	private String esquina02;
	
	public Esquina(String esquina01, String esquina02) {
		super();
		this.esquina01 = esquina01;
		this.esquina02 = esquina02;
	}	
	
	public String getEsquina01() {
		return esquina01;
	}

	public String getEsquina02() {
		return esquina02;
	}


	@Override
	public String toString() {
			String str = "";
			str += "Esquina " + this.esquina01 + " com a " + this.esquina02;
			return str;
	}
	
	
	
}
