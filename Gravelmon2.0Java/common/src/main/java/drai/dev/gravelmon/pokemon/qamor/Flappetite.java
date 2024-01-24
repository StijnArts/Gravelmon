package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Flappetite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Flappetite() {
        super("Flappetite",
                Type.NORMAL,Type.DARK,
                new Stats(140,
                        80,
                        100,
                        75,
                        85,
                        15),
                List.of(Ability.GLUTTONY), Ability.GLUTTONY,
                8, 165,
                new Stats(2,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.MONSTER),
                List.of("Flappetite is never satisfied and always want to feed more. It threatens passing by pokemon and trainers into giving it all their food. There are rumors of trainers going into the forest and running into a Flappetite, and- after having nothing to offer it- getting gobbled up whole!"),
                List.of(),
                List.of(                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Flappetite");

    }


}
