package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import informacoes.Esquina;
import informacoes.Restaurante;


/* 
 * Esse main tem como objetivo ser executado em duas etapas. A primeira consiste na execucao do main, que ira gerar uma lista
 * de restaurantes disponiveis no app, imprimindo o nome, o tipo de comida e preco de todos os restaurantes.
 * Cada restaurante tera um ID (numero de referencia para determinado restaurante. 
 * Assim, na segunda etapa, é necessario que digite o ID do restaurante desejado no console.
 * Com o ID digitado, o app devolvera o endereco do restaurante que possui o ID informado. 
*/

public class App {

	private static Scanner teclado;

	public static void main(String[] args) {
		
		teclado = new Scanner(System.in);
		
		//Construindo os restaurentes do app e armazenando no array.
		Restaurante res01 = new Restaurante("Presidant", "restaurante frances" , "alto", 0);
		Restaurante res02 =new Restaurante("Churrascaria Plataforma", "restaurante brasileiro" , "alto", 1);
		Restaurante res03 =new Restaurante("Los Tacos", "restaurante mexicano" , "medio", 2);
		Restaurante res04 =new Restaurante("La Grande Boucherie", "restaurante frances" , "alto", 3);
		Restaurante res05 =new Restaurante("Texas Burguer", "restaurante americano" , "baixo", 4);
		
		ArrayList<Restaurante> restaurantes = new ArrayList<>();
		restaurantes.add(res01); restaurantes.add(res02); restaurantes.add(res03); restaurantes.add(res04); 
		restaurantes.add(res05);
		
		//Criando e armazenando os enderecos dos restaurantes
		Esquina es01 = new Esquina("7th Ave", "65th Street");
		Esquina es02 = new Esquina("8th Ave", "60th Street");
		Esquina es03 = new Esquina("1th Ave", "45th Street");
		Esquina es04 = new Esquina("3th Ave", "20th Street");
		Esquina es05 = new Esquina("9th Ave", "15th Street");
		
		res01.addEsquina(es01); res02.addEsquina(es02); res03.addEsquina(es03); res04.addEsquina(es04); 
		res05.addEsquina(es05);
		
		// IMPRIMIR A ESQUINA System.out.println(res01.esquina());
		res02.getId();
		
		
		
		/*
		//Imprimindo todos os restaurantes disponiveis no app
		System.out.println("----------Restaurantes Disponiveis---------");
		for (Restaurante restaurante : restaurantes) System.out.println(restaurante);

		
		//Usando o Scanner para digitar o ID do restaurante
		System.out.println("Digite o ID do restaurante desejado: ");
		
		int id = teclado.nextInt();
		
		System.out.println("\nVoce digitou o ID " + id + "\n" + "Abaixo esta a localizacao do restaurante selecionado.");
	
		//Imprimindo a localizacao (esquina proxima) do restaurante
		 * 
		 * 
		 */

}

}