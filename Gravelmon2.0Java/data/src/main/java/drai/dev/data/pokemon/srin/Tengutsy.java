package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tengutsy extends drai.dev.data.pokemon.Pokemon {
    public Tengutsy(Stats stats) {
        super("Tengutsy",
                Type.ROCK,Type.WATER,
                stats,
                List.of(Ability.WIND_RIDER), Ability.GUTS,
                16, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.87,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("- Sandstorm Rock - Shore Up Ground - Dual Wingbeat Flying - Flatter Dark - Aqua JetSTAB Water - Tailwind Flying - Whirlwind Normal - Swagger Normal - Rock Polish Rock - Drill Peck Flying - Drill Run Ground - Power GemSTAB Rock - Chip Away Normal - WhirlpoolSTAB Water - Water PulseSTAB Water - Muddy WaterSTAB Water - Water ArrowSTAB Water - Gust Flying - Stealth Rock Rock - Feather Dance Flying - Dazzling Gleam Fairy"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FLATTER,1),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,1),
                        new MoveLearnSetEntry(Move.SHORE_UP,1),
                        new MoveLearnSetEntry(Move.WHIRLWIND,1),
                        new MoveLearnSetEntry(Move.DRILL_RUN,1),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,1),
                        new MoveLearnSetEntry(Move.TAILWIND,1),
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.DRILL_PECK,1),
                        new MoveLearnSetEntry(Move.POWER_GEM,1),
                        new MoveLearnSetEntry(Move.AQUA_JET,1),
                        new MoveLearnSetEntry(Move.CHIP_AWAY,1),
                        new MoveLearnSetEntry(Move.WATERARROW,1),
                        new MoveLearnSetEntry(Move.WATER_PULSE,1),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,1),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,1),
                        new MoveLearnSetEntry(Move.SWAGGER,1),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,1),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,1),
                        new MoveLearnSetEntry(Move.SANDSTORM,1),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,1)),
                List.of(Label.SORIN),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_PEAK).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Tengutsy");

    }


}
