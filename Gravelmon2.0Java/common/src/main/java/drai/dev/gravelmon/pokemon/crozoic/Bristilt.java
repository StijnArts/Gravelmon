package drai.dev.gravelmon.pokemon.crozoic;


import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;
public class Bristilt extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bristilt(Stats stats) {
        super("Bristilt",
                Type.POISON,
                stats,
                List.of(Ability.POISON_POINT,Ability.FILTER), Ability.TOXIC_DEBRIS,
                13, 70,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.AMORPHOUS),
                List.of("Its frill can fold up or down, allowing it to point its spikes in any direction. Water freely passes through the frill while keeping out pollutants, which are absorbed to give the spikes their potent toxin."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PIN_MISSILE,1),
                        new MoveLearnSetEntry(Move.SOAKUP,1),
                        new MoveLearnSetEntry(Move.PURIFY,1),
                        new MoveLearnSetEntry(Move.SPIKE_CANNON,1),
                        new MoveLearnSetEntry(Move.SLUDGE,1),
                        new MoveLearnSetEntry(Move.SPIKES,1),
                        new MoveLearnSetEntry(Move.BARB_BARRAGE,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.PRICKLEBARBS,1),
                        new MoveLearnSetEntry(Move.BIDE,1),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,1),
                        new MoveLearnSetEntry(Move.RECOVER,1),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,1)                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.RARE, 31, 51, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Bristilt");

    }


}
