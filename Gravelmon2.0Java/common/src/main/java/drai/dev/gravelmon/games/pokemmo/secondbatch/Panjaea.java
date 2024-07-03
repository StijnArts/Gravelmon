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
public class Panjaea extends drai.dev.gravelmon.games.registry.Game {
    public Panjaea() {
        super("Panjaea");
    }

    @Override
    public void registerPokemon() {
//        pokemon.add(new Owleaf());   Missing Stats
//        pokemon.add(new Fowliage());   Missing Stats
//        pokemon.add(new Strigallant());   Missing Stats
//        pokemon.add(new Coalverine());   Missing Stats
//        pokemon.add(new Charmaul());   Missing Stats
//        pokemon.add(new Brimscorch());   Missing Stats
//        pokemon.add(new Raindolph());   Missing Stats
//        pokemon.add(new Elkreek());   Missing Stats
//        pokemon.add(new Moocean());   Missing Stats
//        pokemon.add(new Caterpolar());   Missing Stats
//        pokemon.add(new Cryosalis());   Missing Stats
//        pokemon.add(new Monarctic());   Missing Stats
//        pokemon.add(new Leetle());   Missing Stats
//        pokemon.add(new Cherupace());   Missing Stats
//        pokemon.add(new Larviathan());   Missing Stats
//        pokemon.add(new Sassquish());   Missing Stats
//        pokemon.add(new 341676());   Missing Art
//        pokemon.add(new Malacute());   Missing Stats
//        pokemon.add(new Huskules());   Missing Stats
//        pokemon.add(new Turfin());   Missing Stats
//        pokemon.add(new Metalodon());   Missing Stats
//        pokemon.add(new Frostkey());   Missing Stats
//        pokemon.add(new Frostrike());   Missing Stats
//        pokemon.add(new Smallet());   Missing Stats
//        pokemon.add(new Stormmer());   Missing Stats
//        pokemon.add(new Kikkyu());   Missing Stats
        pokemon.add(new Necreon());
//        pokemon.add(new Tauroot());   Missing Stats
//        pokemon.add(new Taurmor());   Missing Stats
//        pokemon.add(new Minothorn());   Missing Stats
//        pokemon.add(new Cinduck());   Missing Stats
//        pokemon.add(new Volswan());   Missing Stats
//        pokemon.add(new Swanix());   Missing Stats
//        pokemon.add(new Minkler());   Missing Stats
//        pokemon.add(new Lagoonorak());   Missing Stats
//        pokemon.add(new Tsunamink());   Missing Stats
//        pokemon.add(new Rugrant());   Missing Stats
//        pokemon.add(new Perdizzy());   Missing Stats
//        pokemon.add(new Perdazzle());   Missing Stats
//        pokemon.add(new Pheaseance());   Missing Stats
//        pokemon.add(new Knoknok());   Missing Stats
//        pokemon.add(new Gravyle());   Missing Stats
//        pokemon.add(new Hardgoyle());   Missing Stats
//        pokemon.add(new Koolbeens());   Missing Stats
//        pokemon.add(new Straken());   Missing Stats
//        pokemon.add(new Adoraphin());   Missing Stats
//        pokemon.add(new Dolphet());   Missing Stats
//        pokemon.add(new Draphin());   Missing Stats
//        pokemon.add(new Elekina());   Missing Stats
//        pokemon.add(new Chargehog());   Missing Stats
//        pokemon.add(new Mosquick());   Missing Stats
//        pokemon.add(new Mosquiteer());   Missing Stats
//        pokemon.add(new Jetkundo());   Missing Stats
//        pokemon.add(new Purty());   Missing Stats
//        pokemon.add(new Luvly());   Missing Stats
//        pokemon.add(new Awfoal());   Missing Stats
//        pokemon.add(new Mulevolent());   Missing Stats
//        pokemon.add(new Voltergeist());   Missing Stats
//        pokemon.add(new Cardinoir());   Missing Stats
//        pokemon.add(new Cardinuit());   Missing Stats
//        pokemon.add(new Ramster());   Missing Stats
        pokemon.add(new Bladeon());
//        pokemon.add(new Bumblebaa());   Missing Stats
//        pokemon.add(new Womball());   Missing Stats
//        pokemon.add(new Wombatant());   Missing Stats
//        pokemon.add(new Cascavalve());   Missing Stats
//        pokemon.add(new Nozzleisk());   Missing Stats
//        pokemon.add(new Mossybara());   Missing Stats
//        pokemon.add(new Herbybara());   Missing Stats
//        pokemon.add(new Tropybara());   Missing Stats
//        pokemon.add(new Vulkit());   Missing Stats
//        pokemon.add(new Infeline());   Missing Stats
//        pokemon.add(new Jawar());   Missing Stats
//        pokemon.add(new Foamingo());   Missing Stats
//        pokemon.add(new Flowmingo());   Missing Stats
//        pokemon.add(new Fauxmingo());   Missing Stats
//        pokemon.add(new Gleech());   Missing Stats
//        pokemon.add(new Sparkeet());   Missing Stats
//        pokemon.add(new Shockatiel());   Missing Stats
//        pokemon.add(new Shockatoo());   Missing Stats
//        pokemon.add(new Rubbite());   Missing Stats
//        pokemon.add(new Trasharp());   Missing Stats
//        pokemon.add(new Leappa());   Missing Stats
//        pokemon.add(new Locrush());   Missing Stats
//        pokemon.add(new Sylphemy());   Missing Stats
//        pokemon.add(new Dankton());   Missing Stats
//        pokemon.add(new Planktarges());   Missing Stats
//        pokemon.add(new Toxow());   Missing Stats
//        pokemon.add(new Toxwine());   Missing Stats
//        pokemon.add(new Amallama());   Missing Stats
//        pokemon.add(new Llamagma());   Missing Stats
//        pokemon.add(new Cryoman());   Missing Stats
//        pokemon.add(new Stalagator());   Missing Stats
//        pokemon.add(new Pixiego());   Missing Stats
//        pokemon.add(new Faeroll());   Missing Stats
//        pokemon.add(new Fungoon());   Missing Stats
//        pokemon.add(new Truffian());   Missing Stats
//        pokemon.add(new Banditake());   Missing Stats
//        pokemon.add(new Auriconda());   Missing Stats
//        pokemon.add(new Octusy());   Missing Stats
//        pokemon.add(new Fluffrie());   Missing Stats
//        pokemon.add(new Flufflame());   Missing Stats
//        pokemon.add(new Fluffury());   Missing Stats
//        pokemon.add(new Cherokid());   Missing Stats
//        pokemon.add(new 478173());   Missing Stats
//        pokemon.add(new Bristern());   Missing Stats
//        pokemon.add(new Larostache());   Missing Stats
//        pokemon.add(new Shorebeard());   Missing Stats
//        pokemon.add(new Chuego());   Missing Stats
//        pokemon.add(new Chualoon());   Missing Stats
//        pokemon.add(new Rutabug());   Missing Stats
//        pokemon.add(new Turniptero());   Missing Stats
//        pokemon.add(new Queenbeet());   Missing Stats
        pokemon.add(new Waspeon());
//        pokemon.add(new Stemur());   Missing Stats
//        pokemon.add(new Vandalaye());   Missing Stats
//        pokemon.add(new Madarascal());   Missing Stats
//        pokemon.add(new Embala());   Missing Stats
//        pokemon.add(new Sizzelle());   Missing Stats
//        pokemon.add(new Blazelle());   Missing Stats
//        pokemon.add(new Phantain());   Missing Stats
//        pokemon.add(new Phantide());   Missing Stats
//        pokemon.add(new Phantank());   Missing Stats
//        pokemon.add(new 644875());   Missing Art
//        pokemon.add(new 200690());   Missing Art
//        pokemon.add(new 133495());   Missing Art
//        pokemon.add(new Pestiny());   Missing Stats
//        pokemon.add(new Kongroach());   Missing Stats
//        pokemon.add(new Monstroach());   Missing Stats
//        pokemon.add(new Venosseous());   Missing Stats
//        pokemon.add(new Skelethal());   Missing Stats
//        pokemon.add(new Okapix());   Missing Stats
//        pokemon.add(new Seediment());   Missing Stats
//        pokemon.add(new Krakarock());   Missing Stats
//        pokemon.add(new Naguni());   Missing Stats
//        pokemon.add(new Lamiante());   Missing Stats
//        pokemon.add(new Gorgana());   Missing Stats
//        pokemon.add(new Scopper());   Missing Stats
//        pokemon.add(new Amperator());   Missing Stats
//        pokemon.add(new Wyldog());   Missing Stats
//        pokemon.add(new Grinreap());   Missing Stats
//        pokemon.add(new Beakat());   Missing Stats
//        pokemon.add(new Fowland());   Missing Stats
//        pokemon.add(new Seismyth());   Missing Stats
        pokemon.add(new Toxeon());
    }

}
