package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Netempra extends drai.dev.data.pokemon.Pokemon {
    public Netempra() {
        super("Netempra",
                Type.GRASS,Type.PSYCHIC,
                new Stats(76,
                        53,
                        89,
                        82,
                        91,
                        74),
                List.of(Ability.CHLOROPHYLL,Ability.OWN_TEMPO), Ability.OBLIVIOUS,
                10, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                163, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Netempra's psychic power has increased exponentially after evolution. Each bud seems to have a mind of its own. The forms each have their own strengths in battle."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.WORRY_SEED,1),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,5),
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,9),
                        new MoveLearnSetEntry(Move.CONFUSION,14),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,18),
                        new MoveLearnSetEntry(Move.REFLECT,18),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,21),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,25),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,30),
                        new MoveLearnSetEntry(Move.PSYBEAM,34),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,39),
                        new MoveLearnSetEntry(Move.SYNTHESIS,43),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,48),
                        new MoveLearnSetEntry(Move.LEECH_SEED,52)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Netempra");

    }


}
