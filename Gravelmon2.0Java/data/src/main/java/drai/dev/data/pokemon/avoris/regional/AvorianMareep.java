package drai.dev.data.pokemon.avoris.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class AvorianMareep extends drai.dev.data.pokemon.Pokemon {
    public AvorianMareep() {
        super("Mareep",
                Type.PSYCHIC, Type.ELECTRIC,
                new Stats(55,
                        40,
                        40,
                        45,
                        65,
                        35),
                List.of(Ability.SOUNDPROOF,Ability.TELEPATHY,Ability.SYNCHRONIZE), Ability.SYNCHRONIZE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("With their flashing of lights on its horns and tail, they stun and confuse their foes. Then using their psychic energy, they may hypnotize and make them experience hallucinations. They are known to alter the dreams of those sleeping. Many reported wild dreams involving Avorian Mareep in some way."),
                List.of(),
                List.of(),
                List.of(Label.AVORIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Mareep");

    }


}
