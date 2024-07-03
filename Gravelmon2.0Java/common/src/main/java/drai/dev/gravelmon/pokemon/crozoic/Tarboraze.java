package drai.dev.gravelmon.pokemon.crozoic;


import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;
public class Tarboraze extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tarboraze(Stats stats) {
        super("Tarboraze",
                Type.FIRE,
                stats,
                List.of(Ability.FLAME_BODY,Ability.FEROCIOUS), Ability.FIERYSPIRIT,
                28, 2898,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of("A close relative of Tyrantrum, but from a different continent. In its desert habitat, it reigns supreme, shedding excess heat in the form of raging blue flames."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.NOBLE_ROAR,1),
                        new MoveLearnSetEntry(Move.OUTRAGE,1),
                        new MoveLearnSetEntry(Move.OVERRULE,1),
                        new MoveLearnSetEntry(Move.RAGING_FURY,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.STOMP,1),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,1),
                        new MoveLearnSetEntry(Move.BULLDOZE,1),
                        new MoveLearnSetEntry(Move.HEAT_CRASH,1),
                        new MoveLearnSetEntry(Move.FIRE_FANG,1),
                        new MoveLearnSetEntry(Move.BATTLEROAR,1),
                        new MoveLearnSetEntry(Move.CRUNCH,1)                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 39, 57, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS, Biome.IS_VOLCANIC, Biome.IS_LUSH))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tarboraze");

    }


}
