package atividade_hospital;

import java.util.ArrayList;

public class FilaNormal {
	
	private ArrayList<String> fila = new ArrayList<String>();

    public void enqueue(String elemento) {
        fila.add(elemento);
    }

    public String dequeue() {
        if (fila.isEmpty()) {
            throw new IllegalStateException("A fila está vazia.");
        }
        return fila.remove(0);
    }

    public boolean isEmpty() {
        return fila.isEmpty();
    }

    public int size() {
        return fila.size();
    }

    public String peek() {
        if (fila.isEmpty()) {
            throw new IllegalStateException("A fila está vazia.");
        }
        return fila.get(0);
    }
    
    public String get(int index) {
        if (index < 0 || index >= fila.size()) {
            throw new IndexOutOfBoundsException("Índice inválido.");
        }
        return fila.get(index);
    }
}
