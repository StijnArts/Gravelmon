package drai.dev.gravelmon.pokemon.otopo;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Ramparent extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ramparent() {
        super("Ramparent",
                Type.NORMAL, Type.STEEL,
                new Stats(70,
                        110,
                        110,
                        50,
                        50,
                        90),
                List.of(Ability.STURDY,Ability.ADAPTABILITY), Ability.NORMALIZE,
                12, 726,
                new Stats(0,2,0,0,0,0), 80,
                0.5,
                168, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("A Ramparent is powerful enough to tow heavy automobiles. When threatened, its horn has hardened to a rock-hard condition, and it will charge with full might."),
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
           setLangFileName("Ramparent");

    }


}
