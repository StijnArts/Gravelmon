package drai.dev.gravelmon.pokemon.theos;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Mantice extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mantice() {
        super("Mantice",
                Type.FAIRY, Type.FIGHTING,
                new Stats(40,
                        80,
                        35,
                        35,
                        45,
                        70),
                List.of(Ability.STAKEOUT), Ability.SHARPNESS,
                6, 160,
                new Stats(0,1,0,0,0,0), 190,
                0.5,
                61, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Mantice have very swift and fluid movements. They gracefully dance around their prey before unleashing the fatal blow."),
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
           setLangFileName("Mantice");

    }


}
