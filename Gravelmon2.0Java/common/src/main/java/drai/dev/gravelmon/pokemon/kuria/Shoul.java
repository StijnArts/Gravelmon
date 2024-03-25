package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Shoul extends drai.dev.gravelmon.pokemon.Pokemon {
    public Shoul() {
        super("Shoul",
                Type.GHOST,Type.ICE,
                new Stats(36,
                        61,
                        40,
                        40,
                        48,
                        46),
                List.of(Ability.SNOW_CLOAK,Ability.MAGIC_BOUNCE), Ability.SLUSH_RUSH,
                5, 22,
                new Stats(0,1,0,0,0,0), 45,
                0.5,
                53, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Shoul will appear in snowstorms and mimic the cries of a child. When it fools someone into getting close, Shoul will absorb their soul into the mirror on its chest."),
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
           setLangFileName("Shoul");

    }


}
