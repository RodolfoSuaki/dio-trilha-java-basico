import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    Map<String, Integer> contadorDePalavras;

    public ContagemPalavras() {
        this.contadorDePalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contadorDePalavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra){
        String palavraARemover = null;
        if(!contadorDePalavras.isEmpty()){
            contadorDePalavras.remove(palavra);
        }
    }

    public int exibirContagemPalavras(){
        int contagemPalavras = 0;
        for(int contagem: contadorDePalavras.values()){
            contagemPalavras += contagem;
        }
        return contagemPalavras;
    }

    public String encontrarPalavraMaisFrequente(){
        Integer contagemPalavraMaisFrequente = Integer.MIN_VALUE;
        String palavraMaisFrequente = null;
        for(Map.Entry<String, Integer> entry : contadorDePalavras.entrySet()){
            if(entry.getValue()>contagemPalavraMaisFrequente){
                contagemPalavraMaisFrequente = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente + " (" + contagemPalavraMaisFrequente + ")";
    }

    public static void main(String[] args) {
        ContagemPalavras contagemLinguagens = new ContagemPalavras();

        // Adiciona linguagens e suas contagens
        contagemLinguagens.adicionarPalavra("Java", 2);
        contagemLinguagens.adicionarPalavra("Python", 8);
        contagemLinguagens.adicionarPalavra("JavaScript", 1);
        contagemLinguagens.adicionarPalavra("C#", 6);

        // Exibe a contagem total de linguagens
        System.out.println("Existem " + contagemLinguagens.exibirContagemPalavras() + " palavras.");

        // Encontra e exibe a linguagem mais frequente
        String linguagemMaisFrequente = contagemLinguagens.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem mais frequente é: " + linguagemMaisFrequente);
    }
}