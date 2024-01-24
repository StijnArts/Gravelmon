package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Sprocko extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sprocko() {
        super("Sprocko",
                Type.GRASS,
                new Stats(25,
                        20,
                        40,
                        40,
                        20,
                        50),
                List.of(Ability.MULTISCALE), Ability.MULTISCALE,
                8, 165,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                88, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MONSTER),
                List.of("It carries seeds in its mouth whenever it finds them. When confronted by enemies, it will spit them all at once in a powerful burst."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.VINE_WHIP,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.BULLET_SEED,12),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,16),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,19),
                        new MoveLearnSetEntry(Move.NATURE_POWER,24),
                        new MoveLearnSetEntry(Move.ENDEAVOR,31),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,35),
                        new MoveLearnSetEntry(Move.LEAF_STORM,40)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sprocko");

    }


}
