package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Plastree extends drai.dev.gravelmon.pokemon.Pokemon {
    public Plastree() {
        super("Plastree",
                Type.NORMAL,
                new Stats(20,
                        80,
                        95,
                        50,
                        95,
                        10),
                List.of(Ability.CLEAR_BODY,Ability.IMMUNITY,Ability.SAP_SIPPER), Ability.SAP_SIPPER,
                9, 165,
                new Stats(0,0,0,0,1,0), 210,
                0.5,
                64, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.MONSTER),
                List.of("Its glossy body resembles a small plant. In barren wastelands and desert, they gather in great numbers pretending to be grass."),
                List.of(new EvolutionEntry("plastree", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"24")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,5),
                        new MoveLearnSetEntry(Move.FAKE_OUT,12),
                        new MoveLearnSetEntry(Move.BITE,16),
                        new MoveLearnSetEntry(Move.FACADE,25),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,30),
                        new MoveLearnSetEntry(Move.ACUPRESSURE,37),
                        new MoveLearnSetEntry(Move.GLARE,42),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,50),
                        new MoveLearnSetEntry(Move.MIMIC,59),
                        new MoveLearnSetEntry(Move.POWER_WHIP,64)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPARSE, Biome.IS_DESERT)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Plastree");

    }


}
