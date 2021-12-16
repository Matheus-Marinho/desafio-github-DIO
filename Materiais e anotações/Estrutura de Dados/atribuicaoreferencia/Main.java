public class Main {
    public static void main(String[] args) {
        
        int intA = 1;
        int intB = intA; // Copiando o valor da variavel referenciada (tipo primitivo)

        System.out.println("intA = " + intA + " intB = " + intB);
        intA = 2;
        System.out.println("intA = " + intA + " intB = " + intB);

        MeuObj objA = new MeuObj(1);
        MeuObj objB = objA; // Copiando a referencia na memoria do objA para o objB (tipo não primitivo)

        System.out.println("objA = " + objA + " objB = " + objB);
        objA.setNum(3);
        System.out.println("objA = " + objA + " objB = " + objB);

    }    
}