package drai.dev.data.games.pokemmo.secondbatch;


import drai.dev.data.pokemon.amavi.*;
import drai.dev.data.pokemon.dhiome.*;
import drai.dev.data.pokemon.mushi.*;
import drai.dev.data.pokemon.theos.*;
import drai.dev.data.pokemon.kuria.*;
import drai.dev.data.pokemon.ottora.*;
import drai.dev.data.pokemon.mastenia.*;
import drai.dev.data.pokemon.mongratis.*;
import drai.dev.data.pokemon.tokas.regional.*;
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
public class Tokas extends drai.dev.data.games.registry.Game {
    public Tokas() {
        super("Tokas");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Frungus());   
        pokemon.add(new Mushribbit());   
        pokemon.add(new Toadrule(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   
        pokemon.add(new Oinklit());   
        pokemon.add(new Hamferno());   
        pokemon.add(new Infernoink(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   
        pokemon.add(new Bufflow());   
        pokemon.add(new Brinalo());   
        pokemon.add(new Bisonami(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   
//        pokemon.add(new Trilbin());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Bintone());   Missing Art
//        pokemon.add(new Beatrob());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Erliber());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Getzawyrm());   Missing Art
        pokemon.add(new Nutub());   
        pokemon.add(new Bubinuter(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   
//        pokemon.add(new Combee());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Vespiquen());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Mortoise());   Missing Art
//        pokemon.add(new Clunkey());   Missing Art
//        pokemon.add(new Arachute());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Parachnid());   Missing Art
//        pokemon.add(new Scuddle());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Crustancient());   Missing Art
//        pokemon.add(new Nozlox());   Missing Art
//        pokemon.add(new Hydrox());   Missing Art
//        pokemon.add(new Dewmite());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Fountic());   Missing Art
//        pokemon.add(new Obstick());   Missing Art
//        pokemon.add(new Stalkturnal());   Missing Art
//        pokemon.add(new Walok());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Binduga());   Missing Art
//        pokemon.add(new Gliduki());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Tukaleap());   Missing Art
//        pokemon.add(new Cattack());   Missing Art
//        pokemon.add(new Magby("", Aspect.TOKASSIAN));   Missing Art
//        pokemon.add(new Magmar("", Aspect.TOKASSIAN));   Missing Art
        pokemon.add(new Koroka());   
        pokemon.add(new Goroka(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   
//        pokemon.add(new Snoboon());   Missing Art
//        pokemon.add(new Boonball());   Missing Art
//        pokemon.add(new Abomboon());   Missing Art
//        pokemon.add(new Gexom());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Gectidact());   Missing Art
        pokemon.add(new Finpin());   
        pokemon.add(new Merpin());   
        pokemon.add(new Mermace(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   
//        pokemon.add(new Aarkweird());   Missing Art
//        pokemon.add(new Myrmerize());   Missing Art
//        pokemon.add(new Tamindash());   Missing Art
//        pokemon.add(new Corozard());   Missing Art
//        pokemon.add(new Biolazard());   Missing Art
        pokemon.add(new Gravelo());   
        pokemon.add(new Minerapt());   
        pokemon.add(new Outcroptor(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   
//        pokemon.add(new Grebur());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Grebloo());   Missing Art
        pokemon.add(new Parazyme());   
        pokemon.add(new Cytocite(new Stats(0, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));   
//        pokemon.add(new Snifflet());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Fridgehog());   Missing Art
//        pokemon.add(new Iciquill());   Missing Art
//        pokemon.add(new Gestup());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Phantoll());   Missing Art
//        pokemon.add(new Springeist());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new 215200());   Missing Art
    }

}
