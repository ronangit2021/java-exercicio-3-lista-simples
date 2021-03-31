package exercicioInverter;

import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Main app = new Main();
		app.start();

	}

	private void start() {

		Scanner ler = new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		String umaFrase = ler.nextLine();

		inverterFrase(umaFrase);
		
	}

	private void inverterFrase(String palavra) {

		System.out.println("Palavra normal: " + palavra);

		char[] arrayDeCaracteres = palavra.toCharArray();

		String palavraInvertida = "";

		for (int i = arrayDeCaracteres.length - 1; i >= 0; i--) {

			palavraInvertida = palavraInvertida + arrayDeCaracteres[i];

		}

		System.out.println("Palavra invertida: " + palavraInvertida);

		}
}