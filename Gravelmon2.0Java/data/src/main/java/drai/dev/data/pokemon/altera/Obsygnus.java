package drai.dev.data.pokemon.altera;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Obsygnus extends drai.dev.data.pokemon.Pokemon {
    public Obsygnus() {
        super("Obsygnus",
                Type.ROCK,Type.FIRE,
                new Stats(65,
                        130,
                        52,
                        78,
                        78,
                        92),
                List.of(Ability.SHARPNESS,Ability.OBSIDIANBODY), Ability.THERMAL_EXCHANGE,
                11, 666,
                new Stats(0,2,0,0,0,0), 90,
                0.5,
                173, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Its body is formed from razor-sharp volcanic glass. By superheating the blades on its forelegs, it can slice effortlessly through concrete."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CUT,1),
                        new MoveLearnSetEntry(Move.SHARPEN,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,5),
                        new MoveLearnSetEntry(Move.EMBER,8),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,12),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,17),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,20),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,24),
                        new MoveLearnSetEntry(Move.SLASH,29),
                        new MoveLearnSetEntry(Move.STONE_AXE,32),
                        new MoveLearnSetEntry(Move.POWER_GEM,37),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,43),
                        new MoveLearnSetEntry(Move.STONE_EDGE,47),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,52),
                        new MoveLearnSetEntry(Move.GUILLOTINE,58),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,64),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.ACCELEROCK,"tm"),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_CRASH,"tm")),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(33).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOLCANIC)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Obsygnus");

    }


}
