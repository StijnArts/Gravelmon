package drai.dev.data.pokemon.beginnings;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Falconduct extends drai.dev.data.pokemon.Pokemon {
    public Falconduct() {
        super("Falconduct",
                Type.ELECTRIC,Type.FLYING,
                new Stats(80,
                        72,
                        65,
                        111,
                        65,
                        125),
                List.of(Ability.STATIC,Ability.GALE_WINGS), Ability.LIGHTNING_ROD,
                15, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Falconduct commands the skies with jet-like precision, its sleek body cutting through storms like a blade of thunder. Its wings generate static currents that bathe the ground in ions. Some believe Falconduct's form inspired the shape of early military aircraft."),
                List.of(),
                List.of(),
                List.of(Label.OTTORA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(32).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Falconduct");
           setCanFly();

    }


}
