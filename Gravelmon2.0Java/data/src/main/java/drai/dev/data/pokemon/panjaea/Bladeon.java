package drai.dev.data.pokemon.panjaea;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bladeon extends drai.dev.data.pokemon.Pokemon {
    public Bladeon() {
        super("Bladeon",
                Type.STEEL,
                new Stats(65,
                        130,
                        110,
                        60,
                        65,
                        95),
                List.of(Ability.CLEAR_BODY), Ability.SHARPNESS,
                8, 310,
                new Stats(0,2,0,0,0,0), 45,
                0.875,
                184, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.PANJAEA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .eeveelution()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_HIGHLANDS).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Bladeon");
        addAdditionalEvolution("eevee", new EvolutionEntry(getCleanName(), EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"minecraft:iron_sword"));
    }


}
