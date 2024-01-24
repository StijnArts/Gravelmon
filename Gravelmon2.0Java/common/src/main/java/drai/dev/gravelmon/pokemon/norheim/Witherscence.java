package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Witherscence extends drai.dev.gravelmon.pokemon.Pokemon {
    public Witherscence() {
        super("Witherscence",
                Type.PSYCHIC,Type.GRASS,
                new Stats(120,
                        50,
                        65,
                        100,
                        120,
                        60),
                List.of(Ability.COTTON_DOWN,Ability.REGENERATOR,Ability.HEATPROOF), Ability.HEATPROOF,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Evo Strength Sap Grass"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Witherscence");

    }


}
