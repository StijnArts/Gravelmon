package drai.dev.gravelmon.pokemon.amavi;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

public class Shellop extends drai.dev.gravelmon.pokemon.Pokemon {
    public Shellop() {
        super("Shellop",
                Type.WATER,
                new Stats(80,
                        20,
                        70,
                        50,
                        70,
                        20),
                List.of(Ability.TORRENT), Ability.FILTER,
                3, 204,
                new Stats(1,0,0,0,0,0), 45,
                0.75,
                65, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.AMORPHOUS),
                List.of("Location: Groveridge (Starter)"),
                List.of(),
                List.of(                        ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Shellop");

    }


}
