package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Scrolock extends drai.dev.data.pokemon.Pokemon {
    public Scrolock() {
        super("Scrolock",
                Type.GRASS, Type.GHOST,
                new Stats(75,
                        65,
                        120,
                        85,
                        110,
                        60),
                List.of(Ability.CURSED_BODY), Ability.INFILTRATOR,
                18, 250,
                new Stats(0,0,2,0,1,0), 90,
                0.5,
                184, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.AMORPHOUS),
                List.of("Scrolock is known for its eerie presence, often appearing in dark, abandoned areas where it likes to haunt unsuspecting travelers. It can also use its paper arms to grab onto its opponents and drain their energy, making it a formidable opponent in battle."),
                List.of(),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Scrolock");

    }


}
