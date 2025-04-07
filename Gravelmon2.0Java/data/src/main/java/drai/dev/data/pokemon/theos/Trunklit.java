package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Trunklit extends drai.dev.data.pokemon.Pokemon {
    public Trunklit() {
        super("Trunklit",
                Type.FIRE, Type.GROUND,
                new Stats(80,
                        45,
                        70,
                        70,
                        45,
                        20),
                List.of(Ability.WHITE_SMOKE), Ability.BERSERK,
                10, 1050,
                new Stats(1,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Trunklit release puffs of smoke from their nose to create shapes. Humans in the ancient times would use the soot leftover to create artwork and tell stories."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Trunklit");

    }


}
