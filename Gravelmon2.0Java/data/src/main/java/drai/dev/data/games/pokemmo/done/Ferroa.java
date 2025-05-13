package drai.dev.data.games.pokemmo.done;

import drai.dev.data.pokemon.crozoic.*;
import drai.dev.data.pokemon.ferroa.*;
import drai.dev.gravelmon.pokemon.attributes.*;

//done
public class Ferroa extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Ferroa();
    private Ferroa() {
        super("Ferroa");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Crabble());
        addNewPokemon(new Carapoma());
        addNewPokemon(new Crustorchard());
        addNewPokemon(new Burrliz());
        addNewPokemon(new Reptack());
        addNewPokemon(new Calientrop());
        addNewPokemon(new Sharby());
        addNewPokemon(new Lamnaw());
        addNewPokemon(new Squalucid());
        addNewPokemon(new Chirunner());
        addNewPokemon(new Roaduner());
//        addNewPokemon(new Misthary()); Member of line Not Finished
        addNewPokemon(new Hoppoint());
        addNewPokemon(new Helmhide());
        addNewPokemon(new Durabarge());
        addNewPokemon(new Imbirbe());
        addNewPokemon(new Kolalibri());
        addNewPokemon(new Blastun());
        addNewPokemon(new Bugbardier());
        addNewPokemon(new Ensprout());
        addNewPokemon(new Treenanza());
        addNewPokemon(new Cykit());
        addNewPokemon(new Feleye());
        addNewPokemon(new Scribish());
        addNewPokemon(new Papyrush());
        addNewPokemon(new Dirtusk());
        addNewPokemon(new Stalagrus());
        addNewPokemon(new Buroot());
        addNewPokemon(new Stinginger());
        addNewPokemon(new Cuptus());
        addNewPokemon(new Cactank());
        addNewPokemon(new Colsector());
        addNewPokemon(new Shardodon());
        addNewPokemon(new Solardon());
        addNewPokemon(new Buzzoo());
        addNewPokemon(new Carrioon());
        addNewPokemon(new Embuzzle());
        addNewPokemon(new Scrapint());
        addNewPokemon(new Pupnacious());
        addNewPokemon(new Lungob());
        addNewPokemon(new Dessibello());
        addNewPokemon(new Chardine());
        addNewPokemon(new Volray());
        addNewPokemon(new Torplitz());
        addNewPokemon(new Sprouton());
        addNewPokemon(new Utopion());
        addNewPokemon(new Champiant());
        addNewPokemon(new Filsick());
        addNewPokemon(new Fevirus());
        addNewPokemon(new Shivirus());
        addNewPokemon(new Quivirus());
        addNewPokemon(new Snole());
        addNewPokemon(new Digloo());
        addNewPokemon(new Frosmole());
        addNewPokemon(new Gavile());
        addNewPokemon(new Chirocodile());
        addNewPokemon(new Erradio());
        addNewPokemon(new Eyesi());
        addNewPokemon(new Eyesaur());
        addNewPokemon(new CrozoicanEyesi("eyesi", Aspect.CROZOICAN));
        addNewPokemon(new CrozoicanEyesaur("eyesaur", Aspect.CROZOICAN));
        removePokedexPokemon("eyesi-crozoican");
        removePokedexPokemon("eyesaur-crozoican");
        addNewPokemon(new Disructor());
        addNewPokemon(new Rhinozer());
        addNewPokemon(new Rhinolition());
        addNewPokemon(new Notifant());
        addNewPokemon(new Fountusk());
        addNewPokemon(new Eledrant());
        addNewPokemon(new Wraggle());
        addNewPokemon(new Wranglash());
        addNewPokemon(new Hayataga());
        addNewPokemon(new Welweed());
        addNewPokemon(new Welwitch());
        addNewPokemon(new Vespark());
        addNewPokemon(new Volthroe());
        addNewPokemon(new Snooseat());
        addNewPokemon(new Taraxaconk());
        addNewPokemon(new Phoncrawl());
        addNewPokemon(new Techknot());
        addNewPokemon(new Trawlossus());
        addNewPokemon(new Puppest());
        addNewPokemon(new Socktopus());
        addNewPokemon(new Germuck());
        addNewPokemon(new Germasaur());
        addNewPokemon(new Flaskantine());
        addNewPokemon(new Flingzer());
        var partae = new Partae();
        addNewPokemon(partae);
        addNewPokemon(new LostIslandsPartae("", Aspect.LOST_ISLANDS));
        removePokedexPokemon("partae-lost_islands");
        var loftival = new Loftival();
        addNewPokemon(loftival);
        addNewPokemon(new LostIslandsLoftival("", Aspect.LOST_ISLANDS));
        removePokedexPokemon("loftival-lost_islands");
        addNewPokemon(new Hotdach());
        addNewPokemon(new Schnausage());
        addNewPokemon(new Hammerod());
        addNewPokemon(new Pictolith());
        addNewPokemon(new Canvalith());
        addNewPokemon(new Sinklot());
        addNewPokemon(new Snareball());
        addNewPokemon(new Whaxzza());
        addNewPokemon(new Beatzza());
        addNewPokemon(new Manchinade());
        addNewPokemon(new Mandrazooka());
        addNewPokemon(new Buoybie());
        addNewPokemon(new Albalue());
        addNewPokemon(new Soponge());
        addNewPokemon(new Bubbaluffa());
        addNewPokemon(new Anemeany());
        addNewPokemon(new Truculony());

        addNewPokemon(new Lusigusi());
        addNewPokemon(new Hermice());
        addNewPokemon(new Hermafrost());
        addNewPokemon(new Hagma());
        addNewPokemon(new Conhagrant());
        addNewPokemon(new Mesmarine());
        addNewPokemon(new Jellop());
        addNewPokemon(new Irukarate());
        addNewPokemon(new Craberrant());
        addNewPokemon(new Frogfew());
        addNewPokemon(new Sundangler());
        addNewPokemon(new Psyder());
        addNewPokemon(new Lunarach());
        addNewPokemon(new Rotpot());
        addNewPokemon(new Woebehind());
