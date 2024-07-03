package drai.dev.gravelmon.pokemon.myth;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

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
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 70, 0.000001, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FLORAL)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "day"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setPortraitXYZ(0,1.8,0);
        setCanFly(true);
    }
}
