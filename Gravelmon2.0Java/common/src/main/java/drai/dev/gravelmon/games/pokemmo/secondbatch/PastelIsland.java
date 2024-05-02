package drai.dev.gravelmon.games.pokemmo.secondbatch;


import drai.dev.gravelmon.pokemon.amavi.*;
import drai.dev.gravelmon.pokemon.dhiome.*;
import drai.dev.gravelmon.pokemon.mushi.*;
import drai.dev.gravelmon.pokemon.nosto.Doiliwoo;
import drai.dev.gravelmon.pokemon.nosto.Loomstool;
import drai.dev.gravelmon.pokemon.nosto.Mycelil;
import drai.dev.gravelmon.pokemon.nosto.Panthevil;
import drai.dev.gravelmon.pokemon.nosto.Rascat;
import drai.dev.gravelmon.pokemon.nosto.Smould;
import drai.dev.gravelmon.pokemon.pastelisland.regional.*;
import drai.dev.gravelmon.pokemon.pastelisland.regional.Flabb;
import drai.dev.gravelmon.pokemon.theos.*;
import drai.dev.gravelmon.pokemon.kuria.*;
import drai.dev.gravelmon.pokemon.ottora.*;
import drai.dev.gravelmon.pokemon.spion.*;
import drai.dev.gravelmon.pokemon.mastenia.*;
import drai.dev.gravelmon.pokemon.mongratis.*;
import drai.dev.gravelmon.pokemon.ultraspace.*;
import drai.dev.gravelmon.pokemon.urzavos.*;
import drai.dev.gravelmon.pokemon.terranov.*;
import drai.dev.gravelmon.pokemon.enjin.*;
import drai.dev.gravelmon.pokemon.mystis.*;
import drai.dev.gravelmon.pokemon.pastelisland.*;
import drai.dev.gravelmon.pokemon.neonintendo.*;
import drai.dev.gravelmon.pokemon.tokas.*;
import drai.dev.gravelmon.pokemon.panjaea.*;
import drai.dev.gravelmon.pokemon.cyare.*;
import drai.dev.gravelmon.pokemon.olysos.*;
import drai.dev.gravelmon.pokemon.nodorro.*;
import drai.dev.gravelmon.pokemon.orbis.*;
import drai.dev.gravelmon.pokemon.fliga.*;
import drai.dev.gravelmon.pokemon.ruskow.*;
import drai.dev.gravelmon.pokemon.otopo.*;
import drai.dev.gravelmon.pokemon.goetia.*;
import drai.dev.gravelmon.pokemon.ionos.*;
import drai.dev.gravelmon.pokemon.lagoone.*;
import drai.dev.gravelmon.pokemon.atlas.*;
import drai.dev.gravelmon.pokemon.avoris.*;
import drai.dev.gravelmon.pokemon.enriko.*;
import drai.dev.gravelmon.pokemon.ferroa.*;
import drai.dev.gravelmon.pokemon.hiza.*;
import drai.dev.gravelmon.pokemon.hub.*;
import drai.dev.gravelmon.pokemon.interregional.*;
import drai.dev.gravelmon.pokemon.isiah.*;
import drai.dev.gravelmon.pokemon.junnin.*;
import drai.dev.gravelmon.pokemon.lonava.*;
import drai.dev.gravelmon.pokemon.mythire.*;
import drai.dev.gravelmon.pokemon.nosto.*;
import drai.dev.gravelmon.pokemon.novrai.*;
import drai.dev.gravelmon.pokemon.oceane.*;
import drai.dev.gravelmon.pokemon.okeno.*;
import drai.dev.gravelmon.pokemon.orohnhavai.*;
import drai.dev.gravelmon.pokemon.qamor.*;
import drai.dev.gravelmon.pokemon.rica.*;
import drai.dev.gravelmon.pokemon.varitas.*;
import drai.dev.gravelmon.pokemon.aristos.*;
import drai.dev.gravelmon.pokemon.midamis.*;
import drai.dev.gravelmon.pokemon.norheim.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class PastelIsland extends drai.dev.gravelmon.games.registry.Game {
    public PastelIsland() {
        super("Pastel Island");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Geckamp());
        pokemon.add(new Gecktricity());
        pokemon.add(new Geckolt());
        pokemon.add(new Avire());
        pokemon.add(new Cygnaze());
        pokemon.add(new Inphoeno());
        pokemon.add(new Hissicle());
        pokemon.add(new Viperost());
        pokemon.add(new Kelviper());
        pokemon.add(new Chucheek());
        pokemon.add(new Mowzumi());
        pokemon.add(new Pripilla());
        pokemon.add(new Orilepi());
        pokemon.add(new Nymfly());
        pokemon.add(new Drasilis());
        pokemon.add(new Dragoneura());
        pokemon.add(new Buzkin());
        pokemon.add(new Electrisk());
        pokemon.add(new Ledyba(165));
        pokemon.add(new Ledian(166));
        pokemon.add(new Eleedian());
        pokemon.add(new Hejjikyu());
        pokemon.add(new Yapifur());
        pokemon.add(new Frosfur());
        pokemon.add(new Blasfur());
        pokemon.add(new Cleffa(173));
        pokemon.add(new Clefairy(35));
        pokemon.add(new Clefable(36));
        pokemon.add(new Rascat());
        pokemon.add(new Panthevil());
        pokemon.add(new Flabb(669));
        pokemon.add(new Floette(670));
        pokemon.add(new Florgae());
//        pokemon.add(new Lechonk(915));   Missing Stats
        pokemon.add(new Mycelil());
        pokemon.add(new Loomstool());
        pokemon.add(new Smould());
        pokemon.add(new Girafarig(203));
        pokemon.add(new Sizzlipede(850));
        pokemon.add(new Centiskorch(851));
//        pokemon.add(new Friylash());   Missing Stats
//        pokemon.add(new Majestrill());   Missing Stats
        pokemon.add(new Shellder(90));
        pokemon.add(new Cloyster(91));
        pokemon.add(new Doiliwoo());
        pokemon.add(new Sneasel(215));
        pokemon.add(new Weavile(461));
        pokemon.add(new Dametal());
        pokemon.add(new Damaleo());
//        pokemon.add(new Smoliv(928));   Missing Stats
        pokemon.add(new Gothita(574));
        pokemon.add(new Gothorita(575));
        pokemon.add(new Gothitelle(576));
        pokemon.add(new Searth());
        pokemon.add(new Titanomaw());
//        pokemon.add(new Carburn());   Missing Art
//        pokemon.add(new Crustoise());   Missing Art
//        pokemon.add(new Allodina());   Missing Art
        pokemon.add(new Lunapyon());
        pokemon.add(new Lemish());
        pokemon.add(new Sourprion());
        pokemon.add(new Smeargle(235));
        pokemon.add(new Banksund());
        pokemon.add(new Happiny(440));
        pokemon.add(new Chansey(113));
        pokemon.add(new Bossey());
//        pokemon.add(new PsyEye());   Missing Stats
//        pokemon.add(new Hyprentice());   Missing Stats
//        pokemon.add(new Hallusage());   Missing Stats
//        pokemon.add(new Giruffle());   Missing Stats
//        pokemon.add(new Sparaffe());   Missing Stats
//        pokemon.add(new Trojaraffe());   Missing Stats
//        pokemon.add(new Dimnewt());   Missing Stats
//        pokemon.add(new Spimeleon());   Missing Stats
//        pokemon.add(new Donguana());   Missing Stats
//        pokemon.add(new Malloh());   Missing Stats
//        pokemon.add(new Marshamie());   Missing Stats
//        pokemon.add(new Mallowisp());   Missing Stats
        pokemon.add(new Cobblelf());
//        pokemon.add(new Elfishoe());   Missing Art
//        pokemon.add(new Sabatelf());   Missing Art
        pokemon.add(new Koffing(109));
        pokemon.add(new Weezing(110));
//        pokemon.add(new Leetch());   Missing Stats
//        pokemon.add(new Pariahsite());   Missing Stats
//        pokemon.add(new Haebidon());   Missing Stats
//        pokemon.add(new Rooklite());   Missing Stats
//        pokemon.add(new Militite());   Missing Stats
//        pokemon.add(new Colossesar());   Missing Stats
    }

}
