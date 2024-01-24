package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Caviat extends drai.dev.gravelmon.pokemon.Pokemon {
    public Caviat() {
        super("Caviat",
                Type.NORMAL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.RUN_AWAY), Ability.RUN_AWAY,
                8, 165,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("- TackleSTAB Normal 3 Tail Whip Normal 6 Bite Dark 8 Quick AttackSTAB Normal 11 Sand Attack Ground 13 Taunt Dark 16 Crunch Dark 18 Tickle Normal 21 Hyper FangSTAB Normal 23 Screech Normal 26 Chip AwaySTAB Normal 28 Sucker Punch Dark 31 Swagger Normal 33 Super FangSTAB Normal 36 Double-EdgeSTAB Normal"),
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
                        new MoveLearnSetEntry(Move.HYPER_FANG,21),
                        new MoveLearnSetEntry(Move.SCREECH,23),
                        new MoveLearnSetEntry(Move.CHIP_AWAY,26),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,28),
                        new MoveLearnSetEntry(Move.SWAGGER,31),
                        new MoveLearnSetEntry(Move.SUPER_FANG,33),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,36)                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Caviat");

    }


}
