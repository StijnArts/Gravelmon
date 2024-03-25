package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Varymite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Varymite() {
        super("Varymite",
                Type.POISON,Type.COSMIC,
                new Stats(50,
                        44,
                        65,
                        80,
                        55,
                        43),
                List.of(Ability.WONDER_SKIN,Ability.ANTICIPATION), Ability.MAGIC_GUARD,
                7, 20,
                new Stats(0,0,0,1,0,0), 90,
                0.5,
                91, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Varymite are small but very potent. Some people claim a bite from Varymite temporarily sent them to another point in time and space."),
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
           setLangFileName("Varymite");

    }


}
