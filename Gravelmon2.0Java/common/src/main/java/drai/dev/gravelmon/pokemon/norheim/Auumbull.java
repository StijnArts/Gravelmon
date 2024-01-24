package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Auumbull extends drai.dev.gravelmon.pokemon.Pokemon {
    public Auumbull() {
        super("Auumbull",
                Type.PSYCHIC,Type.GROUND,
                new Stats(100,
                        130,
                        100,
                        80,
                        90,
                        70),
                List.of(Ability.RECKLESS), Ability.ANGER_POINT,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Legends speak of a bull whom corrupted the spirit of a cow. Auðumbull uses its tongue, licking the nutrients from both rock and ice; granting the power of gods only for itself."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Auðumbull");

    }


}
