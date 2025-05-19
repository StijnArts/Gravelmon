package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pupenta extends drai.dev.data.pokemon.Pokemon {
    public Pupenta() {
        super("Pupenta",
                Type.BUG,
                new Stats(30,
                        20,
                        60,
                        40,
                        30,
                        30),
                List.of(Ability.SHED_SKIN,Ability.RUN_AWAY), Ability.EFFECT_SPORE,
                0, 0,
                new Stats(0,0,1,0,1,0), 120,
                0.5,
                74, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It positions itself as near to the sun as possible in order to acquire adequate energy for development. Constantly staring at the sun has left it blind, but it has enhanced its other senses."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,5),
                        new MoveLearnSetEntry(Move.HARDEN,8),
                        new MoveLearnSetEntry(Move.CONFUSION,11),
                        new MoveLearnSetEntry(Move.POISON_POWDER,13),
                        new MoveLearnSetEntry(Move.STUN_SPORE,13),
                        new MoveLearnSetEntry(Move.PSYBEAM,17),
                        new MoveLearnSetEntry(Move.POISON_FANG,21),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,23),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,25),
                        new MoveLearnSetEntry(Move.VENOSHOCK,29),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,35),
                        new MoveLearnSetEntry(Move.PSYCHIC,45)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Pupenta");

    }


}
