import java.util.Scanner;

public class Contador {
    public static void main(String[] args){

        //Obtendo dois números do usuário
        Scanner sc1 = new Scanner(System.in);
        System.out.println("\n Por favor, digite um número:");
        Integer numero1 = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Por favor, digite outro número:");
        Integer numero2 = sc2.nextInt();

        try{
          contar(numero1, numero2);
        }

        catch(ParametrosInvalidosException exception){
            System.out.println("O segundo número deve ser maior que o primeiro");;
        }
    }

    static void contar (Integer numero1, Integer numero2) throws ParametrosInvalidosException {
        int contagem = numero2 - numero1;
        if(contagem<0){
            throw new ParametrosInvalidosException();
        }

        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (i+1));
            }
        }
}
