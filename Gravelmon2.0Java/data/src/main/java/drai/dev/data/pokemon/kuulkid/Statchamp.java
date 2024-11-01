package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Statchamp extends drai.dev.data.pokemon.Pokemon {
    public Statchamp() {
        super("Statchamp",
                Type.ROCK,Type.FIGHTING,
                new Stats(100,
                        98,
                        112,
                        65,
                        60,
                        72),
                List.of(Ability.SOLID_ROCK,Ability.BATTLE_ARMOR), Ability.MOLD_BREAKER,
                17, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 40, 56, .54, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Statchamp");

    }


}
