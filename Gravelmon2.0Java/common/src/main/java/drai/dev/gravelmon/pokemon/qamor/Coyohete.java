package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Coyohete extends drai.dev.gravelmon.pokemon.Pokemon {
    public Coyohete() {
        super("Coyohete",
                Type.FAIRY,Type.FIRE,
                new Stats(100,
                        100,
                        98,
                        70,
                        62,
                        90),
                List.of(Ability.DEFIANT), Ability.DEFIANT,
                8, 165,
                new Stats(1,0,1,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("The dazzling coat of Coyohete shine bright and fiery in the cold nights of their desert home. When they reach their top speeds, brilliant sparks and embers erupt from its tail which it uses to coordinate it's fellow pack members. Coyohete hunt in packs at night, and are notorious for attacking pets and any weaker pokemon they can find."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FESTIVESHOT,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Coyohete");

    }


}
