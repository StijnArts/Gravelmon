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
        Pokemon shyleon = new Shyleon().setPreferredBlocks(List.of("minecraft:sculk_sensor"));
        pokemon.add(shyleon);
        pokemon.add(new ShyleonTerrestrial("", Aspect.TERRESTRIAL));
        pokemon.add(new ShyleonXenoversal("", Aspect.XENOVERSAL));
        pokemon.add(new ShyleonAstral("", Aspect.ASTRAL));
        pokemon.add(new ShyleonX("", Aspect.X));
        Pokemon trishout = new Trishout();
        pokemon.add(trishout);
        pokemon.add(new TrishoutTerrestrial("", Aspect.TERRESTRIAL));
        pokemon.add(new TrishoutXenoversal("", Aspect.XENOVERSAL));
        pokemon.add(new TrishoutAstral("", Aspect.ASTRAL));
        pokemon.add(new TrishoutX("", Aspect.X));
        Pokemon shulong = new Shulong();
        pokemon.add(shulong);
        pokemon.add(new ShulongTerrestrial("", Aspect.TERRESTRIAL));
        pokemon.add(new ShulongXenoversal("", Aspect.XENOVERSAL));
        pokemon.add(new ShulongAstral("", Aspect.ASTRAL));
        pokemon.add(new ShulongX("", Aspect.X));
        pokemon.add(new Sparkowl());
        pokemon.add(new Shawkbird());
        pokemon.add(new Harrowk());
        pokemon.add(new Yemin());
        pokemon.add(new Kungfur());
        pokemon.add(new Masgot());
        pokemon.add(new Bremand());
        pokemon.add(new Puppillon());
        pokemon.add(new Hangead());
        pokemon.add(new Nunvil());
        pokemon.add(new Whisteract());
        pokemon.add(new Blingrimm());
        pokemon.add(new Blingrudge());
        pokemon.add(new Hikiloo());
        pokemon.add(new Mylomute());
        pokemon.add(new Kidoon());
        pokemon.add(new Honchen());
        pokemon.add(new Persage());
        pokemon.add(new Koinkoin());
        pokemon.add(new Beefle());
        pokemon.add(new Punchbug());
        pokemon.add(new Hercurcules());
        pokemon.add(new Chigami());
        pokemon.add(new Grudako());
        Pokemon sabolt = new Sabolt();
        pokemon.add(sabolt);
        pokemon.add(new SaboltTerrestrial("", Aspect.TERRESTRIAL));
        pokemon.add(new SaboltXenoversal("", Aspect.XENOVERSAL));
        pokemon.add(new Gachigachoo());
        pokemon.add(new Hystearic());
        pokemon.add(new Wystearia());
        pokemon.add(new Pepequeno());
        Pokemon scovile = new Scovile();
        pokemon.add(scovile);
        pokemon.add(new ScovileX("", Aspect.X));
        pokemon.add(new Excalibould());
        pokemon.add(new Madieval());
        pokemon.add(new Rockapye());
        pokemon.add(new Troglolith());
        pokemon.add(new Sputnink());
        pokemon.add(new Nebyura());
        pokemon.add(new Birigiri());
        pokemon.add(new Chubiburny());
        pokemon.add(new Goombear());
        pokemon.add(new Manticoeur().setUsesBigModel());
        pokemon.add(new Fatail().setUsesBigModel());
        pokemon.add(new Reindear());
        pokemon.add(new Reindigo());
        pokemon.add(new Sosqwatch());
        pokemon.add(new Vroombug());
        pokemon.add(new Skravroom());

        pokemon.add(new Chikaboo());
        pokemon.add(new Peckabone());
        pokemon.add(new Rexquiem());
        pokemon.add(new Scaracno());
        pokemon.add(new Scaracluo());
        pokemon.add(new Scarphasmo());
        pokemon.add(new Tokakle().setUsesBigModel());
        pokemon.add(new Donanas());
        pokemon.add(new Chimaooze());
        //TODO add sound pledge move to eevee learnset
        //TODO change evolution requirement from round to sound pledge
        pokemon.add(new Bandeon());
        //TODO add dragon pledge move to eevee learnset
        pokemon.add(new Scaleon());
        pokemon.add(new PorygonWES());
        pokemon.add(new Electaburst());
        pokemon.add(new Chientilly());
        pokemon.add(new Dusmee());
        pokemon.add(new Egohiss());
        pokemon.add(new Egorgeon());
        pokemon.add(new Chiripe());
        pokemon.add(new Batnana());
        pokemon.add(new Vesperfum());
        pokemon.add(new Croakling());
        pokemon.add(new Bullverin());
        pokemon.add(new Croakraze());

        pokemon.add(new Inflant());
        pokemon.add(new Floatusk());
        pokemon.add(new Swelephant());
        pokemon.add(new Luxflon());
        Pokemon dragalisk = new Dragalisk();
        pokemon.add(dragalisk);
        pokemon.add(new DragaliskX("", Aspect.X));
        pokemon.add(new Dielebi());
        pokemon.add(new Reginalous());
    }
}
