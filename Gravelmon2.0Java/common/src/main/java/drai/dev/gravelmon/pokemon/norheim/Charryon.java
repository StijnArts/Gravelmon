package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Charryon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Charryon() {
        super("Charryon",
                Type.GHOST,Type.WATER,
                new Stats(85,
                        85,
                        75,
                        95,
                        120,
                        70),
                List.of(Ability.SWIFT_SWIM), Ability.DRIZZLE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Charryon can only feel sorrow. It leaves safe passage to the afterlife for both Pokémon and humans."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DESTINY_BOND,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Charryon");

    }


}
