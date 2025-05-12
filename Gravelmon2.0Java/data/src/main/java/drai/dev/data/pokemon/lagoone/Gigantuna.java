package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gigantuna extends drai.dev.data.pokemon.Pokemon {
    public Gigantuna() {
        super("Gigantuna",
                Type.WATER,
                new Stats(105,
                        65,
                        70,
                        105,
                        85,
                        75),
                List.of(Ability.THICK_FAT), Ability.MARVEL_SCALE,
                17, 1400,
                new Stats(2,0,0,0,0,0), 80,
                0.5,
                172, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("It will try to eat anything that fits in its mouth, especially shiny objects. Their scales will glisten and even slightly change color depending on what they eat."),
                List.of(),
                List.of(       new MoveLearnSetEntry(Move.BITE, 1),
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
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 31, 54, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Gigantuna");

    }


}
