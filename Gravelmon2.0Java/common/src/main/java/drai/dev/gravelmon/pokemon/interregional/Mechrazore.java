package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Mechrazore extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mechrazore() {
        super("Mechrazore",
                Type.STEEL,Type.DRAGON,
                new Stats(170,
                        140,
                        130,
                        90,
                        80,
                        70),
                List.of(Ability.OVERWHELMING), Ability.OVERWHELMING,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Mechrazore is a man-made mechanical beast, with it's gigantic strength used to fight the Ultra Beast threat. Though it proves ultimately destructive of any environment it's placed in, it's methods of disposing of Ultra Beasts are effective."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DESTRUCTOBEAM,1)                        ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mechrazore");

    }


}
