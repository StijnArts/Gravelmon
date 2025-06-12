package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sardive extends drai.dev.data.pokemon.Pokemon {
    public Sardive() {
        super("Sardive",
                Type.WATER,
                new Stats(40,
                        30,
                        40,
                        65,
                        40,
                        75),
                List.of(Ability.PICKUP), Ability.MARVEL_SCALE,
                4, 32,
                new Stats(1,0,0,0,0,0), 220,
                0.5,
                52, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("They swim in very large groups in the ocean, if one is too tired to keep swimming it will use its hook tail to cling to another's tail and be pulled alongside."),
                List.of(new EvolutionEntry("gigantuna", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(            new MoveLearnSetEntry(Move.BITE, 1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP, 1),
                        new MoveLearnSetEntry(Move.BUBBLE, 1),
                        new MoveLearnSetEntry(Move.AQUA_JET, 7),
                        new MoveLearnSetEntry(Move.BIND, 8),
                        new MoveLearnSetEntry(Move.JET_STRIKE, 10),
                        new MoveLearnSetEntry(Move.GLARE, 12),
                        new MoveLearnSetEntry(Move.HEADBUTT, 14),
                        new MoveLearnSetEntry(Move.CRUNCH, 17),
                        new MoveLearnSetEntry(Move.DUAL_CHOP, 21),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE, 23),
                        new MoveLearnSetEntry(Move.AQUA_TAIL, 26),
                        new MoveLearnSetEntry(Move.ICE_FANG, 34),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED, 47),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH, 52)            ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 7, 28, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Sardive");

    }


}
