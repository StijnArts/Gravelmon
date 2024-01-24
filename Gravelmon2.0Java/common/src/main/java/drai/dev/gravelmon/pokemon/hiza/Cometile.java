package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Cometile extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cometile() {
        super("Cometile",
                Type.DRAGON,Type.STEEL,
                new Stats(40,
                        50,
                        50,
                        50,
                        50,
                        50),
                List.of(Ability.LIGHT_METAL), Ability.LIGHT_METAL,
                8, 165,
                new Stats(0,0,0,1,0,0), 25,
                0.5,
                50, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MINERAL),
                List.of("What was thought to be a meteor that fell on the planet was actually a Cometile egg, nobody knows its true origin."),
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
           setLangFileName("Cometile");

    }


}
