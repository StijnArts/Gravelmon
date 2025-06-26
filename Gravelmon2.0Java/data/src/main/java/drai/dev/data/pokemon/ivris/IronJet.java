package drai.dev.data.pokemon.ivris;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class IronJet extends drai.dev.data.pokemon.Pokemon {
    public IronJet() {
        super("IronJet",
                Type.FLYING,Type.GROUND,
                new Stats(70,
                        113,
                        75,
                        32,
                        75,
                        204),
                List.of(Ability.QUARK_DRIVE), null,
                32, 0,
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
                        .setBiomes(Biome.IS_SKY, Biome.IS_PEAK).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Iron Jet");

    }


}
