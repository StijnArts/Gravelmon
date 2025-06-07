package drai.dev.data.games.pokemmo.done;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.hub.*;
import drai.dev.data.pokemon.hub.Confectious;
import drai.dev.data.pokemon.hub.Garbadjinn;
import drai.dev.data.pokemon.varitas.*;
import drai.dev.data.pokemon.varitas.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
//TODO update
public class Varitas extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Varitas();
    private Varitas() {
        super("Varitas");
    }

    @Override
    public void registerPokemon() {
        /*addNewPokemon(new Pinecoon().addLabels(Label.STARTER)); Member of line Not Finished
        addNewPokemon(new Vigileaf().addLabels(Label.STARTER)); Missing Art
        addNewPokemon(new Enforester().addLabels(Label.STARTER)); Missing Art
//        addNewPokemon(new Scorchion().addLabels(Label.STARTER)); Member of line Not Finished
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
        addNewPokemon(new Cloddle()); Missing Art
        addNewPokemon(new Temperock()); Missing Art
        addNewPokemon(new Diamondure()); Missing Art
        addNewPokemon(new Claggy());
        addNewPokemon(new Scrachty());
        addNewPokemon(new Meansprout());
        addNewPokemon(new Meanstalk());
        addNewPokemon(new Sinistalk(new Stats(500, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
//        addNewPokemon(new Burnewt()); Missing Art
//        addNewPokemon(new Amphiburn()); Missing Art
//        addNewPokemon(new Oilimander()); Missing Art
        addNewPokemon(new Boowee()); Missing Art
        addNewPokemon(new Stridoar()); Missing Art
        addNewPokemon(new Byteau()); Missing Art
        addNewPokemon(new Hoofin());
        addNewPokemon(new Cervidrake(new Stats(378, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED)))); Missing Art
        addNewPokemon(new Wardrab());
        addNewPokemon(new Menasuit());
        addNewPokemon(new Dapperition());
        addNewPokemon(new Oddancer()); Missing Art
        addNewPokemon(new Dancentric()); Missing Art
        addNewPokemon(new Plumplasm());
        addNewPokemon(new Phantomnom(new Stats(461, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));

        addNewPokemon(new VaritasianBonsly(438));
        addNewPokemon(new VaritasianSudowoodo(185));
                addNewPokemon(new Sudoferno());
        addNewPokemon(new VaritasianMimeJr(439));
        addNewPokemon(new VaritasianMrMime(122));
        addNewPokemon(new MrCrime()); //TODO
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
        addNewPokemon(new VaritasianImpidimp("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianMorgrem("", Aspect.VARITASIAN));
        addNewPokemon(new Grimpire(new Stats(510, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))));

        addNewPokemon(new VaritasianHatenna(856)); Member of line Not Finished
        addNewPokemon(new VaritasianHattrem(857)); Missing Art
        addNewPokemon(new Hatterage()); Missing Art;
        addNewPokemon(new VaritasianMantyke(458)); Member of line Not Finished
        addNewPokemon(new VaritasianMantine(226)); Missing Art
        addNewPokemon(new Knifish()); Missing Art
        addNewPokemon(new Pisword()); Mising Art
        addNewPokemon(new Volcamone(new Stats(354, StatArchetype.PHYSICAL_WALL, List.of(StatType.DEFENCE))));

        addNewPokemon(new VaritasianHorsea(116)); Member of line Not Finished
        addNewPokemon(new VaritasianSeadra(117)); Missing Art
        addNewPokemon(new VaritasianKingdra(230)); Missing Art
//        addNewPokemon(new Nauticlown()); Missing Art
        addNewPokemon(new Bluega()); Member of line Not Finished
        addNewPokemon(new Narwave()); Missing Art
        addNewPokemon(new Bleakoat());Member of line Not Finished
        addNewPokemon(new Punchill());Missing Art
        addNewPokemon(new Snowbrawl());Missing Art
        addNewPokemon(new Whizoom());Missing Art
//        addNewPokemon(new Urnaround());Missing Art
        addNewPokemon(new VaritasianKlink("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianKlang("", Aspect.VARITASIAN));
        addNewPokemon(new Tanklang());
        addNewPokemon(new Goopipe());
        addNewPokemon(new Piplex());
        addNewPokemon(new Sinklutter(new Stats(512, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new VaritasianOnix(95)); Member of line Not Finished
        addNewPokemon(new Galactix()); Missing Art
                addNewPokemon(new VaritasianCubone(95)); Member of line Not Finished
                addNewPokemon(new VaritasianMarowak(95)); Member of line Not Finished
        addNewPokemon(new Marowing()); Missing Art
        addPokedexPokemon("wynaut");
        addNewPokemon(new VaritasianWobbuffet("", Aspect.VARITASIAN));
        addPokedexPokemon("dunsparce");

        addNewPokemon(new Dustout(new Stats(498, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addPokedexPokemon("girafarig");
        addNewPokemon(new Kirinirik(new Stats(550, StatArchetype.MIXED_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Coreef()); Missing Art
        addNewPokemon(new Jollibird()); Missing Art
        addNewPokemon(new Smeartiste()); Missing Art
        addPokedexPokemon("kecleon");
        addNewPokemon(new Concealeon());
        addNewPokemon(new Pestilint());
        addNewPokemon(new Carvesta());
        addNewPokemon(new Molcarona());
        addNewPokemon(new Grimire());
        addNewPokemon(new Stuk());
        addNewPokemon(new Nebulull());
        addNewPokemon(new Xenotic());
        //TODO update
        addNewPokemon(new Fretal());
        addNewPokemon(new Canopeace());
        addNewPokemon(new Grassola());
        addNewPokemon(new Graceola());
        addNewPokemon(new VaritasianOddish("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianGloom("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianVileplume("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianBellossom("", Aspect.VARITASIAN));
        addNewPokemon(new Severm());
        addNewPokemon(new Infesteed());
        addNewPokemon(new VaritasianBounsweet("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianSteenee("", Aspect.VARITASIAN));
        addNewPokemon(new Frankensteen());
        addNewPokemon(new VaritasianPhantump("Phantump", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianTrevenant("Trevenant", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianFlabebe("Flabebe", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianFloette("Floette", Aspect.VARITASIAN));
        addNewPokemon(new Sporges());
        addNewPokemon(new VaritasianYamask("", Aspect.VARITASIAN));
        addNewPokemon(new Mirrorigus());
        addNewPokemon(new VaritasianSwablu("Swablu", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianAltaria("Altaria", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianPorygon("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianPorygon2("", Aspect.VARITASIAN));
        addNewPokemon(new Porygon0());
        addNewPokemon(new VaritasianDreepy(885)); Member of line Not Finished
        addNewPokemon(new VaritasianDrakloak(886)); Missing Art
        addNewPokemon(new VaritasianDragapult(887)); Missing Art
        addNewPokemon(new Frostooth());Member of line Not Finished
        addNewPokemon(new Jawcicle()); Missing Art
        addNewPokemon(new Alliglacier()); Missing Art
        addNewPokemon(new Einymph());
        addNewPokemon(new Zweiphid());
        addNewPokemon(new Hydreinopod());
        addNewPokemon(new VaritasianSlugma("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianMagcargo("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianTyrogue("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianHitmonlee("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianHitmonchan("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianHitmontop("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianMunchlax("", Aspect.VARITASIAN));
        addNewPokemon(new Snarlax());
        addNewPokemon(new VaritasianTynamo("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianEelektrik("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianEelektross("", Aspect.VARITASIAN));
        addNewPokemon(new Lasaur());
        addNewPokemon(new Lectrosaur());
        addNewPokemon(new Confectious());
        addNewPokemon(new Garbadjinn());
        addNewPokemon(new Slowpose());
        addNewPokemon(new Slowtow());
        addNewPokemon(new Slowswing());
        addNewPokemon(new VaritasianMilcery("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianAlcremie("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianTogepi("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianTogetic("", Aspect.VARITASIAN));
        addNewPokemon(new Togetect());
        addNewPokemon(new VaritasianRaikou("", Aspect.VARITASIAN).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new VaritasianEntei("", Aspect.VARITASIAN).addLabels(Label.SUB_LEGENDARY));
        addNewPokemon(new VaritasianSuicune("", Aspect.VARITASIAN).addLabels(Label.SUB_LEGENDARY));*/
    }

}
