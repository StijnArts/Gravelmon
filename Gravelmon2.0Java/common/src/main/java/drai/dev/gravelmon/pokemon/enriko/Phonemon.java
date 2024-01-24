package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Phonemon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Phonemon() {
        super("Phonemon",
                Type.NORMAL,Type.GHOST,
                new Stats(60,
                        85,
                        100,
                        100,
                        100,
                        35),
                List.of(Ability.SOUNDPROOF,Ability.SCRAPPY,Ability.CACOPHONY), Ability.CACOPHONY,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Locking an inmate in the same room as a loudmouthed Phonemon used to be a widespread method of interrogation. Its bite is just as strong as its bark."),
                List.of(),
                List.of(                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Phonemon");

    }


}
