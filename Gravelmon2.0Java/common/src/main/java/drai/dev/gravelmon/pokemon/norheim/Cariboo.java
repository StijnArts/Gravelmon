package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Cariboo extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cariboo() {
        super("Cariboo",
                Type.NORMAL,
                new Stats(65,
                        60,
                        50,
                        65,
                        70,
                        65),
                List.of(Ability.EARLY_BIRD), Ability.INSOMNIA,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Leer Normal - TackleSTAB Normal - Astonish Ghost 4 Leer Normal 8 Spite Ghost 14 Horn AttackSTAB Normal 14 Fury AttackSTAB Normal 19 Haze Ice 22 Night Shade Ghost 26 StompSTAB Normal 30 Mist Ice 33 Hex Ghost 36 Confuse Ray Ghost 42 Ominous Wind Ghost 47 Life Dew Water 53 Horn Leech Grass 58 Aromatic Mist Fairy 64 Last ResortSTAB Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.SPITE,8),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,14),
                        new MoveLearnSetEntry(Move.HAZE,19),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,22),
                        new MoveLearnSetEntry(Move.STOMP,26),
                        new MoveLearnSetEntry(Move.MIST,30),
                        new MoveLearnSetEntry(Move.HEX,33),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,36),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,42),
                        new MoveLearnSetEntry(Move.LIFE_DEW,47),
                        new MoveLearnSetEntry(Move.HORN_LEECH,53),
                        new MoveLearnSetEntry(Move.AROMATIC_MIST,58),
                        new MoveLearnSetEntry(Move.LAST_RESORT,64),
                        new MoveLearnSetEntry(Move.MORNING_SUN,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm")                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cariboo");

    }


}
