package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Smogophant extends drai.dev.data.pokemon.Pokemon {
    public Smogophant() {
        super("Smogophant",
                Type.FIRE, Type.GROUND,
                new Stats(120,
                        70,
                        100,
                        105,
                        75,
                        30),
                List.of(Ability.WHITE_SMOKE), Ability.BERSERK,
                30, 6500,
                new Stats(3,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Smogophant constantly release foul smelling smoke from the pores on their backs. The thicker the smoke the younger and healthier the Smogophant."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Smogophant");

    }


}
