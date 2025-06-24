package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Quink extends drai.dev.data.pokemon.Pokemon {
    public Quink() {
        super("Quink",
                Type.FAIRY,Type.GRASS,
                new Stats(65,
                        50,
                        60,
                        70,
                        65,
                        80),
                List.of(Ability.QUICK_DRAW), Ability.FILTER,
                5, 23,
                new Stats(0,0,0,1,0,0), 200,
                0.5,
                71, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.LEER,3),
                        new MoveLearnSetEntry(Move.COPYCAT,5),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,8),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,8),
                        new MoveLearnSetEntry(Move.CHARM,11),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,13),
                        new MoveLearnSetEntry(Move.MIMIC,16),
                        new MoveLearnSetEntry(Move.METRONOME,23),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,27),
                        new MoveLearnSetEntry(Move.ACROBATICS,32),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,35),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,38),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,45),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,47),
                        new MoveLearnSetEntry(Move.SKETCH,65)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(12).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_MAGICAL)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Quink");

    }


}
