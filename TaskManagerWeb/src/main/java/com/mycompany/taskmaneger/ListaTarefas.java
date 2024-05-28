package com.mycompany.taskmaneger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaTarefas {
    
    private static final List<Task> listaTarefas = Collections.synchronizedList(new ArrayList<>());

    public static List<Task> listar() {
        return listaTarefas;
    }

    public static void adicionar(Task task) {
        listaTarefas.add(task);
    }

    public static void remover(int posTarefas) {
        if (posTarefas >= 0 && posTarefas < listaTarefas.size()) {
            listaTarefas.remove(posTarefas);
        } else {
            System.out.println("Índice inválido.");
        }
    }
}