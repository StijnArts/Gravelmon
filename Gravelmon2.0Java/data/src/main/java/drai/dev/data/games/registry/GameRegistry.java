package drai.dev.data.games.registry;

import drai.dev.data.*;
import drai.dev.data.games.instagram.artworks218.*;
import drai.dev.data.games.instagram.eldark.*;
import drai.dev.data.games.instagram.federex.*;
import drai.dev.data.games.instagram.fra.*;
import drai.dev.data.games.og.*;
import drai.dev.data.games.original.*;
import drai.dev.data.games.pbs.*;
import drai.dev.data.games.pokemmo.*;

import java.util.*;

public class GameRegistry {
    public static ArrayList<Game> games = new ArrayList<>();
    public static void registerGames(){
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
        games.add(new NeoNintendo());
        games.add(new Sage());
        games.add(new Realidea());
        games.add(new Rica());
        games.add(new Infinity());
        games.add(new Dhiome());
        games.add(new Lagoone());
        games.add(new HUB());
        games.add(new Interregional());
        games.add(new Opal());
        games.add(new Ferroa());
        games.add(new Insurgence());
        games.add(new Enriko());
        games.add(new Xenoverse());
        games.add(new Avoris());
        games.add(new Oceane());
        games.add(new Varitas());
        games.add(new Africanus());
        games.add(new Aristos());
        games.add(new Uranium());
        games.add(new Flux());
        games.add(new Hiza());
        games.add(new Junnin());

        games.add(new Raian());
        games.add(new Norse());
        games.add(new Trizor());
        games.add(new Palmia());
        games.add(new Fra());
        games.add(new Borazul());
        games.add(new Bago());
        games.add(new Aldao());

        games.add(new OrohnHavai());
        games.add(new EternalForest());
        games.add(new Norheim());
        games.add(new Soulstones());
        games.add(new Crozoic());
        games.add(new Lonava());
        games.add(new Lockemon());
        games.add(new Nosto());

        games.add(new Ivris());

        games.add(new Umbra());

        games.add(new Form());

        games.add(new BlazingEmerald());
        games.add(new Mythire());
        games.add(new Avalos());
        games.add(new Daybreak());
        games.add(new Qamor());
        games.add(new Vanguard());
        games.add(new Kuria());
        games.add(new Isiah());
        games.add(new Myth());
        games.add(new Midamis());
        games.add(new Okeno());
        games.add(new Deneb());
        games.add(new Enjin());
        games.add(new Ionos());
        games.add(new Novrai());
        games.add(new Atlas());
        games.add(new Amavi());
        games.add(new Cyare());
        games.add(new Ferran());

        games.add(new Mahal());
        games.add(new Fabel());
        games.add(new Arom());
        games.add(new Sahl());
        games.add(new Elb());

        games.add(new Goetia());
    }
}
