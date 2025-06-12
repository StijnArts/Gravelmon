package drai.dev.data.pokemon.atlas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Cachoe extends drai.dev.data.pokemon.Pokemon {
    public Cachoe() {
        super("Cachoe",
                Type.BUG,
                new Stats(62,
                        43,
                        90,
                        43,
                        72,
                        30),
                List.of(Ability.SHIELD_DUST,Ability.SHED_SKIN,Ability.RUN_AWAY), Ability.RUN_AWAY,
                5, 165,
                new Stats(0,0,2,0,0,0), 120,
                0.5,
                123, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Cachoe's head and tail mimic eyes, but are only for display. The real body has turned to liquid inside its silky cocoon, awaiting evolution."),
                List.of(new EvolutionEntry("silxie", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"15")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.HARDEN,10),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,13),
                        new MoveLearnSetEntry(Move.BUG_BITE,20),
                        new MoveLearnSetEntry(Move.SPIDER_WEB,25),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm"),
                        new MoveLearnSetEntry(Move.THREADLASH,"tm"),
                        new MoveLearnSetEntry(Move.STICKY_WEB,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 10, 19, 2.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cachoe");

    }


}
