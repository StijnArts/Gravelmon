package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Diraho extends drai.dev.data.pokemon.Pokemon {
    public Diraho() {
        super("Diraho",
                Type.ROCK,Type.FIRE,
                new Stats(75,
                        113,
                        73,
                        41,
                        52,
                        121),
                List.of(Ability.TOUGH_CLAWS), Ability.DROUGHT,
                21, 602,
                new Stats(0,0,0,0,0,0), 0,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("In order to survive the increasing cold, this mon adapted to create its own warmth. Diraho thrived, until a prey shortage couldn't sustain their large hunting packs."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,17),
                        new MoveLearnSetEntry(Move.DIG,23),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,28),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,32),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,37),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,41),
                        new MoveLearnSetEntry(Move.CRYSTALCRUNCH,46),
                        new MoveLearnSetEntry(Move.STONE_EDGE,50),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,54)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Diraho");

    }


}
