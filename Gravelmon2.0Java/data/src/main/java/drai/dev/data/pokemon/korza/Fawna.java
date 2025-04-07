package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Fawna extends drai.dev.data.pokemon.Pokemon {
    public Fawna() {
        super("Fawna",
                Type.FAIRY,
                new Stats(47,
                        54,
                        45,
                        56,
                        48,
                        50),
                List.of(Ability.FOREWARN), Ability.WONDER_SKIN,
                7, 181,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.FIELD),
                List.of("Fawna live in the most remote and dense forests of Korza. Seeing one is taken as a sign of a coming miracle."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STOMP,5),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,10),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,16),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,20),
                        new MoveLearnSetEntry(Move.REST,25),
                        new MoveLearnSetEntry(Move.BOUNCE,35),
                        new MoveLearnSetEntry(Move.AGILITY,40),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,46),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,50),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,53)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Fawna");

    }


}
