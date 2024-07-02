package drai.dev.gravelmon.games.pokemmo.secondbatch;


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
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;
public class Ruskow extends drai.dev.gravelmon.games.registry.Game {
    public Ruskow() {
        super("Ruskow");
    }

    @Override
    public void registerPokemon() {
//        pokemon.add(new Eleplant());   Missing Stats
//        pokemon.add(new Herbederm());   Missing Stats
        pokemon.add(new Mammahonia());
//        pokemon.add(new Bollokin());   Missing Stats
//        pokemon.add(new Flamabull());   Missing Stats
//        pokemon.add(new Audhroch());   Missing Stats
//        pokemon.add(new Newtiny());   Missing Stats
//        pokemon.add(new Salamarsh());   Missing Stats
//        pokemon.add(new Caudatidal());   Missing Stats
//        pokemon.add(new Coocun());   Missing Stats
//        pokemon.add(new Cocadeux());   Missing Stats
//        pokemon.add(new Cocatrois());   Missing Stats
//        pokemon.add(new Pilfur());   Missing Stats
//        pokemon.add(new Pikpossum());   Missing Stats
//        pokemon.add(new Nimf());   Missing Stats
//        pokemon.add(new Trusshy());   Missing Stats
//        pokemon.add(new Dayfly());   Missing Stats
//        pokemon.add(new Duskito());   Missing Stats
//        pokemon.add(new Kupal());   Missing Stats
//        pokemon.add(new Cheervona());   Missing Stats
//        pokemon.add(new Taracub());   Missing Stats
//        pokemon.add(new Dentdeleo());   Missing Stats
//        pokemon.add(new Dandylion());   Missing Stats
//        pokemon.add(new Cervidear());   Missing Stats
//        pokemon.add(new Pedenki());   Missing Stats
//        pokemon.add(new Rasclove());   Missing Stats
//        pokemon.add(new Inkling());   Missing Stats
//        pokemon.add(new Inkap());   Missing Stats
//        pokemon.add(new Inklassy());   Missing Stats
//        pokemon.add(new Sorrowmin());   Missing Stats
//        pokemon.add(new Ermourne());   Missing Stats
//        pokemon.add(new Weepsel());   Missing Stats
//        pokemon.add(new Magixy());   Missing Stats
//        pokemon.add(new Magimancy());   Missing Stats
//        pokemon.add(new Critatter());   Missing Stats
//        pokemon.add(new Critippet());   Missing Stats
//        pokemon.add(new Critabard());   Missing Stats
//        pokemon.add(new Spectung());   Missing Stats
//        pokemon.add(new Hauntung());   Missing Stats
//        pokemon.add(new Phantung());   Missing Stats
//        pokemon.add(new Maluce());   Missing Stats
//        pokemon.add(new Nitemori());   Missing Stats
//        pokemon.add(new Llima());   Missing Stats
//        pokemon.add(new Rocpaca());   Missing Stats
//        pokemon.add(new Jewellama());   Missing Stats
//        pokemon.add(new Crovus());   Missing Stats
//        pokemon.add(new Cawpin());   Missing Stats
//        pokemon.add(new Flambe());   Missing Stats
//        pokemon.add(new Fricasheep());   Missing Stats
//        pokemon.add(new Searies());   Missing Stats
//        pokemon.add(new Lullamb());   Missing Stats
//        pokemon.add(new Shleepy());   Missing Stats
//        pokemon.add(new Mismol());   Missing Stats
//        pokemon.add(new Hokumol());   Missing Stats
//        pokemon.add(new Boovine());   Missing Stats
//        pokemon.add(new Tumblwee());   Missing Stats
//        pokemon.add(new Jumblweed());   Missing Stats
//        pokemon.add(new Troublweed());   Missing Stats
//        pokemon.add(new Poisoma());   Missing Stats
//        pokemon.add(new Coronatox());   Missing Stats
//        pokemon.add(new Spuro());   Missing Stats
//        pokemon.add(new Spurtail());   Missing Stats
//        pokemon.add(new Walabrume());   Missing Stats
//        pokemon.add(new Kangarain());   Missing Stats
//        pokemon.add(new Stormaroo());   Missing Stats
//        pokemon.add(new Cadavish());   Missing Stats
//        pokemon.add(new Carcashark());   Missing Stats
//        pokemon.add(new Shoales());   Missing Stats
//        pokemon.add(new Palaices());   Missing Stats
//        pokemon.add(new Dolfun());   Missing Stats
//        pokemon.add(new Tropiaqua());   Missing Stats
//        pokemon.add(new Peruna());   Missing Stats
//        pokemon.add(new Mantill());   Missing Stats
//        pokemon.add(new Maneral());   Missing Art
//        pokemon.add(new Dripem());   Missing Art
//        pokemon.add(new Blowelt());   Missing Art
//        pokemon.add(new Perxie());   Missing Art
//        pokemon.add(new Frownie());   Missing Art
//        pokemon.add(new Grimlin());   Missing Art
//        pokemon.add(new Gargamin());   Missing Art
//        pokemon.add(new Garguardan());   Missing Art
//        pokemon.add(new Shivery());   Missing Art
//        pokemon.add(new Glaciowl());   Missing Art
//        pokemon.add(new Snobun());   Missing Art
//        pokemon.add(new Lapice());   Missing Art
//        pokemon.add(new Merrymint());   Missing Art
//        pokemon.add(new Ringibell());   Missing Art
//        pokemon.add(new Iciclaw());   Missing Art
//        pokemon.add(new Chillobo());   Missing Art
//        pokemon.add(new Twinklyink());   Missing Art
//        pokemon.add(new Tadbole());   Missing Art
//        pokemon.add(new Frolog());   Missing Art
//        pokemon.add(new Grottoad());   Missing Art
//        pokemon.add(new Firaffa());   Missing Art
//        pokemon.add(new Paladon());   Missing Art
//        pokemon.add(new Wreking());   Missing Art
//        pokemon.add(new Gagild());   Missing Art
//        pokemon.add(new Paramite());   Missing Art
//        pokemon.add(new Cordysect());   Missing Art
//        pokemon.add(new Hissathmum());   Missing Art
//        pokemon.add(new Unispor());   Missing Art
//        pokemon.add(new Bispor());   Missing Art
//        pokemon.add(new Trispor());   Missing Art
//        pokemon.add(new Aubanda());   Missing Art
//        pokemon.add(new Burbanda());   Missing Art
//        pokemon.add(new Babashka());   Missing Art
//        pokemon.add(new Mamashka());   Missing Art
//        pokemon.add(new Gulpy());   Missing Art
//        pokemon.add(new Peroleum());   Missing Art
//        pokemon.add(new Chafern());   Missing Art
//        pokemon.add(new Cirgrus());   Missing Art
//        pokemon.add(new Pavogue());   Missing Stats
//        pokemon.add(new Sovynik());   Missing Art
//        pokemon.add(new Ussernaut());   Missing Art
//        pokemon.add(new Eetie());   Missing Art
//        pokemon.add(new Youefo());   Missing Art
//        pokemon.add(new Catopact());   Missing Stats
//        pokemon.add(new Spectreflek());   Missing Stats
//        pokemon.add(new Polterglas());   Missing Stats
//        pokemon.add(new Sleazer());   Missing Art
//        pokemon.add(new Plagrusomr());   Missing Art
//        pokemon.add(new Torspeedo());   Missing Art
//        pokemon.add(new Subuoyant());   Missing Art
//        pokemon.add(new Acrylor());   Missing Art
//        pokemon.add(new Tempoura());   Missing Art
//        pokemon.add(new Gallopere());   Missing Art
//        pokemon.add(new Solbud());   Missing Art
//        pokemon.add(new Grotess());   Missing Art
//        pokemon.add(new Larvequin());   Missing Art
//        pokemon.add(new Harlequeen());   Missing Art
//        pokemon.add(new Teddilite());   Missing Art
//        pokemon.add(new Bearionette());   Missing Art
//        pokemon.add(new Oozion());   Missing Stats
//        pokemon.add(new Gloopzion());   Missing Stats
//        pokemon.add(new Nomix());   Missing Stats
//        pokemon.add(new Clerix());   Missing Art
//        pokemon.add(new Sorcerix());   Missing Art
//        pokemon.add(new Combatix());   Missing Art
//        pokemon.add(new Bandix());   Missing Art
//        pokemon.add(new Judodo());   Missing Stats
//        pokemon.add(new Solotussle());   Missing Art
//        pokemon.add(new Keewee());   Missing Art
//        pokemon.add(new Behemoa());   Missing Art
//        pokemon.add(new Bisdawn());   Missing Art
//        pokemon.add(new Adeos());   Missing Art
//        pokemon.add(new Aurevora());   Missing Art
//        pokemon.add(new Lamotte());   Missing Art
//        pokemon.add(new Wawalle());   Missing Art
//        pokemon.add(new Villamya());   Missing Art
//        pokemon.add(new Simagedon());   Missing Art
//        pokemon.add(new Kumajr());   Missing Art
    }

}
