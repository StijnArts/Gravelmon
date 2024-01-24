package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Hoglog extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hoglog() {
        super("Hoglog",
                Type.PSYCHIC,Type.GRASS,
                new Stats(145,
                        80,
                        120,
                        80,
                        160,
                        15),
                List.of(Ability.COMATOSE), Ability.PSYCHIC_SURGE,
                8, 165,
                new Stats(2,0,2,0,2,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hoglog");

    }


}
