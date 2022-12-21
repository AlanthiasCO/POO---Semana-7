package casas;

public class Endereco {

	private String rua;
	private int numRua;
	private String cidade;
	
	
	public Endereco(String rua, int numRua, String cidade) {
		super();
		this.rua = rua;
		this.numRua = numRua;
		this.cidade = cidade;
	}
	
	
	
	
	public String getRua() {
		return rua;
	}

	public int getNumRua() {
		return numRua;
	}

	public String getCidade() {
		return cidade;
	}

	@Override
	public String toString() {
		String str = "";
		str +=  " " + this.rua + " "+ this.numRua + ", " + this.cidade ;
		return str;
	}
	
	
	
}
