package drai.dev.data.pokemon.varitas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Graceola extends drai.dev.data.pokemon.Pokemon {
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
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(38)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Graceola");

    }


}
