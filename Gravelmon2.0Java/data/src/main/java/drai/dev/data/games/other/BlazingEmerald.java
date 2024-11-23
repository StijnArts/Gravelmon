package drai.dev.data.games.other;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.blazingemerald.*;

public class BlazingEmerald extends Game {
    public BlazingEmerald() {
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
        addPokedexPokemon("venonat-hoennian");
        addNewPokemon(new Muramoth());
        addNewPokemon(new Lucemoth());
        addPokedexPokemon("weedle, kakuna, beedrill");
        addNewPokemon(new Drilladin());
        addPokedexPokemon("dunsparce-hoennian");
        addNewPokemon(new Drasparath());
        addPokedexPokemon("mareanie-hoennian, toxapex-hoennian, farfetchd");
        addNewPokemon(new Mallarki());
        addPokedexPokemon("pinsir-hoennian, teddiursa-hoennian, ursaring-hoennian, doduo, dodrio-hoennian, " +
                "skarmory-hoennian, tynamo-hoennian, eelektrik-hoennian, eelektross-hoennian, maractus-hoennian, seviper");
        addNewPokemon(new Silviper());
        addPokedexPokemon("zangoose");
        addNewPokemon(new Zangoro());
        addPokedexPokemon("tangela-hoennian, tangrowth-hoennian, pawniard-hoennian, bisharp-hoennian, solosis-hoennian, duosion-hoennian, reuniclus-hoennian, goomy-hoennian");
        addNewPokemon(new Goolossal());
        addPokedexPokemon("shuckle-hoennian, emolga-hoennian, onix-hoennian");
        addNewPokemon(new Chrysalix());
        addPokedexPokemon("tentacool-hoennian, tentacruel-hoennian, seel-hoennian, dewgong-hoennian, chinchou-hoennian, lanturn-hoennian, qwilfish-hoennian, remoraid, octillery");
        addNewPokemon(new Slingray());
        addNewPokemon(new Bawlfrog());
        addPokedexPokemon("dreepy-hoennian, drakloak-hoennian, dragapult-hoennian, regigigas-hoennian");
        addNewPokemon(new Vitellion());
        addNewPokemon(new Metunn());
    }
}
