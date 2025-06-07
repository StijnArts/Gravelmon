package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Transil extends drai.dev.data.pokemon.Pokemon {
    public Transil() {
        super("Transil",
                Type.STEEL,Type.BUG,
                new Stats(120,
                        85,
                        95,
                        60,
                        60,
                        100),
                List.of(Ability.BULLETPROOF), Ability.MOTOR_DRIVE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Capable of rolling on the tire-like rings on their legs for fast travel. The cavity between its dome and body is large enough to carry small mons, who often hitch a ride on these gentle giants."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Transil");

    }


}
