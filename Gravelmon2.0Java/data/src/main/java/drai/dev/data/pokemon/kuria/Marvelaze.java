package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Marvelaze extends drai.dev.data.pokemon.Pokemon {
    public Marvelaze() {
        super("Marvelaze",
                Type.FIRE, Type.FAIRY,
                new Stats(88,
                        55,
                        55,
                        115,
                        95,
                        128),
                List.of(Ability.FLASH_FIRE,Ability.PRESSURE), Ability.SERENE_GRACE,
                10, 195,
                new Stats(0,0,0,0,0,3), 30,
                0.125,
                182, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.HUMAN_LIKE),
                List.of("Marvelaze are small but extremely quick Pokémon. It leaves a trail of marvelous fire behind when it flies through the air so that its Embay children can find it."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP, 1),
                        new MoveLearnSetEntry(Move.EMBER, 1),
                        new MoveLearnSetEntry(Move.CHARM, 1),
                        new MoveLearnSetEntry(Move.DRAINING_KISS, 8),
                        new MoveLearnSetEntry(Move.WILLOWISP, 12),
                        new MoveLearnSetEntry(Move.FAIRY_LOCK, 22),
                        new MoveLearnSetEntry(Move.BITE, 25),
                        new MoveLearnSetEntry(Move.FIRE_FANG, 28),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE, 30),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM, 37),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE, 40),
                        new MoveLearnSetEntry(Move.FIRE_BLAST, 51),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, 55),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN, 60)
                ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 38, 54, .14, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Marvelaze");

    }


}
