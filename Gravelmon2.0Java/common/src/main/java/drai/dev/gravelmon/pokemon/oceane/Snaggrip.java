package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Snaggrip extends drai.dev.gravelmon.pokemon.Pokemon {
    public Snaggrip() {
        super("Snaggrip",
                Type.STEEL,
                new Stats(50,
                        130,
                        180,
                        45,
                        65,
                        10),
                List.of(Ability.HYPER_CUTTER), Ability.STURDY,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                168, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("The jaws of its shell are strong enough to slice a truck in half. When threatened, they shut closed tight and are impossible to reopen by human force alone."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_FANG,1)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Snaggrip");

    }


}
