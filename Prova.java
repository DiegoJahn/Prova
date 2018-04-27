import java.util.Scanner;
public class Prova {
	public static void main(String[] args){
		int media;
		Scanner scan = new Scanner(System.in);
		System.out.println("Vamos calcular a média de 4 numeros.");
		System.out.println("Digite o primeiro numero:");
		int num1 = scan.nextInt();
		System.out.println("Digite o segundo numero:");
		int num2 = scan.nextInt();
		System.out.println("Digite o terceiro numero:");
		int num3 = scan.nextInt();
		System.out.println("Digite o quarto numero:");
		int num4 = scan.nextInt();

		media = ((num1 + num2 + num3 + num4) / 4);
		System.out.printf("A média é: %d ", media);


	}
}