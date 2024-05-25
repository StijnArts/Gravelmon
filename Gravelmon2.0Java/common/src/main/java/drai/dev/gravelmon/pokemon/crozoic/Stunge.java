package drai.dev.gravelmon.pokemon.crozoic;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Stunge extends drai.dev.gravelmon.pokemon.Pokemon {
    public Stunge() {
        super("Stunge",
                Type.POISON,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.POISON_POINT,Ability.FILTER), Ability.TOXIC_DEBRIS,
                7, 54,
                new Stats(0,0,0,0,0,0), 210,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.AMORPHOUS),
                List.of("At the slightest hint of danger, it expunges all of the stored liquid in its body, causing its venomous spines to shoot outward in all directions."),
                List.of(new EvolutionEntry("bristilt", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
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
                ), SpawnContext.SEAFLOOR, SpawnPool.RARE, 13, 32, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Stunge");

    }


}
