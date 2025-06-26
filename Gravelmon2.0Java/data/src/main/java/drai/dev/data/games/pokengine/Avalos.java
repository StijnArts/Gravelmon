package drai.dev.data.games.pokengine;


import drai.dev.data.pokemon.avalos.*;
import drai.dev.data.pokemon.avalos.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

//Done
public class Avalos extends drai.dev.data.games.registry.Game {
    public static final drai.dev.data.games.registry.Game INSTANCE = new Avalos();
    private Avalos() {
        super("Fliga");
    }
    //todo instagram/artwork
    @Override
    public void registerPokemon() {
        addNewPokemon(new Aggronut().addLabels(Label.STARTER));
        addNewPokemon(new Kerbunsta().addLabels(Label.STARTER));
        addNewPokemon(new Harebinger().addLabels(Label.STARTER));
        addNewPokemon(new Meltuff().addLabels(Label.STARTER));
        addNewPokemon(new Magrumble().addLabels(Label.STARTER));
        addNewPokemon(new Obsidious().addLabels(Label.STARTER));
        addNewPokemon(new Nibblish().addLabels(Label.STARTER));
        addNewPokemon(new Vicera().addLabels(Label.STARTER));
        addNewPokemon(new Marawder().addLabels(Label.STARTER));
        addNewPokemon(new Squirelutton());
        addNewPokemon(new Muncheek());
        addNewPokemon(new Scuffbill());
        addNewPokemon(new Balaefax());
        addPokedexPokemon("wingull, pelipper");
        addNewPokemon(new Larintenant());
        addNewPokemon(new AvalossianNincada("Nincada", Aspect.AVALOSSIAN));
        addNewPokemon(new Shinodea());
        addNewPokemon(new Larvhilt());
        addNewPokemon(new Cutlassp());
        addNewPokemon(new Beani());
        addNewPokemon(new Setsubean());
        addNewPokemon(new Sconsimese());
        addNewPokemon(new Kashigan());
        addPokedexPokemon("kangaskhan");
        addNewPokemon(new Jatilohunn());
        addNewPokemon(new AvalossianShellos("", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianGastrodon("", Aspect.AVALOSSIAN));
        addNewPokemon(new Calaloof());
        addNewPokemon(new Cephalofear());
        addNewPokemon(new Scarasoil());
        addNewPokemon(new Bowlaphod());
//        addNewPokemon(new Froselot());   Missing Art
        addNewPokemon(new Budy());
        addNewPokemon(new Growdup());
        addNewPokemon(new AvalossianBellsprout("", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianWeepinbell("", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianVictreebel("", Aspect.AVALOSSIAN));
//        addNewPokemon(new Devapup());   Missing Art
//        addNewPokemon(new Dingorous());   Missing Art
        addNewPokemon(new Fubber());
        addNewPokemon(new Jodoge());
        addNewPokemon(new AvalossianHappiny("", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianChansey("", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianBlissey("", Aspect.AVALOSSIAN));
        addNewPokemon(new Pollutail());
        addNewPokemon(new Oiphinae());
        addNewPokemon(new Hazarachi());
        addNewPokemon(new Gallostone());
        addNewPokemon(new Opalian());
        addNewPokemon(new AvalossianParas("", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianParasect("", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianAipom("", Aspect.AVALOSSIAN));
        addNewPokemon(new Slambizom());
        addNewPokemon(new Macaqdeath());
        addNewPokemon(new Cocyfish());
        addNewPokemon(new Maliospi());
        addNewPokemon(new Helsteteri());
        addNewPokemon(new AvalossianRalts("Ralts", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianKirlia("Kirlia", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianGardevoir("Gardevoir", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianGallade("", Aspect.AVALOSSIAN));
        addNewPokemon(new Twillowl());
        addNewPokemon(new Astrowl());
        addNewPokemon(new Nyaqua());
        addNewPokemon(new Whiskereef());
        addNewPokemon(new Intelattod());
        addPokedexPokemon("meowth, persian");
        addNewPokemon(new Slynx());
        addNewPokemon(new Tragobite());
        addNewPokemon(new Sphyrnizor());
        addNewPokemon(new Carchankle());
        addNewPokemon(new AvalossianTreecko("Treecko", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianGrovyle("Grovyle", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianSceptile("Sceptile", Aspect.AVALOSSIAN));
        addNewPokemon(new Meekat());
        addNewPokemon(new Kilokatta());
//        addNewPokemon(new AvalossianCufant());
//        addNewPokemon(new AvalossianCopperajah());
        addNewPokemon(new Sproutle());
        addNewPokemon(new Dyramic());
        addNewPokemon(new Porscythe());
        addNewPokemon(new Krakacobra());
        addNewPokemon(new Fairywoo());
        addNewPokemon(new AvalossianSlakoth("Slakoth", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianVigoroth("Vigoroth", Aspect.AVALOSSIAN));
        addNewPokemon(new Therierrrm());
        addNewPokemon(new Fomen());
        addNewPokemon(new Spirix());
        addNewPokemon(new Impuglist());
        addNewPokemon(new Tarturough());
//        addNewPokemon(new Mitecron()); Member of line Not Finished
        addNewPokemon(new AvalossianVanillite("", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianVanillish("", Aspect.AVALOSSIAN));
        addNewPokemon(new Vanillurgy());
        addNewPokemon(new Repteptile());
        addNewPokemon(new Uroshella());
        addNewPokemon(new AvalossianParaudio("", Aspect.AVALOSSIAN));
        addNewPokemon(new Paralsetto());
        addNewPokemon(new AvalossianQwilfish("", Aspect.AVALOSSIAN));
        addNewPokemon(new Barbray());
        addNewPokemon(new Alternatron());
        addNewPokemon(new Mousprite());
        addNewPokemon(new Mouscalibur());
        addNewPokemon(new Mouszerker());
        addNewPokemon(new Snowtus());
        addNewPokemon(new Nerimbe());
        addNewPokemon(new AvalossianDuskull("Duskull", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianDusclops("Dusclops", Aspect.AVALOSSIAN));
        addNewPokemon(new AvalossianDusknoir("", Aspect.AVALOSSIAN));
//        addNewPokemon(new Asabuv());   Missing Art
//        addNewPokemon(new Sobalo());   Missing Art
        addNewPokemon(new Bowvine());
        addNewPokemon(new Stingpin());
        addNewPokemon(new Slith().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Amalgin().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Chimericon().addLabels(Label.PSEUDO_LEGENDARY));
        addNewPokemon(new Growlain());
//        addNewPokemon(new Tristous());   Missing Art
//        addNewPokemon(new Lancarot());   Missing Art
//        addNewPokemon(new Bedavare());   Missing Art
        addNewPokemon(new Morgous().addLabels(Label.LEGENDARY));
//        addNewPokemon(new Merlinus());   Missing Art
//        addNewPokemon(new Galahaus());   Missing Art
//        addNewPokemon(new Arthuriac());   Missing Art
        addNewPokemon(new Marvelisk().addLabels(Label.ULTRA_BEAST));
        addNewPokemon(new Calligraphis().addLabels(Label.ULTRA_BEAST));
        addNewPokemon(new Andracarina().addLabels(Label.ULTRA_BEAST));
        addNewPokemon(new Hullk().addLabels(Label.ULTRA_BEAST));
        addNewPokemon(new Julimese().addLabels(Label.ULTRA_BEAST));
        addNewPokemon(new Newcleaur().addLabels(Label.ULTRA_BEAST));
        addNewPokemon(new Chilormangur().addLabels(Label.ULTRA_BEAST));
        addNewPokemon(new Operlogica().addLabels(Label.ULTRA_BEAST));
        addNewPokemon(new Wushenli().addLabels(Label.ULTRA_BEAST));
    }

}
