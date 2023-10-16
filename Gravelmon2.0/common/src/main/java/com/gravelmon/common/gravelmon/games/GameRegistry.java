package com.gravelmon.common.gravelmon.games;

import com.gravelmon.common.gravelmon.games.original.*;

import java.util.*;

public class GameRegistry {
    public static ArrayList<Game> games = new ArrayList<>();
    public static void registerGames(){
        games.add(new com.gravelmon.common.gravelmon.games.original.GenerationOne());
        games.add(new com.gravelmon.common.gravelmon.games.original.GenerationTwo());
        games.add(new com.gravelmon.common.gravelmon.games.original.GenerationThree());
        games.add(new com.gravelmon.common.gravelmon.games.original.GenerationFour());
        games.add(new com.gravelmon.common.gravelmon.games.original.GenerationFive());
        games.add(new com.gravelmon.common.gravelmon.games.original.GenerationSix());
        games.add(new com.gravelmon.common.gravelmon.games.original.GenerationSeven());
        games.add(new com.gravelmon.common.gravelmon.games.original.GenerationEight());
        games.add(new com.gravelmon.common.gravelmon.games.original.GenerationNine());
        games.add(new com.gravelmon.common.gravelmon.games.Sage());
        games.add(new com.gravelmon.common.gravelmon.games.Infinity());
        //games.add(new Insurgence());
        games.add(new com.gravelmon.common.gravelmon.games.Xenoverse());
        games.add(new com.gravelmon.common.gravelmon.games.BlazingEmerald());
        games.add(new com.gravelmon.common.gravelmon.games.Vega());
    }
}
