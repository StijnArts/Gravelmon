package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Crystacoon extends drai.dev.data.pokemon.Pokemon {
    public Crystacoon() {
        super("Crystacoon",
                Type.ICE,Type.BUG,
                new Stats(55,
                        50,
                        100,
                        60,
                        115,
                        35),
                List.of(Ability.NO_GUARD), Ability.SNOW_CLOAK,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Each individual's icy shell has a slightly different shape from each other. Crystacoon attach themselves to high branches and stay still until evolution, but when disturbed will drop onto assailants using their shell's sharp spikes."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.REFLECT,13),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,13)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Crystacoon");

    }


}
