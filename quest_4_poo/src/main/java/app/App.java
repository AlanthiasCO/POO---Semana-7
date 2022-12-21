package app;

import java.util.ArrayList;

import casas.Casa;
import casas.Endereco;

public class App {

	public static void main(String[] args) {
		
		//Criando casas
		ArrayList<Casa> casas = new ArrayList<>();
		
		Casa casa1 = new Casa("Sobrado", 4, 500);
		Casa casa2 = new Casa("Moderna", 8, 7000);
		Casa casa3 = new Casa("Geminada", 2, 1400);
		Casa casa4 = new Casa("Chacara", 7, 9000);
		
		casas.add(casa1); casas.add(casa2); casas.add(casa3); casas.add(casa4);
		
		Endereco end01 = new Endereco("Rua Tom Jobim", 24, "Palotina");
		Endereco end02 = new Endereco("Rua Zé Mané", 16, "Curitiba");
		Endereco end03 = new Endereco("Rua Dondoca Faria", 543, "Guarapuava");
		Endereco end04 = new Endereco("Rua Pavao", 242, "Campo Mourao");
		
		casa1.addEndereco(end01); casa2.addEndereco(end02); casa3.addEndereco(end03); casa4.addEndereco(end04);
		
		System.out.println("----------Casas Disponiveis---------\n");
		for (Casa casa : casas) System.out.println(casa);

		
	}
	
}
