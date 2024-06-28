import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LivrariaOnline {
    Map<String, Livro> livrariaList;

    public LivrariaOnline() {
        this.livrariaList = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro){
        livrariaList.put(link, new Livro);
    }

    public void removerLivro(String titulo){
        Livro livroARemover = null;
        for (Map.Entry<String, Livro> entry: livrariaList.entrySet()){
            if(entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                livroARemover = entry.getValue();
            }
        }
        livrariaList.remove(livroARemover);
    }

    public void exibirLivrosOrdenadosPorPreco(){
        Map<String, Livro> livrariaTree = new TreeMap<>(livrariaList);
        System.out.println(livrariaTree);
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor){
        Map<String, Livro> livros = null;
        for(Map.Entry<String, Livro> entry: livrariaList.entrySet()){
            if (entry.getValue().getAutor().equalsIgnoreCase(autor)){
                livros.put(entry.getKey(),entry.getValue());
            }
        }
        return livros;
    }

    public Livro obterLivroMaisCaro(){
        Map<String, Livro> livroMaisCaro = null;
        double valorMaisCaro = Integer.MIN_VALUE;
        Map<String, Livro> livrariaTree = new TreeMap<>(livrariaList);
        for(Map.Entry<String, Livro> entry: livrariaTree.entrySet()){
            if(entry.getValue().getPreco() > valorMaisCaro){
                livroMaisCaro.put(entry.getKey(), entry.getValue());
                valorMaisCaro = entry.getValue().getPreco();
            }
        }
    return (Livro) livroMaisCaro;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();
        // Adiciona os livros à livraria online
        livrariaOnline.adicionarLivro("https://amzn.to/3EclT8Z", new Livro("1984", "George Orwell", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/47Umiun", new Livro("A Revolução dos Bichos", "George Orwell", 7.05d));
        livrariaOnline.adicionarLivro("https://amzn.to/3L1FFI6", new Livro("Caixa de Pássaros - Bird Box: Não Abra os Olhos", "Josh Malerman", 19.99d));
        livrariaOnline.adicionarLivro("https://amzn.to/3OYb9jk", new Livro("Malorie", "Josh Malerman", 5d));
        livrariaOnline.adicionarLivro("https://amzn.to/45HQE1L", new Livro("E Não Sobrou Nenhum", "Agatha Christie", 50d));
        livrariaOnline.adicionarLivro("https://amzn.to/45u86q4", new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 5d));

        // Exibe todos os livros ordenados por preço
        System.out.println("Livros ordenados por preço: \n" + livrariaOnline.exibirLivrosOrdenadosPorPreco());

        //Exibe todos os livros ordenados por autor
        System.out.println("Livros ordenados por autor: \n" + livrariaOnline.exibirLivrosOrdenadosPorAutor());

        // Pesquisa livros por autor
        String autorPesquisa = "Josh Malerman";
        livrariaOnline.pesquisarLivrosPorAutor(autorPesquisa);

        // Obtém e exibe o livro mais caro
        System.out.println("Livro mais caro: " + livrariaOnline.obterLivroMaisCaro());

        // Obtém e exibe o livro mais barato
        //System.out.println("Livro mais barato: " + livrariaOnline.obterLivroMaisBarato());

        // Remover um livro pelo título
        livrariaOnline.removerLivro("1984");
        System.out.println(livrariaOnline.livros);

    }
}
