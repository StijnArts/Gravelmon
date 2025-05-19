package drai.dev.data.item;

import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.mega.*;

import javax.imageio.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.util.List;

public class MegaStoneGenerator {
    public static void createMegaStoneTexture(String resourcesDir, String baseMegaStoneName, MegaEvolution megaEvolution) {
        if(megaEvolution.getMegaStonePalette()==null) return;
        String pathname = resourcesDir + "\\assets\\gravelmon\\textures\\item\\megastones\\";
        File textureLocation = new File(pathname + megaEvolution.getMegaStoneName(baseMegaStoneName)+".png");
        if(textureLocation.exists()) return;
        var palette = megaEvolution.getMegaStonePalette();
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(pathname + "preset//absolite.png"));
        } catch (IOException e) {
            return;
        }
        if (!(image.getColorModel() instanceof IndexColorModel)) {
            throw new IllegalArgumentException("Image is not indexed color");
        }

        IndexColorModel oldModel = (IndexColorModel) image.getColorModel();
        int size = oldModel.getMapSize();

        byte[] reds = new byte[size];
        byte[] greens = new byte[size];
        byte[] blues = new byte[size];
        oldModel.getReds(reds);
        oldModel.getGreens(greens);
        oldModel.getBlues(blues);

        // Replace with palette colors where possible
        for (int i = 0; i < palette.colors.length; i++) {
            if (palette.colors[i] != null && i < size) {
                Color c = palette.colors[i];
                reds[i] = (byte) c.getRed();
                greens[i] = (byte) c.getGreen();
                blues[i] = (byte) c.getBlue();
            }
        }

        // Create new color model
        IndexColorModel newModel = new IndexColorModel(
                oldModel.getPixelSize(), size, reds, greens, blues, oldModel.getTransparentPixel()
        );

        // Create new image using new model
        BufferedImage newImage = new BufferedImage(
                image.getWidth(), image.getHeight(), BufferedImage.TYPE_BYTE_INDEXED, newModel
        );

        // Copy pixels over
        WritableRaster raster = newImage.getRaster();
        image.copyData(raster);
        try {
            ImageIO.write(newImage, "png", textureLocation);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
