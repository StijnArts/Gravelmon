package drai.dev.data.pokemon.rica;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class mara extends drai.dev.data.pokemon.Pokemon {
    public mara() {
        super("mara",
                Type.GRASS, Type.PSYCHIC,
                new Stats(110,
                        55,
                        65,
                        95,
                        100,
                        110),
                List.of(Ability.NATURAL_CURE), Ability.TRACE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.GRASS),
                List.of("[mara] prance through the plains, spreading flower pollen as they hop. They are caring Pokemon and will tend to any injured Pokemon in need, no matter what species."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,7),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,12),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,16),
                        new MoveLearnSetEntry(Move.BATON_PASS,20),
                        new MoveLearnSetEntry(Move.LEECH_SEED,25),
                        new MoveLearnSetEntry(Move.DETECT,29),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,33),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,37),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,41),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,46),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,52),
                        new MoveLearnSetEntry(Move.AGILITY,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,"tm")                        ),
                List.of(Label.RICA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("mara");

    }


}
