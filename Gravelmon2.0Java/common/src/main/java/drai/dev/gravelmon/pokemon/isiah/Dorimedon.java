package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Dorimedon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dorimedon() {
        super("Dorimedon",
                Type.PSYCHIC,Type.STEEL,
                new Stats(70,
                        80,
                        70,
                        110,
                        120,
                        50),
                List.of(Ability.SOUNDPROOF,Ability.OWN_TEMPO,Ability.MOODY), Ability.MOODY,
                8, 165,
                new Stats(0,0,0,0,2,0), 0,
                0.5,
                175, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.HUMAN_LIKE),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dorimedon");

    }


}