//        addNewPokemon(new Choppup()); Member of line Not Finished
//        addNewPokemon(new Wolvaxe()); Missing Art
        addNewPokemon(new Skuzzly());
        addNewPokemon(new Clockoo());
        addNewPokemon(new Nocturvian());
        addNewPokemon(new Lumbrawl());
        addNewPokemon(new Unifly());
        addNewPokemon(new Multifly());
        addNewPokemon(new Amplifly());
        addNewPokemon(new Tadpunk());
        addNewPokemon(new Flatriarch());
        addNewPokemon(new Shiverme());
        addNewPokemon(new Whalpool());
        addNewPokemon(new Numerea());
        addNewPokemon(new Amberado());
        addNewPokemon(new Laharva());
        addNewPokemon(new Ignuana());
        addNewPokemon(new Grily());
        addNewPokemon(new Charcool());
        addNewPokemon(new Denkyu());
        addNewPokemon(new Electrocuke());
        addNewPokemon(new Shankrosite());
        addNewPokemon(new Teayke());
        addNewPokemon(new Teayrant());
        addNewPokemon(new Thermonster());
        addNewPokemon(new Pteroast());
        addNewPokemon(new Ferrodactyl());
        addNewPokemon(new Clawhyde());
        addNewPokemon(new Voltato());
        addNewPokemon(new Levitato());
        addNewPokemon(new Sleetle());
        addNewPokemon(new Cacold());
        addNewPokemon(new Scaralanche());
        addNewPokemon(new AquaZ());
        addNewPokemon(new Auroreel());
        addNewPokemon(new Lurelit());
        addNewPokemon(new Grimfernal());
        addNewPokemon(new Skite());
        addNewPokemon(new Despairay());
        addNewPokemon(new Channichill());
        addNewPokemon(new Smolter());
        addNewPokemon(new Boilunk());
        addNewPokemon(new Crystabrawl());
//        addNewPokemon(new Gambowl()); Missing Art
//        addNewPokemon(new Gamphora()); Member of line Not Finished
        addNewPokemon(new Icicrawl());
        addNewPokemon(new Glacicrawl());
        addNewPokemon(new Velvedrake());
        var snipion = new Snipion();
        addNewPokemon(snipion);
        addNewPokemon(new CrozoicanSnipion("", Aspect.CROZOICAN));
        removePokedexPokemon("snipion-crozoican");
        var chainScraw = new Chainscraw();
        addNewPokemon(chainScraw);
        addNewPokemon(new CrozoicanChainscraw("", Aspect.CROZOICAN));
        removePokedexPokemon("chainscraw-crozoican");
        addNewPokemon(new Enigmore());
        addNewPokemon(new Oculustrous());
        addNewPokemon(new Remainstone());
        addNewPokemon(new Broogah());
        addNewPokemon(new Platoul());
        addNewPokemon(new Victorelic());
        addNewPokemon(new Batellite());
        addNewPokemon(new Purrth());
        addNewPokemon(new Terrachnid());
        addNewPokemon(new Miserachnid());
        addNewPokemon(new Messoul());
        addNewPokemon(new Wastenaut());
//        addNewPokemon(new Draguma()); Member of line Not Finished
//       addNewPokemon(new Scivern()); Missing Art
        addNewPokemon(new Celestar());
        addNewPokemon(new Celestroid());

    }

}
