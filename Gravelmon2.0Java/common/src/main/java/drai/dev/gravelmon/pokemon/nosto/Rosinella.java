package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Rosinella extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rosinella() {
        super("Rosinella",
                Type.FAIRY,
                new Stats(43,
                        45,
                        43,
                        61,
                        59,
                        33),
                List.of(Ability.CUTE_CHARM,Ability.HARVEST,Ability.MAGIC_BOUNCE), Ability.MAGIC_BOUNCE,
                8, 165,
                new Stats(0,0,0,1,0,0), 255,
                0.0,
                57, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.FAIRY),
                List.of("These tiny Pokémon are very adventurous and tend to be oblivious when it comes to danger. They often get lost."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,4),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,7)                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rosinella");

    }


}
