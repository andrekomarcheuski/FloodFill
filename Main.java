package src;

public class Main {
    public static void main(String[] args) {
        try {
            Imagem input = new Imagem("input.png");
            int[][] pixels = input.getPixels();

            FloodFill floodFill = new FloodFill(pixels);
            floodFill.preencherComFila(10, 10, 0xFF00FF00); 

            input.saveImage(pixels, "output.png");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
