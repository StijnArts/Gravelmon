package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Maskilisk extends drai.dev.gravelmon.pokemon.Pokemon {
    public Maskilisk() {
        super("Maskilisk",
                Type.DRAGON,
                new Stats(60,
                        85,
                        60,
                        60,
                        75,
                        65),
                List.of(Ability.STEADFAST,Ability.SCRAPPY,Ability.ROCK_HEAD), Ability.ROCK_HEAD,
                8, 165,
                new Stats(0,2,0,0,0,0), 125,
                0.5,
                142, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MONSTER),
                List.of("A mysterious Pokemon that lives in the woods, a covering of feathers keeps it warm in the winter months. There are stories of a human child that was raised by these Pokemon as one of their own."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCALE_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.JUMPSCARE,"tm")                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Maskilisk");

    }


}
