package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Meansprout extends drai.dev.gravelmon.pokemon.Pokemon {
    public Meansprout() {
        super("Meansprout",
                Type.GRASS,
                new Stats(50,
                        45,
                        30,
                        55,
                        40,
                        80),
                List.of(Ability.INFILTRATOR), Ability.REGENERATOR,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Meansprout are laughably weak in battle, so they instead toy with foes psychologically, sprouting up and whispering behind their back or using vines to trip them up."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WRAP,1),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,5),
                        new MoveLearnSetEntry(Move.TAUNT,9)                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Meansprout");

    }


}
