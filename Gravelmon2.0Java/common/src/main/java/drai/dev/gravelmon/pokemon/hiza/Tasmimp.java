package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Tasmimp extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tasmimp() {
        super("Tasmimp",
                Type.DARK,
                new Stats(35,
                        68,
                        59,
                        45,
                        32,
                        51),
                List.of(Ability.ANGER_POINT,Ability.RIVALRY,Ability.GLUTTONY), Ability.GLUTTONY,
                8, 165,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                51, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Even though they live in packs, they don't get along well with eachother. Loud screeches can be heard at night as they fight among themselves."),
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
           setLangFileName("Tasmimp");

    }


}
