package drai.dev.gravelmon.pokemon.otopo;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Vishuslayk extends drai.dev.gravelmon.pokemon.Pokemon {
    public Vishuslayk() {
        super("Vishuslayk",
                Type.WATER, Type.ELECTRIC,
                new Stats(96,
                        145,
                        73,
                        69,
                        100,
                        77),
                List.of(Ability.LIGHTNING_ROD,Ability.STORM_DRAIN), Ability.MOXIE,
                0, 0,
                new Stats(0,2,0,0,0,1), 60,
                0.5,
                189, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Vishuslayk, one of the most ferocious Pokemon, has a territorial feud with Gyarados. By whirling swiftly in water, Vishuslayk may electrically charge their body. It will fire sparks from its tentacles if it feels threatened."),
                List.of(),
                List.of(                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Vishuslayk");

    }


}
