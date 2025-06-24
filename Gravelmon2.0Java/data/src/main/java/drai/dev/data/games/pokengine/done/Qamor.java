package drai.dev.data.games.pokengine.done;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.qamor.*;
import drai.dev.data.pokemon.qamor.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
//done
public class Qamor extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Qamor();
    private Qamor() {
        super("Qamor");
    }

    @Override
    public void registerPokemon() {

        addNewPokemon(new Albat().addLabels(Label.STARTER));
        addNewPokemon(new Gremleaf().addLabels(Label.STARTER));
        addNewPokemon(new Tropifox().addLabels(Label.STARTER));
        addNewPokemon(new Kindlet().addLabels(Label.STARTER));
        addNewPokemon(new Occultlet().addLabels(Label.STARTER));
        addNewPokemon(new Dambattoir().addLabels(Label.STARTER));
        addNewPokemon(new Barbay().addLabels(Label.STARTER));
        addNewPokemon(new Makrabla().addLabels(Label.STARTER));
        addNewPokemon(new Barrakoba().addLabels(Label.STARTER));
        addNewPokemon(new Whoopwing());
        addNewPokemon(new Miamacaw());
        addNewPokemon(new Spectipilla());
        addNewPokemon(new Chrystalis());
        addNewPokemon(new Crysteavenly());
        addNewPokemon(new Umbrub());
        addNewPokemon(new Trepinject());
        addNewPokemon(new Rascage());
        addNewPokemon(new Puglup());
        addNewPokemon(new Brusbime());
        addNewPokemon(new Munchkitty());
        addNewPokemon(new Pompurr());
        addNewPokemon(new Kicsqueak());
        addNewPokemon(new Aggroroo());
        addNewPokemon(new Sweetilt());
        addNewPokemon(new Stiltotem());
        addNewPokemon(new Calypstar());
        addNewPokemon(new Velverette());
        addNewPokemon(new Spinister());
        addNewPokemon(new Capsudier());
        addNewPokemon(new Nerachi());
        addNewPokemon(new Castide());
        addNewPokemon(new Miragill());
        addNewPokemon(new Ciguapo());
        addNewPokemon(new Sombruja());
        addNewPokemon(new Decibelle());
        addNewPokemon(new Ampt());
        addNewPokemon(new Konsert());
        addNewPokemon(new Brewpod());
        addNewPokemon(new Mochrema());
        addNewPokemon(new Xolito());
        addNewPokemon(new Coyohete());
        addNewPokemon(new Culponi());
        addNewPokemon(new Bronconvict());
        addNewPokemon(new QamoranTyrogue("", Aspect.QAMORAN));
        addNewPokemon(new QamoranHitmonlee("", Aspect.QAMORAN));
        addNewPokemon(new QamoranHitmonchan("", Aspect.QAMORAN));
        addNewPokemon(new QamoranHitmontop("", Aspect.QAMORAN));
        addNewPokemon(new Aqube());
        addNewPokemon(new Wapolyp());
        addNewPokemon(new Seasnug());
        addNewPokemon(new Clairbuoyant());
        addNewPokemon(new Pudgey());
        addNewPokemon(new Flappetite());
        addNewPokemon(new Cavacreep());
        addNewPokemon(new QamoranPsyduck("", Aspect.QAMORAN));
        addPokedexPokemon("golduck");
        addNewPokemon(new Gobbledyduck());
        addNewPokemon(new Virchia());
        addNewPokemon(new Impetal());
        addNewPokemon(new Numby());
        addNewPokemon(new Munsun());
        addNewPokemon(new Thermoni());
        addPokedexPokemon("volbeat, illumise");
        addNewPokemon(new Peritwinkle());
        addNewPokemon(new Keclekid());
        addPokedexPokemon("kecleon");
        addNewPokemon(new Paposy());
        addNewPokemon(new Ancaleana());
        addNewPokemon(new Belublebug());
//        addNewPokemon(new Wibble()); Members of line not finished
        addNewPokemon(new Norsery(new Stats(345, StatArchetype.FAST_SUPPORT, List.of(StatType.SPECIAL_DEFENCE))));
        addNewPokemon(new Forflush());
        addNewPokemon(new Sycelium());
        addNewPokemon(new Cerecybim());
        addNewPokemon(new Somberscribe());
        addNewPokemon(new QamoranSeel("", Aspect.QAMORAN));
        addNewPokemon(new QamoranDewgong("", Aspect.QAMORAN));
        addNewPokemon(new Grimgrin());
        addNewPokemon(new Gibboor());
        addNewPokemon(new Grimandrill());
        addNewPokemon(new Pappybara());
        addNewPokemon(new Popondot());
        addNewPokemon(new Refereef());
        addNewPokemon(new Semiphrawn());
        addNewPokemon(new Crabanner());
        addNewPokemon(new Snipspawn());
        addNewPokemon(new Bogbile());
        addNewPokemon(new Tottapotta());
        addNewPokemon(new Terradobe());
        addNewPokemon(new Magmead());
        addNewPokemon(new Nectarmite());
        addNewPokemon(new Disgaze());
        addNewPokemon(new Hissteric());
        addNewPokemon(new Dashkite());
        addNewPokemon(new Zipstream());
        addNewPokemon(new Cassowatt());
        addPokedexPokemon("rellor");
        addNewPokemon(new QamoranRabsca("", Aspect.QAMORAN));
        addNewPokemon(new Spooksew());
        addNewPokemon(new Effigeam());
        addNewPokemon(new Hollowhusk());
        addNewPokemon(new Planchelt());
        addNewPokemon(new Effigeam());
        addNewPokemon(new Hollowhusk());
        addNewPokemon(new Rubee());
        addNewPokemon(new Beimota());
        addNewPokemon(new QamoranTangrowth("", Aspect.QAMORAN));
        addNewPokemon(new QamoranTangela("", Aspect.QAMORAN));

        addNewPokemon(new Servolt());
        addNewPokemon(new Joulereign());
        addNewPokemon(new QamoranCubchoo("", Aspect.QAMORAN));
        addNewPokemon(new QamoranBeartic("", Aspect.QAMORAN));
        addNewPokemon(new Chkachuru());
        addNewPokemon(new Parumpum());
        addNewPokemon(new Dokudurru());
        addNewPokemon(new Cragato());
        addNewPokemon(new Resistreak());
        addNewPokemon(new Chiticonch());
        addNewPokemon(new Harperyl());
        addNewPokemon(new Brinbait());
        addNewPokemon(new Aleglarlure());
        addNewPokemon(new Blubuoy());
        addNewPokemon(new Albacross());
        addNewPokemon(new Curbludgeon());
        addNewPokemon(new QamoranSpoink("Spoink", Aspect.QAMORAN));
        addNewPokemon(new QamoranGrumpig("Grumpig", Aspect.QAMORAN));
        addNewPokemon(new QamoranKoffing("", Aspect.QAMORAN));
        addNewPokemon(new QamoranWeezing("", Aspect.QAMORAN));
        addNewPokemon(new Grumpork());
        addNewPokemon(new Glamglob());
        addNewPokemon(new Lilpaca());
        addNewPokemon(new Pacalpine());
        addNewPokemon(new Chillichoya());
        addNewPokemon(new QamoranSandygast("", Aspect.QAMORAN));
        addNewPokemon(new Saguartic());
        addNewPokemon(new Palosstone());
        addNewPokemon(new Mightiro());
        addNewPokemon(new Encantomb());
        addNewPokemon(new Gorsylum());
//        addNewPokemon(new Coldron()); // TODO
//        addNewPokemon(new Burrboil());
//        addNewPokemon(new Frigitank());
        addNewPokemon(new Frodent());
        addNewPokemon(new Bunbrisk());
        addNewPokemon(new Wintweasel());
        addNewPokemon(new Madrursa());
        addNewPokemon(new Nordirk());
        addNewPokemon(new Vikice());
        addNewPokemon(new Valkryce());
        addNewPokemon(new Selkreeper());
        addNewPokemon(new QamoranCombee("", Aspect.QAMORAN));
        addNewPokemon(new Vespidron());
        addNewPokemon(new Cryometry());
        addPokedexPokemon("cryogonal");
        addNewPokemon(new Frijolop());
        addNewPokemon(new Crickochet());
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
        addNewPokemon(new EXEon().addLabels(Label.EEVEELUTION));
    }
}