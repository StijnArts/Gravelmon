package drai.dev.gravelmon.pokemon.orbis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Rascaloon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rascaloon() {
        super("Rascaloon",
                Type.NORMAL,
                new Stats(43,
                        36,
                        42,
                        25,
                        31,
                        63),
                List.of(Ability.KEEN_EYE,Ability.PICKUP), Ability.LONG_REACH,
                3, 100,
                new Stats(0,0,0,0,0,1), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Raccute use their adorable looks to lure humans into giving them food. They hold out their hands and wait by houses until they are given a snack."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,4),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,7),
                        new MoveLearnSetEntry(Move.FLING,10),
                        new MoveLearnSetEntry(Move.THIEF,14),
                        new MoveLearnSetEntry(Move.COVET,17),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,21),
                        new MoveLearnSetEntry(Move.TAIL_SLAP,27),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,37),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,40),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,43)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rascaloon");

    }


}
