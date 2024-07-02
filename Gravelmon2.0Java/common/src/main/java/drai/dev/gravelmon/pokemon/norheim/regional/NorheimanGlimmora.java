package drai.dev.gravelmon.pokemon.norheim.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class NorheimanGlimmora extends drai.dev.gravelmon.pokemon.Pokemon {
    public NorheimanGlimmora(String name, Aspect aspect, Stats stats) {
        super(name, aspect, "Glimmora",
                Type.ICE, Type.POISON,
                stats,
                List.of(Ability.TOXIC_DEBRIS), Ability.TOXIC_DEBRIS,
                15, 165,
                new Stats(0,0,0,0,0,0), 25,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,4),
                        new MoveLearnSetEntry(Move.MIMIC,7),
                        new MoveLearnSetEntry(Move.SLUDGE,11),
                        new MoveLearnSetEntry(Move.BLOCK,15),
                        new MoveLearnSetEntry(Move.ICE_BALL,18),
                        new MoveLearnSetEntry(Move.TRICK,20),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,24),
                        new MoveLearnSetEntry(Move.CAUSTIC_BREATH,28),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,31),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,35),
                        new MoveLearnSetEntry(Move.PROTECT,40),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,43),
                        new MoveLearnSetEntry(Move.FREEZEDRY,47),
                        new MoveLearnSetEntry(Move.TOXICFUMES,52),
                        new MoveLearnSetEntry(Move.COLDSNAP,55),
                        new MoveLearnSetEntry(Move.ROOST,60)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 35, 54, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FREEZING)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Glimmora");
        addAdditionalEvolution("glimmet", new EvolutionEntry("glimmora norheiman", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35"),
                        new EvolutionRequirementEntry(EvolutionRequirementCondition.BIOME,"\""+ Biome.IS_FREEZING.getId() + ":" + Biome.IS_FREEZING.getName() +"\""))));

    }


}
