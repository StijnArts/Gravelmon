package drai.dev.data.pokemon.flux;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Scarablaze extends drai.dev.data.pokemon.Pokemon {
    public Scarablaze() {
        super("Scarablaze",
                Type.BUG,Type.FIRE,
                new Stats(44,
                        54,
                        51,
                        65,
                        44,
                        62),
                List.of(Ability.BOMBARDIER,Ability.MAGIC_GUARD), Ability.SOLAR_POWER,
                3, 102,
                new Stats(0,0,0,1,0,0), 45,
                0.5,
                64, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.BUG,EggGroup.HUMAN_LIKE),
                List.of("It gathers detritus into a fiery ball that it kicks around wherever it goes. Some ancient cultures believed this ball was a fragment of the sun."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,5),
                        new MoveLearnSetEntry(Move.PROTECT,9),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,14),
                        new MoveLearnSetEntry(Move.MUD_BOMB,18),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,23),
                        new MoveLearnSetEntry(Move.MORNING_SUN,27),
                        new MoveLearnSetEntry(Move.MYSTICAL_FIRE,32),
                        new MoveLearnSetEntry(Move.STEAMROLLER,36),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,41),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,45),
                        new MoveLearnSetEntry(Move.PYRO_BALL,50),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.TRAILBLAZE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.PSYBEAM,"tm"),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,"tm"),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,"tm"),
                        new MoveLearnSetEntry(Move.ROLLOUT,"tm"),
                        new MoveLearnSetEntry(Move.POLLEN_PUFF,"tm"),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS,"tm")),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DESERT).canSeeSky().duringDaytime()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Scarablaze");

    }


}
