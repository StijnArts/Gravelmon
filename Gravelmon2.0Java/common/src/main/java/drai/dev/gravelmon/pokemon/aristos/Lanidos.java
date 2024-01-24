package drai.dev.gravelmon.pokemon.aristos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Lanidos extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lanidos() {
        super("Lanidos",
                Type.BUG,Type.FAIRY,
                new Stats(70,
                        40,
                        70,
                        60,
                        70,
                        90),
                List.of(Ability.SWARM,Ability.CUTE_CHARM,Ability.FUR_COAT), Ability.FUR_COAT,
                8, 165,
                new Stats(0,2,0,0,0,0), 90,
                0.5,
                147, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("An advantage of Lanidos' slim body is being able to swiftly catch prey without having to restrain it with threads. The thick fur covering its body absorbs hard-hitting blows."),
                List.of(),
                List.of(                        ),
                List.of(Label.ARISTOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lanidos");

    }


}
