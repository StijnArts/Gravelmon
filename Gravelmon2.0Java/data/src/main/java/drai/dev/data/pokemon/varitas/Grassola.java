package drai.dev.data.pokemon.varitas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Grassola extends drai.dev.data.pokemon.Pokemon {
    public Grassola() {
        super("Grassola",
                Type.GRASS, Type.FAIRY,
                new Stats(65,
                        55,
                        95,
                        65,
                        95,
                        35),
                List.of(Ability.LEAF_GUARD,Ability.REGENERATOR,Ability.SERENE_GRACE), Ability.SERENE_GRACE,
                6, 165,
                new Stats(0,0,1,0,1,0), 60,
                0.25,
                144, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("It slowly moves along the forest floor, camougoomyed among old pieces of wood. It was initially mistaken for Corsola due to the way branches sprout from it"),
                List.of(new EvolutionEntry("graceola", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))),
                List.of(        new MoveLearnSetEntry(Move.FLOWER_SHIELD,1),
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
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 6, 26, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DECIDUOUS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE))),
                List.of(SpawnPreset.NATURAL),
                List.of());
           setLangFileName("Grassola");

    }


}
