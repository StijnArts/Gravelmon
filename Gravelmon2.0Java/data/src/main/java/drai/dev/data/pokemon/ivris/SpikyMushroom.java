package drai.dev.data.pokemon.ivris;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class SpikyMushroom extends drai.dev.data.pokemon.Pokemon {
    public SpikyMushroom() {
        super("SpikyMushroom",
                Type.FIRE,Type.FIGHTING,
                new Stats(124,
                        105,
                        147,
                        43,
                        95,
                        53),
                List.of(Ability.PROTOSYNTHESIS), null,
                17, 0,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.IVRIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .abnormality()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_JUNGLE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Spiky Mushroom");

    }


}
