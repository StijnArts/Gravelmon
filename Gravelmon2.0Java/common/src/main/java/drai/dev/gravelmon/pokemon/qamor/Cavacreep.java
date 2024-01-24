package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Cavacreep extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cavacreep() {
        super("Cavacreep",
                Type.BUG,Type.GRASS,
                new Stats(100,
                        93,
                        80,
                        57,
                        70,
                        70),
                List.of(Ability.RIPEN,Ability.UNNERVE,Ability.THICK_FAT), Ability.THICK_FAT,
                8, 165,
                new Stats(1,1,0,0,0,0), 200,
                0.5,
                165, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Cavacreep disguise themselves as ripe delicious fruit to trick passing by Pokemon and people into trying to eat them, and at the last second jumping out and attacking them. These pokemon are incredibly tricky and mischievous, and are known to fall from the high trees above on top of any passerby below or even placing their fruit peals in strategic locations to make people slip."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.SPITE,5),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,8),
                        new MoveLearnSetEntry(Move.LEECH_SEED,10),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,16),
                        new MoveLearnSetEntry(Move.POISON_FANG,24),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,29),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,33),
                        new MoveLearnSetEntry(Move.EMBARGO,35),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,37),
                        new MoveLearnSetEntry(Move.POISON_JAB,39),
                        new MoveLearnSetEntry(Move.SYNTHESIS,41),
                        new MoveLearnSetEntry(Move.XSCISSOR,45),
                        new MoveLearnSetEntry(Move.POWER_WHIP,50),
                        new MoveLearnSetEntry(Move.FELL_STINGER,55),
                        new MoveLearnSetEntry(Move.BANANARANG,"tm"),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,"tm"),
                        new MoveLearnSetEntry(Move.SPIDER_WEB,"tm"),
                        new MoveLearnSetEntry(Move.ELECTROWEB,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cavacreep");

    }


}
