package drai.dev.data.games.pokemmo.secondbatch;


import drai.dev.data.pokemon.enjin.*;
import drai.dev.data.pokemon.amavi.*;
import drai.dev.data.pokemon.dhiome.*;
import drai.dev.data.pokemon.enjin.Enchantowl;
import drai.dev.data.pokemon.enjin.Teleprog;
import drai.dev.data.pokemon.mushi.*;
import drai.dev.data.pokemon.theos.*;
import drai.dev.data.pokemon.kuria.*;
import drai.dev.data.pokemon.ottora.*;
import drai.dev.data.pokemon.mastenia.*;
import drai.dev.data.pokemon.mongratis.*;
import drai.dev.data.pokemon.ultraspace.*;
import drai.dev.data.pokemon.urzavos.*;
import drai.dev.data.pokemon.terranov.*;
import drai.dev.data.pokemon.enjin.*;
import drai.dev.data.pokemon.mystis.*;
import drai.dev.data.pokemon.pastelisland.*;
import drai.dev.data.pokemon.neonintendo.*;
import drai.dev.data.pokemon.tokas.*;
import drai.dev.data.pokemon.panjaea.*;
import drai.dev.data.pokemon.cyare.*;
import drai.dev.data.pokemon.olysos.*;
import drai.dev.data.pokemon.nodorro.*;
import drai.dev.data.pokemon.orbis.*;
import drai.dev.data.pokemon.fliga.*;
import drai.dev.data.pokemon.ruskow.*;
import drai.dev.data.pokemon.otopo.*;
import drai.dev.data.pokemon.goetia.*;
import drai.dev.data.pokemon.ionos.*;
import drai.dev.data.pokemon.lagoone.*;
import drai.dev.data.pokemon.atlas.*;
import drai.dev.data.pokemon.avoris.*;
import drai.dev.data.pokemon.enriko.*;
import drai.dev.data.pokemon.ferroa.*;
import drai.dev.data.pokemon.hiza.*;
import drai.dev.data.pokemon.hub.*;
import drai.dev.data.pokemon.interregional.*;
import drai.dev.data.pokemon.isiah.*;
import drai.dev.data.pokemon.junnin.*;
import drai.dev.data.pokemon.lonava.*;
import drai.dev.data.pokemon.mythire.*;
import drai.dev.data.pokemon.nosto.*;
import drai.dev.data.pokemon.novrai.*;
import drai.dev.data.pokemon.oceane.*;
import drai.dev.data.pokemon.okeno.*;
import drai.dev.data.pokemon.orohnhavai.*;
import drai.dev.data.pokemon.qamor.*;
import drai.dev.data.pokemon.rica.*;
import drai.dev.data.pokemon.varitas.*;
import drai.dev.data.pokemon.aristos.*;
import drai.dev.data.pokemon.midamis.*;
import drai.dev.data.pokemon.norheim.*;
import drai.dev.data.pokemon.crozoic.*;
import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.africanus.*;
import drai.dev.data.pokemon.africanus.regional.*;
import drai.dev.data.pokemon.ayrei.*;
import drai.dev.data.pokemon.ayrei.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.chaosinvestia.regional.*;
import drai.dev.data.pokemon.soulstones.*;
import drai.dev.data.pokemon.soulstones.regional.*;

import java.util.*;

import static org.graalvm.shadowed.org.jcodings.transcode.EConvResult.Finished;

public class Enjin extends drai.dev.data.games.registry.Game {
    public Enjin() {
        super("Enjin");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Mouldon());
        pokemon.add(new Fungrove());
        pokemon.add(new Saprodon());
        pokemon.add(new Gastrohm());
        pokemon.add(new Mollectric());
        pokemon.add(new Nudibolt());
//        pokemon.add(new Arborsa());   Member of line Not Finished
//        pokemon.add(new Fumostrello());   Member of line Not Finished
//        pokemon.add(new Salamare());   Member of line Not Finished
//        pokemon.add(new Seefowl());   Member of line Not Finished
//        pokemon.add(new Hamstorch());   Member of line Not Finished
//        pokemon.add(new Hippop());   Member of line Not Finished
//        pokemon.add(new Faunifer());   Member of line Not Finished
//        pokemon.add(new Sirain());   Member of line Not Finished
//        pokemon.add(new Budbun());    Member of line Not Finished
        pokemon.add(new Enchantowl());
//        pokemon.add(new Chimini());  Member of line Not Finished
//        pokemon.add(new Aquamel());   Member of line Not Finished
//        pokemon.add(new Cattack());   Member of line Not Finished
//        pokemon.add(new Feilex()); Member of line Not Finished
        pokemon.add(new Paintta());
        pokemon.add(new Piscasso());
        pokemon.add(new Bistodum(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Coldfin(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Raveclem());
        pokemon.add(new Galats(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Coldier(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Eyeziant());
        pokemon.add(new Ghostea());
        pokemon.add(new Bihaund());   Missing Stats
        pokemon.add(new Serpendage());Member of line Not Finished
        pokemon.add(new Jerbalm());  Member of line Not Finished
        pokemon.add(new Kiwatt());   Missing Stats
        pokemon.add(new Kikiwi());    Member of line Not Finished
        pokemon.add(new Magmaraca());   Missing Stats
        pokemon.add(new Magmaligna(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Queenival(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Punky(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Slamb(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Roselot(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Rosival(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Roswain(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Snooz());
//        pokemon.add(new Tenwreck());Member of line Not Finished
//        pokemon.add(new Snouturf());Member of line Not Finished
        pokemon.add(new Volverdi(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Curstar());
        pokemon.add(new Shihtzoof());   Missing Stats
        pokemon.add(new Priminpup(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Cucuppy(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Member of line Not Finished
        pokemon.add(new Gremelon());Member of line Not Finished
        pokemon.add(new Skoopy());Member of line Not Finished
        pokemon.add(new Thornip(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Nostroot());
        pokemon.add(new Khthonion());
        pokemon.add(new Sloggin());
        pokemon.add(new Lucidris());
        pokemon.add(new Chlorodra());
        pokemon.add(new Cocoward());
        pokemon.add(new Cocombat());
        pokemon.add(new Lunectric());
        pokemon.add(new Spikid());Member of line Not Finished
        pokemon.add(new Matchoppa());Member of line Not Finished
        pokemon.add(new Wotter(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Cyclub(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Angeroid(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Teleprog());
        pokemon.add(new Clampere(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Balbuni(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Criseti());Member of line Not Finished
        pokemon.add(new Anseti(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Macrochip(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Vipuny());
        pokemon.add(new Vipentide());
        pokemon.add(new Pterabonk());
        pokemon.add(new Smashzal());
        pokemon.add(new Gossnow());
        pokemon.add(new Curdwaul());
        pokemon.add(new Cubreeze());
        pokemon.add(new Frosstitan());
        pokemon.add(new Waddlur());
        pokemon.add(new Cuddlur());
        pokemon.add(new Abysprit());
        pokemon.add(new Marvelisk());
        pokemon.add(new Nuptielle());
        pokemon.add(new Burielle(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
        pokemon.add(new Aristocalf());   Missing Stats
        pokemon.add(new Majestapir(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   Missing Stats
    }

}
