import java.util.Scanner;
import java.math.BigInteger;

public class Desafio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=0 ; i<n ; i++) {
		  int x = sc.nextInt();
      BigInteger total = BigInteger.valueOf(0);

      BigInteger graos = BigInteger.valueOf(1);

      for(int j=0; j<x; j++){
        graos = graos.multiply(BigInteger.valueOf(2));
        total = graos.divide(BigInteger.valueOf(12000));
      }       			
      System.out.print(total + " kg\n");
		}
		sc.close();
	}
}