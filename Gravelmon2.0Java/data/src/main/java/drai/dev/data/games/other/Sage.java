package drai.dev.data.games.other;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.sage.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Sage extends Game {
    public static final Game INSTANCE = new Sage();
    private Sage() {
        super("Sage");

    }

    @Override
    public void registerPokemon() {
        //Foliat Line
        addNewPokemon(new Foliat().addLabels(Label.STARTER));
        addNewPokemon(new Florabri().addLabels(Label.STARTER));
        addNewPokemon(new Floressum().addLabels(Label.STARTER));

        //Kidling line
        addNewPokemon(new Kidling().addLabels(Label.STARTER));
        addNewPokemon(new Pyroat().addLabels(Label.STARTER));
        addNewPokemon(new Flairees().addLabels(Label.STARTER));

        //Aguade line
        addNewPokemon(new Aguade().addLabels(Label.STARTER));
        addNewPokemon(new Iguadium().addLabels(Label.STARTER));
        addNewPokemon(new Aguanaut().addLabels(Label.STARTER));

        //Harpee line
        addNewPokemon(new Harpee());
        addNewPokemon(new Aquilor());
        addNewPokemon(new Warquila());

        //Capig line
        addNewPokemon(new Capig());
        addNewPokemon(new Capabara());

        //Avalynx line
        addNewPokemon(new Cubzero());
        addNewPokemon(new Avalynx());

        //Fawning line
        addNewPokemon(new Fawning());
        addNewPokemon(new Llamarsh());
        addNewPokemon(new Buckston());

        //Pengliff line
        addNewPokemon(new Pengliff());
        addNewPokemon(new Penglacier());

        //Bluffin Line
        addNewPokemon(new Bluffin());
        addNewPokemon(new Burrmudail());

        //Koblin line
        addNewPokemon(new Koblin());
        addNewPokemon(new Koberus());
        addNewPokemon(new Kobalt());

        //Pebblosa line
        addNewPokemon(new Pebblosa());
        addNewPokemon(new Terratetra());
        addNewPokemon(new Gigaard());

        addNewPokemon(new Cowatti());

        //Snome Line
        addNewPokemon(new Snome());
        addNewPokemon(new Snogre());

        //Taomarin Line
        addNewPokemon(new Taomarin());
        addNewPokemon(new Orangutao());

        //Larvabidae Line
        addNewPokemon(new Larvabidae());
        addNewPokemon(new Caranox());
        addNewPokemon(new Carajoule());
        addNewPokemon(new Caracrust());

        //Musburry Line
        addNewPokemon(new Musburry());
        addNewPokemon(new Musbushel());

        addNewPokemon(new Berratel());

        //Growmeo line
        addNewPokemon(new Growmeo());
        addNewPokemon(new Montegrew());

        //Tuliep line
        addNewPokemon(new Tuliep());
        addNewPokemon(new Capulilly());

        addNewPokemon(new Dreamdery());

        addNewPokemon(new Macabra());

        //Kertruffle line
        addNewPokemon(new Kertruffle());
        addNewPokemon(new Mosshroom());
        addNewPokemon(new Lumishroom());
        addNewPokemon(new Perishroom());

        //Rocano line
        addNewPokemon(new Rocano());
        addNewPokemon(new Volcaroc());
        addNewPokemon(new Volcoalder());

        //Pounther line
        addNewPokemon(new Pounther());
        addNewPokemon(new Jaguile());

        //Neureka line
        addNewPokemon(new Neureka());
        addNewPokemon(new Cerebrulb());

        //Peppit line
        addNewPokemon(new Peppit());
        addNewPokemon(new Hoppanero());
        addNewPokemon(new Scovalope());

        //Pawter line
        addNewPokemon(new Pawter());
        addNewPokemon(new Hurricanine());

        //Skullarva line
        addNewPokemon(new Skullarva());
        addNewPokemon(new Maskoon());
        addNewPokemon(new Mortasque());

        //Vectol line
        addNewPokemon(new Vectol());
        addNewPokemon(new Vectol2());

        //Bouwee line
        addNewPokemon(new Bouwee());
        addNewPokemon(new Scubug());

        //Totter line
        addNewPokemon(new Totter());
        addNewPokemon(new Cascotta());
        addNewPokemon(new Lutrajet());

        //Alpint line
        addNewPokemon(new Alpint());
        addNewPokemon(new Forusk());

        //Platypow line
        addNewPokemon(new Platypow());
        addNewPokemon(new Platikhao());

        //Cuppy line
        addNewPokemon(new Cuppy().fishingSpawnFromExisting());
        addNewPokemon(new Fettlekish());

        addNewPokemon(new Shibalbat());

        addNewPokemon(new Nobunata());

        //Psybex line
        addNewPokemon(new Psybex());
        addNewPokemon(new Gnuru());

        //Flowger line
        addNewPokemon(new Flowger().fishingSpawnFromExisting());
        addNewPokemon(new Bullotus());

        addNewPokemon(new Burrowl());

        addNewPokemon(new Magowl());

        //Craliber line
        addNewPokemon(new Craliber());
        addNewPokemon(new Crawglock());

        //Leafish Line
        addNewPokemon(new Leafish().fishingSpawnFromExisting());
        addNewPokemon(new Chlorofin());

        //Quibble Line
        addNewPokemon(new Quibble());
        addNewPokemon(new Fowattle());
        addNewPokemon(new Turkistador());

        //Sedirrot line
        addNewPokemon(new Sedirrot());
        addNewPokemon(new Condesa());

        //Cardinite line
        addNewPokemon(new Cardinite());
        addNewPokemon(new Chardinal());

        addNewPokemon(new Skurrow());

        addNewPokemon(new Somberado());

        //Phlask line
        addNewPokemon(new Phlask());
        addNewPokemon(new Noxial());
        addNewPokemon(new Fumighast());

        //Atomite line
        addNewPokemon(new Atomite());
        addNewPokemon(new Orbatom());

        //Squink line
        addNewPokemon(new Squink().fishingSpawnFromExisting());
        addNewPokemon(new Squidrift());

        addNewPokemon(new Boarealis());

        //Chelonite line
        addNewPokemon(new Chelonite());
        addNewPokemon(new Galaxagos());

        addNewPokemon(new Magnitogre());

        //minarac line
        addNewPokemon(new Minarac());
        addNewPokemon(new Trenchula());

        //Pottle line
        addNewPokemon(new Pottle());
        addNewPokemon(new Trikotta());
        addNewPokemon(new Terrorcotta());

        //Pueblant line
        addNewPokemon(new Pueblant());
        addNewPokemon(new Cahokisect());

        //Cobrasket line
        addNewPokemon(new Cobrasket());
        addNewPokemon(new Charmbra());

        //Cairup line
        addNewPokemon(new Cairup());
        addNewPokemon(new Kairoglyph());

        //Necronite line
        addNewPokemon(new Necronite());
        addNewPokemon(new Gravollum());

        //Diloweed line
        addNewPokemon(new Diloweed());
        addNewPokemon(new Pangolash());

        //Ignishell line
        addNewPokemon(new Ignishell());
        addNewPokemon(new Shelosene());
        addNewPokemon(new Flarrapin());

        //Desoula line
        addNewPokemon(new Desoula());
        addNewPokemon(new Necrow());
        addNewPokemon(new Vultergyst());

        //Dinkywink line
        addNewPokemon(new Dinkywink().addLabels(Label.FOSSIL));
        addNewPokemon(new Dunkywunkr().addLabels(Label.FOSSIL));

        //Calphite line
        addNewPokemon(new Calphite().addLabels(Label.FOSSIL));
        addNewPokemon(new Indrolith().addLabels(Label.FOSSIL));

        addNewPokemon(new Solacari());

        addNewPokemon(new Nurshary().fishingSpawnFromExisting());

        //Loneleaf line
        addNewPokemon(new Loneleaf());
        addNewPokemon(new Forthorn());

        //Coltergeist line
        addNewPokemon(new Coltergeist());
        addNewPokemon(new Fantasmare());

        //Chihah line
        addNewPokemon(new Chihaha());
        addNewPokemon(new Howlequin());

        //Chegrin line
        addNewPokemon(new Chegrin());
        addNewPokemon(new Cheshade());

        //Doppole line
        addNewPokemon(new Doppole());
        addNewPokemon(new Artifish());

        addNewPokemon(new Thoraxe());

        //Pomparunt line
        addNewPokemon(new Pomparunt());
        addNewPokemon(new Pompagoon());
        addNewPokemon(new Hyekuza());

        addNewPokemon(new Erycoon());

        addNewPokemon(new Leukoon());

        //Toxito line
        addNewPokemon(new Toxito());
        addNewPokemon(new Sanguito());

        //Orett line
        addNewPokemon(new Orett());
        addNewPokemon(new Anvelid());
        addNewPokemon(new Magroplex());

        addNewPokemon(new Viipii());

        //Chilloth line
        addNewPokemon(new Chilloth());
        addNewPokemon(new Soakoth());

        //Chayan line
        addNewPokemon(new Chayan());
        addNewPokemon(new Macuarrior());
        addNewPokemon(new Ocerumi());

        //Fortifry line
        addNewPokemon(new Fortifry().fishingSpawnFromExisting());
        addNewPokemon(new Oarwish().fishingSpawnFromExisting());

        addNewPokemon(new Smashiary());

        //Slatic line
        addNewPokemon(new Slatic());
        addNewPokemon(new Telsion());
        addNewPokemon(new Chameleohm());

        //Glauqua line
        addNewPokemon(new Glauqua());
        addNewPokemon(new Hydranticus());

        //Lintle line
        addNewPokemon(new Lintle());
        addNewPokemon(new Silkinder());
        addNewPokemon(new Paramoth());

        //Parapy line
        addNewPokemon(new Parapy());
        addNewPokemon(new Mawasite());

        //Chimpoca line
        addNewPokemon(new Chimpoca());
        addNewPokemon(new Simayan());
        addNewPokemon(new Monkezuma());

        //Enigmite line
        addNewPokemon(new Enigmite());
        addNewPokemon(new Enigmantis());

        //Arjibi line
        addNewPokemon(new Arjibi().fishingSpawnFromExisting());
        addNewPokemon(new Royjibiv());

        //Barracute line
        addNewPokemon(new Barracute().fishingSpawnFromExisting());
        addNewPokemon(new Jawgodon());

        //Drosire line
        addNewPokemon(new Drosire());
        addNewPokemon(new Sunduke());

        //Wispern line
        addNewPokemon(new Wispern());
        addNewPokemon(new Phantern());

        //Glocto line
        addNewPokemon(new Glocto().fishingSpawnFromExisting());
        addNewPokemon(new Lavoon());

        //Gilla line
        addNewPokemon(new Gilla());
        addNewPokemon(new Hornizard());
        addNewPokemon(new Ankillosore());

        //Bazilisk line
        addNewPokemon(new Bazilisk());
        addNewPokemon(new Ornitherb());
        addNewPokemon(new Dilophlora());

        addNewPokemon(new Baboom());

        //Icetope line
        addNewPokemon(new Icetope());
        addNewPokemon(new Chillnobyl());

        //Wendingo line
        addNewPokemon(new Wendingo());
        addNewPokemon(new Carnibal());

        //Luchito line
        addNewPokemon(new Luchito());
        addNewPokemon(new Eluchadon());

        //Grolem line
        addNewPokemon(new Grolem());
        addNewPokemon(new Comossus());

        //Larvyn line
        addNewPokemon(new Larvyn().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Dracoon().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Basilect().addLabels(Label.PSEUDO_LEGENDARY));

        //Carbite line
        addNewPokemon(new Carbite().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Pressaur().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Diamat().addLabels(Label.PSEUDO_LEGENDARY));

        //Quecko line
        addNewPokemon(new Quecko());
        addNewPokemon(new Tozecko());

        //Crakling line
        addNewPokemon(new Crakling());
        addNewPokemon(new Fuelong());

        //Draggar line
        addNewPokemon(new Draggar());
        addNewPokemon(new Ragnarow());

        addNewPokemon(new Eronze().addLabels(Label.SUB_LEGENDARY));

        addNewPokemon(new Erion().addLabels(Label.SUB_LEGENDARY));

        addNewPokemon(new Erace().addLabels(Label.SUB_LEGENDARY));

        addNewPokemon(new Patama().addLabels(Label.SUB_LEGENDARY));

        addNewPokemon(new Machima().addLabels(Label.SUB_LEGENDARY));

        addNewPokemon(new Yacuma().addLabels(Label.SUB_LEGENDARY));

        var quetzar = new Quetzar().addLabels(Label.LEGENDARY);
        addNewPokemon(quetzar);
        addNewPokemon(new QuetzarSpace("", Aspect.SPACE).addLabels(Label.LEGENDARY));
        removePokedexPokemon("quetzar-space");

        addNewPokemon(new Xochi().addLabels(Label.SUB_LEGENDARY));

        addNewPokemon(new Xotec().addLabels(Label.SUB_LEGENDARY));
    }
}
