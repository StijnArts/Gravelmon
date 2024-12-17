package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Comidandy extends drai.dev.data.pokemon.Pokemon {
    public Comidandy() {
        super("Comidandy",
                Type.GRASS,Type.ROCK,
                new Stats(60,
                        80,
                        110,
                        80,
                        85,
                        40),
                List.of(Ability.STURDY,Ability.ROCK_HEAD), Ability.CHLOROPHYLL,
                9, 88,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                159, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("On days with a full moon, Comidandy gather in open fields and dance until sunrise. At the end of summer, their head seeds shed off and are carried away by the wind."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.VINE_WHIP,1),
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,6),
                        new MoveLearnSetEntry(Move.HARDEN,11),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,16),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,21),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,25),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,31),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,36),
                        new MoveLearnSetEntry(Move.POWER_GEM,40),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,45),
                        new MoveLearnSetEntry(Move.EARTH_POWER,45),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,52),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,57),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,61)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Comidandy");

    }


}
