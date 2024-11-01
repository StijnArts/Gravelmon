package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ruffen extends drai.dev.data.pokemon.Pokemon {
    public Ruffen() {
        super("Ruffen",
                Type.GRASS,Type.PSYCHIC,
                new Stats(70,
                        54,
                        62,
                        81,
                        63,
                        81),
                List.of(Ability.OVERGROW), Ability.TELEPATHY,
                6, 127,
                new Stats(0,0,0,1,0,1), 45,
                0.875,
                144, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.GRASS),
                List.of("The leaf on Ruffen's head can release large bursts of psychic energy when needed. The pollen-like dandruff in its fur and whiskers can cause severe allergic reactions."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.ABSORB,7),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,11),
                        new MoveLearnSetEntry(Move.GROWTH,13),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,15),
                        new MoveLearnSetEntry(Move.CALM_MIND,21),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,25),
                        new MoveLearnSetEntry(Move.PSYCH_UP,29),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,33),
                        new MoveLearnSetEntry(Move.TRICK,37),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,41),
                        new MoveLearnSetEntry(Move.SYNTHESIS,46),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,50),
                        new MoveLearnSetEntry(Move.PSYCHIC,53),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.SNATCH,"tm"),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,"tm"),
                        new MoveLearnSetEntry(Move.SWITCHEROO,"tm")                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ruffen");

    }


}
