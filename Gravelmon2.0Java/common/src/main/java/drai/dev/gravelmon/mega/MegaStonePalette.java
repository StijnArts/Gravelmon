package drai.dev.gravelmon.mega;


import java.awt.*;
import java.util.*;
import java.util.List;

public class MegaStonePalette {
    public final Color[] colors = new Color[9];

    public MegaStonePalette(String coreColor, String highlightColor, String backgroundColor) {
        colors[1] = fromHex(coreColor);
        colors[2] = adjustSaturation(colors[1].brighter(),1.3f);
        colors[8] = shiftHue(adjustSaturation(colors[1].darker().darker(),.7f), .01f);
        colors[3] = fromHex(backgroundColor);
        colors[4] = colors[3].darker();
        colors[0] = adjustSaturation(colors[4].darker(), .7f);
        colors[7] = adjustSaturation(colors[0].darker(), .7f);
        colors[6] = fromHex(highlightColor);
        colors[5] = colors[6].brighter();
    }

    public static Color fromHex(String hex) {
        // Remove leading '#' if present
        if (hex.startsWith("#")) {
            hex = hex.substring(1);
        }

        // Parse RRGGBB (6 chars) or optionally AARRGGBB (8 chars)
        if (hex.length() == 6) {
            return new Color(Integer.parseInt(hex, 16));
        } else if (hex.length() == 8) {
            return new Color(
                    (int) Long.parseLong(hex, 16),
                    true // hasAlpha
            );
        } else {
            throw new IllegalArgumentException("Invalid hex color: " + hex);
        }
    }

    // Brightness: 0 = black, 1 = full brightness
    public static Color adjustBrightness(Color color, float factor) {
        float[] hsb = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        hsb[2] = clampFloat(hsb[2] * factor); // Brightness
        int rgb = Color.HSBtoRGB(hsb[0], hsb[1], hsb[2]);
        return new Color(rgb | (color.getAlpha() << 24), true); // Preserve alpha
    }

    // Saturation: 0 = grayscale, 1 = full saturation
    public static Color adjustSaturation(Color color, float factor) {
        float[] hsb = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        hsb[1] = clampFloat(hsb[1] * factor); // Saturation
        int rgb = Color.HSBtoRGB(hsb[0], hsb[1], hsb[2]);
        return new Color(rgb | (color.getAlpha() << 24), true);
    }

    // Hue: 0–1, so you can shift it e.g. +0.1 or -0.25
    public static Color shiftHue(Color color, float shiftAmount) {
        float[] hsb = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        hsb[0] = (hsb[0] + shiftAmount) % 1.0f;
        if (hsb[0] < 0) hsb[0] += 1.0f;
        int rgb = Color.HSBtoRGB(hsb[0], hsb[1], hsb[2]);
        return new Color(rgb | (color.getAlpha() << 24), true);
    }

    private static float clampFloat(float val) {
        return Math.max(0f, Math.min(1f, val));
    }
}
