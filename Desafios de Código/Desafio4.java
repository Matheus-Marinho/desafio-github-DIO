import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int horasaida = sc.nextInt();
		int tempoviagem = sc.nextInt();
		int fuso = sc.nextInt();
    
    if (horasaida == 0){
      horasaida = 24;
    }
    int horachegada = horasaida + tempoviagem + fuso;
    
    if (horachegada > 23){
      horachegada -= 24;
    }
    
    
		System.out.println(horachegada);
		
		sc.close();
	}
}