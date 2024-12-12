package drai.dev.data.games.other;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.*;
import drai.dev.data.pokemon.xenoverse.*;
import drai.dev.data.pokemon.xenoverse.xspecies.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Xenoverse extends Game {
    public Xenoverse() {
        super("Xenoverse");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Shyleon());
        addNewPokemon(new ShyleonTerrestrial("", Aspect.TERRESTRIAL));
        addNewPokemon(new ShyleonXenoversal("", Aspect.XENOVERSAL));
        addNewPokemon(new ShyleonAstral("", Aspect.ASTRAL));
        addNewPokemon(new ShyleonX("", Aspect.X));
        removePokedexPokemon("shyleon-x");
        addNewPokemon(new Trishout());
        addNewPokemon(new TrishoutTerrestrial("", Aspect.TERRESTRIAL));
        addNewPokemon(new TrishoutXenoversal("", Aspect.XENOVERSAL));
        addNewPokemon(new TrishoutAstral("", Aspect.ASTRAL));
        addNewPokemon(new TrishoutX("", Aspect.X));
        removePokedexPokemon("trishout-x");
        addNewPokemon(new Shulong());
        addNewPokemon(new ShulongTerrestrial("", Aspect.TERRESTRIAL));
        addNewPokemon(new ShulongXenoversal("", Aspect.XENOVERSAL));
        addNewPokemon(new ShulongAstral("", Aspect.ASTRAL));
        addNewPokemon(new ShulongX("", Aspect.X));
        removePokedexPokemon("shulong-x");
        addNewPokemon(new Sparkowl());
        addNewPokemon(new Shawkbird());
        addNewPokemon(new Harrowk());
        addNewPokemon(new Yemin());
        addNewPokemon(new Kungfur());
        addNewPokemon(new Masgot());
        addNewPokemon(new Bremand());
        addNewPokemon(new Puppillon());
        addNewPokemon(new Hangead());
        addNewPokemon(new Nunvil());
        addNewPokemon(new Whisteract());
        addNewPokemon(new Blingrimm());
        addNewPokemon(new Blingrudge());
        addNewPokemon(new Hikiloo());
        addNewPokemon(new Mylomute());
        addNewPokemon(new Kidoon());
        addNewPokemon(new Honchen());
        addPokedexPokemon("meowth-eldiwan");
        addNewPokemon(new Persage());
        addNewPokemon(new Koinkoin());
        addNewPokemon(new Beefle());
        addNewPokemon(new Punchbug());
        addNewPokemon(new Hercurcules());
        addNewPokemon(new Chigami());
        addNewPokemon(new Grudako());
        Pokemon sabolt = new Sabolt();
        addNewPokemon(sabolt);
        addNewPokemon(new SaboltTerrestrial("", Aspect.TERRESTRIAL));
        addNewPokemon(new SaboltXenoversal("", Aspect.XENOVERSAL));
        addNewPokemon(new Gachigachoo());
        addNewPokemon(new Hystearic());
        addNewPokemon(new Wystearia());
        addNewPokemon(new Pepequeno());
        Pokemon scovile = new Scovile();
        addNewPokemon(scovile);
        addNewPokemon(new ScovileX("", Aspect.X));
        removePokedexPokemon("scovile-x");
        addNewPokemon(new Excalibould());
        addNewPokemon(new Madieval());
        addNewPokemon(new Rockapye());
        addNewPokemon(new Troglolith());
        addNewPokemon(new Sputnink());
        addNewPokemon(new Nebyura());
        addNewPokemon(new Birigiri());
        addNewPokemon(new Chubiburny());
        addNewPokemon(new Goombear());
        addNewPokemon(new Manticoeur().setUsesBigModel());
        addNewPokemon(new Fatail().setUsesBigModel());
        addNewPokemon(new Reindear());
        addNewPokemon(new Reindigo());
        addNewPokemon(new Sosqwatch());
        addNewPokemon(new Vroombug());
        addNewPokemon(new Skravroom());

        addNewPokemon(new Chikaboo());
        addNewPokemon(new Peckabone());
        addNewPokemon(new Rexquiem());
        addNewPokemon(new Scaracno());
        addNewPokemon(new Scaracluo());
        addNewPokemon(new Scarphasmo());
        addNewPokemon(new Tokakle().setUsesBigModel());
        addNewPokemon(new Donanas());
        addNewPokemon(new Chimaooze());
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
        addNewPokemon(new Bandeon());
        addNewPokemon(new Scaleon());
        addPokedexPokemon("porygon," +
                "porygon2," +
                "porygonz");
        addNewPokemon(new PorygonWES());
        addNewPokemon(new Electaburst());
        removePokedexPokemon("electaburst");
        addNewPokemon(new Chientilly());
        removePokedexPokemon("chientilly");
        addNewPokemon(new Dusmee());
        addNewPokemon(new Egohiss());
        addNewPokemon(new Egorgeon());
        addNewPokemon(new Chiripe());
        addNewPokemon(new Batnana());
        addNewPokemon(new Vesperfum());
        addNewPokemon(new Croakling());
        addNewPokemon(new Bullverin());
        addNewPokemon(new Croakraze());

        addNewPokemon(new Inflant());
        addNewPokemon(new Floatusk());
        addNewPokemon(new Swelephant());
        addNewPokemon(new Luxflon());
        Pokemon dragalisk = new Dragalisk();
        addNewPokemon(dragalisk);
        addNewPokemon(new DragaliskX("", Aspect.X));
        addNewPokemon(new Dielebi());
        addNewPokemon(new Reginalous());
        addPokedexPokemon("elekid-x," +
                "electabuzz-x," +
                "electaburst," +
                "spiritomb-x," +
                "carvanha-x," +
                "sharpedo-x," +
                "pyukumuku-x," +
                "pikachu-male_x," +
                "pikachu-female_x," +
                "joltik-x," +
                "galvantula-x," +
                "smeargle-x," +
                "chientilly," +
                "gastly-x," +
                "haunter-x," +
                "gengar-x," +
                "yamask-x," +
                "cofagrigus-x," +
                "ponyta-x," +
                "rapidash-x," +
                "cacnea-x," +
                "cacturne-x," +
                "swirlix-x," +
                "slurpuff-x," +
                "budew-x," +
                "roselia-x," +
                "roserade-x," +
                "mareanie-x," +
                "toxapex-x," +
                "greninja-x," +
                "mewtwo-x," +
                "raichu-x," +
                "bisharp-x," +
                "scovile-x," +
                "tyranitar-x," +
                "ditto-x," +
                "aegislash-x," +
                "tapufini-x," +
                "tapulele-x," +
                "tapukoko-x," +
                "tapubulu-x," +
                "dragalisk-x," +
                "shyleon-x," +
                "trishout-x," +
                "shulong-x");
    }
}
