package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Peadazzled extends drai.dev.data.pokemon.Pokemon {
    public Peadazzled(Stats stats) {
        super("Peadazzled",
                Type.PSYCHIC, Type.FLYING,
                stats,
                List.of(Ability.UNNERVE,Ability.INTIMIDATE), Ability.RATTLED,
                15, 748,
                new Stats(0,0,0,0,0,0), 45,
                1.0,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("The more confusing and striking the eye-markings on Peadazzled's body are, the more favorably they are treated among their peers."),
                List.of(),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Peadazzled");

    }


}
