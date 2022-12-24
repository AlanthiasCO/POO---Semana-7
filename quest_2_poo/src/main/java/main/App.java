package main;

import java.util.ArrayList;
import java.util.List;

import infos_trem.Horario;
import infos_trem.Rota;
import infos_trem.Trem;

public class App {

	public static void main(String[] args) {
		
		//INICINANDO A LISTA DE ROTAS
		ArrayList<Rota> trajetos = new ArrayList<>();	
		ArrayList<Trem> trens = new ArrayList<>();	
		
		//CRIANDO OS TRAJETOS
		Rota rota1 = new Rota("Jandaia do Sul", "Maringa");
		Rota rota2 = new Rota("Maringa", "Campo Mourao");
		
		
		//CRIANDO OS HORARIOS
		Horario hora1 = new Horario(14, 12, 30);
		Horario hora2 = new Horario(29, 22, 15);
		
		//CRIANDO OS TREMS
		Trem trem01 = new Trem("Local");
		Trem trem02 = new Trem("Local");
		
		//ADICIONANDO AS INFORMACOES NOS TREM
		trem01.addRota(rota1); trem01.addHorario(hora1);
		trem02.addRota(rota2); trem02.addHorario(hora2);
		
		trens.add(trem01); trens.add(trem02);
		System.out.println("----------Trens Disponiveis---------\n");
		for (Trem trem : trens) System.out.println(trem);
		
		
		System.out.println("\nSEGUNDA EXECUCAO\n");

		
		//Trocando o destino final da rota1 e do trem1
		rota1.addNovoDestino("Londrina");		//antes era maringa, agora sera londrina
		System.out.println("----------Trens Disponiveis---------\n");
		for (Trem trem : trens) System.out.println(trem);
	}
}
