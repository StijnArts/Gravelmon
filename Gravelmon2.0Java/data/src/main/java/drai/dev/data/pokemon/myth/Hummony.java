package drai.dev.data.pokemon.myth;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Hummony extends Pokemon {
    public Hummony() {
        super("Hummony",
                Type.FAIRY, Type.FLYING,
                new Stats(100,100,100,100,100,100),
                List.of(Ability.PIXILATE), Ability.PIXILATE,
                12, 679,
                new Stats(0,0,0,0,1,0), 3,
                -1,
                250, ExperienceGroup.MEDIUM_FAST,
                70,
                100, List.of(EggGroup.UNDISCOVERED),
                List.of("A Mythical Pokemon that is said to be the descent of Cresselia, although it seems a bit more evil."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FAIRY_WIND, 1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK, 3),
                        new MoveLearnSetEntry(Move.SCREECH, 8),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE, 12),
                        new MoveLearnSetEntry(Move.WING_ATTACK, 15),
                        new MoveLearnSetEntry(Move.MOONLIGHT, 21),
                        new MoveLearnSetEntry(Move.MOONBLAST, 25),
                        new MoveLearnSetEntry(Move.AERIAL_ACE, 29),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD, 33),
                        new MoveLearnSetEntry(Move.HYPNOSIS, 39),
                        new MoveLearnSetEntry(Move.SING, 41),
                        new MoveLearnSetEntry(Move.HYPER_VOICE, 43),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED, 44),
                        new MoveLearnSetEntry(Move.CALM_MIND, 50),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE, 55),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT, 60),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, 70),
                        new MoveLearnSetEntry(Move.STARBOLT, 85)
                ),
                List.of(Label.MYTH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.ULTRA_RARE)
    .setMinLevel(65)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_FLORAL)
    .duringDaytime()
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
    }
}
