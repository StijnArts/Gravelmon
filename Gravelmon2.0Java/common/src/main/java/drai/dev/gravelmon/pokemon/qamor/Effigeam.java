package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Effigeam extends drai.dev.gravelmon.pokemon.Pokemon {
    public Effigeam() {
        super("Effigeam",
                Type.GHOST,Type.STEEL,
                new Stats(81,
                        75,
                        70,
                        75,
                        70,
                        28),
                List.of(Ability.FRISK), Ability.CURSED_BODY,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Effigeam are very empathetic Pokemon that feel the emotions of those around them, and often make others feel their emotions. When their friends gets seriously injured, they would offer up their own stuffing or felt and insist on patching them back up."),
                List.of(),
                List.of(                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Effigeam");

    }


}
