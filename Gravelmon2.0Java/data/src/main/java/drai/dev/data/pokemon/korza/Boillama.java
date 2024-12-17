package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Boillama extends drai.dev.data.pokemon.Pokemon {
    public Boillama() {
        super("Boillama",
                Type.FIRE,
                new Stats(62,
                        88,
                        83,
                        62,
                        55,
                        61),
                List.of(Ability.BLAZE), Ability.STURDY,
                11, 476,
                new Stats(0,2,0,0,0,0), 45,
                0.875,
                144, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Boillama has the capacity to spit its scalding hot saliva at great distances, in order to deter predators and otherwise unwanted attention. The wool is incredibly soft and retains heat very well, making it a popular fabric material."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_CRASH,"tm")                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Boillama");

    }


}
