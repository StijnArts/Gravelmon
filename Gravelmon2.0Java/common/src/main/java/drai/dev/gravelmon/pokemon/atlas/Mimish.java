package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Mimish extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mimish() {
        super("Mimish",
                Type.WATER,
                new Stats(60,
                        20,
                        15,
                        25,
                        15,
                        65),
                List.of(Ability.RATTLED,Ability.SWIFT_SWIM,Ability.IMMUNITY), Ability.IMMUNITY,
                8, 165,
                new Stats(0,0,0,0,0,1), 150,
                0.5,
                40, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.DRAGON),
                List.of("- Splash Normal 8 Me First Normal 16 Mirror Move Flying 24 Copycat Normal 32 Mimic Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.ME_FIRST,8),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,16),
                        new MoveLearnSetEntry(Move.COPYCAT,24),
                        new MoveLearnSetEntry(Move.MIMIC,32)                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mimish");

    }


}
