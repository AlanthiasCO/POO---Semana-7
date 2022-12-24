package infos_trem;

import java.util.List;

public class Rota {
	
	private String origem;
	private String destino;
	
public Rota(String origem, String destino) {
	this.origem = origem;
	this.destino = destino;
}
	
//adicionar um novo destino ao trajeto
public void addNovoDestino(String destino) {
	this.destino = destino;
	
	
}

@Override
public String toString() {
	String str = "";
	str += "\nOrigem: " + this.origem;
	str += "\nDestino: " + this.destino;
	return str;
}


}
