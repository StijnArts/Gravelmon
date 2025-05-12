package drai.dev.data.pokemon.xenoverse.xspecies;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class DragaliskX extends Pokemon {
    public DragaliskX(String name, Aspect aspect) {
        super(name, aspect,"DragaliskX",
                Type.GROUND, Type.ICE,
                new Stats(70, 170, 70, 170, 70, 130),
                List.of(Ability.DREAD_SPACE), Ability.DREAD_SPACE,
                25, 2000,
                new Stats(0,0,0,3,0,0), 30,
                0.5,
                345, ExperienceGroup.SLOW,
                40,
                26, List.of(EggGroup.XENO),
                List.of("This being, created to replace the Dark Lord, is a concentration of pure Fury energy. Although it's smaller to the original Dragalisk, it's still very powerful and lethal."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.VOID_STAR,1),
                        new MoveLearnSetEntry(Move.HAZE,1),
                        new MoveLearnSetEntry(Move.FREEZEDRY,14),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,20),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,27),
                        new MoveLearnSetEntry(Move.BULLDOZE,35),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,42),
                        new MoveLearnSetEntry(Move.GLACIATE,48),
                        new MoveLearnSetEntry(Move.EARTH_POWER,55),
                        new MoveLearnSetEntry(Move.ICE_BEAM,63),
                        new MoveLearnSetEntry(Move.VOID_STAR,70),
                        new MoveLearnSetEntry(Move.FISSURE,75),
                        new MoveLearnSetEntry(Move.OUTRAGE,82),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,88),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tutor")
                        ),
                List.of(Label.XENOVERSE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 70, 80, 0.00001, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());

    }
}
