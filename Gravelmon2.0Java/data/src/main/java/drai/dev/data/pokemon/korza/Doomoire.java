package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Doomoire extends drai.dev.data.pokemon.Pokemon {
    public Doomoire() {
        super("Doomoire",
                Type.GHOST,Type.DARK,
                new Stats(78,
                        74,
                        92,
                        84,
                        103,
                        54),
                List.of(Ability.PERISH_BODY), Ability.POWER_OF_ALCHEMY,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Doomoire's overflowing, powerful aura overtook its shell binding and has become one with the mon. Reading from its pages causes people to lose their minds from the dark knowledge written."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Doomoire");

    }


}
