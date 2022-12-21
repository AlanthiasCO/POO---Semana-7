package app;

import java.util.ArrayList;

import informacoes.Esquina;
import informacoes.Restaurante;

public class AppV2 {

	public static void main(String[] args) {
		//Construindo os restaurentes do app e armazenando no array.
		Restaurante res01 = new Restaurante("Presidant", "restaurante frances" , "alto");
		Restaurante res02 =new Restaurante("Churrascaria Plataforma", "restaurante brasileiro" , "alto");
		Restaurante res03 =new Restaurante("Los Tacos", "restaurante mexicano" , "medio");
		Restaurante res04 =new Restaurante("La Grande Boucherie", "restaurante frances" , "alto");
		Restaurante res05 =new Restaurante("Texas Burguer", "restaurante americano" , "baixo");
		
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
		
		///imprimindo todos os restaurantes disponiveis e os seus respectivos endereços
		System.out.println("----------Restaurantes Disponiveis---------\n");
		for (Restaurante restaurante : restaurantes) System.out.println(restaurante);
	}
}
