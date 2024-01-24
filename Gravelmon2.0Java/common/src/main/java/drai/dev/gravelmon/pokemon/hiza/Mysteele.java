package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Mysteele extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mysteele() {
        super("Mysteele",
                Type.BUG,Type.PSYCHIC,
                new Stats(88,
                        42,
                        85,
                        85,
                        157,
                        40),
                List.of(Ability.INFILTRATOR), Ability.FOREWARN,
                8, 165,
                new Stats(0,0,0,0,2,0), 75,
                0.5,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Because it concentrates all its power on its crystal ball, if it loses its crystal it will lose all its psychic powers. The crystal can awaken the power contained in other Pokémon."),
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
           setLangFileName("Mysteele");

    }


}
