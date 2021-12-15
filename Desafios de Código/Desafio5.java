import java.io.IOException;
import java.util.Scanner;

public class Desafio5 {

	public static void main(String[] args) throws IOException {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	String Paridade, Valor;
    	for (int i = 0; i < N; i++) {
    	  int X = leitor.nextInt();
    		if (X > 0){
    		  Valor = "POSITIVE";
    		}else if (X < 0){
    		  Valor = "NEGATIVE";
    		}else{
    		  Valor = "NULL";
    		}
    		
    		if (X % 2 == 0 ){
    		  Paridade = "EVEN";
    		}else{
    		  Paridade = "ODD";
    		}
    		
    		if(X == 0){
    		  System.out.println(Valor);
    		}else{
    		  System.out.println(Paridade + " " + Valor);
    		}
    		
    	}
	}
	
}