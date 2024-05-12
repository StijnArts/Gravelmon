package drai.dev.gravelmon;

import drai.dev.gravelmon.games.registry.*;
import drai.dev.gravelmon.jsonwriters.*;
import drai.dev.gravelmon.pokemon.*;

public class GravelmonJsonGenerator
{
    private static int dexCounter = 1;

    public static void run(String resourcesDir)
    {
        GameRegistry.registerGames();
        Pokemon.scanEvolutions();
        JSONOutputGenerator.generate(resourcesDir);
    }

    public static void incrementDexCounter(){
        dexCounter++;
    }

    public static void setDexCounter(int dexCounter) {
        GravelmonJsonGenerator.dexCounter = dexCounter;
    }

    public static int getDexCounter(){
        return dexCounter;
    }
}
