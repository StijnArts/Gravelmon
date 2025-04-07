package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Frankfurnt extends drai.dev.data.pokemon.Pokemon {
    public Frankfurnt() {
        super("Frankfurnt",
                Type.FIRE,
                new Stats(95,
                        80,
                        65,
                        95,
                        80,
                        60),
                List.of(Ability.FLASH_FIRE,Ability.RUN_AWAY), Ability.WHITE_SMOKE,
                10, 310,
                new Stats(1,0,0,1,0,0), 45,
                0.5,
                178, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Frankfurnt's ears are covered in fur that have a similar consistency and odour to smoke. They are often used by firefighters as a mean to locate people trapped in flaming buildings."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,1),
                        new MoveLearnSetEntry(Move.EMBER,3),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,6),
                        new MoveLearnSetEntry(Move.BITE,10),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,14),
                        new MoveLearnSetEntry(Move.COIL,32),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,46),
                        new MoveLearnSetEntry(Move.DIG,"tm")                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Frankfurnt");

    }


}
