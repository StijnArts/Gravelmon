package drai.dev.gravelmon.pokemon.theos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Grumbear extends drai.dev.gravelmon.pokemon.Pokemon {
    public Grumbear() {
        super("Grumbear",
                Type.NORMAL,Type.DARK,
                new Stats(150,
                        85,
                        65,
                        50,
                        85,
                        65),
                List.of(Ability.ANGER_POINT), Ability.FUR_COAT,
                23, 1180,
                new Stats(3,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The only time Grumbear are at peace is when they're hibernating. If awoken too early, they will go into a frenzy attacking everything they see."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Grumbear");

    }


}
