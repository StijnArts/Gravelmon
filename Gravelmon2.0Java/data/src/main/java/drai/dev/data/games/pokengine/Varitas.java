package drai.dev.data.games.pokengine;

import drai.dev.data.attributes.*;
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
        super("Varitas", "https://pokengine.org/collections/10piq9nx/Varitas");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Pinecoon().addLabels(Label.STARTER));
        addNewPokemon(new Vigileaf().addLabels(Label.STARTER));
        addNewPokemon(new Enforester(new Stats(533, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.HP, StatType.SPEED))).addLabels(Label.STARTER));
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
        addNewPokemon(new Cloddle());
        addNewPokemon(new Temperock());
        addNewPokemon(new Diamondure(new Stats(511, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Claggy());
        addNewPokemon(new Scrachty());
        addNewPokemon(new Meansprout());
        addNewPokemon(new Meanstalk());
        addNewPokemon(new Sinistalk(new Stats(500, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
//        addNewPokemon(new Burnewt()); Missing Art
//        addNewPokemon(new Amphiburn()); Missing Art
//        addNewPokemon(new Oilimander()); Missing Art
        addNewPokemon(new Boowee());
        addNewPokemon(new Stridoar());
        addNewPokemon(new Byteau(new Stats(523, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Sharpig());
        addNewPokemon(new Boarazer(new Stats(489, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new Hoofin());
        addNewPokemon(new Cervidrake(new Stats(512, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addNewPokemon(new Wardrab());
        addNewPokemon(new Menasuit());
        addNewPokemon(new Dapperition());
        addNewPokemon(new Oddancer());
        addNewPokemon(new Dancentric(new Stats(469, StatArchetype.FAST_SUPPORT, List.of(StatType.SPECIAL_ATTACK))));
        addNewPokemon(new Plumplasm());
        addNewPokemon(new Phantomnom(new Stats(461, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new VaritasianBonsly("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianSudowoodo("", Aspect.VARITASIAN));
        addNewPokemon(new Sudoferno(new Stats(523, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.DEFENCE))));
        addNewPokemon(new VaritasianMimeJr("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianMrMime("", Aspect.VARITASIAN));
        addNewPokemon(new MrCrime(new Stats(523, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.HP))));
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
        addNewPokemon(new VaritasianHatenna("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianHattrem("", Aspect.VARITASIAN));
        addNewPokemon(new Hatterage());
        addNewPokemon(new VaritasianMantyke("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianMantine("", Aspect.VARITASIAN));
        addNewPokemon(new Knifish());
        addNewPokemon(new Pisword(new Stats(483, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new Volcamone(new Stats(354, StatArchetype.PHYSICAL_WALL, List.of(StatType.DEFENCE))));

        addNewPokemon(new VaritasianHorsea("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianSeadra("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianKingdra("", Aspect.VARITASIAN));
//        addNewPokemon(new Nauticlown()); Missing Art
        addNewPokemon(new Bluega());
        addNewPokemon(new Narwave(new Stats(478, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE, StatType.HP))));
        addNewPokemon(new Bleakoat());
        addNewPokemon(new Punchill());
        addNewPokemon(new Snowbrawl(new Stats(532, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
//        addNewPokemon(new Whizoom());Missing Art
//        addNewPokemon(new Urnaround());Missing Art
        addNewPokemon(new VaritasianKlink("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianKlang("", Aspect.VARITASIAN));
        addNewPokemon(new Tanklang());
        addNewPokemon(new Goopipe());
        addNewPokemon(new Piplex());
        addNewPokemon(new Sinklutter(new Stats(512, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))));
        addNewPokemon(new VaritasianOnix("", Aspect.VARITASIAN));
        addNewPokemon(new Galactix());
        addNewPokemon(new VaritasianCubone("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianMarowak("", Aspect.VARITASIAN));
        addNewPokemon(new Marowing(new Stats(525, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))));
        addPokedexPokemon("wynaut");
        addNewPokemon(new VaritasianWobbuffet("", Aspect.VARITASIAN));
        addPokedexPokemon("dunsparce");

        addNewPokemon(new Dustout(new Stats(498, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.SPEED))));
        addPokedexPokemon("girafarig");
        addNewPokemon(new Kirinirik(new Stats(520, StatArchetype.MIXED_ATTACKER, List.of(StatType.SPEED))));
        addPokedexPokemon("corsola");
        addNewPokemon(new Coreef(new Stats(510, StatArchetype.BULKY_SUPPORT, List.of(StatType.HP, StatType.DEFENCE))));
        addPokedexPokemon("delibird");
        addNewPokemon(new Jollibird(new Stats(490, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.HP, StatType.SPECIAL_ATTACK))));
        addPokedexPokemon("smeargle");
        addNewPokemon(new Smeartiste(new Stats(420, StatArchetype.FAST_SUPPORT, List.of(StatType.DEFENCE, StatType.SPECIAL_DEFENCE))));
        addPokedexPokemon("kecleon");
        addNewPokemon(new Concealeon());
        addNewPokemon(new Pestilint());
        addNewPokemon(new Carvesta());
        addNewPokemon(new Molcarona());
        addNewPokemon(new Grimire());
        addNewPokemon(new Stuk());
        addNewPokemon(new Nebulull());
        addNewPokemon(new Xenotic());

        addNewPokemon(new Fretal());
        addNewPokemon(new Canopeace());
        addNewPokemon(new Grassola());
        addNewPokemon(new Graceola());
        addNewPokemon(new VaritasianOddish("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianGloom("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianVileplume("", Aspect.VARITASIAN,
                new Stats(490, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPEED, StatType.ATTACK))));
        addNewPokemon(new VaritasianBellossom("", Aspect.VARITASIAN,
                new Stats(490, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED, StatType.HP))));
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
        addNewPokemon(new VaritasianDreepy("", Aspect.VARITASIAN).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new VaritasianDrakloak("", Aspect.VARITASIAN).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new VaritasianDragapult("", Aspect.VARITASIAN).addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Frostooth());
        addNewPokemon(new Jawcicle());
        addNewPokemon(new Alliglacier(new Stats(537, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPEED, StatType.ATTACK))));
        addNewPokemon(new Einymph().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Zweiphid().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Hydreinopod().addLabels(Label.PSEUDO_LEGENDARY));
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
        addNewPokemon(new VaritasianSuicune("", Aspect.VARITASIAN).addLabels(Label.SUB_LEGENDARY));
    }

}
