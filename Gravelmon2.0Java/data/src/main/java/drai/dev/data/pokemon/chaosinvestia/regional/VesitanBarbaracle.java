package drai.dev.data.pokemon.chaosinvestia.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VesitanBarbaracle extends drai.dev.data.pokemon.Pokemon {
    public VesitanBarbaracle(String name, Aspect aspect) {
        super(name, aspect, "VesitanBarbaracle",
                Type.ROCK,Type.STEEL,
                new Stats(90,
                        110,
                        130,
                        50,
                        63,
                        100),
                List.of(Ability.TOUGH_CLAWS,Ability.STURDY), null,
                13, 960,
                new Stats(0,2,0,0,0,0), 255,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.WATER_1),
                List.of("Arme und Beine verfügen über eigene Gehirne, was ihnen relative Bewegungsfreiheit gewährt. Sie ordnen sich jedoch zumeist den Befehlen des Kopfes unter."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,44),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,33),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.STONE_EDGE,60),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,10),
                        new MoveLearnSetEntry(Move.SLASH,13),
                        new MoveLearnSetEntry(Move.CLAMP,20),
                        new MoveLearnSetEntry(Move.SKULL_BASH,65),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,4),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,28),
                        new MoveLearnSetEntry(Move.METAL_CLAW,39),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,55),
                        new MoveLearnSetEntry(Move.WITHDRAW,7),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,24),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,18),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,37),
                        new MoveLearnSetEntry(Move.IRON_HEAD,48),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,50)                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(33)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DRIPSTONE)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Barbaracle");

    }


}
