package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Barbavelry extends drai.dev.data.pokemon.Pokemon {
    public Barbavelry() {
        super("Barbavelry",
                Type.FIGHTING,
                new Stats(75,
                        100,
                        70,
                        75,
                        70,
                        110),
                List.of(Ability.ANGER_POINT), Ability.RECKLESS,
                27, 165,
                new Stats(0,0,0,0,0,2), 65,
                0.5,
                173, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It is very proud of its abilities and competitive. It will dash past other running Pokemon to boast about its speed."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.LOW_KICK,8),
                        new MoveLearnSetEntry(Move.STOMP,11),
                        new MoveLearnSetEntry(Move.JUMP_KICK,20),
                        new MoveLearnSetEntry(Move.HIGH_HORSEPOWER,24),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,29),
                        new MoveLearnSetEntry(Move.BULK_UP,35),
                        new MoveLearnSetEntry(Move.REVERSAL,40),
                        new MoveLearnSetEntry(Move.AGILITY,45),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,51),
                        new MoveLearnSetEntry(Move.SUPERPOWER,61)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 31, 56, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA, Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Barbavelry");

    }


}
