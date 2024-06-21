import java.util.ArrayList;
import java.util.List;

public class SomaNumero {
    List<Integer> listaNumero;

    public SomaNumero() {
        this.listaNumero = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNumero.add(numero);
    }

    public int calcularSoma(){
        int total = 0;
        for(Integer i: listaNumero){
            total += i;
        }
        return total;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if(!listaNumero.isEmpty()) {
            for (Integer m : listaNumero) {
                if (m > maiorNumero) {
                    maiorNumero = m;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!listaNumero.isEmpty()) {
            for (Integer me : listaNumero) {
                if (me < menorNumero) {
                    menorNumero = me;
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros(){
        System.out.println(listaNumero);
    }

    public static void main(String[] args) {
        // Criando uma instância da classe SomaNumeros
        SomaNumero somaNumero = new SomaNumero();

        // Adicionando números à lista
        somaNumero.adicionarNumero(5);
        somaNumero.adicionarNumero(0);
        somaNumero.adicionarNumero(0);
        somaNumero.adicionarNumero(-2);
        somaNumero.adicionarNumero(10);

        // Exibindo a lista de números adicionados
        System.out.println("Números adicionados:");
        somaNumero.exibirNumeros();

        // Calculando e exibindo a soma dos números na lista
        System.out.println("Soma dos números = " + somaNumero.calcularSoma());

        // Encontrando e exibindo o maior número na lista
        System.out.println("Maior número = " + somaNumero.encontrarMaiorNumero());

        // Encontrando e exibindo o menor número na lista
        System.out.println("Menor número = " + somaNumero.encontrarMenorNumero());
    }
}