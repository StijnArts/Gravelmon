package drai.dev.data.games.other;

import drai.dev.data.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.blazingemerald.*;
import drai.dev.data.pokemon.blazingemerald.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class BlazingEmerald extends Game {
    public static final Game INSTANCE = new BlazingEmerald();
    private BlazingEmerald() {
        super("BlazingEmerald");
    }

    @Override
    public void registerPokemon() {

        addPokedexPokemon(
                "eevee," +
                        "vaporeon," +
                        "jolteon," +
                        "flareon," +
                        "espeon," +
                        "umbreon," +
                        "leafeon," +
                        "glaceon," +
                        "sylveon");
        addNewPokemon(new Oreon());
        addNewPokemon(new HoennianVenonat("", Aspect.HOENNIAN));
        addNewPokemon(new Muramoth());
        addNewPokemon(new Lucemoth());
        addPokedexPokemon("weedle, kakuna, beedrill");
        addNewPokemon(new Drilladin());
        addNewPokemon(new HoennianDunsparce("Dunsparce", Aspect.HOENNIAN));
        addNewPokemon(new Drasparath());
        addNewPokemon(new HoennianMareanie("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianToxapex("", Aspect.HOENNIAN));
        addPokedexPokemon("farfetchd");
        addNewPokemon(new Mallarki());
        addNewPokemon(new HoennianPinsir("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianTeddiursa("Teddiursa", Aspect.HOENNIAN));
        addNewPokemon(new HoennianUrsaring("Ursaring", Aspect.HOENNIAN));
        addPokedexPokemon("doduo");
        addNewPokemon(new HoennianDodrio("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianSkarmory("Skarmory", Aspect.HOENNIAN));
        addNewPokemon(new HoennianTynamo("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianEelektrik("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianEelektross("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianMaractus("", Aspect.HOENNIAN));
        addPokedexPokemon("seviper");
        addNewPokemon(new Silviper());
        addPokedexPokemon("zangoose");
        addNewPokemon(new Zangoro());
        addNewPokemon(new HoennianTangela("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianTangrowth("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianPawniard("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianBisharp("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianSolosis("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianDuosion("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianReuniclus("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianGoomy("Goomy", Aspect.HOENNIAN));
        addNewPokemon(new Goolossal());
        addNewPokemon(new HoennianShuckle("Shuckle", Aspect.HOENNIAN));
        addNewPokemon(new HoennianEmolga("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianOnix("", Aspect.HOENNIAN));
        addNewPokemon(new Chrysalix());
        addNewPokemon(new HoennianTentacool("", Aspect.HOENNIAN).createFishingSpawn(SpawnPool.COMMON, 9, 34, 5.4));
        addNewPokemon(new HoennianTentacruel("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianSeel("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianDewgong("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianChinchou("Chinchou", Aspect.HOENNIAN));
        addNewPokemon(new HoennianLanturn("Lanturn", Aspect.HOENNIAN));
        addNewPokemon(new HoennianQwilfish("Qwilfish", Aspect.HOENNIAN));
        addPokedexPokemon("remoraid, octillery");
        addNewPokemon(new Slingray());
        addNewPokemon(new Bawlfrog());
        addNewPokemon(new HoennianDreepy("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianDrakloak("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianDragapult("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianRegigigas("", Aspect.HOENNIAN));
        addNewPokemon(new Vitellion());
        addNewPokemon(new Crawb());
        addNewPokemon(new Metunn());

    }
}