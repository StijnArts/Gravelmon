package drai.dev.data.games.other;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.infinity.*;

public class Infinity extends Game {
    public Infinity() {
        super("Infinity");
    }

    @Override
    public void registerPokemon() {
        addPokedexPokemon("bulbasaur-egho, ivysaur-egho, venusaur-egho, charmander-egho, charmeleon-egho, charizard-egho, squirtle-egho, wartortle-egho, blastoise-egho");
        //Lukpup line
        addNewPokemon(new Lukpup());
        addNewPokemon(new Lukagon());
        //Kokiseed line
        addNewPokemon(new Kokiseed());
        addNewPokemon(new Kokipound());
        addNewPokemon(new Kokismash());

        //Chargo line
        addNewPokemon(new Chargo());
        addNewPokemon(new Burnaram());
        addNewPokemon(new Psysteed());

        //Darpole line
        addNewPokemon(new Darpole().fishingSpawnFromExisting());
        addNewPokemon(new Brutoad());
        addNewPokemon(new Godfrogger());

        addPokedexPokemon("pichu, pikachu");
        addNewPokemon(new Gorochu());
        addPokedexPokemon("nidoranf, nidorina, nidoqueen, nidoranm, nidorino, nidoking");
        addNewPokemon(new Nidorook());
        addPokedexPokemon("dunsparce");
        addNewPokemon(new Quezsparce());
        addPokedexPokemon("meowth, persian");
        addNewPokemon(new Faeralynx());

        addPokedexPokemon("shellder-egho");
        addNewPokemon(new Skulkraken());

        addPokedexPokemon("grimer-egho, muk-egho");
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
        addNewPokemon(new Omeon());
        addNewPokemon(new Champeon());
        addNewPokemon(new Lepideon());
        addNewPokemon(new Guardeon());
        addNewPokemon(new Obsideon());
        addNewPokemon(new Scorpeon());
        addNewPokemon(new Sphynxeon());
        addNewPokemon(new Nimbeon());
        addNewPokemon(new Draconeon());
        addNewPokemon(new Eeveeon());
        addNewPokemon(new Vareon());
        addPokedexPokemon("cubone, marowak");
        addNewPokemon(new Terathwack());
        addPokedexPokemon("spearow-egho, fearow-egho, hoothoot-egho, noctowl-egho");
        addNewPokemon(new Grimfowl());
        addPokedexPokemon("azurill-egho, marill-egho, azumarill-egho, trubbish-egho, garbodor-egho, swablu-egho, altaria-egho, lotad-egho, lombre-egho, ludicolo-egho, sunkern, sunflora");
        addNewPokemon(new Sunflorid());
        addPokedexPokemon("smoochum, jynx");
        addNewPokemon(new Sorcerice());
        addPokedexPokemon("kecleon");
        addNewPokemon(new Kecleodon());
        addPokedexPokemon("magnemite-egho, magneton-egho, magnezone-egho, tangela-egho, tangrowth-egho, poochyena, mightyena");
        addNewPokemon(new Wereyena());
        addNewPokemon(new Reaptide().fishingSpawnFromExisting());
        addPokedexPokemon("happiny-egho, chansey-egho, blissey-egho");
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
        addNewPokemon(new Scalarva());
        addNewPokemon(new Dragalis());
        addNewPokemon(new Ceregal());
        addNewPokemon(new Gargon());
        addNewPokemon(new Wardern());
        addNewPokemon(new Dragoyle());
        addPokedexPokemon("porygon, porygon2, porygonz");
        addNewPokemon(new PorygonX());

        //Egho Oddish line
        addPokedexPokemon("oddish-egho, gloom-egho");
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
        addPokedexPokemon("chikorita-egho, bayleef-egho, meganium-egho");
        addPokedexPokemon("cyndaquil-egho, quilava-egho, typhlosion-egho");
        addPokedexPokemon("totodile-egho, croconaw-egho, feraligatr-egho");

        addNewPokemon(new Mewthree());

        addNewPokemon(new Oculeus());

        addNewPokemon(new Arkhaos());
    }
}
