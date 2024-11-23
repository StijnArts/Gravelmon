package drai.dev.data.games.pokemmo.firstbatch;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.hub.Confectious;
import drai.dev.data.pokemon.hub.Garbadjinn;
import drai.dev.data.pokemon.varitas.*;

import java.util.*;

public class Varitas extends drai.dev.data.games.registry.Game {
    public Varitas() {
        super("Varitas");
    }

    @Override
    public void registerPokemon() {
//        pokemon.add(new Pinecoon()); Member of line Not Finished
//        pokemon.add(new Vigileaf()); Missing Art
//        pokemon.add(new Enforester()); Missing Art
//        pokemon.add(new Scorchion()); Member of line Not Finished
        addNewPokemon(new Capillar());
        addNewPokemon(new Beacoon());
        addNewPokemon(new Fulgoryu());
        addNewPokemon(new Feebleg());
        addNewPokemon(new Webbind());
        addNewPokemon(new Taranterror());
        addNewPokemon(new Dorsel());
        addNewPokemon(new Riverous(new Stats(451, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Stalacbite());
        addNewPokemon(new Stalagoyle(new Stats(410, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
//        pokemon.add(new Cloddle()); Missing Art
//        pokemon.add(new Temperock()); Missing Art
//        pokemon.add(new Diamondure()); Missing Art
        addNewPokemon(new Claggy());
        addNewPokemon(new Scrachty());
        addNewPokemon(new Meansprout());
        addNewPokemon(new Meanstalk());
        addNewPokemon(new Sinistalk(new Stats(500, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
//        pokemon.add(new Burnewt()); Missing Art
//        pokemon.add(new Amphiburn()); Missing Art
//        pokemon.add(new Oilimander()); Missing Art
//        pokemon.add(new Boowee()); Missing Art
//        pokemon.add(new Stridoar()); Missing Art
//        pokemon.add(new Byteau()); Missing Art
        addNewPokemon(new Hoofin(new Stats(378, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
//        pokemon.add(new Cervidrake()); Missing Art
        addNewPokemon(new Wardrab());
        addNewPokemon(new Menasuit());
        addNewPokemon(new Dapperition());
//        pokemon.add(new Oddancer()); Missing Art
//        pokemon.add(new Dancentric()); Missing Art
        addNewPokemon(new Plumplasm());
        addNewPokemon(new Phantomnom(new Stats(461, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
//        pokemon.add(new Sudoferno()); //Missing Art
//        pokemon.add(new MrCrime()); Missing Art
        addNewPokemon(new Germite());
        addNewPokemon(new Gastropox());
        addNewPokemon(new Agitwin());
        addNewPokemon(new Naeglerium());
        addNewPokemon(new Dicell(new Stats(325, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))));
        addNewPokemon(new Minicule());
        addNewPokemon(new Atomix());
        addNewPokemon(new Kwiklik());
        addNewPokemon(new Binarray(new Stats(476, StatArchetype.FAST_SPECIAL_WALL, List.of(StatType.SPEED))));
        addNewPokemon(new Purradox(new Stats(423, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))));
        addPokedexPokemon("impidimp-varitasian, morgrem-varitasian");
        addNewPokemon(new Grimpire(new Stats(510, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));
//        pokemon.add(new Hatterage()); Missing Art;
//        pokemon.add(new Knifish()); Missing Art
//        pokemon.add(new Pisword()); Mising Art
        addNewPokemon(new Volcamone(new Stats(354, StatArchetype.PHYSICAL_WALL, List.of(StatType.DEFENCE))));
//        pokemon.add(new Nauticlown()); Missing Art
//        pokemon.add(new Bluega()); Member of line Not Finished
//        pokemon.add(new Narwave()); Missing Art
//        pokemon.add(new Bleakoat());Member of line Not Finished
//        pokemon.add(new Punchill());Missing Art
//        pokemon.add(new Snowbrawl());Missing Art
//        pokemon.add(new Whizoom());Missing Art
//        pokemon.add(new Urnaround());Missing Art
        addPokedexPokemon("klink-varitasian, klang-varitasian");
        addNewPokemon(new Tanklang());
        addNewPokemon(new Goopipe());
        addNewPokemon(new Piplex());
        addNewPokemon(new Sinklutter(new Stats(512, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
//        pokemon.add(new Galactix()); Missing Art
//        pokemon.add(new Marowing()); Missing Art
        addPokedexPokemon("wynaut, wobbuffet-varitasian, dunsparce");

        addNewPokemon(new Dustout(new Stats(498, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addPokedexPokemon("girafarig");
        addNewPokemon(new Kirinirik(new Stats(550, StatArchetype.MIXED_ATTACKER, List.of(StatType.SPEED))));
//        pokemon.add(new Coreef()); Missing Art
//        pokemon.add(new Jollibird()); Missing Art
//        pokemon.add(new Smeartiste()); Missing Art
        addPokedexPokemon("kecleon");
        addNewPokemon(new Concealeon());
        addNewPokemon(new Pestilint());
        addNewPokemon(new Carvesta());
        addNewPokemon(new Molcarona());
        addNewPokemon(new Grimire());
        addNewPokemon(new Stuk());
        addNewPokemon(new Fretal());
        addNewPokemon(new Canopeace());
        addNewPokemon(new Grassola());
        addNewPokemon(new Graceola());
        addNewPokemon(new Severm());
        addNewPokemon(new Infesteed());
        addPokedexPokemon("bounsweet-varitasian, steenee-varitasian");
        addNewPokemon(new Frankensteen());
        addPokedexPokemon("phantump-varitasian, trevenant-varitasian, flabebe-varitasian, floette-varitasian");
        addNewPokemon(new Sporges());
        addPokedexPokemon("yamask-varitasian");
        addNewPokemon(new Mirrorigus());
        addPokedexPokemon("swablu-varitasian, altaria-varitasian, porygon-varitasian, porygon2-varitasian");
        addNewPokemon(new Porygon0());
//        pokemon.add(new Frostooth());Member of line Not Finished
//        pokemon.add(new Jawcicle()); Missing Art
//        pokemon.add(new Alliglacier()); Missing Art
        addPokedexPokemon("tyrogue-varitasian, hitmonlee-varitasian, hitmonchan-varitasian, hitmontop-varitasian, munchlax-varitasian");
        addNewPokemon(new Snarlax());
        addPokedexPokemon("tynamo-varitasian, eelektrik-varitasian, eelektross-varitasian");
        addNewPokemon(new Lasaur());
        addNewPokemon(new Lectrosaur());
        addNewPokemon(new Confectious());
        addNewPokemon(new Garbadjinn());
        addPokedexPokemon("milcery-varitasian, alcremie-varitasian, togepi-varitasian, togetic-varitasian");
        addNewPokemon(new Togetect());
        addPokedexPokemon("raikou-varitasian, entei-varitasian, suicune-varitasian");
    }

}
