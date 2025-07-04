package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Cryosect extends drai.dev.data.pokemon.Pokemon {
    public Cryosect() {
        super("Cryosect",
                Type.BUG, Type.ICE,
                new Stats(60,
                        70,
                        65,
                        120,
                        100,
                        80),
                List.of(Ability.ICE_BODY), Ability.WEAK_ARMOR,
                10, 165,
                new Stats(0,0,0,0,0,0), 110,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Flapping their icy glass-like wings cools the air around them. A swarm of them will blow intense icy winds when threatened."),
                List.of(),
                List.of(),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(26).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SWAMP).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Cryosect");

    }


}
