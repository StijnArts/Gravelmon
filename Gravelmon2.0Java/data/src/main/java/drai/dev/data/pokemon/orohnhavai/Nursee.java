package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Nursee extends drai.dev.data.pokemon.Pokemon {
    public Nursee() {
        super("Nursee",
                Type.FAIRY,
                new Stats(100,
                        40,
                        30,
                        45,
                        45,
                        40),
                List.of(Ability.NATURAL_CURE,Ability.REGENERATOR,Ability.HEALER), Ability.HEALER,
                8, 165,
                new Stats(1,0,0,0,0,0), 130,
                0.25,
                95, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.FAIRY),
                List.of("Nursee are so caring and kind they will cry if another Pokemon is crying or hurt, often when they don't know why. They will also tend to injured Pokemon out of the goodness of their hearts, even if not asked."),
                List.of(),
                List.of(),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Nursee");

    }


}
