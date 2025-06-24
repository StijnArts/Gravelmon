package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Electrisk extends drai.dev.data.pokemon.Pokemon {
    public Electrisk() {
        super("Electrisk",
                Type.ELECTRIC, Type.FLYING,
                new Stats(80,
                        70,
                        65,
                        110,
                        75,
                        88),
                List.of(Ability.STATIC,Ability.BIG_PECKS), Ability.GALE_WINGS,
                18, 952,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                220, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("With a flap of their mighty wings, Electrisk cause the sky to rumble. Those lucky enough to witness an Electrisk fly will see nothing but a blur."),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(28).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Electrisk");

    }


}
