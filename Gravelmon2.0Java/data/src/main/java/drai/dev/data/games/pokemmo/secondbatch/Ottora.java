package drai.dev.data.games.pokemmo.secondbatch;


import drai.dev.data.pokemon.ottora.*;

import drai.dev.data.pokemon.amavi.*;
import drai.dev.data.pokemon.dhiome.*;
import drai.dev.data.pokemon.mushi.*;
import drai.dev.data.pokemon.ottora.regional.*;
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

public class Ottora extends drai.dev.data.games.registry.Game {
    public Ottora() {
        super("Ottora");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new OttoranHonedge("", Aspect.OTTORAN));
        pokemon.add(new OttoranDoublade("", Aspect.OTTORAN));

        pokemon.add(new Hopling());
        pokemon.add(new Bunbush());
        pokemon.add(new Inflagulo());
        pokemon.add(new Wolverupt());
        pokemon.add(new Guillie());
        pokemon.add(new Deeluge());
        pokemon.add(new Moosong());
        pokemon.add(new Pinjure());
        pokemon.add(new Stachick());
        pokemon.add(new Shockite());
        pokemon.add(new Floodle());
        pokemon.add(new Civilarva());
        pokemon.add(new Pupail());
        pokemon.add(new Jueshika());
        pokemon.add(new Aqquack());
        pokemon.add(new Cabbrain());
        pokemon.add(new Finook());
        pokemon.add(new Aubat());
        pokemon.add(new Dustbun());
        pokemon.add(new Levieon(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   Missing Stats
        pokemon.add(new Duneon(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   Missing Stats
//        pokemon.add(new Sporita());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Doznale());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Impidimp(859));   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Fawnt());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Salfurrr());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Specture());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Pidunce());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Minmallow());   MEMBER OF LINE NOT FINISHED
//        pokemon.add(new Netyke());   MEMBER OF LINE NOT FINISHED
        pokemon.add(new Disix());   Missing Stats
        pokemon.add(new Diielve());   Missing Stats
        pokemon.add(new Giiem());   Missing Stats
        pokemon.add(new Howltlaw());   Missing Stats
        pokemon.add(new Aegistump(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   Missing Stats
        pokemon.add(new Chainslash(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   Missing Stats
        pokemon.add(new Copurr(new Stats(0, StatArchetype.FAST_SPECIAL_ATTACKER,
                List.of(StatType.SPEED))));   Missing Stats
    }

}
