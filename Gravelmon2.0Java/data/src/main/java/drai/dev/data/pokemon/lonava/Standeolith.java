package drai.dev.data.pokemon.lonava;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Standeolith extends drai.dev.data.pokemon.Pokemon {
    public Standeolith() {
        super("Standeolith",
                Type.ROCK,
                new Stats(66,
                        40,
                        78,
                        30,
                        112,
                        55),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                28, 165,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Constructed 5000 years ago from stones dragged hundreds of miles, Standeolith were supposedly animated by ancient settlers. The symbol on their center stone is believed to mean 'motion'."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,7),
                        new MoveLearnSetEntry(Move.GRAVITY,11),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,15),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,19),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,23),
                        new MoveLearnSetEntry(Move.POWER_GEM,27),
                        new MoveLearnSetEntry(Move.CALM_MIND,31),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,35),
                        new MoveLearnSetEntry(Move.CURSE,39),
                        new MoveLearnSetEntry(Move.RELICPILLAR,42),
                        new MoveLearnSetEntry(Move.SANDSTORM,48),
                        new MoveLearnSetEntry(Move.STONE_EDGE,54),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,60)                        ),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 21, 43, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.TRAIL_RUINS),
                0.28, 0.3,
                List.of());
           setLangFileName("Standeolith");

    }


}
