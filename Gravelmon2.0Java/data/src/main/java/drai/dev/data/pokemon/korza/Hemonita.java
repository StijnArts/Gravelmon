package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hemonita extends drai.dev.data.pokemon.Pokemon {
    public Hemonita() {
        super("Hemonita",
                Type.POISON,Type.DARK,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.EFFECT_SPORE,Ability.LIQUID_OOZE), Ability.MERCILESS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Upon evolution, this pokemon has become a dangerous but unsettling beauty, leaving an eerily blood-like stain everywhere it goes. It likes to scare children with its second face."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,"tm"),
                        new MoveLearnSetEntry(Move.RAGE_POWDER,"tm")                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hemonita");

    }


}