package exercicio06;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();

	}

	private void start() {

		String[] carros = { "civic", "gol", "palio", "uno" };

		for (int i = 0; i < carros.length; i++) {

			String carro = carros[i];
			System.out.println("Nome carro: " + carro);
		}
		System.out.println("__________________");

		carros[1] = "L200";

		for (String carro : carros) {

			System.out.println("Nome carro: " + carro);

		}
		System.out.println("__________________");

		int tamanhoDoNovoArray = carros.length + 1;
		String[] novoArrayDeCarros = new String[tamanhoDoNovoArray];

		for (int i = 0; i < carros.length; i++) {

			String novoCarro = carros[i];
			novoArrayDeCarros[i] = novoCarro;
			
		}
		novoArrayDeCarros[tamanhoDoNovoArray - 1] = "Gol";
		
		for(String carro : novoArrayDeCarros) {
			System.out.println("Carro : " + carro);
		}
	}

}
