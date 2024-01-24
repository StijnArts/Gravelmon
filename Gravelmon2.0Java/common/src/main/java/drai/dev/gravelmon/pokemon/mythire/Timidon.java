package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Timidon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Timidon() {
        super("Timidon",
                Type.DRAGON,
                new Stats(40,
                        40,
                        50,
                        40,
                        40,
                        80),
                List.of(Ability.KLUTZ), Ability.ANTICIPATION,
                8, 165,
                new Stats(0,0,1,0,0,0), 180,
                0.5,
                58, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MONSTER),
                List.of("A cowardly Pokémon often abandoned by its parents at birth. In the absence of parental care, it collects whatever it can find with little regard for its own basic needs, hoarding them in its lonesome burrow."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.COVET,1),
                        new MoveLearnSetEntry(Move.SCALE_SHOT,"tm")                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Timidon");

    }


}
