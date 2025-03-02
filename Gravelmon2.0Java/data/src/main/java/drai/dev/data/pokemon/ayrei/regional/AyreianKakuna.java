package drai.dev.data.pokemon.ayrei.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AyreianKakuna extends drai.dev.data.pokemon.Pokemon {
    public AyreianKakuna(String name, Aspect aspect) {
        super(name, aspect, "Kakuna",
                Type.BUG,
                new Stats(45,
                        60,
                        50,
                        50,
                        25,
                        50),
                List.of(Ability.SHED_SKIN,Ability.TECHNICIAN), null,
                6, 100,
                new Stats(0,0,2,0,0,0), 120,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("While awaiting evolution, it hides from predators under leaves and in nooks of branches."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,13),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.TACKLE,5),
                        new MoveLearnSetEntry(Move.BULLDOZE,16),
                        new MoveLearnSetEntry(Move.TWINEEDLE,9),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,"tm"),
                        new MoveLearnSetEntry(Move.ELECTROWEB,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm")                        ),
                List.of(Label.VANGUARD),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Kakuna");

    }


}
