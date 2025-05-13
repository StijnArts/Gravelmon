package drai.dev.data.games.registry;

import drai.dev.data.*;
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
        games.add(GenerationOne.INSTANCE);
        games.add(GenerationTwo.INSTANCE);
        games.add(GenerationThree.INSTANCE);
        games.add(GenerationFour.INSTANCE);
        games.add(GenerationFive.INSTANCE);
        games.add(GenerationSix.INSTANCE);
        games.add(GenerationSeven.INSTANCE);
        games.add(GenerationEight.INSTANCE);
        games.add(GenerationNine.INSTANCE);
        DexCounter.setDexCounter(1025);
        games.add(NeoNintendo.INSTANCE);
        games.add(Sage.INSTANCE);
        games.add(Realidea.INSTANCE);
        games.add(Rica.INSTANCE);
        games.add(Infinity.INSTANCE);
        games.add(Dhiome.INSTANCE);
        games.add(Sevii.INSTANCE);
        games.add(Lagoone.INSTANCE);
        games.add(HUB.INSTANCE);
        games.add(Interregional.INSTANCE);
        games.add(Opal.INSTANCE);
        games.add(PhoenixRising.INSTANCE);
        games.add(Ferroa.INSTANCE);
        games.add(Insurgence.INSTANCE);
        games.add(Enriko.INSTANCE);
        games.add(Xenoverse.INSTANCE);
        games.add(Avoris.INSTANCE);
        games.add(Oceane.INSTANCE);
        games.add(Varitas.INSTANCE);
        games.add(Africanus.INSTANCE);
        games.add(Aristos.INSTANCE);
        games.add(Azure.INSTANCE);
        games.add(Uranium.INSTANCE);
        games.add(Flux.INSTANCE);
        games.add(Kuulkid.INSTANCE);
        games.add(Hiza.INSTANCE);
        games.add(Junnin.INSTANCE);

        games.add(Raian.INSTANCE);
        games.add(Norse.INSTANCE);
        games.add(Palmia.INSTANCE);
        games.add(Trizor.INSTANCE);

        games.add(Bago.INSTANCE);
        games.add(Aldao.INSTANCE);
        games.add(Fra.INSTANCE);
        games.add(Borazul.INSTANCE);

        games.add(OrohnHavai.INSTANCE);
        games.add(EternalForest.INSTANCE);
        games.add(Norheim.INSTANCE);
        games.add(Soulstones.INSTANCE);
        games.add(Crozoic.INSTANCE);
        games.add(Lonava.INSTANCE);
        games.add(Lockemon.INSTANCE);
        games.add(Nosto.INSTANCE);

        games.add(Ivris.INSTANCE);

        games.add(Umbra.INSTANCE);

        games.add(Form.INSTANCE);

        games.add(BlazingEmerald.INSTANCE);
        games.add(Mythire.INSTANCE);
        games.add(Avalos.INSTANCE);
        games.add(Daybreak.INSTANCE);
        games.add(Qamor.INSTANCE);
        games.add(Vanguard.INSTANCE);
        games.add(Kuria.INSTANCE);
        games.add(Isiah.INSTANCE);
        games.add(Midamis.INSTANCE);
        games.add(Okeno.INSTANCE);
        games.add(Deneb.INSTANCE);
        games.add(Enjin.INSTANCE);
        games.add(Ionos.INSTANCE);
        games.add(Novrai.INSTANCE);
        games.add(Atlas.INSTANCE);
        games.add(Amavi.INSTANCE);
        games.add(Cyare.INSTANCE);

        games.add(Ferran.INSTANCE);
        games.add(Mahal.INSTANCE);
        games.add(Fabel.INSTANCE);
        games.add(Arom.INSTANCE);

        games.add(Goetia.INSTANCE);
//        games.add(Sorin.INSTANCE);
        games.add(Mastenia.INSTANCE);
        games.add(Mikitari.INSTANCE);
        games.add(Mushi.INSTANCE);
        games.add(Mongratis.INSTANCE);
        games.add(Mystis.INSTANCE);
        games.add(Nodorro.INSTANCE);
        games.add(Olysos.INSTANCE);
        games.add(Ishiria.INSTANCE);
        games.add(Orbis.INSTANCE);
        games.add(Beginnings.INSTANCE);
    }
}
