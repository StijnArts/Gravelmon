package drai.dev.gravelmon.games.registry;

import drai.dev.gravelmon.*;
import drai.dev.gravelmon.games.*;
import drai.dev.gravelmon.games.original.*;
import drai.dev.gravelmon.games.pokemmo.firstbatch.*;
import drai.dev.gravelmon.games.pokemmo.secondbatch.*;

import java.util.*;

public class GameRegistry {
    public static ArrayList<Game> games = new ArrayList<>();
    public static void registerGames(){
        //TODO add the better nether biomes to the nether biomes tags
        games.add(new GenerationOne());
        games.add(new GenerationTwo());
        games.add(new GenerationThree());
        games.add(new GenerationFour());
        games.add(new GenerationFive());
        games.add(new GenerationSix());
        games.add(new GenerationSeven());
        games.add(new GenerationEight());
        games.add(new GenerationNine());
        GravelmonJsonGenerator.setDexCounter(1025);
        games.add(new Sage());
        games.add(new Realidea());
        games.add(new Rica());
        games.add(new Infinity());
        games.add(new Dhiome());
        games.add(new Opal());
        games.add(new Insurgence());
        games.add(new Xenoverse());
        games.add(new Avoris());
        games.add(new Oceane());
        games.add(new Varitas());
        games.add(new Junnin());
        games.add(new EternalForest());
        games.add(new Lockemon());
        games.add(new Nosto());
        games.add(new Umbra());
        games.add(new BlazingEmerald());
        games.add(new Daybreak());
        games.add(new Vanguard());
        games.add(new Kuria());
        games.add(new Isiah());
        games.add(new Myth());
        games.add(new Midamis());
        games.add(new Deneb());
        games.add(new Amavi());
    }
}
