package drai.dev.data.jsonwriters;

public class DexCounter {
    private static int dexCounter = 1;

    public static void incrementDexCounter(){
        dexCounter++;
    }

    public static void setDexCounter(int dexCounter) {
        DexCounter.dexCounter = dexCounter;
    }

    public static int getDexCounter(){
        return dexCounter;
    }
}
