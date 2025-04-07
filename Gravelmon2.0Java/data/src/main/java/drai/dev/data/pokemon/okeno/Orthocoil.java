package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Orthocoil extends drai.dev.data.pokemon.Pokemon {
    public Orthocoil() {
        super("Orthocoil",
                Type.ROCK, Type.POISON,
                new Stats(40,
                        43,
                        91,
                        63,
                        51,
                        67),
                List.of(Ability.FLARE_BOOST), Ability.SWIFT_SWIM,
                8, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                71, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_3),
                List.of("Orthoceras + Petroleum"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.SLUDGE,6),
                        new MoveLearnSetEntry(Move.WATER_SPORT,11),
                        new MoveLearnSetEntry(Move.INCINERATE,16),
                        new MoveLearnSetEntry(Move.TOXIC,20),
                        new MoveLearnSetEntry(Move.PROTECT,26),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,32),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,37),
                        new MoveLearnSetEntry(Move.POISONBURST,42),
                        new MoveLearnSetEntry(Move.DRILL_RUN,46),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,52),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,"tm"),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Orthocoil");

    }


}
