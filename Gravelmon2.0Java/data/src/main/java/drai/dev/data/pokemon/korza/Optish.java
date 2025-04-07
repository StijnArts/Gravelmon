package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Optish extends drai.dev.data.pokemon.Pokemon {
    public Optish() {
        super("Optish",
                Type.WATER,Type.FLYING,
                new Stats(32,
                        33,
                        45,
                        55,
                        65,
                        70),
                List.of(Ability.AIR_LOCK), Ability.RAIN_DISH,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                60, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Scales on their bodies allow Optish to flicker in and out of sight as they fly through the air. This makes the mon difficult to find and to document, espeically on film."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,3),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,9),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,14),
                        new MoveLearnSetEntry(Move.WHIRLWIND,19),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,23),
                        new MoveLearnSetEntry(Move.ACROBATICS,28),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,32),
                        new MoveLearnSetEntry(Move.SCALD,37),
                        new MoveLearnSetEntry(Move.DEFOG,42),
                        new MoveLearnSetEntry(Move.ROOST,47),
                        new MoveLearnSetEntry(Move.HURRICANE,51),
                        new MoveLearnSetEntry(Move.YAWN,56),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,62),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,67),
                        new MoveLearnSetEntry(Move.HAZE,71),
                        new MoveLearnSetEntry(Move.ENDEAVOR,76)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Optish");

    }


}
