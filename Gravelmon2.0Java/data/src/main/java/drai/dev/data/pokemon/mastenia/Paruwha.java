package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Paruwha extends drai.dev.data.pokemon.Pokemon {
    public Paruwha() {
        super("Paruwha",
                Type.GROUND, Type.FLYING,
                new Stats(125,
                        125,
                        90,
                        95,
                        70,
                        75),
                List.of(Ability.PRESSURE), Ability.SAND_STREAM,
                25, 854,
                new Stats(2,2,0,0,0,0), 3,
                0.0,
                290, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("- Sand Attack Ground - PeckSTAB Flying 5 Sand TombSTAB Ground 10 Block Normal 15 GustSTAB Flying 20 Feather Dance Flying 25 Ancient Power Rock 30 Tailwind Flying 35 Drill RunSTAB Ground 40 Shore Up Ground 45 EarthquakeSTAB Ground 50 Sandstorm Rock 55 HurricaneSTAB Flying 60 Dual WingbeatSTAB Flying 65 Scorching SandsSTAB Ground 70 FissureSTAB Ground"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.SAND_TOMB,5),
                        new MoveLearnSetEntry(Move.BLOCK,10),
                        new MoveLearnSetEntry(Move.GUST,15),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,20),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,25),
                        new MoveLearnSetEntry(Move.TAILWIND,30),
                        new MoveLearnSetEntry(Move.DRILL_RUN,35),
                        new MoveLearnSetEntry(Move.SHORE_UP,40),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,45),
                        new MoveLearnSetEntry(Move.SANDSTORM,50),
                        new MoveLearnSetEntry(Move.HURRICANE,55),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,60),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS,65),
                        new MoveLearnSetEntry(Move.FISSURE,70)                        ),
                List.of(Label.MASTENIA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .subLegend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_ARID).isRaining()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Paruwha");
        setCanFly(true);

    }


}
