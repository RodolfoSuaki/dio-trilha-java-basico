import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //Mensagem de entrada do sistema
        System.out.println("Bem-vindo(a) ao cadastro de conta! \n");
        
        //Coletando a informação: Número.
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Por gentileza, digite o número da Agência.");
        Integer numero = sc1.nextInt();

        //Coletando a informação: Agência.
        Scanner sc2 = new Scanner (System.in);
        System.out.println("Por gentileza, digite a agência com o dígito.");
        String agencia = sc2.nextLine();

        //Coletando a informação: Nome do cliente.
        Scanner sc3 = new Scanner (System.in);
        System.out.println("Por gentileza, digite seu nome completo.");
        String nome = sc3.nextLine();

        //Coletando a informação: Saldo.
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Por gentileza, digite seu saldo.");
        Double saldo = sc4.nextDouble();
        
        //Imprimir o resultado
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
