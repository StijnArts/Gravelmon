package drai.dev.gravelmon.pokemon.kuria;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Noctoa extends drai.dev.gravelmon.pokemon.Pokemon {
    public Noctoa() {
        super("Noctoa",
                Type.NORMAL, Type.DARK,
                new Stats(63,
                        95,
                        60,
                        60,
                        60,
                        94),
                List.of(Ability.INFILTRATOR), Ability.SHADOW_TAG,
                9, 92,
                new Stats(0,2,0,0,0,1), 120,
                0.5,
                145, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("Noctoa differ in day and night. During the day, Noctoa is as kind as it was as a Biroo. But at night, it becomes a truly violent monstrosity."),
                List.of(),
                List.of( new MoveLearnSetEntry(Move.BABYDOLL_EYES,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.SLASH,1),
                        new MoveLearnSetEntry(Move.SWITCHEROO,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.COVET,9),
                        new MoveLearnSetEntry(Move.HEADBUTT,12),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,15),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,18),
                        new MoveLearnSetEntry(Move.REST,23),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,28),
                        new MoveLearnSetEntry(Move.FLING,33),
                        new MoveLearnSetEntry(Move.FLAIL,38),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,43),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,48)            ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 22, 38, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Noctoa");

    }


}
