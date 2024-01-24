package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Sycelium extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sycelium() {
        super("Sycelium",
                Type.POISON,Type.PSYCHIC,
                new Stats(88,
                        44,
                        65,
                        90,
                        75,
                        38),
                List.of(Ability.OWN_TEMPO), Ability.OWN_TEMPO,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.AMORPHOUS),
                List.of("Sycelium are covered with odd with odd tumor-like lumps filled with a peculiar amount of neurological activity that are even capable of sending signals to other parts of the Sycelium’s body. Sycelium are known to act conflicted or confused, as if battling the commands of its multiple minds."),
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
           setLangFileName("Sycelium");

    }


}
