package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Radiaze extends drai.dev.data.pokemon.Pokemon {
    public Radiaze() {
        super("Radiaze",
                Type.ROCK, Type.ELECTRIC,
                new Stats(75,
                        95,
                        70,
                        120,
                        85,
                        105),
                List.of(Ability.SOLID_ROCK,Ability.LIGHTNING_ROD,Ability.TOUGH_CLAWS), Ability.TOUGH_CLAWS,
                8, 165,
                new Stats(0,0,0,2,0,1), 30,
                0.5,
                243, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of("The energy it absorbs from thunderstorms can be concentrated into a powerful beam. It can absorb power from cities to cause a major blackout, which it hardly does."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,6),
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,10),
                        new MoveLearnSetEntry(Move.SPARK,14),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,19),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,23),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,28),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,33),
                        new MoveLearnSetEntry(Move.ELECTRIFY,38),
                        new MoveLearnSetEntry(Move.DISCHARGE,43),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,48),
                        new MoveLearnSetEntry(Move.STUNJAB,50),
                        new MoveLearnSetEntry(Move.GLARE,54),
                        new MoveLearnSetEntry(Move.CRYSTALCRUNCH,59),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,65),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.POWER_GEM,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERTAIL,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Radiaze");

    }


}
