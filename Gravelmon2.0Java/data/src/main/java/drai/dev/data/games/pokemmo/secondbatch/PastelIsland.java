//package drai.dev.data.games.pokemmo.secondbatch;
//
//
//import drai.dev.data.pokemon.amavi.*;
//import drai.dev.data.pokemon.dhiome.*;
//import drai.dev.data.pokemon.mushi.*;
//import drai.dev.data.pokemon.nosto.Doiliwoo;
//import drai.dev.data.pokemon.nosto.Loomstool;
//import drai.dev.data.pokemon.nosto.Mycelil;
//import drai.dev.data.pokemon.nosto.Panthevil;
//import drai.dev.data.pokemon.nosto.Rascat;
//import drai.dev.data.pokemon.nosto.Smould;
//import drai.dev.data.pokemon.pastelisland.regional.*;
//import drai.dev.data.pokemon.pastelisland.regional.Flabb;
//import drai.dev.data.pokemon.theos.*;
//import drai.dev.data.pokemon.kuria.*;
//import drai.dev.data.pokemon.ottora.*;
//
//import drai.dev.data.pokemon.mastenia.*;
//import drai.dev.data.pokemon.mongratis.*;
//import drai.dev.data.pokemon.ultraspace.*;
//import drai.dev.data.pokemon.urzavos.*;
//import drai.dev.data.pokemon.terranov.*;
//import drai.dev.data.pokemon.enjin.*;
//import drai.dev.data.pokemon.mystis.*;
//import drai.dev.data.pokemon.pastelisland.*;
//import drai.dev.data.pokemon.neonintendo.*;
//import drai.dev.data.pokemon.tokas.*;
//import drai.dev.data.pokemon.panjaea.*;
//import drai.dev.data.pokemon.cyare.*;
//import drai.dev.data.pokemon.olysos.*;
//import drai.dev.data.pokemon.nodorro.*;
//import drai.dev.data.pokemon.orbis.*;
//import drai.dev.data.pokemon.fliga.*;
//import drai.dev.data.pokemon.ruskow.*;
//import drai.dev.data.pokemon.otopo.*;
//import drai.dev.data.pokemon.goetia.*;
//import drai.dev.data.pokemon.ionos.*;
//import drai.dev.data.pokemon.lagoone.*;
//import drai.dev.data.pokemon.atlas.*;
//import drai.dev.data.pokemon.avoris.*;
//import drai.dev.data.pokemon.enriko.*;
//import drai.dev.data.pokemon.ferroa.*;
//import drai.dev.data.pokemon.hiza.*;
//import drai.dev.data.pokemon.hub.*;
//import drai.dev.data.pokemon.interregional.*;
//import drai.dev.data.pokemon.isiah.*;
//import drai.dev.data.pokemon.junnin.*;
//import drai.dev.data.pokemon.lonava.*;
//import drai.dev.data.pokemon.mythire.*;
//import drai.dev.data.pokemon.nosto.*;
//import drai.dev.data.pokemon.novrai.*;
//import drai.dev.data.pokemon.oceane.*;
//import drai.dev.data.pokemon.okeno.*;
//import drai.dev.data.pokemon.orohnhavai.*;
//import drai.dev.data.pokemon.qamor.*;
//import drai.dev.data.pokemon.rica.*;
//import drai.dev.data.pokemon.varitas.*;
//import drai.dev.data.pokemon.aristos.*;
//import drai.dev.data.pokemon.midamis.*;
//import drai.dev.data.pokemon.norheim.*;
//import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
//import drai.dev.data.attributes.conditions.*;
//
//import java.util.*;
//public class PastelIsland extends drai.dev.data.games.registry.Game {
//    public PastelIsland() {
//        super("Pastel Island");
//    }
//
//    @Override
//    public void registerPokemon() {
//        pokemon.add(new Geckamp());
//        pokemon.add(new Gecktricity());
//        pokemon.add(new Geckolt());
//        pokemon.add(new Avire());
//        pokemon.add(new Cygnaze());
//        pokemon.add(new Inphoeno());
//        pokemon.add(new Hissicle());
//        pokemon.add(new Viperost());
//        pokemon.add(new Kelviper());
//        pokemon.add(new Chucheek());
//        pokemon.add(new Mowzumi());
//        pokemon.add(new Pripilla());
//        pokemon.add(new Orilepi());
//        pokemon.add(new Nymfly());
//        pokemon.add(new Drasilis());
//        pokemon.add(new Dragoneura());
//        pokemon.add(new Buzkin());
//        pokemon.add(new Electrisk());
//        pokemon.add(new Ledyba(165));
//        pokemon.add(new Ledian(166));
//        pokemon.add(new Eleedian());
//        pokemon.add(new Hejjikyu());
//        pokemon.add(new Yapifur());
//        pokemon.add(new Frosfur());
//        pokemon.add(new Blasfur());
//        pokemon.add(new Cleffa(173));
//        pokemon.add(new Clefairy(35));
//        pokemon.add(new Clefable(36));
//        pokemon.add(new Rascat());
//        pokemon.add(new Panthevil());
//        pokemon.add(new Flabb(669));
//        pokemon.add(new Floette(670));
//        pokemon.add(new Florgae());
////        pokemon.add(new Lechonk(915));   Missing Stats
//        pokemon.add(new Mycelil());
//        pokemon.add(new Loomstool());
//        pokemon.add(new Smould());
//        pokemon.add(new Girafarig(203));
//        pokemon.add(new Sizzlipede(850));
//        pokemon.add(new Centiskorch(851));
////        pokemon.add(new Friylash());   Missing Stats
////        pokemon.add(new Majestrill());   Missing Stats
//        pokemon.add(new Shellder(90));
//        pokemon.add(new Cloyster(91));
//        pokemon.add(new Doiliwoo());
//        pokemon.add(new Sneasel(215));
//        pokemon.add(new Weavile(461));
//        pokemon.add(new Dametal());
//        pokemon.add(new Damaleo());
////        pokemon.add(new Smoliv(928));   Missing Stats
//        pokemon.add(new Gothita(574));
//        pokemon.add(new Gothorita(575));
//        pokemon.add(new Gothitelle(576));
//        pokemon.add(new Searth());
//        pokemon.add(new Titanomaw());
////        pokemon.add(new Carburn());   Missing Art
////        pokemon.add(new Crustoise());   Missing Art
////        pokemon.add(new Allodina());   Missing Art
//        pokemon.add(new Lunapyon());
//        pokemon.add(new Lemish());
//        pokemon.add(new Sourprion());
//        pokemon.add(new Smeargle(235));
//        pokemon.add(new Banksund());
//        pokemon.add(new Happiny(440));
//        pokemon.add(new Chansey(113));
//        pokemon.add(new Bossey());
////        pokemon.add(new PsyEye());   Missing Stats
////        pokemon.add(new Hyprentice());   Missing Stats
////        pokemon.add(new Hallusage());   Missing Stats
////        pokemon.add(new Giruffle());   Missing Stats
////        pokemon.add(new Sparaffe());   Missing Stats
////        pokemon.add(new Trojaraffe());   Missing Stats
////        pokemon.add(new Dimnewt());   Missing Stats
////        pokemon.add(new Spimeleon());   Missing Stats
////        pokemon.add(new Donguana());   Missing Stats
////        pokemon.add(new Malloh());   Missing Stats
////        pokemon.add(new Marshamie());   Missing Stats
////        pokemon.add(new Mallowisp());   Missing Stats
//        pokemon.add(new Cobblelf());
////        pokemon.add(new Elfishoe());   Missing Art
////        pokemon.add(new Sabatelf());   Missing Art
//        pokemon.add(new Koffing(109));
//        pokemon.add(new Weezing(110));
////        pokemon.add(new Leetch());   Missing Stats
////        pokemon.add(new Pariahsite());   Missing Stats
////        pokemon.add(new Haebidon());   Missing Stats
////        pokemon.add(new Rooklite());   Missing Stats
////        pokemon.add(new Militite());   Missing Stats
////        pokemon.add(new Colossesar());   Missing Stats
//    }
//
//}
