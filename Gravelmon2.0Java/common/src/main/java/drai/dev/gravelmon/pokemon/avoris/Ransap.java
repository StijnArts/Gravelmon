package drai.dev.gravelmon.pokemon.avoris;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Ransap extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ransap() {
        super("Ransap",
                Type.DARK, Type.NORMAL,
                new Stats(94,
                        100,
                        65,
                        60,
                        75,
                        76),
                List.of(Ability.STICKY_HOLD,Ability.HONEY_GATHER,Ability.INSOMNIA), Ability.INSOMNIA,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.75,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Ransap have a rivalry with Ursaring, as they prevent Ransap from eating their favorite treat: the sweet sap of Grample. They grow feral if deprived of the sap for too long. Eating the sap will cause them to go into a frenzy."),
                List.of(),
                List.of(                        ),
                List.of(Label.AVORIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ransap");

    }


}
