package drai.dev.gravelmon.pokemon.aristos.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class AristosianSpinarak extends drai.dev.gravelmon.pokemon.Pokemon {
    public AristosianSpinarak() {
        super("Spinarak",
                Type.BUG,Type.FAIRY,
                new Stats(40,
                        30,
                        40,
                        40,
                        40,
                        60),
                List.of(Ability.SWARM,Ability.CUTE_CHARM,Ability.FUR_COAT), Ability.FUR_COAT,
                8, 165,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                50, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Its body is covered with thick white fur. Spinarak hides inside it, only leaving its sparkling eyes out to attract prey close."),
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
           setLangFileName("Spinarak");

    }


}
