package drai.dev.gravelmon;

import com.cobblemon.mod.common.pokemon.*;

public class GravelmonUtils {
    public static String getCleanName(String name) {
        return name.toLowerCase().replace(' ', '_').replaceAll("[^a-zA-Z0-9_]", "").replace("'", "").replace("\\.", "").replace("-", "").replace(" ", "");
    }

    public static float modelWidgetCorrection(RenderablePokemon par5, float original) {
        var labels = par5.getSpecies().getLabels();
        if(labels.contains("not_modeled")){
            return 0;
        }
        return original;
    }

    public static boolean isParsableAsInt(String str) {
        try {
            Integer.parseInt(str);
            return true; // If parsing is successful, return true
        } catch (NumberFormatException e) {
            return false; // If an exception is thrown, return false
        }
    }
}
