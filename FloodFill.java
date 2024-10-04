package src;

public class FloodFill {
    private int[][] pixel;
    private int backgroundColor;

    public FloodFill(int[][] pixel) {
        this.pixel = pixel;
    }

    public void preencherComPilha(int x, int y, int cor) {
        this.backgroundColor = pixel[y][x];
        Pilha pilha = new Pilha();
        pilha.empilhar(new int[]{x, y});
        while (!pilha.isEmpty()) {
            int[] cordenada = pilha.desempilhar();
            int cx = cordenada[0];
            int cy = cordenada[1];
            if (estaEmBranco(cx, cy) && pixel[cy][cx] == backgroundColor) {
                pixel[cy][cx] = cor;
                pilha.empilhar(new int[]{cx + 1, cy}); 
                pilha.empilhar(new int[]{cx - 1, cy}); 
                pilha.empilhar(new int[]{cx, cy + 1}); 
                pilha.empilhar(new int[]{cx, cy - 1}); 
            }
        }
    }

    public void preencherComFila(int x, int y, int cor) {
        if (!estaEmBranco(x, y)) {
            return; 
        }
        this.backgroundColor = pixel[y][x];
        Fila queue = new Fila();
        queue.enfileirar(new int[]{x, y});
        while (!queue.isEmpty()) {
            int[] cordenada = queue.desenfileirar();
            int cx = cordenada[0];
            int cy = cordenada[1];
            if (estaEmBranco(cx, cy) && pixel[cy][cx] == backgroundColor) {
                pixel[cy][cx] = cor;
                queue.enfileirar(new int[]{cx + 1, cy}); 
                queue.enfileirar(new int[]{cx - 1, cy}); 
                queue.enfileirar(new int[]{cx, cy + 1}); 
                queue.enfileirar(new int[]{cx, cy - 1}); 
            }
        }
    }
    
    private boolean estaEmBranco(int x, int y) {
        return x >= 0 && y >= 0 && x < pixel[0].length && y < pixel.length;
    }
}
