import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListaTarefa {
    Set<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaAremover = null;
        for(Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaAremover = t;
                break;
            }
        }
        tarefaList.remove(tarefaAremover);
    }

    public void exibirTarefas(){
        System.out.println(tarefaList);
    }

    public int contarTarefas(){
        return tarefaList.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for(Tarefa t: tarefaList){
            if(t.isRealizada()){
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for(Tarefa t: tarefaList){
            if(!t.isRealizada()){
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        Tarefa tarefa = null;
        for(Tarefa t: tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefa = t;
            }
        }
        System.out.println(tarefa);
        tarefa.setRealizada(true);
        System.out.println(tarefa);
    }

    public void marcarTarefaPendente(String descricao){
        Tarefa tarefa = null;
        for(Tarefa t: tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefa = t;
            }
        }
        System.out.println(tarefa);
        tarefa.setRealizada(false);
        System.out.println(tarefa);
    }

    public void limparListaTarefas(){
        tarefaList.clear();
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefa listaTarefas = new ListaTarefa();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefasConcluidas());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }
}