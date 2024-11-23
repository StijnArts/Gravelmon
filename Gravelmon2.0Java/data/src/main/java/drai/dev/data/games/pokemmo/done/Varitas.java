package drai.dev.data.games.pokemmo.done;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.hub.Confectious;
import drai.dev.data.pokemon.hub.Garbadjinn;
import drai.dev.data.pokemon.varitas.*;

import java.util.*;
//done
public class Varitas extends drai.dev.data.games.registry.Game {
    public Varitas() {
        super("Varitas");
    }

    @Override
    public void registerPokemon() {
//        addNewPokemon(new Pinecoon()); Member of line Not Finished
//        addNewPokemon(new Vigileaf()); Missing Art
//        addNewPokemon(new Enforester()); Missing Art
//        addNewPokemon(new Scorchion()); Member of line Not Finished
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
//        addNewPokemon(new Cloddle()); Missing Art
//        addNewPokemon(new Temperock()); Missing Art
//        addNewPokemon(new Diamondure()); Missing Art
        addNewPokemon(new Claggy());
        addNewPokemon(new Scrachty());
        addNewPokemon(new Meansprout());
        addNewPokemon(new Meanstalk());
        addNewPokemon(new Sinistalk(new Stats(500, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
//        addNewPokemon(new Burnewt()); Missing Art
//        addNewPokemon(new Amphiburn()); Missing Art
//        addNewPokemon(new Oilimander()); Missing Art
//        addNewPokemon(new Boowee()); Missing Art
//        addNewPokemon(new Stridoar()); Missing Art
//        addNewPokemon(new Byteau()); Missing Art
        addNewPokemon(new Hoofin(new Stats(378, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
//        addNewPokemon(new Cervidrake()); Missing Art
        addNewPokemon(new Wardrab());
        addNewPokemon(new Menasuit());
        addNewPokemon(new Dapperition());
//        addNewPokemon(new Oddancer()); Missing Art
//        addNewPokemon(new Dancentric()); Missing Art
        addNewPokemon(new Plumplasm());
        addNewPokemon(new Phantomnom(new Stats(461, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
//        addNewPokemon(new Sudoferno()); //Missing Art
//        addNewPokemon(new MrCrime()); Missing Art
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
//        addNewPokemon(new Hatterage()); Missing Art;
//        addNewPokemon(new Knifish()); Missing Art
//        addNewPokemon(new Pisword()); Mising Art
        addNewPokemon(new Volcamone(new Stats(354, StatArchetype.PHYSICAL_WALL, List.of(StatType.DEFENCE))));
//        addNewPokemon(new Nauticlown()); Missing Art
//        addNewPokemon(new Bluega()); Member of line Not Finished
//        addNewPokemon(new Narwave()); Missing Art
//        addNewPokemon(new Bleakoat());Member of line Not Finished
//        addNewPokemon(new Punchill());Missing Art
//        addNewPokemon(new Snowbrawl());Missing Art
//        addNewPokemon(new Whizoom());Missing Art
//        addNewPokemon(new Urnaround());Missing Art
        addPokedexPokemon("klink-varitasian, klang-varitasian");
        addNewPokemon(new Tanklang());
        addNewPokemon(new Goopipe());
        addNewPokemon(new Piplex());
        addNewPokemon(new Sinklutter(new Stats(512, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
//        addNewPokemon(new Galactix()); Missing Art
//        addNewPokemon(new Marowing()); Missing Art
        addPokedexPokemon("wynaut, wobbuffet-varitasian, dunsparce");

        addNewPokemon(new Dustout(new Stats(498, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addPokedexPokemon("girafarig");
        addNewPokemon(new Kirinirik(new Stats(550, StatArchetype.MIXED_ATTACKER, List.of(StatType.SPEED))));
//        addNewPokemon(new Coreef()); Missing Art
//        addNewPokemon(new Jollibird()); Missing Art
//        addNewPokemon(new Smeartiste()); Missing Art
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
//        addNewPokemon(new Frostooth());Member of line Not Finished
//        addNewPokemon(new Jawcicle()); Missing Art
//        addNewPokemon(new Alliglacier()); Missing Art
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
