import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> ordenarAsc = new ArrayList<>(numerosList);
        if(!numerosList.isEmpty()){
            Collections.sort(ordenarAsc);
            return ordenarAsc;
        }
        else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> ordenarDesc = new ArrayList<>(numerosList);
        if(!numerosList.isEmpty()){
            ordenarDesc.sort(Collections.reverseOrder());
            return ordenarDesc;
        }
        else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe OrdenacaoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        // Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        // Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());

        // Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());

    }
}