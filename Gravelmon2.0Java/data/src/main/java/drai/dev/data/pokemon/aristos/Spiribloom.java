package drai.dev.data.pokemon.aristos;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Spiribloom extends drai.dev.data.pokemon.Pokemon {
    public Spiribloom() {
        super("Spiribloom",
                Type.GRASS, Type.POISON,
                new Stats(50,
                        92,
                        108,
                        92,
                        108,
                        35),
                List.of(Ability.UNNERVE), Ability.EFFECT_SPORE,
                8, 165,
                new Stats(0,0,1,0,1,0), 100,
                0.5,
                170, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Its strange face-like composition is to scare away attackers, but if that doesn't work it can also spin its petals to spread toxic particles. Its body is light so it anchors itself to a loose rock to both keep it grounded and to be able to move if it needs to."),
                List.of(),
                List.of(),
                List.of(Label.ARISTOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Spiribloom");

    }


}
