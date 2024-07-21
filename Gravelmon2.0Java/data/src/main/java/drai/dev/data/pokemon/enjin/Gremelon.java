package drai.dev.data.pokemon.enjin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gremelon extends drai.dev.data.pokemon.Pokemon {
    public Gremelon() {
        super("Gremelon",
                Type.GRASS, Type.DARK,
                new Stats(55,
                        90,
                        60,
                        55,
                        40,
                        50),
                List.of(Ability.PICKPOCKET), Ability.PRANKSTER,
                5, 104,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                70, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("This Pokémon is incredibly sneaky, often pretending to be a normal melon, then popping out and tripping its victim using vines!"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BRAMBLEUP,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,1),
                        new MoveLearnSetEntry(Move.BEAT_UP,1),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,1),
                        new MoveLearnSetEntry(Move.BULLET_SEED,1)                        ),
                List.of(Label.ENJIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gremelon");

    }


}
