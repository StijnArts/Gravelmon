package drai.dev.data.pokemon.enriko;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Goolony extends drai.dev.data.pokemon.Pokemon {
    public Goolony() {
        super("Goolony",
                Type.STEEL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 110,
                0.75,
                135, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.DITTO),
                List.of("(steel/grease) As it eats, it uses all of the energy gained to replicate itself. Larger clones are assimilated into its own body like a hivemind."),
                List.of(),
                List.of(),
                List.of(Label.ENRIKO),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Goolony");

    }


}
