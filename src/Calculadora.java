import java.util.Scanner;

public class Calculadora {
	public int Numero;
	public int Soma = 0;
	public Scanner Leitor = new Scanner(System.in);

	public void RecebeNumero() {
		System.out.println("Escolha um número: ");
		Numero = (int) Leitor.nextDouble();
	}

	public void Calcula() {
		while (Numero > 0) {
			Soma = Soma + (Numero % 10);
			Numero = Numero / 10;
		}
	}
	
	public void CalculaSoma() {
		System.out.println("Total da soma: "+Soma);
	}
}
