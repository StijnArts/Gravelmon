package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Knotyors extends drai.dev.gravelmon.pokemon.Pokemon {
    public Knotyors() {
        super("Knotyors",
                Type.DRAGON,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.TANGLED_FEET,Ability.LIMBER,Ability.AVARICE), Ability.AVARICE,
                8, 165,
                new Stats(0,0,0,0,0,0), 100,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("Some believe that the gold nugget that it's wrapped around is actually an egg. These Pokemon are always trying to steal each other's gold nuggets, so some Knotyors will even try to eat their gold to hide it."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.COINCASCADE,1)                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Knotyors");

    }


}
