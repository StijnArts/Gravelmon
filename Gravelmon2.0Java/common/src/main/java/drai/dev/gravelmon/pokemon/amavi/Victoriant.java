package drai.dev.gravelmon.pokemon.amavi;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

public class Victoriant extends drai.dev.gravelmon.pokemon.Pokemon {
    public Victoriant() {
        super("Victoriant",
                Type.BUG,Type.GROUND,
                new Stats(88,
                        44,
                        88,
                        44,
                        88,
                        22),
                List.of(Ability.COMPOUND_EYES,Ability.COMPETITIVE), Ability.STURDY,
                7, 263,
                new Stats(0,0,0,0,2,0), 0,
                0.0,
                130, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG,EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Victoriant");

    }


}
