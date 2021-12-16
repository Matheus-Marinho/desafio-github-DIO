package Condicionais;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, n3, media;
        Scanner entradas = new Scanner(System.in);

        System.out.print("Informe o valor da primeira nota: ");
        n1 = entradas.nextDouble();
        System.out.print("Informe o valor da segunda nota: ");
        n2 = entradas.nextDouble();
        System.out.print("Informe o valor da terceira nota: ");
        n3 = entradas.nextDouble();

        media = (n1 + n2 + n3) / 3;

        if (media == 10){
            System.out.println("O aluno ficou com média " + media + ", e foi aprovado com louvor!");
        }else if(media >= 6 && media < 10){
            System.out.println("O aluno foi aprovado com média "+ media + "!");
        }else if(media >= 0 && media < 6){
            System.out.println("O aluno ficou com a nota abaixo da média e foi reprovado!");
        }else{
            System.out.println("Notas inválidas!");
        }
        entradas.close();
    }
}
