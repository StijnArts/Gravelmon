package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Hoofin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hoofin(Stats stats) {
        super("Hoofin",
                Type.NORMAL, Type.WATER,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                13, 165,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PLAY_NICE,1),
                        new MoveLearnSetEntry(Move.LICK,5),
                        new MoveLearnSetEntry(Move.AQUASLAP,10),
                        new MoveLearnSetEntry(Move.LIFE_DEW,14),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,18),
                        new MoveLearnSetEntry(Move.COVET,22),
                        new MoveLearnSetEntry(Move.SOAK,26),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,31),
                        new MoveLearnSetEntry(Move.BODY_SLAM,35),
                        new MoveLearnSetEntry(Move.LIQUIDATION,40),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,46),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,53)
                ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 13, 35, 1.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hoofin");

    }


}
