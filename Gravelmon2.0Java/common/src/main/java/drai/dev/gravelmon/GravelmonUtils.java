package drai.dev.gravelmon;

public class GravelmonUtils {
    public static String getCleanName(String name) {
        return name.toLowerCase().replace(' ', '_').replaceAll("[^a-zA-Z0-9_]", "").replace("'", "").replace("\\.", "").replace("-", "").replace(" ", "");
    }
}
