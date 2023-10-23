package drai.dev.gravelmon.games;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.xenoverse.*;
import drai.dev.gravelmon.pokemon.xenoverse.xspecies.*;

public class Xenoverse extends Game{
    public Xenoverse() {
        super("Xenoverse");
    }

    @Override
    public void registerPokemon() {
        Pokemon shyleon = new Shyleon();
        pokemon.add(shyleon);
        pokemon.add(new ShyleonTerrestrial(shyleon.getPokedexNumber()));
        pokemon.add(new ShyleonXenoversal(shyleon.getPokedexNumber()));
        pokemon.add(new ShyleonAstral(shyleon.getPokedexNumber()));
        pokemon.add(new ShyleonX(shyleon.getPokedexNumber()));
        Pokemon trishout = new Trishout();
        pokemon.add(trishout);
        pokemon.add(new TrishoutTerrestrial(trishout.getPokedexNumber()));
        pokemon.add(new TrishoutXenoversal(trishout.getPokedexNumber()));
        pokemon.add(new TrishoutAstral(trishout.getPokedexNumber()));
        pokemon.add(new TrishoutX(trishout.getPokedexNumber()));
        Pokemon shulong = new Shulong();
        pokemon.add(shulong);
        pokemon.add(new ShulongTerrestrial(shulong.getPokedexNumber()));
        pokemon.add(new ShulongXenoversal(shulong.getPokedexNumber()));
        pokemon.add(new ShulongAstral(shulong.getPokedexNumber()));
        pokemon.add(new ShulongX(shulong.getPokedexNumber()));
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
        pokemon.add(new SaboltTerrestrial(sabolt.getPokedexNumber()));
        pokemon.add(new SaboltXenoversal(sabolt.getPokedexNumber()));
        pokemon.add(new Gachigachoo());
        pokemon.add(new Hystearic());
        pokemon.add(new Wystearia());
        pokemon.add(new Pepequeno());
        Pokemon scovile = new Scovile();
        pokemon.add(scovile);
        pokemon.add(new ScovileX(scovile.getPokedexNumber()));
        pokemon.add(new Excalibould());
        pokemon.add(new Madieval());
        pokemon.add(new Rockapye());
        pokemon.add(new Troglolith());
        pokemon.add(new Sputnink());
        pokemon.add(new Nebyura());
        pokemon.add(new Birigiri());
        pokemon.add(new Chubiburny());
        pokemon.add(new Goombear());
        pokemon.add(new Manticoeur());
        pokemon.add(new Fatail());
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
        pokemon.add(new Tokakle());
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
        pokemon.add(new DragaliskX(dragalisk.getPokedexNumber()));
        pokemon.add(new Dielebi());
        pokemon.add(new Reginalous());
    }
}
