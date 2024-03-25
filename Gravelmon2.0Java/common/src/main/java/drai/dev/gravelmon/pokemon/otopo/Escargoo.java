package drai.dev.gravelmon.pokemon.otopo;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Escargoo extends drai.dev.gravelmon.pokemon.Pokemon {
    public Escargoo() {
        super("Escargoo",
                Type.POISON,Type.ICE,
                new Stats(100,
                        75,
                        125,
                        65,
                        80,
                        55),
                List.of(Ability.WEAK_ARMOR,Ability.LIQUID_OOZE), Ability.HYDRATION,
                0, 0,
                new Stats(0,0,2,0,0,0), 0,
                0.5,
                175, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("The fluid leaking from Escargoo's shell is extremely dangerous. Under the toxicity of its secretions, even its shell is beginning to fracture."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.RAIN_DANCE,1)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Escargoo");

    }


}
