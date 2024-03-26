package drai.dev.gravelmon.games.pokemmo.secondbatch;


import drai.dev.gravelmon.pokemon.atlas.Ampin;
import drai.dev.gravelmon.pokemon.atlas.Korboral;
import drai.dev.gravelmon.pokemon.atlas.Sharquake;
import drai.dev.gravelmon.pokemon.atlas.Submurchin;
import drai.dev.gravelmon.pokemon.atlas.Surchin;
import drai.dev.gravelmon.pokemon.atlas.Wombabe;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import drai.dev.gravelmon.pokemon.amavi.*;
import drai.dev.gravelmon.pokemon.dhiome.*;
import drai.dev.gravelmon.pokemon.mushi.*;
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

import java.util.*;
public class Dhiome extends drai.dev.gravelmon.games.registry.Game {
    public Dhiome() {
        super("Dhiome");
    }

    @Override
    public void registerPokemon() {
//        pokemon.add(new Spearex()); Member of Set not finished
//        pokemon.add(new Jagrowth()); Member of Set not finished
//        pokemon.add(new Venoble()); Member of Set not finished
//        pokemon.add(new Caflare()); Member of Set not finished
//        pokemon.add(new Bovlame()); Member of Set not finished
//        pokemon.add(new Pharaox()); Member of Set not finished
//        pokemon.add(new Bubblebon());Member of line Not Finished
//        pokemon.add(new Scufflebon());Member of line Not Finished
//        pokemon.add(new Lochare());   Missing Art
        pokemon.add(new Wombabe());
        pokemon.add(new Korboral());
//        pokemon.add(new Cantarini());   Missing Stats
//        pokemon.add(new Flavian());   Missing Art
//        pokemon.add(new Carafowl());   Missing Art
//        pokemon.add(new Melobaa());   Missing Stats
//        pokemon.add(new Bellaris());   Missing Stats
//        pokemon.add(new Metalicot());   Missing Art
//        pokemon.add(new Larvora());   Missing Stats
//        pokemon.add(new Pupod());   Missing Stats
//        pokemon.add(new Gyrogig());   Missing Art
//        pokemon.add(new Leaplit());   Missing Art
//        pokemon.add(new Chrysaleye());   Missing Stats
//        pokemon.add(new Falantern());   Missing Art
//        pokemon.add(new Terrapile());   Missing Art
//        pokemon.add(new Chozumi());   Missing Art
//        pokemon.add(new zumi());   Missing Art
//        pokemon.add(new Weebud());   Missing Stats
//        pokemon.add(new Whoopsey());   Missing Stats
//        pokemon.add(new Wilterales());   Missing Art
//        pokemon.add(new Fingel());   Missing Stats
//        pokemon.add(new Celefin());   Missing Art
//        pokemon.add(new Pterangel());   Missing Art
//        pokemon.add(new Burcrub());   Missing Art
//        pokemon.add(new Forticlawd());   Missing Art
//        pokemon.add(new Origull());   Missing Stats
//        pokemon.add(new Crane());   Missing Art
//        pokemon.add(new Macaboo());   Missing Stats
//        pokemon.add(new Spectross());   Missing Stats
//        pokemon.add(new Gloshroom());   Missing Stats
//        pokemon.add(new Phosporus());   Missing Stats
//        pokemon.add(new Istobat());   Missing Stats
//        pokemon.add(new Arabat());   Missing Stats
//        pokemon.add(new Thermate());   Missing Stats
//        pokemon.add(new Babburn());   Missing Art
//        pokemon.add(new Cropiki());   Missing Stats
//        pokemon.add(new Dwarpy());   Missing Stats
//        pokemon.add(new Bonafant());   Missing Stats
//        pokemon.add(new Wisdaum());Member of line Not Finished
        pokemon.add(new Surchin());
        pokemon.add(new Submurchin());
//        pokemon.add(new Nimbleak());   Missing Stats
//        pokemon.add(new Dojoku());   Missing Stats
//        pokemon.add(new Fumaji());   Missing Stats
//        pokemon.add(new Furatle());   Missing Stats
//        pokemon.add(new Fusecto());   Missing Stats
//        pokemon.add(new Femewliar());   Missing Stats
//        pokemon.add(new Niarsith());   Missing Art
//        pokemon.add(new Welpyre());   Missing Stats
//        pokemon.add(new Keenine());   Missing Stats
//        pokemon.add(new Shisapien());   Missing Stats
//        pokemon.add(new Silnun());   Missing Stats
//        pokemon.add(new Amivelv());   Missing Stats
//        pokemon.add(new Nebulent());   Missing Stats
//        pokemon.add(new Draligne());Member of line Not Finished
//        pokemon.add(new Mushcap());   Missing Stats
//        pokemon.add(new Belyad());   Missing Stats
//        pokemon.add(new Petishell());   Missing Stats
//        pokemon.add(new Primorse());   Missing Stats
//        pokemon.add(new Puffoon());   Missing Stats
//        pokemon.add(new Egenpus());   Missing Stats
//        pokemon.add(new Slugly());   Missing Stats
//        pokemon.add(new Toxnail());   Missing Stats
//        pokemon.add(new Mandibrine());   Missing Stats
//        pokemon.add(new Petrifern());   Missing Stats
//        pokemon.add(new Serrarbo());   Missing Stats
//        pokemon.add(new Ruminelk());   Missing Stats
//        pokemon.add(new Ancervus());   Missing Stats
        pokemon.add(new Ampin());
        pokemon.add(new Sharquake());
//        pokemon.add(new Polynett());Member of line Not Finished
//        pokemon.add(new Polykelp());   Missing Stats
//        pokemon.add(new Venchill());   Missing Stats
//        pokemon.add(new Fungeon());   Missing Stats
//        pokemon.add(new Pixidra());   Missing Art
//        pokemon.add(new Genbrisk());   Missing Stats
//        pokemon.add(new Voltwin());   Missing Stats
    }

}
