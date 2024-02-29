package drai.dev.gravelmon.games.registry;

import drai.dev.gravelmon.*;
import drai.dev.gravelmon.games.*;
import drai.dev.gravelmon.games.original.*;
import drai.dev.gravelmon.games.pokemmo.*;

import java.util.*;

public class GameRegistry {
    public static ArrayList<Game> games = new ArrayList<>();
    public static void registerGames(){
        //TODO make pokemon that evolve using an item drop said item in their evolved form
        games.add(new GenerationOne());
        games.add(new GenerationTwo());
        games.add(new GenerationThree());
        games.add(new GenerationFour());
        games.add(new GenerationFive());
        games.add(new GenerationSix());
        games.add(new GenerationSeven());
        games.add(new GenerationEight());
        games.add(new GenerationNine());
        GravelmonJsonGenerator.setDexCounter(1024);
        games.add(new Sage());
        games.add(new Realidea());
        games.add(new Infinity());
        games.add(new HUB());
        games.add(new Interregional());
        games.add(new Opal());
        games.add(new Ferroa());
        games.add(new Insurgence());
        games.add(new Enriko());
        games.add(new Xenoverse());
        games.add(new Avoris());
        games.add(new Varitas());
        games.add(new Aristos());
        games.add(new Uranium());
        games.add(new Flux());
        games.add(new Hiza());
        games.add(new Junnin());
        games.add(new OrohnHavai());
        games.add(new EternalForest());
        games.add(new Norheim());
        games.add(new Lonava());
        games.add(new Lockemon());
        games.add(new Nosto());
        games.add(new Umbra());
        games.add(new BlazingEmerald());
        games.add(new Mythire());
        games.add(new Daybreak());
        games.add(new Qamor());
        games.add(new Vanguard());
        games.add(new Isiah());
        games.add(new Myth());
        games.add(new Midamis());
        games.add(new Deneb());
        games.add(new Atlas());
    }
}
