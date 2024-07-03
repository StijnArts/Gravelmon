package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Ogrelisk extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ogrelisk() {
        super("Ogrelisk",
                Type.ROCK, Type.PSYCHIC,
                new Stats(90,
                        100,
                        100,
                        100,
                        195,
                        15),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                29, 165,
                new Stats(0,0,0,0,3,0), 3,
                0.5,
                300, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("It is believed to have used its psychic powers to travel from an unfavorable distant future to today's past, having lived two or more different lives."),
                List.of(),
                List.of(      new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,1),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,7),
                        new MoveLearnSetEntry(Move.SLASH,14),
                        new MoveLearnSetEntry(Move.AGILITY,21),
                        new MoveLearnSetEntry(Move.PSYCHO_CUT,28),
                        new MoveLearnSetEntry(Move.COUNTER,35),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,42),
                        new MoveLearnSetEntry(Move.SACRED_SWORD,49),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,63),
                        new MoveLearnSetEntry(Move.MEGAHORN,70),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,77),
                        new MoveLearnSetEntry(Move.STONE_EDGE,84),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,91)),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 65, 75, .0005, List.of(
                ), List.of(),
                List.of(SpawnPreset.JUNGLE_PYRAMID),
                0.28, 0.3,
                List.of());
           setLangFileName("Ogrelisk");

    }


}
