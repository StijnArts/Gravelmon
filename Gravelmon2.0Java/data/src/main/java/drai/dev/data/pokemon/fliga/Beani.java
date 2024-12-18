package drai.dev.data.pokemon.fliga;


import drai.dev.data.pokemon.amavi.*;
import drai.dev.data.pokemon.dhiome.*;
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
import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Beani extends drai.dev.data.pokemon.Pokemon {
    public Beani() {
        super("Beani",
                Type.GRASS,
                new Stats(35,
                        50,
                        53,
                        50,
                        51,
                        21),
                List.of(Ability.WATER_ABSORB,Ability.LEAF_GUARD), Ability.RAIN_DISH,
                8, 0,
                new Stats(0,0,1,0,0,0), 175,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MONSTER),
                List.of("Beani are born in a somewhat atypical fashion. While they're completely capable of hatching normally, farmers like to plant the eggs in the ground and keep them safe until the Beani is born. Beani are universally beloved due to secreting a salty liquid that is often used by chefs."),
                List.of(new EvolutionEntry("setsubean", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"23")))),
                List.of(
                        new MoveLearnSetEntry(Move.VINE_WHIP,1),
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.LEECH_SEED,4),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,7),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,12),
                        new MoveLearnSetEntry(Move.RAGE_POWDER,16),
                        new MoveLearnSetEntry(Move.SYNTHESIS,19),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,22),
                        new MoveLearnSetEntry(Move.CONFUSION,25),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,28),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,31),
                        new MoveLearnSetEntry(Move.PSYCHIC,34),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,37),
                        new MoveLearnSetEntry(Move.STORED_POWER,40),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,46),
                        new MoveLearnSetEntry(Move.EARTH_POWER,50),
                        new MoveLearnSetEntry(Move.POWER_WHIP,55),
                        new MoveLearnSetEntry(Move.LEAF_STORM,60)                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Beani");

    }


}
