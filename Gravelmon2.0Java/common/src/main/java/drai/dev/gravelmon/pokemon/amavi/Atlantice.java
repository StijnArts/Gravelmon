package drai.dev.gravelmon.pokemon.amavi;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Atlantice extends drai.dev.gravelmon.pokemon.Pokemon {
    public Atlantice() {
        super("Atlantice",
                Type.WATER, Type.ICE,
                new Stats(150,
                        45,
                        105,
                        80,
                        105,
                        45),
                List.of(Ability.TORRENT), Ability.FILTER,
                15, 3084,
                new Stats(3,0,0,0,0,0), 45,
                0.5,
                235, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(),
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
           setLangFileName("Atlantice");

    }


}
