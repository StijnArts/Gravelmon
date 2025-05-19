package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ambrite extends drai.dev.data.pokemon.Pokemon {
    public Ambrite() {
        super("Ambrite",
                Type.FAIRY,
                new Stats(64,
                        62,
                        93,
                        83,
                        97,
                        61),
                List.of(Ability.LEVITATE), Ability.IMMUNITY,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Cavities in the shells maintain buoyancy so that Ambrite can swim gracefully through the sea with their tentacles. Their shells were their only remnants, the dazzling colors being well preserved."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Ambrite");

    }


}
