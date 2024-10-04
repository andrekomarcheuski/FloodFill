package src;
import java.util.LinkedList;

public class Pilha {
    private LinkedList<int[]> pilha = new LinkedList<>();

    public void empilhar(int[] cordenada) {
        pilha.push(cordenada);
    }

    public int[] desempilhar() {
        return pilha.pop();
    }

    public boolean isEmpty() {
        return pilha.isEmpty();
    }
}

