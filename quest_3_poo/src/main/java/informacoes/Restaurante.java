package informacoes;


public class Restaurante {
	
	private String nome;
	private String tipo_comida;
	private String preco;
	private Integer id;
	private Esquina esquina;
	
	public Restaurante(String nome, String tipo_comida, String preco) {
		super();
		this.nome = nome;
		this.tipo_comida = tipo_comida;
		this.preco = preco;
	}
	
	public Restaurante(String nome, String tipo_comida, String preco, Integer id) {
		super();
		this.nome = nome;
		this.tipo_comida = tipo_comida;
		this.preco = preco;
		this.id = id;

	}

	public Integer getId() {
		return id;
	}
	
	public void addEsquina(Esquina esquina) {
		this.esquina = esquina;
	}
	
	
	public Esquina esquina() {
		return esquina;
	}



	public String toString() {
		String str = "";
		str += "Nome do restaurante: " + this.nome + "\n";
		str += "Tipo de comida: " + this.tipo_comida + "\n";
		str += "Preco: " + this.preco + "\n";
		//str += "Id: " + this.id + "\n";
		str += "Endereco: " + this.esquina + "\n";
		return str;
	}
	
	
	
	
	
}
