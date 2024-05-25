package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Graceola extends drai.dev.gravelmon.pokemon.Pokemon {
    public Graceola() {
        super("Graceola",
                Type.GRASS, Type.FAIRY,
                new Stats(60,
                        95,
                        50,
                        145,
                        130,
                        30),
                List.of(Ability.MAGIC_GUARD,Ability.REGENERATOR,Ability.SERENE_GRACE), Ability.SERENE_GRACE,
                10, 165,
                new Stats(0,0,0,2,0,0), 30,
                0.25,
                179, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("They normally stay very still to absorb sunlight but every year groups of them will come together and do beautiful dances to welcome the coming of spring."),
                List.of(),
                List.of(    new MoveLearnSetEntry(Move.FLOWER_SHIELD,1),
                        new MoveLearnSetEntry(Move.LEECH_SEED,7),
                        new MoveLearnSetEntry(Move.VINE_WHIP,9),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,12),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,16),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,21),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,25),
                        new MoveLearnSetEntry(Move.CHARM,29),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,33),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,36),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,41),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,45),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,50),
                        new MoveLearnSetEntry(Move.MOONBLAST,56),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,63)                ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 38, 56, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_SUMMER))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Graceola");

    }


}
