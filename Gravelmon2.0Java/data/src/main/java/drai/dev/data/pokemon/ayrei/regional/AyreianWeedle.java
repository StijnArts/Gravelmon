package drai.dev.data.pokemon.ayrei.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AyreianWeedle extends drai.dev.data.pokemon.Pokemon {
    public AyreianWeedle(String name, Aspect aspect) {
        super(name, aspect, "Weedle",
                Type.BUG,
                new Stats(40,
                        40,
                        30,
                        50,
                        20,
                        20),
                List.of(Ability.SHIELD_DUST,Ability.TECHNICIAN), null,
                3, 32,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Its poison stinger is very powerful. Its bright-colored body is intended to warn off its enemies."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,5),
                        new MoveLearnSetEntry(Move.TWINEEDLE,9),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,"tm"),
                        new MoveLearnSetEntry(Move.ELECTROWEB,"tm")                        ),
                List.of(Label.VANGUARD),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Weedle");

    }


}
