package drai.dev.data.pokemon.varitas;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hydreinopod extends drai.dev.data.pokemon.Pokemon {
    public Hydreinopod() {
        super("Hydreinopod",
                Type.BUG,Type.FAIRY,
                new Stats(90,
                        105,
                        90,
                        125,
                        90,
                        100),
                List.of(Ability.INFILTRATOR), Ability.INTIMIDATE,
                19, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.VARITAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
                        .pseudoLegend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_JUNGLE).duringDaytime()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Hydreinopod");

    }


}
