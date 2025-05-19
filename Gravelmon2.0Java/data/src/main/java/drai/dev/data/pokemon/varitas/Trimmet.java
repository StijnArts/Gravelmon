package drai.dev.data.pokemon.varitas;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Trimmet extends drai.dev.data.pokemon.Pokemon {
    public Trimmet() {
        super("Trimmet",
                Type.FAIRY,Type.FLYING,
                new Stats(48,
                        35,
                        42,
                        105,
                        60,
                        60),
                List.of(Ability.OWN_TEMPO,Ability.KEEN_EYE), Ability.MAGIC_BOUNCE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Its small, light body allows it to hop around jungle canopies with ease. Its resemblance to a flower often helps to camouflage it from predators and also caused researchers to initially mistake it for Glimmet."),
                List.of(),
                List.of(),
                List.of(Label.VARITAS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Trimmet");

    }


}
