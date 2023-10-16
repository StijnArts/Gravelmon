package com.gravelmon.common.gravelmon;

import com.gravelmon.common.gravelmon.games.*;
import com.gravelmon.common.gravelmon.jsonwriters.*;
import com.gravelmon.common.gravelmon.pokemon.*;

public class GravelmonJsonGenerator
{
    private static int dexCounter = 1;

    public static void run( String[] args )
    {
        GameRegistry.registerGames();
        Pokemon.scanEvolutions();
        com.gravelmon.common.gravelmon.jsonwriters.JSONOutputGenerator.generate();
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
