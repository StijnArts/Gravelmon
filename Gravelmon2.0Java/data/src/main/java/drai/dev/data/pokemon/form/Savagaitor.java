package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Savagaitor extends drai.dev.data.pokemon.Pokemon {
    public Savagaitor() {
        super("Savagaitor",
                Type.DRAGON,Type.FIGHTING,
                new Stats(115,
                        136,
                        115,
                        40,
                        98,
                        22),
                List.of(Ability.RAGINGSCALE), null,
                24, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .setAntiBiomes(Biome.IS_OVERWORLD)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Savagaitor");

    }


}
