package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Effighast extends drai.dev.data.pokemon.Pokemon {
    public Effighast(Stats stats) {
        super("Effighast",
                Type.GHOST, Type.GRASS,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                20, 68,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.GRASS),
                List.of("These 'Mons are a staple of every farmer's team in Urzavos, as they protect their fields from other 'Mons that seek to eat their crops or harass their livestock."),
                List.of(),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Effighast");

    }


}
