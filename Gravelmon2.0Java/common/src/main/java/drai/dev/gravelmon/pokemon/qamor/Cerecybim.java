package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Cerecybim extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cerecybim() {
        super("Cerecybim",
                Type.POISON,Type.PSYCHIC,
                new Stats(122,
                        60,
                        90,
                        125,
                        98,
                        35),
                List.of(Ability.OWN_TEMPO), Ability.OWN_TEMPO,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.AMORPHOUS),
                List.of("Each Cerecybin has a collection of fully functional brains peppered throughout its body, working in a sort of hive mind where they work with each other and share their thoughts throughout the whole cluster. Cerecybin's gas is toxic, and breathing in too much is said to cause mutations in an organism's body."),
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
           setLangFileName("Cerecybim");

    }


}
