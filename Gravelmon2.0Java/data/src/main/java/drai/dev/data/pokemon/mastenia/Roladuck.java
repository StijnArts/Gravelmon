package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Roladuck extends drai.dev.data.pokemon.Pokemon {
    public Roladuck(Stats stats) {
        super("Roladuck",
                Type.GROUND, Type.WATER,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Rollout Rock - Rototiller Ground - Earth PowerSTAB Ground - Muddy WaterSTAB Water - Water GunSTAB Water - Baby-Doll Eyes Fairy - Beak Blast Flying - DigSTAB Ground - Yawn Normal - Sand TombSTAB Ground - Ancient Power Rock - Aqua Ring Water - Aqua JetSTAB Water - Sandstorm Rock - Defense Curl Normal - Amnesia Psychic - BulldozeSTAB Ground"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROTOTILLER,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.DIG,1),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,1),
                        new MoveLearnSetEntry(Move.BEAK_BLAST,1),
                        new MoveLearnSetEntry(Move.AQUA_JET,1),
                        new MoveLearnSetEntry(Move.SAND_TOMB,1),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,1),
                        new MoveLearnSetEntry(Move.YAWN,1),
                        new MoveLearnSetEntry(Move.EARTH_POWER,1),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,1),
                        new MoveLearnSetEntry(Move.AQUA_RING,1),
                        new MoveLearnSetEntry(Move.SANDSTORM,1),
                        new MoveLearnSetEntry(Move.BULLDOZE,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.AMNESIA,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,1)                        ),
                List.of(Label.MASTENIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Roladuck");

    }


}
