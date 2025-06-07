package drai.dev.data.games.other;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.infinity.*;
import drai.dev.data.pokemon.infinity.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Infinity extends Game {
    public static final Game INSTANCE = new Infinity();
    private Infinity() {
        super("Infinity");
    }

    @Override
    public void registerPokemon() {

        addNewPokemon(new EghoBulbasaur("", Aspect.EGHO).addLabels(Label.STARTER));
        addNewPokemon(new EghoIvysaur("", Aspect.EGHO).addLabels(Label.STARTER));
        addNewPokemon(new EghoVenusaur("", Aspect.EGHO).addLabels(Label.STARTER));
        addNewPokemon(new EghoCharmander("", Aspect.EGHO).addLabels(Label.STARTER));
        addNewPokemon(new EghoCharmeleon("", Aspect.EGHO).addLabels(Label.STARTER));
        addNewPokemon(new EghoCharizard("", Aspect.EGHO).addLabels(Label.STARTER));
        addNewPokemon(new EghoSquirtle("", Aspect.EGHO).addLabels(Label.STARTER));
        addNewPokemon(new EghoWartortle("", Aspect.EGHO).addLabels(Label.STARTER));
        addNewPokemon(new EghoBlastoise("", Aspect.EGHO).addLabels(Label.STARTER));
        //Lukpup line
        addNewPokemon(new Lukpup().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Lukagon().addLabels(Label.PSEUDO_LEGENDARY));
        //Kokiseed line
        addNewPokemon(new Kokiseed().addLabels(Label.STARTER));
        addNewPokemon(new Kokipound().addLabels(Label.STARTER));
        addNewPokemon(new Kokismash().addLabels(Label.STARTER));

        //Chargo line
        addNewPokemon(new Chargo().addLabels(Label.STARTER));
        addNewPokemon(new Burnaram().addLabels(Label.STARTER));
        addNewPokemon(new Psysteed().addLabels(Label.STARTER));

        //Darpole line
        addNewPokemon(new Darpole().fishingSpawnFromExisting().addLabels(Label.STARTER));
        addNewPokemon(new Brutoad().addLabels(Label.STARTER));
        addNewPokemon(new Godfrogger().addLabels(Label.STARTER));

        addPokedexPokemon("pichu, pikachu");
        addNewPokemon(new Gorochu());
        addPokedexPokemon("nidoranf, nidorina, nidoqueen, nidoranm, nidorino, nidoking");
        addNewPokemon(new Nidorook());
        addPokedexPokemon("dunsparce");
        addNewPokemon(new Quezsparce());
        addPokedexPokemon("meowth, persian");
        addNewPokemon(new Faeralynx());

        addNewPokemon(new EghoShellder("", Aspect.EGHO).fishingSpawnFromExisting());
        addNewPokemon(new Skulkraken());

        addNewPokemon(new EghoGrimer("", Aspect.EGHO));
        addNewPokemon(new EghoMuk("", Aspect.EGHO));
        addNewPokemon(new Oozma());

        //Eeveelutions

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
        addNewPokemon(new Omeon().addLabels(Label.EEVEELUTION));
        addNewPokemon(new Champeon().addLabels(Label.EEVEELUTION));
        addNewPokemon(new Lepideon().addLabels(Label.EEVEELUTION));
        addNewPokemon(new Guardeon().addLabels(Label.EEVEELUTION));
        addNewPokemon(new Obsideon().addLabels(Label.EEVEELUTION));
        addNewPokemon(new Scorpeon().addLabels(Label.EEVEELUTION));
        addNewPokemon(new Sphynxeon().addLabels(Label.EEVEELUTION));
        addNewPokemon(new Nimbeon().addLabels(Label.EEVEELUTION));
        addNewPokemon(new Draconeon().addLabels(Label.EEVEELUTION));
        addNewPokemon(new Eeveeon().addLabels(Label.EEVEELUTION));
        addNewPokemon(new Vareon().addLabels(Label.EEVEELUTION));
        addPokedexPokemon("cubone, marowak");
        addNewPokemon(new Terathwack());
        addNewPokemon(new EghoSpearow("", Aspect.EGHO));
        addNewPokemon(new EghoFearow("", Aspect.EGHO));
        addNewPokemon(new EghoHoothoot("hoothoot", Aspect.EGHO));
        addNewPokemon(new EghoNoctowl("noctowl", Aspect.EGHO));
        addNewPokemon(new Grimfowl());
        addNewPokemon(new EghoAzurill("Azurill", Aspect.EGHO));
        addNewPokemon(new EghoMarill("marill", Aspect.EGHO));
        addNewPokemon(new EghoAzumarill("azumarill", Aspect.EGHO));
        addNewPokemon(new EghoTrubbish("", Aspect.EGHO));
        addNewPokemon(new EghoGarbodor("", Aspect.EGHO));
        addNewPokemon(new EghoSwablu("Swablu", Aspect.EGHO));
        addNewPokemon(new EghoAltaria("Altaria", Aspect.EGHO));
        addNewPokemon(new EghoLotad("Lotad", Aspect.EGHO));
        addNewPokemon(new EghoLombre("Lombre", Aspect.EGHO));
        addNewPokemon(new EghoLudicolo("Ludicolo", Aspect.EGHO));
        addPokedexPokemon("sunkern, sunflora");
        addNewPokemon(new Sunflorid());
        addPokedexPokemon("smoochum, jynx");
        addNewPokemon(new Sorcerice());
        addPokedexPokemon("kecleon");
        addNewPokemon(new Kecleodon());
        addNewPokemon(new EghoMagnemite("", Aspect.EGHO));
        addNewPokemon(new EghoMagneton("", Aspect.EGHO));
        addNewPokemon(new EghoMagnezone("", Aspect.EGHO));
        addNewPokemon(new EghoTangela("", Aspect.EGHO));
        addNewPokemon(new EghoTangrowth("", Aspect.EGHO));
        addPokedexPokemon("poochyena, mightyena");
        addNewPokemon(new Wereyena());
        addNewPokemon(new Reaptide().fishingSpawnFromExisting());
        addNewPokemon(new EghoHappiny("", Aspect.EGHO));
        addNewPokemon(new EghoChansey("", Aspect.EGHO));
        addNewPokemon(new EghoBlissey( "blissey", Aspect.EGHO));
        //Kidfoot line
        addNewPokemon(new Kidfoot());
        addNewPokemon(new Snosquatch());
        addNewPokemon(new Grasquatch());
        //Arctusk line
        addNewPokemon(new Arctusk());
        addNewPokemon(new Gigantusk());
        //Iceros line
        addNewPokemon(new Iceros());
        addNewPokemon(new Glacieros());
        addNewPokemon(new Mockroach());
        addPokedexPokemon("delibird");
        addNewPokemon(new Jollibird());
        addPokedexPokemon("qwilfish");
        addNewPokemon(new Kablowfish());
        addNewPokemon(new Scalarva().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Dragalis().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Ceregal().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Gargon());
        addNewPokemon(new Wardern());
        addNewPokemon(new Dragoyle());
        addPokedexPokemon("porygon, porygon2, porygonz");
        addNewPokemon(new PorygonX());

        //Egho Oddish line
        addNewPokemon(new EghoOddish("", Aspect.EGHO));
        addNewPokemon(new EghoGloom("", Aspect.EGHO));
        addNewPokemon(new Viledoom());
        addNewPokemon(new Mortossum());

        //Mushling line
        addNewPokemon(new Mushling());
        addNewPokemon(new Psycholyte());
        addNewPokemon(new Shroomage());

        addNewPokemon(new Calfpint());
        addPokedexPokemon("tauros, miltank");

        addNewPokemon(new Arbird());
        addPokedexPokemon("skarmory");

        //Girafarig evos
        addPokedexPokemon("girafarig");
        addPokedexPokemon("farigiraf");
        addNewPokemon(new Girafaraf());
        addNewPokemon(new Giragira());

        //Whave line
        addNewPokemon(new Whave().fishingSpawnFromExisting());
        addNewPokemon(new Orcabyss().fishingSpawnFromExisting());

        //Zapalope line
        addNewPokemon(new Zapalope());
        addNewPokemon(new Joltalope());
        addNewPokemon(new EghoChikorita("chikorita", Aspect.EGHO).addLabels(Label.STARTER));
        addNewPokemon(new EghoBayleef("bayleef", Aspect.EGHO).addLabels(Label.STARTER));
        addNewPokemon(new EghoMeganium("meganium", Aspect.EGHO).addLabels(Label.STARTER));
        addNewPokemon(new EghoCyndaquil("cyndaquil", Aspect.EGHO).addLabels(Label.STARTER));
        addNewPokemon(new EghoQuilava("quilava", Aspect.EGHO).addLabels(Label.STARTER));
        addNewPokemon(new EghoTyphlosion("typhlosion", Aspect.EGHO).addLabels(Label.STARTER));
        addNewPokemon(new EghoTotodile("totodile", Aspect.EGHO).fishingSpawnFromExisting().addLabels(Label.STARTER));
        addNewPokemon(new EghoCroconaw("croconaw", Aspect.EGHO).addLabels(Label.STARTER));
        addNewPokemon(new EghoFeraligatr("feraligatr", Aspect.EGHO).addLabels(Label.STARTER));

        addNewPokemon(new Mewthree().addLabels(Label.LEGENDARY));

        addNewPokemon(new Oculeus().addLabels(Label.LEGENDARY));

        addNewPokemon(new Arkhaos().addLabels(Label.LEGENDARY));
    }
}
