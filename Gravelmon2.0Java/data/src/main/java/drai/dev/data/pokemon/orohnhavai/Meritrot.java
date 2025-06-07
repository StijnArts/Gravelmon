package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Meritrot extends drai.dev.data.pokemon.Pokemon {
    public Meritrot() {
        super("Meritrot",
                Type.NORMAL,
                new Stats(55,
                        50,
                        38,
                        50,
                        40,
                        72),
                List.of(Ability.RUN_AWAY), Ability.SCRAPPY,
                8, 165,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Gentle-natured and friendly, Meritrot love being around people and giving rides. They are far stronger than they appear and are used for farm work all over Atlas."),
                List.of(),
                List.of(),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Meritrot");

    }


}
