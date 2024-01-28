package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Reconuisance extends drai.dev.gravelmon.pokemon.Pokemon {
    public Reconuisance() {
        super("Reconuisance",
                Type.STEEL,Type.FLYING,
                new Stats(65,
                        95,
                        115,
                        35,
                        95,
                        105),
                List.of(Ability.MOTOR_DRIVE,Ability.LIGHTNING_ROD,Ability.FOREWARN), Ability.FOREWARN,
                8, 165,
                new Stats(0,0,0,0,0,2), 45,
                1.0,
                180, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Its lens can zoom in extremely far, allowing it to watch a single person from a mile away. It can relay what it has seen like a projector to its trainer, should it trust them."),
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
           setLangFileName("Reconuisance");

    }


}