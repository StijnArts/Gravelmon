package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Warbleer extends drai.dev.data.pokemon.Pokemon {
    public Warbleer() {
        super("Warbleer",
                Type.NORMAL, Type.FLYING,
                new Stats(62,
                        98,
                        72,
                        100,
                        62,
                        106),
                List.of(Ability.KEEN_EYE,Ability.COURAGEOUS,Ability.ADAPTABILITY), Ability.ADAPTABILITY,
                8, 165,
                new Stats(0,0,0,0,0,3), 45,
                0.5,
                215, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Warbleer can spot prey hiding in bushes 100 feet up in the air. Once they find a target, they will dive to catch it in the blink of an eye."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.LEER,3),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,6),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,9),
                        new MoveLearnSetEntry(Move.FLURRYPECK,13),
                        new MoveLearnSetEntry(Move.FORESIGHT,16),
                        new MoveLearnSetEntry(Move.WING_ATTACK,21),
                        new MoveLearnSetEntry(Move.SWIFT,25),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,28),
                        new MoveLearnSetEntry(Move.TAILWIND,32),
                        new MoveLearnSetEntry(Move.LASER_FOCUS,36),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,40),
                        new MoveLearnSetEntry(Move.LAST_RESORT,46),
                        new MoveLearnSetEntry(Move.FEATHERSLASH,55),
                        new MoveLearnSetEntry(Move.WHIRLWIND,"tm"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,"tm"),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Warbleer");

    }


}
