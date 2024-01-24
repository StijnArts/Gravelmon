package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Rodat extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rodat() {
        super("Rodat",
                Type.NORMAL,
                new Stats(100,
                        74,
                        60,
                        56,
                        42,
                        83),
                List.of(Ability.STENCH), Ability.INFILTRATOR,
                8, 165,
                new Stats(2,0,0,0,0,0), 127,
                0.5,
                145, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("- TackleSTAB Normal 3 Tail Whip Normal 6 Bite Dark 8 Quick AttackSTAB Normal 11 Sand Attack Ground 13 Taunt Dark 16 Crunch Dark 18 Tickle Normal 20 Poison Fang Poison 22 Hyper FangSTAB Normal 25 Screech Normal 29 Chip AwaySTAB Normal 32 Sucker Punch Dark 36 Swagger Normal 39 Super FangSTAB Normal 43 Double-EdgeSTAB Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,3),
                        new MoveLearnSetEntry(Move.BITE,6),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,8),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,11),
                        new MoveLearnSetEntry(Move.TAUNT,13),
                        new MoveLearnSetEntry(Move.CRUNCH,16),
                        new MoveLearnSetEntry(Move.TICKLE,18),
                        new MoveLearnSetEntry(Move.POISON_FANG,20),
                        new MoveLearnSetEntry(Move.HYPER_FANG,22),
                        new MoveLearnSetEntry(Move.SCREECH,25),
                        new MoveLearnSetEntry(Move.CHIP_AWAY,29),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,32),
                        new MoveLearnSetEntry(Move.SWAGGER,36),
                        new MoveLearnSetEntry(Move.SUPER_FANG,39),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,43)                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rodat");

    }


}
