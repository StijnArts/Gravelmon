package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class AFleezer extends drai.dev.gravelmon.pokemon.Pokemon {
    public AFleezer() {
        super("AFleezer",
                Type.ICE,Type.ELECTRIC,
                new Stats(75,
                        95,
                        55,
                        95,
                        50,
                        90),
                List.of(Ability.RELENTLESS), Ability.RELENTLESS,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("After Abyssal Evolution, it grows a tremendous horn made of ice that is charged with electricity. Stray bolts from the horn have left its thick hide covered in scars."),
                List.of(),
                List.of(                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("A-Fleezer");

    }


}
