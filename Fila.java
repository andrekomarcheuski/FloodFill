package src;
import java.util.LinkedList;

public class Fila {
    private LinkedList<int[]> fila = new LinkedList<>();

    public void enfileirar(int[] cordenada) {
        fila.addLast(cordenada);
    }

    public int[] desenfileirar() {
        return fila.removeFirst();
    }

    public boolean isEmpty() {
        return fila.isEmpty();
    }
}