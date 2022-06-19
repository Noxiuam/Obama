package gq.noxiuam.obama;

import lombok.SneakyThrows;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class Obama {
    /**
     * Creates obama.
     */
    @SneakyThrows
    public static void main(String[] args) {
        for (int i = 0; i < 420; i++) {
            BufferedImage image = new BufferedImage(69, 69, BufferedImage.TYPE_INT_ARGB);

            File file = new File("image\\obama_" + i + ".png");
            for (int y = 0; y < 69; y++) {
                for (int x = 0; x < 69; x++) {
                    int pixel = ((int) (Math.random() * 256) << 24)
                            | ((int) (Math.random() * 256) << 16)
                            | ((int) (Math.random() * 256) << 8) | (int) (Math.random() * 256);

                    image.setRGB(x, y, pixel);
                }

                ImageIO.write(image, "png", file);
            }
        }
    }
}
