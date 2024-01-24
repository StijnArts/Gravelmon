package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Foxsye extends drai.dev.gravelmon.pokemon.Pokemon {
    public Foxsye() {
        super("Foxsye",
                Type.FAIRY,
                new Stats(40,
                        60,
                        45,
                        70,
                        50,
                        65),
                List.of(Ability.PERCEIVE), Ability.INFILTRATOR,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The mystical orb it holds possesses a magical power that allows them to see through deception and trickery. It seeks out for the truth. Eye contact with a Foxsye will urge you to spill your secrets."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Foxsye");

    }


}
