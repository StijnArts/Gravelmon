package drai.dev.gravelmon.pokemon.aristos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Ramvolt extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ramvolt() {
        super("Ramvolt",
                Type.ELECTRIC,Type.DARK,
                new Stats(95,
                        115,
                        85,
                        75,
                        90,
                        50),
                List.of(Ability.VOLT_ABSORB), Ability.MINUS,
                8, 165,
                new Stats(0,0,0,3,0,0), 45,
                0.8,
                225, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("The immense amount of electrical energy Ramvolt can store makes it aggressive. Lightning strikes unleashed in anger calm it down, but the energy restores in no time."),
                List.of(),
                List.of(                        ),
                List.of(Label.ARISTOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ramvolt");

    }


}
