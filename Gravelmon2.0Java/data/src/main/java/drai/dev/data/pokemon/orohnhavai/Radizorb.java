package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Radizorb extends drai.dev.data.pokemon.Pokemon {
    public Radizorb() {
        super("Radizorb",
                Type.ROCK, Type.ELECTRIC,
                new Stats(57,
                        70,
                        58,
                        95,
                        67,
                        83),
                List.of(Ability.SOLID_ROCK,Ability.LIGHTNING_ROD,Ability.TOUGH_CLAWS), Ability.TOUGH_CLAWS,
                8, 165,
                new Stats(0,0,0,2,0,0), 60,
                0.5,
                151, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.DRAGON),
                List.of("Radizorb's glowing appendages evolved to double as both a battery and a weapon. They can store up to 2,000 Gigawatts of electricity."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CHARGE,1),
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
                        new MoveLearnSetEntry(Move.GLARE,53),
                        new MoveLearnSetEntry(Move.CRYSTALCRUNCH,58),
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
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Radizorb");

    }


}
