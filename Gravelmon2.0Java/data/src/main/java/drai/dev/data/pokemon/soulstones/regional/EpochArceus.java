package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochArceus extends drai.dev.data.pokemon.Pokemon {
    public EpochArceus(String name, Aspect aspect) {
        super(name, aspect, "EpochArceus",
                Type.LIGHT,Type.DRAGON,
                new Stats(300,
                        120,
                        120,
                        120,
                        120,
                        120),
                List.of(Ability.DAZZLING), null,
                32, 3200,
                new Stats(3,0,0,0,0,0), 75,
                -1.0,
                360, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("The Father of Creation. It is described in mythology as the Pokémon that shaped the multiverse with the Creation Trio."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,1),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,1),
                        new MoveLearnSetEntry(Move.EARTH_POWER,1),
                        new MoveLearnSetEntry(Move.DIVINEPUNISHMENT,1)                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Arceus");

    }


}