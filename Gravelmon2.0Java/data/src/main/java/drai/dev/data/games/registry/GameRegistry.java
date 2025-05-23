package drai.dev.data.games.registry;

import drai.dev.data.games.instagram.artworks218.*;
import drai.dev.data.games.instagram.eldark.*;
import drai.dev.data.games.instagram.federex.*;
import drai.dev.data.games.instagram.fra.*;
import drai.dev.data.games.original.*;
import drai.dev.data.games.other.*;
import drai.dev.data.games.pbs.*;
import drai.dev.data.games.pokemmo.*;
import drai.dev.data.games.pokemmo.done.*;
import drai.dev.data.jsonwriters.*;

import java.util.*;

public class GameRegistry {
    public static ArrayList<Game> games = new ArrayList<>();
    public static void registerGames(){
        registerGame(GenerationOne.INSTANCE);
        registerGame(GenerationTwo.INSTANCE);
        registerGame(GenerationThree.INSTANCE);
        registerGame(GenerationFour.INSTANCE);
        registerGame(GenerationFive.INSTANCE);
        registerGame(GenerationSix.INSTANCE);
        registerGame(GenerationSeven.INSTANCE);
        registerGame(GenerationEight.INSTANCE);
        registerGame(GenerationNine.INSTANCE);
        DexCounter.setDexCounter(1025);
        registerGame(NeoNintendo.INSTANCE);
        registerGame(Sage.INSTANCE);
        registerGame(Realidea.INSTANCE);
        registerGame(Rica.INSTANCE);
        registerGame(Infinity.INSTANCE);
        registerGame(Dhiome.INSTANCE);
        registerGame(Sevii.INSTANCE);
        registerGame(Lagoone.INSTANCE);
        registerGame(HUB.INSTANCE);
        registerGame(Interregional.INSTANCE);
        registerGame(Opal.INSTANCE);
        registerGame(PhoenixRising.INSTANCE);
        registerGame(Ferroa.INSTANCE);
        registerGame(Insurgence.INSTANCE);
        registerGame(Enriko.INSTANCE);
        registerGame(Xenoverse.INSTANCE);
        registerGame(Avoris.INSTANCE);
        registerGame(Oceane.INSTANCE);
        registerGame(Varitas.INSTANCE);
        registerGame(Africanus.INSTANCE);
        registerGame(Aristos.INSTANCE);
        registerGame(Azure.INSTANCE);
        registerGame(Uranium.INSTANCE);
        registerGame(Flux.INSTANCE);
        registerGame(Kuulkid.INSTANCE);
        registerGame(Hiza.INSTANCE);
        registerGame(Junnin.INSTANCE);

        registerGame(Raian.INSTANCE);
        registerGame(Norse.INSTANCE);
        registerGame(Palmia.INSTANCE);
        registerGame(Trizor.INSTANCE);

        registerGame(Bago.INSTANCE);
        registerGame(Aldao.INSTANCE);
        registerGame(Fra.INSTANCE);
        registerGame(Borazul.INSTANCE);

        registerGame(OrohnHavai.INSTANCE);
        registerGame(EternalForest.INSTANCE);
        registerGame(Norheim.INSTANCE);
        registerGame(Soulstones.INSTANCE);
        registerGame(Crozoic.INSTANCE);
        registerGame(Lonava.INSTANCE);
        registerGame(Lockemon.INSTANCE);
        registerGame(Nosto.INSTANCE);

        registerGame(Ivris.INSTANCE);

        registerGame(Umbra.INSTANCE);

        registerGame(Form.INSTANCE);

        registerGame(BlazingEmerald.INSTANCE);
        registerGame(Mythire.INSTANCE);
        registerGame(Avalos.INSTANCE);
        registerGame(Daybreak.INSTANCE);
        registerGame(Qamor.INSTANCE);
        registerGame(Vanguard.INSTANCE);
        registerGame(Kuria.INSTANCE);
        registerGame(Isiah.INSTANCE);
        registerGame(Midamis.INSTANCE);
        registerGame(Okeno.INSTANCE);
        registerGame(Deneb.INSTANCE);
        registerGame(Enjin.INSTANCE);
        registerGame(Ionos.INSTANCE);
        registerGame(Novrai.INSTANCE);
        registerGame(Atlas.INSTANCE);
        registerGame(Amavi.INSTANCE);
        registerGame(Cyare.INSTANCE);

        registerGame(Ferran.INSTANCE);
        registerGame(Mahal.INSTANCE);
        registerGame(Fabel.INSTANCE);
        registerGame(Arom.INSTANCE);

        registerGame(Goetia.INSTANCE);
//        registerGame(Sorin.INSTANCE);
        registerGame(Mastenia.INSTANCE);
        registerGame(Mikitari.INSTANCE);
        registerGame(Mushi.INSTANCE);
        registerGame(Mongratis.INSTANCE);
        registerGame(Mystis.INSTANCE);
        registerGame(Nodorro.INSTANCE);
        registerGame(Olysos.INSTANCE);
        registerGame(Ishiria.INSTANCE);
        registerGame(Orbis.INSTANCE);
        registerGame(Beginnings.INSTANCE);
    }

    private static void registerGame(Game game) {
        registerGame(game);
        game.getNewPokemon().forEach(pokemon -> {
            if(pokemon.getAdditionalAspect()==null){
                DexCounter.incrementDexCounter();
                pokemon.setPokedexNumber(DexCounter.getDexCounter());
            }
        });
    }
}
