package taskmaneger;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
     private static final List<Task> ListaTarefas = new ArrayList<>();
    
     public static List<Task> Listar() {
        return ListaTarefas;
    }

    public static void Adicionar(Task task) {
        ListaTarefas.add(task);
    }

    public static void remove(int posTarefas) {
        if (posTarefas >= 0 && posTarefas < ListaTarefas.size()) {
            ListaTarefas.remove(posTarefas);
        } else {
            System.out.println("Índice inválido.");
        
    }
    }
    
}
