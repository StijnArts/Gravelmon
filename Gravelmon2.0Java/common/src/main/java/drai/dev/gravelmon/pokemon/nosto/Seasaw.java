package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Seasaw extends drai.dev.gravelmon.pokemon.Pokemon {
    public Seasaw() {
        super("Seasaw",
                Type.ROCK,Type.DARK,
                new Stats(55,
                        90,
                        65,
                        35,
                        35,
                        75),
                List.of(Ability.STRONG_JAW,Ability.RAZORFINS,Ability.HYPER_CUTTER), Ability.HYPER_CUTTER,
                8, 165,
                new Stats(0,1,0,0,0,0), 45,
                0.875,
                71, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_2,EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Seasaw");

    }


}
