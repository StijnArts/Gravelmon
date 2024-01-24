package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Toxiver extends drai.dev.gravelmon.pokemon.Pokemon {
    public Toxiver() {
        super("Toxiver",
                Type.WATER,Type.POISON,
                new Stats(66,
                        90,
                        65,
                        90,
                        76,
                        80),
                List.of(Ability.POISON_POINT), Ability.SWIFT_SWIM,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Toxiver are ruthless and groups of them can contaminate entire stretches of water. One's spikes can kill a grown man."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Toxiver");

    }


}
