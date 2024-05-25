package drai.dev.gravelmon.pokemon.theos.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Spinarak extends drai.dev.gravelmon.pokemon.Pokemon {
    public Spinarak(int dex) {
        super(dex, "Spinarak",
                Type.BUG, Type.DARK,
                new Stats(40,
                        60,
                        40,
                        40,
                        40,
                        30),
                List.of(Ability.UNNERVE,Ability.INSOMNIA), Ability.SUPER_LUCK,
                5, 85,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                50, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Theosian Spinarak hide out in fields camouflaged as pumpkins. At night, they raid farmer's crops and eat all they can find."),
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
           setLangFileName("Spinarak");

    }


}
