package src;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Imagem {
    private BufferedImage imagem;

    public Imagem(String filePath) throws Exception {
        imagem = ImageIO.read(new File(filePath));
    }

    public int[][] getPixels() {
        int largura = imagem.getWidth();
        int altura = imagem.getHeight();
        int[][] pixels = new int[altura][largura];

        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < largura; x++) {
                pixels[y][x] = imagem.getRGB(x, y);
            }
        }
        return pixels;
    }

    public void saveImage(int[][] pixels, String outputPath) throws Exception {
        for (int y = 0; y < pixels.length; y++) {
            for (int x = 0; x < pixels[0].length; x++) {
                imagem.setRGB(x, y, pixels[y][x]);
            }
        }
        ImageIO.write(imagem, "png", new File(outputPath));
    }
}
