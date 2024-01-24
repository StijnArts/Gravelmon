package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Heaxen extends drai.dev.gravelmon.pokemon.Pokemon {
    public Heaxen() {
        super("Heaxen",
                Type.NORMAL,
                new Stats(35,
                        40,
                        20,
                        40,
                        50,
                        60),
                List.of(Ability.SUPER_LUCK), Ability.UNBURDEN,
                8, 165,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                56, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Their fantastic hearing allow them to never be caught by surprise, they can hear the whole forest even while asleep."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,4),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,6),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,9),
                        new MoveLearnSetEntry(Move.COVET,12),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,15),
                        new MoveLearnSetEntry(Move.ROUND,17),
                        new MoveLearnSetEntry(Move.SING,20),
                        new MoveLearnSetEntry(Move.SWIFT,22),
                        new MoveLearnSetEntry(Move.AGILITY,27),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,30),
                        new MoveLearnSetEntry(Move.WISH,35),
                        new MoveLearnSetEntry(Move.BATON_PASS,39),
                        new MoveLearnSetEntry(Move.LAST_RESORT,42)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Heaxen");

    }


}
