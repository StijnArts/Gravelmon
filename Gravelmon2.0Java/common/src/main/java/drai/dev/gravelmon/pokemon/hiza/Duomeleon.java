package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Duomeleon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Duomeleon() {
        super("Duomeleon",
                Type.FIRE,Type.ICE,
                new Stats(72,
                        42,
                        42,
                        72,
                        62,
                        62),
                List.of(Ability.ADAPTABILITY), Ability.ADAPTABILITY,
                8, 165,
                new Stats(0,0,0,1,0,0), 60,
                0.5,
                72, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of("It is said that in the past it was only able to control one of the two elements, but after several climate changes its body became unstable."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Duomeleon");

    }


}
