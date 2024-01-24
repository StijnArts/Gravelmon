package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Bravelry extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bravelry() {
        super("Bravelry",
                Type.FIGHTING,
                new Stats(45,
                        85,
                        50,
                        65,
                        50,
                        80),
                List.of(Ability.ANGER_POINT), Ability.RECKLESS,
                8, 165,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                82, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Despite not being very strong it prefers to live alone, in hopes of growing strong and fully independent."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.LOW_KICK,8),
                        new MoveLearnSetEntry(Move.STOMP,11),
                        new MoveLearnSetEntry(Move.JUMP_KICK,20),
                        new MoveLearnSetEntry(Move.HIGH_HORSEPOWER,24),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,29),
                        new MoveLearnSetEntry(Move.BULK_UP,33),
                        new MoveLearnSetEntry(Move.REVERSAL,37),
                        new MoveLearnSetEntry(Move.AGILITY,40),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,46),
                        new MoveLearnSetEntry(Move.SUPERPOWER,56)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bravelry");

    }


}
