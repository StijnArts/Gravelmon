package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Infiluv extends drai.dev.gravelmon.pokemon.Pokemon {
    public Infiluv() {
        super("Infiluv",
                Type.FAIRY, Type.PSYCHIC,
                new Stats(100,
                        100,
                        100,
                        100,
                        100,
                        100),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 165,
                new Stats(3,0,0,0,0,0), 45,
                0.0,
                270, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("It is said that the couple touched by the tips of its two tails will share eternal love. Its powers are maximized during a certain day of the year."),
                List.of(),
                List.of(new MoveLearnSetEntry(Move.FAIRY_WIND,1),
                        new MoveLearnSetEntry(Move.MIST,3),
                        new MoveLearnSetEntry(Move.CONFUSION,6),
                        new MoveLearnSetEntry(Move.AROMATIC_MIST,9),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,11),
                        new MoveLearnSetEntry(Move.SWIFT,13),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,17),
                        new MoveLearnSetEntry(Move.RAINBOWGUST,19),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,22),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE,29),
                        new MoveLearnSetEntry(Move.WISH,32),
                        new MoveLearnSetEntry(Move.CALM_MIND,36),
                        new MoveLearnSetEntry(Move.STRANGE_STEAM,39),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,44),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,48),
                        new MoveLearnSetEntry(Move.HEALING_WISH,50),
                        new MoveLearnSetEntry(Move.MISTY_EXPLOSION,60)
                ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Infiluv");

    }


}
