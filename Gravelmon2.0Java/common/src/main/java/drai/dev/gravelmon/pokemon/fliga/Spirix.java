package drai.dev.gravelmon.pokemon.fliga;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Spirix extends drai.dev.gravelmon.pokemon.Pokemon {
    public Spirix() {
        super("Spirix",
                Type.FAIRY,Type.GHOST,
                new Stats(103,
                        67,
                        71,
                        90,
                        103,
                        61),
                List.of(Ability.MAGICIAN), Ability.MAGIC_BOUNCE,
                13, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Phantom HandSTAB Ghost"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PHANTOMHAND,1)                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Spirix");

    }


}
