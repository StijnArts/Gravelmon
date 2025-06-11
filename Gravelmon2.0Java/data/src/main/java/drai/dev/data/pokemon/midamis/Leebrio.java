package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Leebrio extends drai.dev.data.pokemon.Pokemon {
    public Leebrio() {
        super("Leebrio",
                Type.DRAGON, Type.FAIRY,
                new Stats(50,
                        45,
                        40,
                        65,
                        50,
                        50),
                List.of(Ability.FOREWARN), Ability.FOREWARN,
                3, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("leebrey", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(        new MoveLearnSetEntry(Move.BABYDOLL_EYES,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,6),
                        new MoveLearnSetEntry(Move.CHARM,11),
                        new MoveLearnSetEntry(Move.TWISTER,14),
                        new MoveLearnSetEntry(Move.MIST,18),
                        new MoveLearnSetEntry(Move.WISH,22),
                        new MoveLearnSetEntry(Move.RAINBOWGUST,26),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN,30),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,34),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,38),
                        new MoveLearnSetEntry(Move.RAINBOWRUSH,42),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,49),
                        new MoveLearnSetEntry(Move.FESTIVESHOT,55),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,60),
                        new MoveLearnSetEntry(Move.HEALING_WISH,65)                ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .pseudoLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Leebrio");

    }


}
