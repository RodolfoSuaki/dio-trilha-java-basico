import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
        public List<Item> carrinho;

        public CarrinhoDeCompras() {
                this.carrinho = new ArrayList<>();
        }

        public void adicionarItem(String nome, double preco, int quantidade){
                carrinho.add(new Item(nome, preco, quantidade));
        }

        public void removerItem(String nome){
                List<Item> listaTarefasARemover = new ArrayList<>();

                if(!carrinho.isEmpty()){
                        for (Item i: carrinho){
                                if(i.getNome().equalsIgnoreCase(nome)){
                                        listaTarefasARemover.add(i);
                                }
                        }
                }

                carrinho.removeAll(listaTarefasARemover);
        }


        public double calcularValorTotal(){
                double somaTotal = 0;
                for (Item i: carrinho){
                        somaTotal += (i.getQuantidade() * i.getPreco());
                }
                return somaTotal;
        }

        public void exibirItens(){
                System.out.println(carrinho);
        }

        public static void main(String[] args) {
                // Criando uma instância do carrinho de compras
                CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

                // Adicionando itens ao carrinho
                carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
                carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
                carrinhoDeCompras.adicionarItem("Caderno", 10d, 1);
                carrinhoDeCompras.adicionarItem("Borracha", 2d, 1);
                // Exibindo os itens no carrinho
                carrinhoDeCompras.exibirItens();

                // Removendo um item do carrinho
                carrinhoDeCompras.removerItem("Lápis");

                // Exibindo os itens atualizados no carrinho
                carrinhoDeCompras.exibirItens();

                // Calculando e exibindo o valor total da compra
                System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
        }
}

