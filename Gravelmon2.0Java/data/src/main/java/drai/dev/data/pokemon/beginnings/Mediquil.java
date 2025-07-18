package drai.dev.data.pokemon.beginnings;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mediquil extends drai.dev.data.pokemon.Pokemon {
    public Mediquil() {
        super("Mediquil",
                Type.NORMAL,Type.POISON,
                new Stats(110,
                        65,
                        75,
                        60,
                        75,
                        50),
                List.of(Ability.TRIAGE,Ability.POISON_POINT), Ability.THICK_FAT,
                12, 0,
                new Stats(0,0,0,0,0,0), 110,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Mediquil are the nurses of Ottora's forests. Many children have reported that upon being hurt, a healing quil from a Mediquil would clear up their wounds by counteracting bacteria."),
                List.of(),
                List.of(),
                List.of(Label.OTTORA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(25).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TUNDRA).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Mediquil");

    }


}
