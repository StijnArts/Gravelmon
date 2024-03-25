package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Shroudice extends drai.dev.gravelmon.pokemon.Pokemon {
    public Shroudice() {
        super("Shroudice",
                Type.GHOST,Type.ICE,
                new Stats(66,
                        123,
                        80,
                        70,
                        118,
                        94),
                List.of(Ability.REFLECTIVE,Ability.MAGIC_BOUNCE), Ability.TOUGH_CLAWS,
                20, 90,
                new Stats(0,2,0,0,1,0), 45,
                0.5,
                212, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("During a blizzard in a tundra, Shroudice will appear, just staring at lost travelers, waiting for their actions. Because it looks fairly human from a distance, people will sometimes approach, only to get their souls sealed in its mirror."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Shroudice");

    }


}
