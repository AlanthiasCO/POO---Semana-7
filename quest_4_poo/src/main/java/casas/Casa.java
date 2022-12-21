package casas;

public class Casa {
	private String tipoCasa;
	private int numQuartos;
	private float valor;
	private Endereco endereco;
	
	
	public Casa(String tipoCasa, int numQuartos, float valor) {
		super();
		this.tipoCasa = tipoCasa;
		this.numQuartos = numQuartos;
		this.valor = valor;

	}
	
	public void addEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Endereco endereco() {
		return endereco;
	}

	
	@Override
	public String toString() {
		String str = "";
		str += "" + this.tipoCasa + ", " + this.numQuartos + " quartos," + " R$" + this.valor + "," + this.endereco;
		str += "\n";
		return str;
	}
	
}
