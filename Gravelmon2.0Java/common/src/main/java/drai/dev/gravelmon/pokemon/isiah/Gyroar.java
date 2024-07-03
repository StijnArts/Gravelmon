package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Gyroar extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gyroar() {
        super("Gyroar",
                Type.ROCK, Type.DRAGON,
                new Stats(105,
                        87,
                        110,
                        56,
                        67,
                        32),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                25, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN, 1),
                        new MoveLearnSetEntry(Move.ROCK_THROW, 1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP, 3),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL, 6),
                        new MoveLearnSetEntry(Move.ROLLOUT, 10),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH, 13),
                        new MoveLearnSetEntry(Move.PROTECT, 17),
                        new MoveLearnSetEntry(Move.HEADBUTT, 21),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE, 25),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH, 27),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, 30),
                        new MoveLearnSetEntry(Move.FACADE, 34),
                        new MoveLearnSetEntry(Move.SMACK_DOWN, 36),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH, 40),
                        new MoveLearnSetEntry(Move.FAKE_OUT, 43),
                        new MoveLearnSetEntry(Move.DRACO_METEOR, 48),
                        new MoveLearnSetEntry(Move.EARTHQUAKE, 54),
                        new MoveLearnSetEntry(Move.HEAD_SMASH, 58),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, 65),
                        new MoveLearnSetEntry(Move.METEOR_MASH, 69)
                ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 48, 62, .1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MOUNTAIN, Biome.IS_CAVE))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gyroar");

    }


}
